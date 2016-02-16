/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synsoftech.prototypes;

import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;

import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import synsoftech.util.ImageRenderer;
import synsoftech.util.LostHeaderRenderer;

/**
 *
 * @author Guinness
 */
public class Dlg_prototype2 extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_prototype2
     */
    //<editor-fold defaultstate="collapsed" desc=" callback ">
    private Callback callback;

    public void setCallback(Callback callback) {
        this.callback = callback;

    }

    public static interface Callback {

        void ok(CloseDialog closeDialog, OutputData data);
    }

    public static class InputData {
    }

    public static class OutputData {
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_prototype2(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_prototype2(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_prototype2() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_prototype2 myRef;

    private void setThisRef(Dlg_prototype2 myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_prototype2> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_prototype2 create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_prototype2 create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_prototype2 dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_prototype2((java.awt.Frame) parent, false);
                dialog.setModalityType(modalType);
                dialogContainer.put(parent, dialog);
                java.util.logging.Logger.getAnonymousLogger().log(Level.INFO, "instances: {0}", dialogContainer.size());
                dialog.setThisRef(dialog);
                return dialog;
            } else {
                dialog.setModalityType(modalType);
                return dialog;
            }

        }

        if (parent instanceof java.awt.Dialog) {
            Dlg_prototype2 dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_prototype2((java.awt.Dialog) parent, false);
                dialog.setModalityType(modalType);
                dialogContainer.put(parent, dialog);
                java.util.logging.Logger.getAnonymousLogger().log(Level.INFO, "instances: {0}", dialogContainer.size());
                dialog.setThisRef(dialog);
                return dialog;
            } else {
                dialog.setModalityType(modalType);
                return dialog;
            }

        }

        return null;

    }
    //</editor-fold>    

    //<editor-fold defaultstate="collapsed" desc=" main ">
    public static void main(String args[]) {

        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Dlg_prototype2 dialog = Dlg_prototype2.create(new javax.swing.JFrame(), true);
        dialog.setVisible(true);

    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" added ">
    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible == true) {
            getContentPane().removeAll();
            initComponents();
            myInit();
            repaint();
        }

    }

    public javax.swing.JPanel getSurface() {
        return (javax.swing.JPanel) getContentPane();
    }

    public void nullify() {
        myRef.setVisible(false);
        myRef = null;
    }
    //</editor-fold>

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_ssample = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tbl_ssample.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_ssample.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_ssample.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ssampleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_ssample);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_ssampleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ssampleMouseClicked
        select();
    }//GEN-LAST:event_tbl_ssampleMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_ssample;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        init_tbl_orders();
        init_table_bg();
        dummy_data();
    }

    public void do_pass() {

    }

    // <editor-fold defaultstate="collapsed" desc="Key">
    private void disposed() {
        this.dispose();
    }

    private void init_key() {
        KeyMapping.mapKeyWIFW(getSurface(),
                              KeyEvent.VK_ESCAPE, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
//                btn_0.doClick();
                disposed();
            }
        });
    }
    // </editor-fold>

    private ArrayListModel tbl_sample_ALM;
    private TblordersModel tbl_sample_M;

    private void init_tbl_orders() {
        tbl_sample_ALM = new ArrayListModel();
        tbl_sample_M = new TblordersModel(tbl_sample_ALM);
        tbl_ssample.getTableHeader().setPreferredSize(new Dimension(100, 40));
        tbl_ssample.setModel(tbl_sample_M);
        tbl_ssample.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_ssample.setRowHeight(25);
        int[] tbl_widths_orders = {120, 100, 100, 40};
        for (int i = 0, n = tbl_widths_orders.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_ssample, i, tbl_widths_orders[i]);
        }
        Dimension d = tbl_ssample.getTableHeader().getPreferredSize();
        d.height = 30;
        tbl_ssample.getTableHeader().setPreferredSize(d);
        tbl_ssample.getTableHeader().setFont(new java.awt.Font("Arial", 0, 11));
        tbl_ssample.setRowHeight(35);
        tbl_ssample.setFont(new java.awt.Font("Arial", 0, 11));
        TableWidthUtilities.setColumnRightRenderer(tbl_ssample, 2);

        tbl_ssample.getColumnModel().getColumn(0).setHeaderRenderer(new LostHeaderRenderer());
        tbl_ssample.getColumnModel().getColumn(1).setHeaderRenderer(new LostHeaderRenderer());
        tbl_ssample.getColumnModel().getColumn(2).setHeaderRenderer(new LostHeaderRenderer());
        tbl_ssample.getColumnModel().getColumn(3).setHeaderRenderer(new LostHeaderRenderer());
        tbl_ssample.getColumnModel().getColumn(3).setCellRenderer(new ImageRenderer());
    }

    private void loadData_sample(List<to_table_renderer> acc) {
        tbl_sample_ALM.clear();
        tbl_sample_ALM.addAll(acc);
    }

    public static class TblordersModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Order No", "Customer", "Amount Due", ""

        };

        public TblordersModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }

        @Override
        public boolean isCellEditable(int row, int column) {

            return false;
        }

        @Override
        public Class getColumnClass(int col) {
            if (col == 1000) {
                return Boolean.class;
            }
            return Object.class;
        }

        @Override
        public Object getValueAt(int row, int col) {
            to_table_renderer tt = (to_table_renderer) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.transaction_no;
                case 1:
                    return " " + tt.customer_name;
                case 2:
                    return FitIn.fmt_wc_0(tt.amount_due) + " ";

                default:
                    if (tt.selected == true) {
                        return "/synsoftech/prototypes/check34.png";
                    } else {
                        return "/synsoftech/prototypes/delete30.png";
                    }

            }
        }
    }

    private void init_table_bg() {
        Color ivory = new Color(255, 255, 255);
        tbl_ssample.setOpaque(true);
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));
        tbl_ssample.setFillsViewportHeight(true);
        tbl_ssample.setBackground(ivory);
    }

    private void dummy_data() {
        List<to_table_renderer> datas = new ArrayList();
        for (int i = 1; i < 11; i++) {
            String transaction_no = "0000000" + i;
            String customer_name = "Customer " + i;
            double amount_due = 100 * i;
            boolean selected = false;
            to_table_renderer to = new to_table_renderer(transaction_no, customer_name, amount_due, selected);
            datas.add(to);
        }
        loadData_sample(datas);
    }

    public static class to_table_renderer {

        public final String transaction_no;
        public final String customer_name;
        public final double amount_due;
        public boolean selected;

        public to_table_renderer(String transaction_no, String customer_name, double amount_due, boolean selected) {
            this.transaction_no = transaction_no;
            this.customer_name = customer_name;
            this.amount_due = amount_due;
            this.selected = selected;
        }

        public boolean isSelected() {
            return selected;
        }

        public void setSelected(boolean selected) {
            this.selected = selected;
        }
    }

    private void select() {
        int row = tbl_ssample.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_table_renderer to = (to_table_renderer) tbl_sample_ALM.get(row);
        int col = tbl_ssample.getSelectedColumn();

        if (col == 3) {
            if (to.selected == true) {
                to.setSelected(false);
            } else {
                to.setSelected(true);
            }
            tbl_sample_M.fireTableDataChanged();
        }
    }
}
