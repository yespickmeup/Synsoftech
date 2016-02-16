/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synsoftech.mysql;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guinness
 */
public class Mysql {

    public static class databases {

        String db_name;

        public databases() {
        }

        public databases(String db_name) {
            this.db_name = db_name;
        }
    }

    public static class tables {

        String table_name;
        int no_of_records;

        public tables(String table_name, int no_of_records) {
            this.table_name = table_name;
            this.no_of_records = no_of_records;
        }

    }

    public static class columns {

        String column_name;
        String data_type;
        int size;
        boolean is_selected;

        public columns(String column_name, String data_type, int size, boolean is_selected) {
            this.column_name = column_name;
            this.data_type = data_type;
            this.size = size;
            this.is_selected = is_selected;
        }

        public String getColumn_name() {
            return column_name;
        }

        public void setColumn_name(String column_name) {
            this.column_name = column_name;
        }

        public String getData_type() {
            return data_type;
        }

        public void setData_type(String data_type) {
            this.data_type = data_type;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public boolean isIs_selected() {
            return is_selected;
        }

        public void setIs_selected(boolean is_selected) {
            this.is_selected = is_selected;
        }

    }

    public static List<databases> get_databases(String host_name, String port, String username, String password) {
        List<databases> datas = new ArrayList();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://" + host_name + ":" + port + "/";
            Connection con = DriverManager.getConnection(url, username, password);

            ResultSet rs = con.getMetaData().
                    getCatalogs();

            while (rs.next()) {
                databases to = new databases(rs.getString("TABLE_CAT"));
                datas.add(to);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return datas;
    }

    public static List<tables> get_tables(String db_name, String host_name, String port, String username, String password) {

        List<tables> datas = new ArrayList();
        String url = "jdbc:mysql://" + host_name + ":" + port + "/" + db_name;
        String driver = "com.mysql.jdbc.Driver";

        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, username, password);
            DatabaseMetaData dbm = con.getMetaData();
            String[] types = {"TABLE"};
            ResultSet rs = dbm.getTables(null, null, "%", types);

            while (rs.next()) {
                String table = rs.getString("TABLE_NAME");
                List<Mysql.columns> datas2 = Mysql.get_columns2(db_name, table, host_name, port, username, password);
                int i = 0;
                String colname = "";
                for (Mysql.columns t : datas2) {
                    if (i == 0) {
                        colname = t.column_name;
                        break;
                    }
                }

                String s0 = "select count(" + colname + ") from " + db_name + "." + table;
                Statement stmt = con.createStatement();
                ResultSet rs2 = stmt.executeQuery(s0);
                int no_of_records = 0;
                if (rs2.next()) {
                    no_of_records = rs2.getInt(1);
                }

                tables to = new tables(table, no_of_records);

                datas.add(to);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return datas;
    }

    public static List<columns> get_columns(String dbName, String table_name, String host_name, String port, String username, String password) {

        List<columns> datas = new ArrayList();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://" + host_name + ":" + port + "/";
            Connection con = DriverManager.getConnection(url, username, password);
            dbName = dbName + "." + table_name;

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM  " + dbName + " ");
            ResultSetMetaData rsmd = rs.getMetaData();
            int NumOfCol = rsmd.getColumnCount();
            for (int i = 1; i <= NumOfCol; i++) {

                String name = rsmd.getColumnName(i);
                String type = rsmd.getColumnTypeName(i);
                int size = rsmd.getColumnDisplaySize(i);

                columns t = new columns(name, type, size, true);

                datas.add(t);
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return datas;
    }

    public static List<columns> get_columns2(String dbName, String table_name, String host_name, String port, String username, String password) {

        List<columns> datas = new ArrayList();

        try {
            dbName = dbName + "." + table_name;
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://" + host_name + ":" + port + "/";
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM  " + dbName + " ");
            ResultSetMetaData rsmd = rs.getMetaData();
            int NumOfCol = rsmd.getColumnCount();
            for (int i = 1; i <= 1; i++) {

                String name = rsmd.getColumnName(i);
                String type = rsmd.getColumnTypeName(i);
                columns t = new columns(name, type, 0, true);

                datas.add(t);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return datas;
    }

    public static String transfer_object(List<columns> to, String table_name) {

        String parameter = "";

        String text = "public static class to_" + table_name + "{\n\n";
        int i = 0;
        for (columns t : to) {
            String type = t.data_type;
            if (type.equalsIgnoreCase("integer") || type.equalsIgnoreCase("tinyint")) {
                type = "int";
            } else if (type.equalsIgnoreCase("double")) {
                type = "double";
            } else {
                type = "String";
            }

            text = text + "   public final " + type + " " + t.column_name + ";\n";
            if (i == to.size() - 1) {
                parameter = parameter + " " + type + " " + t.column_name + "";
            } else {
                parameter = parameter + " " + type + " " + t.column_name + ",";
            }

            i++;
        }

        text = text + "\n";
        text = text + "public to_" + table_name + "(" + parameter + ")" + "{\n";
        for (columns t : to) {

//            String type = t.data_type;
//            if (type.equalsIgnoreCase("integer") || type.equalsIgnoreCase("tinyint")) {
//                type = "int";
//            } else if (type.equalsIgnoreCase("double")) {
//                type = "double";
//            } else {
//                type = "String";
//            }
            if (t.is_selected == true) {
                text = text + "   this." + t.column_name + " = " + t.column_name + ";\n";
            }
        }
        text = text + "     }\n";
        text = text + "}\n";

        return text;
    }

    public static String insert(List<columns> to, String database, String table_name) {

        String parameter = "";
        String text = "";
        text = text + "public static void  add_data( to_" + table_name + " to_" + table_name + "){ \n";

        text = text + "try {\n Connection conn = MyConnection.connect();\n";
        text = text + "String s0=\"insert into "  + table_name + "(\"\n";

        String col_names = "";
        String col_sql = "";
        int i = 0;
        for (columns t : to) {

            if (i > 0) {

                if (i == 1) {
                    col_names = col_names + "   +\"" + t.column_name + "\"\n";
                    col_sql = col_sql + "   +\":" + t.column_name + "\"\n";
                } else {
                    col_names = col_names + "   +\"," + t.column_name + "\"\n";
                    col_sql = col_sql + "   +\",:" + t.column_name + "\"\n";
                }
            }

            i++;
        }
        text = text + col_names + "   +\")values(\"\n";
        text = text + col_sql + "   +\")\";\n";

        text = text + "\n";
        text = text + "  s0= SqlStringUtil.parse(s0)" + "\n";
        int o = 0;
        for (columns t : to) {
            String type = t.data_type;
            if (type.equalsIgnoreCase("integer") || type.equalsIgnoreCase("tinyint") || type.
                    equalsIgnoreCase("double")) {
                type = "Number";
            } else {
                type = "String";
            }
            if (t.is_selected == true) {
                if (o > 0) {
                    text = text + "     .set" + type + "(\"" + t.column_name + "\",to_" + table_name + "." + t.column_name + ")\n";
                }
                o++;
            }

        }

        text = text + "     .ok();\n";
        text = text + "\n";

        text = text + "  PreparedStatement stmt = conn.prepareStatement(s0);" + "\n";
        text = text + "  stmt.execute();" + "\n";
        text = text + "   Lg.s(S1_to.class, \"Successfully Added\");" + "\n";
        text = text + "} catch (SQLException e) { \n  throw new RuntimeException(e);\n";
        text = text + " } finally { \n  MyConnection.close();\n  }\n  }\n";
        return text;
    }

    public static String update(List<columns> to, String database, String table_name) {

        String parameter = "";
        String text = "";
        text = text + "public static void  update_data( to_" + table_name + " to_" + table_name + "){ \n";

        text = text + "try {\n Connection conn = MyConnection.connect();\n";
        text = text + "String s0=\"update " + table_name + " set \"\n";

        String col_names = "";
        int i = 0;
        for (columns t : to) {
            if (t.is_selected == true) {
                if (i > 0) {
                    if (i == 1) {
                        col_names = col_names + "   +\"" + "" + t.column_name + "= :" + t.column_name + " \"\n";
                    } else {
                        col_names = col_names + "   +\"" + "," + t.column_name + "= :" + t.column_name + " \"\n";
                    }

                }
                i++;
            }

        }
        text = text + col_names + "   +\" where id=\'\"+to_" + table_name + ".id+\"\' \"\n";
        String wheres = "";
        text = text + wheres + "";
        text = text + "   +\" \";\n";
        text = text + "\n";

        text = text + "\n";
        text = text + "  s0= SqlStringUtil.parse(s0)" + "\n";
        int o = 0;
        for (columns t : to) {
            String type = t.data_type;
            if (type.equalsIgnoreCase("integer") || type.equalsIgnoreCase("tinyint") || type.
                    equalsIgnoreCase("double")) {
                type = "Number";
            } else {
                type = "String";
            }
            if (t.is_selected == true) {
                if (o > 0) {
                    text = text + "     .set" + type + "(\"" + t.column_name + "\",to_" + table_name + "." + t.column_name + ")\n";
                }
                o++;
            }

        }

        text = text + "     .ok();\n";
        text = text + "\n";

        text = text + "  PreparedStatement stmt = conn.prepareStatement(s0);" + "\n";
        text = text + "  stmt.execute();" + "\n";
        text = text + "   Lg.s(S1_to.class, \"Successfully Updated\");" + "\n";

        text = text + "} catch (SQLException e) { \n  throw new RuntimeException(e);\n";
        text = text + " } finally { \n  MyConnection.close();\n  }\n  }\n";
        return text;

    }

    public static String delete(List<columns> to, String database, String table_name) {

        String parameter = "";
        String text = "";
        text = text + "public static void  delete_data( to_" + table_name + " to_" + table_name + "){ \n";

        text = text + "try {\n Connection conn = MyConnection.connect();\n";
        text = text + "String s0=\"delete from " + table_name + "  \"\n";

        String wheres = "   +\" where id=\'\"+to_" + table_name + ".id+\"\' \"\n";

        text = text + wheres + "";

        text = text + "   +\" \";\n";
        text = text + "\n";

        text = text + "  PreparedStatement stmt = conn.prepareStatement(s0);" + "\n";
        text = text + "  stmt.execute();" + "\n";
        text = text + "  Lg.s(S1_to.class, \"Successfully Deleted\");" + "\n";

        text = text + "} catch (SQLException e) { \n  throw new RuntimeException(e);\n";
        text = text + " } finally { \n  MyConnection.close();\n  }\n  }\n";
        return text;
    }

    public static String select_list(List<columns> to, String database, String table_name) {

        String text = "";
        text = text + "public static List<to_" + table_name + "> ret_data(String where){ \n";
        text = text + "List<to_" + table_name + "> datas=new ArrayList(); \n\n";
        text = text + "try {\n Connection conn = MyConnection.connect();\n";

        String col_names = "";
        String col_name2 = "";
        String results = "";
        int i = 0;

        for (columns t : to) {

            String type = "";
            if (t.is_selected == true) {
                if (i == 0) {
                    col_names = col_names + "   +\"" + t.column_name + "\"\n";
                } else {
                    col_names = col_names + "   +\"," + t.column_name + "\"\n";
                }
            }

            if (t.data_type.equalsIgnoreCase("integer") || t.data_type.equalsIgnoreCase("tinyint")) {
//                type = "int";

                if (t.is_selected == true) {
                    results = results + "int " + t.column_name + "=" + "rs.getInt(" + (i + 1) + ");\n";
                    if (i == to.size() - 1) {
                        col_name2 = col_name2 + t.column_name + "";
                    } else {
                        col_name2 = col_name2 + t.column_name + ", ";
                    }
                } else {
                    results = results + "int " + t.column_name + "=" + "0;\n";
                    if (i == to.size() - 1) {
                        col_name2 = col_name2 + "0" + "";
                    } else {
                        col_name2 = col_name2 + "0" + ", ";
                    }
                }
            } else if (type.equalsIgnoreCase("DOUBLE")) {
//                type = "double";

                if (t.is_selected == true) {
                    results = results + "double " + t.column_name + "=" + "rs.getDouble(" + (i + 1) + ");\n";
                    if (i == to.size() - 1) {
                        col_name2 = col_name2 + t.column_name + "";
                    } else {
                        col_name2 = col_name2 + t.column_name + ", ";
                    }
                } else {
                    results = results + "int " + t.column_name + "=" + "0;\n";
                    if (i == to.size() - 1) {
                        col_name2 = col_name2 + "0" + "";
                    } else {
                        col_name2 = col_name2 + "0" + ", ";
                    }
                }
            } else {
//                type = "String";

                if (t.is_selected == true) {

                    if (t.data_type.equals("DOUBLE")) {
                        results = results + "double " + t.column_name + "=" + "rs.getDouble(" + (i + 1) + ");\n";
                    } else {
                        results = results + "String " + t.column_name + "=" + "rs.getString(" + (i + 1) + ");\n";
                    }

                    if (i == to.size() - 1) {
                        col_name2 = col_name2 + t.column_name + "";
                    } else {
                        col_name2 = col_name2 + t.column_name + ", ";
                    }

                } else {
                    if (t.data_type.equals("DOUBLE")) {
                        results = results + "double " + t.column_name + "=" + "0;\n";
                    } else {
                        results = results + "String " + t.column_name + "=" + "\"\";\n";
                    }

                    if (i == to.size() - 1) {
                        col_name2 = col_name2 + "\"\"" + "";
                    } else {
                        col_name2 = col_name2 + "\"\"" + ", ";
                    }
                }
            }
            i++;

        }

        text = text + "String s0=\"select \"\n";

        text = text + col_names + "   +\" from " + table_name + "\" \n   + \" \" + where; \n";
        String wheres = "";

        text = text + wheres + "";
        text = text + "\n";

        text = text + "Statement stmt = conn.createStatement();\n";
        text = text + "ResultSet rs = stmt.executeQuery(s0);\n";
        text = text + "while (rs.next()) {\n";
        text = text + results + "\n";
        text = text + "to_" + table_name + " to=new to_" + table_name + "(" + col_name2 + ");\n";
        text = text + "datas.add(to);\n";
        text = text + "}\n";
        text = text + "return datas;\n";
        text = text + "} catch (SQLException e) { \n  throw new RuntimeException(e);\n";
        text = text + " } finally { \n  MyConnection.close();\n  }\n  }\n";

        return text;

    }

    public static String table(List<columns> to, String database, String table_name) {

        String parameter = "";
        String text = " //<editor-fold defaultstate=\"collapsed\" desc=\" " + table_name + " \"> \n";
        text = text + "public static ArrayListModel tbl_" + table_name + "_ALM; \n";
        text = text + "public static Tbl" + table_name + "Model tbl_" + table_name + "_M;" + " \n\n";

        text = text + "public static void init_tbl_" + table_name + "(JTable tbl_" + table_name + ") {\n";
        text = text + "tbl_" + table_name + "_ALM= new ArrayListModel(); \n";
        text = text + "tbl_" + table_name + "_M=  new Tbl" + table_name + "Model(tbl_" + table_name + "_ALM); \n";
        text = text + "tbl_" + table_name + ".setModel(tbl_" + table_name + "_M); \n";
        text = text + "tbl_" + table_name + ".setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION); \n";
        text = text + "tbl_" + table_name + ".setRowHeight(25); \n";

        int size = 0;
        int[] tbl_widths_accounts = new int[to.size()];
        int ii = 0;
        String width = "";
        String columns = "";
        String switchs = "";
        for (columns s : to) {
            if (s.is_selected == true) {
                size = 100;
            } else {
                size = 0;
            }
            tbl_widths_accounts[ii] = size;
            if (ii == to.size() - 1) {
                width = width + size + "";
                columns = columns + "\"" + s.column_name + "\"";
                switchs = switchs + "default:\n return tt." + s.column_name + ";";
            } else {
                width = width + size + ",";
                columns = columns + "\"" + s.column_name + "\",";
                switchs = switchs + "case " + ii + ":\n return tt." + s.column_name + ";";
            }
            ii++;
        }
        text = text + "int[] tbl_widths_" + table_name + "= {" + width + "}; \n";
        text = text + "for (int i = 0, n = tbl_widths_" + table_name + ".length; i < n; i++) { \n";
        text = text + "if (i == 100) { \ncontinue;\n}";
        text = text + "TableWidthUtilities.setColumnWidth(tbl_" + table_name + ", i, tbl_widths_" + table_name + "[i]);\n}\n";

        text = text + "Dimension d = tbl_" + table_name + ".getTableHeader(). getPreferredSize();\n";
        text = text + "d.height = 25;\n";
        text = text + "tbl_" + table_name + ".getTableHeader().setPreferredSize(d);\n";
        text = text + "tbl_" + table_name + ".getTableHeader().setFont(new java.awt.Font(\"Arial\",0, 12)); \n";
        text = text + "tbl_" + table_name + ".setRowHeight(25); \n ";
        text = text + "tbl_" + table_name + ".setFont(new java.awt.Font(\"Arial\", 0, 12)); \n}\n";

        text = text + "public static void loadData_" + table_name + "(List<to_" + table_name + "> acc) { \n";
        text = text + "tbl_" + table_name + "_ALM.clear(); \n";
        text = text + "tbl_" + table_name + "_ALM.addAll(acc); \n}\n\n";

        text = text + "public static class Tbl" + table_name + "Model extends AbstractTableAdapter { \n\n";
        text = text + "public static String[] COLUMNS = {\n" + columns + "\n };\n";

        text = text + "public Tbl" + table_name + "Model(ListModel listmodel) {\n super(listmodel, COLUMNS); \n}\n";
        text = text + "@Override \n public boolean isCellEditable(int row, int column) {\n";
        text = text + "if (column == 100) {\n  return true;\n }\n return false; \n } \n";

        text = text + "@Override \n public Class getColumnClass(int col) {\n ";
        text = text + "if (col == 1000) {\n  return Boolean.class;\n }\n return Object.class;\n } \n";

        text = text + "@Override \n public Object getValueAt(int row, int col) {\n ";
        text = text + "to_" + table_name + " tt = (to_" + table_name + ") getRow(row);\n ";
        text = text + " switch (col) {\n ";
        text = text + "" + switchs + "\n}\n}\n}\n";

        text = text + "//</editor-fold> \n\n";

        return text;
    }

    public static class column_type {

        public final String type;
        public final int type_status;
        public final int has_length;

        public column_type(String type, int type_status, int has_length) {
            this.type = type;
            this.type_status = type_status;
            this.has_length = has_length;
        }
    }

    public static class to_columns {

        public String column_name;
        public String data_type;
        public int size;
        public final int is_selected;

        public to_columns(String column_name, String data_type, int size, int is_selected) {

            this.column_name = column_name;
            this.data_type = data_type;
            this.size = size;
            this.is_selected = is_selected;
        }

        public String getColumn_name() {
            return column_name;
        }

        public void setColumn_name(String column_name) {
            this.column_name = column_name;
        }

        public String getData_type() {
            return data_type;
        }

        public void setData_type(String data_type) {
            this.data_type = data_type;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

    }

    public static List<column_type> column_types() {
        List<column_type> datas = new ArrayList();
        column_type to1 = new column_type("int", 0, 0);
        column_type to37 = new column_type("double", 0, 0);
        column_type to38 = new column_type("datetime", 0, 0);
        column_type to2 = new column_type("varchar", 0, 1000);
        column_type to3 = new column_type("text", 0, 0);
        column_type to4 = new column_type("date", 0, 0);

        column_type to5 = new column_type("Numeric", 1, 0);

        column_type to6 = new column_type("tinyint", 2, 0);
        column_type to7 = new column_type("smallint", 2, 0);
        column_type to8 = new column_type("mediumint", 2, 0);
        column_type to9 = new column_type("int", 2, 0);
        column_type to10 = new column_type("bigint", 2, 0);
        column_type to11 = new column_type("decimal", 2, 0);
        column_type to12 = new column_type("float", 2, 0);
        column_type to13 = new column_type("double", 2, 0);
        column_type to14 = new column_type("real", 2, 0);
        column_type to15 = new column_type("bit", 2, 0);
        column_type to16 = new column_type("boolean", 2, 0);
        column_type to17 = new column_type("serial", 2, 0);

        column_type to18 = new column_type("Date and Time", 1, 0);

        column_type to19 = new column_type("date", 1, 0);
        column_type to20 = new column_type("datetime", 2, 0);
        column_type to21 = new column_type("timestamp", 2, 0);
        column_type to22 = new column_type("time", 2, 0);
        column_type to23 = new column_type("year", 2, 0);

        column_type to24 = new column_type("String", 1, 0);

        column_type to25 = new column_type("char", 2, 0);
        column_type to26 = new column_type("varchar", 2, 1000);
        column_type to27 = new column_type("tinytext", 2, 0);
        column_type to28 = new column_type("text", 2, 0);
        column_type to29 = new column_type("mediumtext", 2, 0);
        column_type to30 = new column_type("longtext", 2, 0);
        column_type to31 = new column_type("binary", 2, 0);
        column_type to32 = new column_type("varbinary", 2, 0);
        column_type to33 = new column_type("tinyblob", 2, 0);
        column_type to34 = new column_type("mediumblob", 2, 0);
        column_type to35 = new column_type("blob", 2, 0);
        column_type to36 = new column_type("longblob", 2, 0);

        datas.add(to1);
        datas.add(to37);
        datas.add(to38);
        datas.add(to2);
        datas.add(to3);
        datas.add(to4);
        datas.add(to5);
        datas.add(to6);
        datas.add(to7);
        datas.add(to8);
        datas.add(to9);
        datas.add(to10);
        datas.add(to11);
        datas.add(to12);
        datas.add(to13);
        datas.add(to14);
        datas.add(to15);
        datas.add(to16);
        datas.add(to17);
        datas.add(to18);
        datas.add(to19);
        datas.add(to20);
        datas.add(to21);
        datas.add(to22);
        datas.add(to23);
        datas.add(to24);
        datas.add(to25);
        datas.add(to26);
        datas.add(to27);
        datas.add(to28);
        datas.add(to29);
        datas.add(to30);
        datas.add(to31);
        datas.add(to32);
        datas.add(to33);
        datas.add(to34);
        datas.add(to35);
        datas.add(to36);

        return datas;
    }

    public static String create_table(String dbname, String table_name, List<Mysql.to_columns> datas, String host_name, String port, String username, String password) {
        String text = "create table " + dbname + "." + table_name + "( \n ";
        text = text + "id int auto_increment primary key  \n ";
        for (Mysql.to_columns to : datas) {
            if (to.size > 0) {
                text = text + "," + to.column_name + " " + to.data_type + "(" + to.size + ")\n";
            } else {
                text = text + "," + to.column_name + " " + to.data_type + "\n";
            }
        }
        text = text + "); ";

        try {

            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://" + host_name + ":" + port + "/";
            Connection con = DriverManager.getConnection(url, username, password);

            Statement stmt = con.createStatement();
            stmt.executeUpdate(text);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return text;
    }

    public static String drop_table(String dbname, String table_name, String host_name, String port, String username, String password) {
        String text = "drop table " + dbname + "." + table_name + "; ";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://" + host_name + ":" + port + "/";
            Connection con = DriverManager.getConnection(url, username, password);

            Statement stmt = con.createStatement();
            stmt.executeUpdate(text);
            return text;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static String empty_table(String dbname, String table_name, String host_name, String port, String username, String password) {
        String text = "TRUNCATE  table " + dbname + "." + table_name + "; ";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://" + host_name + ":" + port + "/";
            Connection con = DriverManager.getConnection(url, username, password);

            Statement stmt = con.createStatement();
            stmt.executeUpdate(text);
            return text;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static String duplicate_table(String dbname, String table_name, String host_name, String port, String username, String password, String new_table_name, List<Mysql.columns> datas) {
        String text = "create table " + dbname + "." + new_table_name + "( \n ";
        text = text + "id int auto_increment primary key  \n ";

        for (Mysql.columns to : datas) {
            if (!to.column_name.equalsIgnoreCase("id")) {

                if (to.data_type.equalsIgnoreCase("double")) {
                    text = text + "," + to.column_name + " " + to.data_type + " \n";
                } else {
                    text = text + "," + to.column_name + " " + to.data_type + "(" + to.size + ")\n";
                }
            }

        }
        text = text + "); ";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://" + host_name + ":" + port + "/";
            Connection con = DriverManager.getConnection(url, username, password);

            Statement stmt = con.createStatement();
            stmt.executeUpdate(text);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return text;

    }

    public static String add_column(String dbname, String table_name, String host_name, String port, String username, String password, String new_column, String new_column_type, int new_column_size) {
        String text = "alter  table " + dbname + "." + table_name + " add " + new_column + " " + new_column_type.toLowerCase() + " ;";
        if (new_column_size > 0) {
            text = "alter  table " + dbname + "." + table_name + " add " + new_column + " " + new_column_type.toLowerCase() + " (" + new_column_size + ");";
        }

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://" + host_name + ":" + port + "/";
            Connection con = DriverManager.getConnection(url, username, password);

            Statement stmt = con.createStatement();
            stmt.executeUpdate(text);
            return text;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static String crud(List<columns> to, String database, String table_name) {

        String parameter = "id";
        String clear = "";
        String add = " private void add_" + table_name + "() { \n\n";
        add = add + " int id=0; \n";

        String select = " private void select_" + table_name + "() { \n\n";
        select = select + " int row = tbl_" + table_name + ".getSelectedRow(); \n";
        select = select + " if (row < 0) { \n";
        select = select + " return;\n } \n";
        select = select + " to_" + table_name + " to = (to_" + table_name + ") tbl_" + table_name + "_ALM.get(row); \n";

        String update = " private void update_" + table_name + "() { \n\n";
        update = update + " int row = tbl_" + table_name + ".getSelectedRow(); \n";
        update = update + " if (row < 0) { \n";
        update = update + " return;\n } \n";
        update = update + " to_" + table_name + " to = (to_" + table_name + ") tbl_" + table_name + "_ALM.get(row); \n";
        update = update + " int id=0; \n";

        String delete = " private void delete_" + table_name + "() { \n\n";
        delete = delete + " int row = tbl_" + table_name + ".getSelectedRow(); \n";
        delete = delete + " if (row < 0) { \n";
        delete = delete + " return;\n } \n";
        delete = delete + " to_" + table_name + " to = (to_" + table_name + ") tbl_" + table_name + "_ALM.get(row); \n";

        String data = " private void data_disbursements(){ \n";
        data = data + " String where=\"\"; \n";
        data = data + " List<S1_" + table_name + ".to_" + table_name + "> datas=S1_" + table_name + ".ret_data(where); \n";
        data = data + " loadData_" + table_name + "(datas);";
        data = data + " }\n\n";

        int i = 0;
        for (columns t : to) {
            if (t.is_selected == true) {
                if (i > 0) {
                    if (t.data_type.equalsIgnoreCase("double")) {
                        add = add + " double " + t.column_name + " = FitIn.toDouble(tf_" + t.column_name + ".getText()); \n";
                        select = select + " tf_" + t.column_name + ".setText(FitIn.fmt_wc_0(to." + t.column_name + ")); \n";
                        update = update + " double " + t.column_name + " = FitIn.toDouble(tf_" + t.column_name + ".getText()); \n";
                    } else if (t.data_type.equalsIgnoreCase("int")) {
                        add = add + " int " + t.column_name + " = FitIn.toInt(tf_" + t.column_name + ".getText()); \n";
                        select = select + " tf_" + t.column_name + ".setText(FitIn.fmt_woc(to." + t.column_name + ")); \n";
                        update = update + " int " + t.column_name + " = FitIn.toInt(tf_" + t.column_name + ".getText()); \n";
                    } else {

                        add = add + " String " + t.column_name + " = tf_" + t.column_name + ".getText(); \n";
                        select = select + " tf_" + t.column_name + ".setText(to." + t.column_name + "); \n";
                        update = update + " String " + t.column_name + " = tf_" + t.column_name + ".getText(); \n";
                    }
                    clear = clear + " tf_" + t.column_name + ".setText(\"\"); \n";

                    parameter = parameter + "," + t.column_name;
                }
                i++;
            }
        }
        add = add + "\n to_" + table_name + " to = new to_" + table_name + "(" + parameter + "); \n";
        add = add + " add_data(to); \n";
        add = add + clear + "\n";
        add = add + "}\n\n";

        select = select + "\n}\n\n";

        update = update + "\n to_" + table_name + " to1 = new to_" + table_name + "(" + parameter + "); \n";
        update = update + " update_data(to1); \n";
        update = update + clear + "\n";
        update = update + "}\n\n";

        delete = delete + " delete_data(to); \n";
        delete = delete + clear + "\n";
        delete = delete + "}\n\n";

        String text = add;
        text = text + select;
        text = text + update;
        text = text + delete;
        text = text + data;

        return text;
    }

}
