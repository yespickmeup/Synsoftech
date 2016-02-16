/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synsoftech.excels;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mijzcx.synapse.desk.utils.FitIn;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDataFormatter;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 *
 * @author Guinness
 */
public class pisps_items {

    public static class items {

        public final String item_code;
        public final String description;
        public final String category;
        public final String classification;
        public final String sub_classification;
        public final String brand;
        public final String model;

        public items(String item_code, String description, String category, String classification, String sub_classification, String brand, String model) {
            this.item_code = item_code;
            this.description = description;
            this.category = category;
            this.classification = classification;
            this.sub_classification = sub_classification;
            this.brand = brand;
            this.model = model;
        }

    }

    public static class cost {

        public final String item_code;
        public final double cost;
        public final double selling_price;

        public cost(String item_code, double cost, double selling_price) {
            this.item_code = item_code;
            this.cost = cost;
            this.selling_price = selling_price;
        }

    }

    public static class my_items {

        public final String item_code;
        public final String barcode;
        public final String description;
        public final String category;
        public final String classification;
        public final String sub_classification;
        public final String brand;
        public final String model;
        public final String uom;
        public final double cost;
        public final double selling_price;

        public my_items(String item_code, String barcode, String description, String category, String classification, String sub_classification, String brand, String model, String uom, double cost, double selling_price) {
            this.item_code = item_code;
            this.barcode = barcode;
            this.description = description;
            this.category = category;
            this.classification = classification;
            this.sub_classification = sub_classification;
            this.brand = brand;
            this.model = model;
            this.uom = uom;
            this.cost = cost;
            this.selling_price = selling_price;
        }

    }

    public static void main(String[] args) {

        List<cost> costss = showCost();

        List<items> items = showItems();
        List<my_items> to_items = new ArrayList();
        for (items item : items) {
            String item_code = item.item_code;
            String barcode = "";
            String description = item.description;
            String category = item.category;
            String classification = item.classification;
            String sub_classification = item.sub_classification;
            String brand = item.brand;
            String model = item.model;
            String uom = "";
            double cost = 0;
            double selling_price = 0;
            for (cost cost1 : costss) {
                if (item.item_code.equals(cost1.item_code)) {
                    cost = cost1.cost;
                    selling_price = cost1.selling_price;
                    break;
                }
            }
            my_items my_item = new my_items(item_code, barcode, description, category, classification, sub_classification, brand, model, uom, cost, selling_price);

            to_items.add(my_item);
        }

        for (my_items to : to_items) {
            System.out.println(to.item_code + " " + to.description + " = " + to.selling_price);
        }
    }

    public static List<items> showItems() {
        String path = "C:\\\\Users\\\\Guinness\\\\Documents\\\\Projects\\\\Algorithm\\\\pisps records\\\\items.xls";
        FileInputStream fis = null;
        List sheetData = new ArrayList();
        try {
            fis = new FileInputStream(path);
            HSSFWorkbook workbook = new HSSFWorkbook(fis);
            HSSFSheet sheet = workbook.getSheetAt(0);
            Iterator rows = sheet.rowIterator();
            while (rows.hasNext()) {
                HSSFRow row = (HSSFRow) rows.next();
                Iterator cells = row.cellIterator();

                List data = new ArrayList();
                while (cells.hasNext()) {
                    HSSFCell cell = (HSSFCell) cells.next();
                    data.add(cell);
                }
                sheetData.add(data);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Unsupported Format");
        } finally {

            if (fis != null) {
                try {
                    fis.close();

                } catch (IOException ex) {
                    Logger.getLogger(Dlg_pisps.class
                            .getName()).
                            log(Level.SEVERE, null, ex);
                }
            }
        }

        List<items> datas = new ArrayList();
        try {
            fis = new FileInputStream(path);
            int r = 0;
            int r_set = 1;

            String prev_no = "";
            for (int i = 0; i < sheetData.size(); i++) {
                List list = (List) sheetData.get(i);
                int size = list.size();
                List<String> record = new ArrayList();
                for (int j = 0; j < list.size(); j++) {
                    HSSFCell cell = (HSSFCell) list.get(j);
                    HSSFDataFormatter hdf = new HSSFDataFormatter();
                    String data = "";

                    if (cell.getCellType() == HSSFCell.CELL_TYPE_STRING) {
                        String mydata = cell.getStringCellValue();
                        data = data + "" + mydata + "";
                        record.add(data);
                    } else {
                        data = data + cell.getNumericCellValue() + "";
                        record.add(data);

                    }

                }
                String[] aw = new String[size];
                int jj = 0;
                for (String s : record) {

                    aw[jj] = s;
                    jj++;
                }

                String item_code = FitIn.fmt_woc(aw[7]);
                String description = aw[1];
                String category = aw[2];
                String classification = aw[3];
                String sub_classification = aw[4];
                String brand = aw[5];
                String model = aw[6];

                items item = new items(item_code, description, category, classification, sub_classification, brand, model);
                datas.add(item);
            }
            return datas;

        } catch (FileNotFoundException ex) {
            Logger.getLogger(pisps_items.class
                    .getName()).
                    log(Level.SEVERE, null, ex);
        }
        return datas;

    }

    public static List<cost> showCost() {

        String path = "C:\\\\Users\\\\Guinness\\\\Documents\\\\Projects\\\\Algorithm\\\\pisps records\\\\cost.xls";
        FileInputStream fis = null;
        List sheetData = new ArrayList();
        try {
            fis = new FileInputStream(path);
            HSSFWorkbook workbook = new HSSFWorkbook(fis);
            HSSFSheet sheet = workbook.getSheetAt(0);
            Iterator rows = sheet.rowIterator();
            while (rows.hasNext()) {
                HSSFRow row = (HSSFRow) rows.next();
                Iterator cells = row.cellIterator();

                List data = new ArrayList();
                while (cells.hasNext()) {
                    HSSFCell cell = (HSSFCell) cells.next();
                    data.add(cell);
                }
                sheetData.add(data);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Unsupported Format");
        } finally {

            if (fis != null) {
                try {
                    fis.close();

                } catch (IOException ex) {
                    Logger.getLogger(Dlg_pisps.class
                            .getName()).
                            log(Level.SEVERE, null, ex);
                }
            }
        }

        List<cost> datas = new ArrayList();
        try {
            fis = new FileInputStream(path);
            int r = 0;
            int r_set = 1;

            String prev_no = "";
            for (int i = 0; i < sheetData.size(); i++) {
                List list = (List) sheetData.get(i);
                int size = list.size();
                List<String> record = new ArrayList();
                for (int j = 0; j < list.size(); j++) {
                    HSSFCell cell = (HSSFCell) list.get(j);
                    HSSFDataFormatter hdf = new HSSFDataFormatter();
                    String data = "";

                    if (cell.getCellType() == HSSFCell.CELL_TYPE_STRING) {
                        String mydata = cell.getStringCellValue();
                        data = data + "" + mydata + "";
                        record.add(data);
                    } else {
                        data = data + cell.getNumericCellValue() + "";
                        record.add(data);

                    }

                }
                String[] aw = new String[size];
                int jj = 0;
                for (String s : record) {

                    aw[jj] = s;
                    jj++;
                }

                String item_code = FitIn.fmt_woc(aw[0]);
                double cost = FitIn.toDouble(aw[1]);
                double price = FitIn.toDouble(aw[2]);
                cost cos = new cost(item_code, cost, price);

                datas.add(cos);
            }
            return datas;

        } catch (FileNotFoundException ex) {
            Logger.getLogger(pisps_items.class
                    .getName()).
                    log(Level.SEVERE, null, ex);
        }
        return datas;

    }
}
