/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synsoftech.mysql;

import POS.pnl.Dashboard;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import synsoftech.fields.Field;
import synsoftech.fields.Label;
import synsoftech.panels.Confirm;
import synsoftech.rendering.Dlg_transfer_object;
import synsoftech.util.ImageRenderer1;
import synsoftech.util.TableRenderer;

/**
 *
 * @author Guinness
 */
public class Dlg_mysql_database extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_mysql_database
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
    private Dlg_mysql_database(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_mysql_database(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_mysql_database() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_mysql_database myRef;

    private void setThisRef(Dlg_mysql_database myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_mysql_database> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_mysql_database create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_mysql_database create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_mysql_database dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_mysql_database((java.awt.Frame) parent, false);
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
            Dlg_mysql_database dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_mysql_database((java.awt.Dialog) parent, false);
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

        Dlg_mysql_database dialog = Dlg_mysql_database.create(new javax.swing.JFrame(), true);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new Label.Separator2();
        tf_db = new Field.Combo();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_tables = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        lbl_db = new org.jdesktop.swingx.JXLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel13 = new javax.swing.JLabel();
        pnl_holder = new javax.swing.JPanel();
        pnl_return = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        pnl_data = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Host Name:");

        jLabel2.setText("Localhost");

        jLabel3.setText("3306");

        jLabel4.setText("Port:");

        jLabel5.setText("root");

        jLabel6.setText("Username:");

        jLabel7.setText("Password:");

        jLabel8.setText("password");

        tf_db.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_db.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_dbMouseClicked(evt);
            }
        });
        tf_db.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_dbActionPerformed(evt);
            }
        });

        tbl_tables.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_tables.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_tables.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_tablesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbl_tablesMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_tables);

        jLabel10.setText("No of Tables:");

        jLabel11.setText("0");

        jLabel12.setText("Database:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/synsoftech/mysql/light33 (1).png"))); // NOI18N
        jButton1.setToolTipText("Create Database");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/synsoftech/mysql/minus104 (1).png"))); // NOI18N
        jButton2.setToolTipText("Drop Database");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/synsoftech/mysql/copy26.png"))); // NOI18N
        jButton3.setToolTipText("Duplicate Database w/out Data");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/synsoftech/mysql/data21.png"))); // NOI18N
        jButton4.setToolTipText("Duplicate Database w/ Data");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/synsoftech/mysql/light33 (1).png"))); // NOI18N
        jButton5.setToolTipText("Create Table");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        lbl_db.setLineWrap(true);

        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        jLabel13.setText("Status:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(tf_db, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lbl_db, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 37, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(5, 5, 5)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_db, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_db, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        pnl_holder.setBackground(new java.awt.Color(255, 255, 255));
        pnl_holder.setLayout(new java.awt.CardLayout());

        pnl_return.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout pnl_returnLayout = new javax.swing.GroupLayout(pnl_return);
        pnl_return.setLayout(pnl_returnLayout);
        pnl_returnLayout.setHorizontalGroup(
            pnl_returnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_returnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_returnLayout.setVerticalGroup(
            pnl_returnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_returnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_holder.add(pnl_return, "card2");

        pnl_data.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnl_dataLayout = new javax.swing.GroupLayout(pnl_data);
        pnl_data.setLayout(pnl_dataLayout);
        pnl_dataLayout.setHorizontalGroup(
            pnl_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );
        pnl_dataLayout.setVerticalGroup(
            pnl_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
        );

        pnl_holder.add(pnl_data, "card3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_holder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_holder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void tf_dbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_dbActionPerformed
        init_db();
    }//GEN-LAST:event_tf_dbActionPerformed

    private void tf_dbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_dbMouseClicked
        init_db();
    }//GEN-LAST:event_tf_dbMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        add_table();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tbl_tablesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_tablesMouseClicked
        select_table();
    }//GEN-LAST:event_tbl_tablesMouseClicked

    private void tbl_tablesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_tablesMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_tablesMouseEntered

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private org.jdesktop.swingx.JXLabel lbl_db;
    private javax.swing.JPanel pnl_data;
    private javax.swing.JPanel pnl_holder;
    private javax.swing.JPanel pnl_return;
    private javax.swing.JTable tbl_tables;
    private javax.swing.JTextField tf_db;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        init_tbl_tables();

    }
    Dashboard dash;

    public void do_pass(String host_name, String port, String username, String password, Dashboard b) {
        dash = b;
        jLabel2.setText(host_name);
        jLabel3.setText(port);
        jLabel5.setText(username);
        jLabel8.setText(password);
        jLabel8.setVisible(false);
        jLabel7.setVisible(false);
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

    List<Mysql.databases> db_list = new ArrayList();

    private void init_db() {
        final String hostname = jLabel2.getText();
        final String port = jLabel3.getText();
        final String username = jLabel5.getText();
        final String password = jLabel8.getText();

        String search = tf_db.getText();
        db_list.clear();
        db_list = Mysql.get_databases(hostname, port, username, password);
        Object[][] obj = new Object[db_list.size()][1];
        int i = 0;
        for (Mysql.databases to : db_list) {
            obj[i][0] = " " + to.db_name;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_db.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.
                setPopup(tf_db, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                final Mysql.databases to = (Mysql.databases) db_list.get(data.selected_row);
                lbl_db.setText(to.db_name);
                tf_db.setText(to.db_name);
                jProgressBar1.setString("Loading...Please wait...");
                jProgressBar1.setIndeterminate(true);
                Thread t = new Thread(new Runnable() {

                    @Override
                    public void run() {
                        loadData_tables(Mysql.get_tables(to.db_name, hostname, port, username, password));
                        jLabel11.setText("" + tbl_tables_ALM.size());
                        jProgressBar1.setString("Finished...");
                        jProgressBar1.setIndeterminate(false);
                    }
                });
                t.start();

            }
        });
    }

    private ArrayListModel tbl_tables_ALM;
    private TbltablesModel tbl_tables_M;

    private void init_tbl_tables() {
        tbl_tables_ALM = new ArrayListModel();
        tbl_tables_M = new TbltablesModel(tbl_tables_ALM);

        tbl_tables.setModel(tbl_tables_M);
        tbl_tables.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_tables.setRowHeight(25);
        int[] tbl_widths_tables = {100, 50, 30, 30, 30, 30, 30};
        for (int i = 0, n = tbl_widths_tables.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_tables, i, tbl_widths_tables[i]);
        }
        Dimension d = tbl_tables.getTableHeader().getPreferredSize();
        d.height = 0;
        tbl_tables.getTableHeader().setPreferredSize(d);
        tbl_tables.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_tables.setRowHeight(25);
        tbl_tables.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_tables.getColumnModel().getColumn(2).setCellRenderer(new ImageRenderer1());
        tbl_tables.getColumnModel().getColumn(3).setCellRenderer(new ImageRenderer1());
        tbl_tables.getColumnModel().getColumn(4).setCellRenderer(new ImageRenderer1());
        tbl_tables.getColumnModel().getColumn(5).setCellRenderer(new ImageRenderer1());
        tbl_tables.getColumnModel().getColumn(6).setCellRenderer(new ImageRenderer1());
    }

    private void loadData_tables(List<Mysql.tables> acc) {
        tbl_tables_ALM.clear();
        tbl_tables_ALM.addAll(acc);
    }

    public static class TbltablesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "", "", "", "", "", "", ""
        };

        public TbltablesModel(ListModel listmodel) {
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
            Mysql.tables tt = (Mysql.tables) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.table_name;
                case 1:
                    return " " + tt.no_of_records;

                case 2:
                    return "/synsoftech/mysql/eye18 (1).png";
                case 3:
                    return "/synsoftech/mysql/copy26.png";
                case 4:
                    return "/synsoftech/mysql/minus42.png";
                case 5:
                    return "/synsoftech/mysql/empty.png";
                default:
                    return "/synsoftech/mysql/add186.png";
            }
        }
    }

    private void select_table() {
        int row = tbl_tables.getSelectedRow();
        if (row < 0) {
            return;
        }
        final String db_name = lbl_db.getText();
        final String hostname = jLabel2.getText();
        final String port = jLabel3.getText();
        final String username = jLabel5.getText();
        final String password = jLabel8.getText();
        final Mysql.tables to = (Mysql.tables) tbl_tables_ALM.get(row);
        int col = tbl_tables.getSelectedColumn();
        if (col == 0) {
            view_columns();
        }
        if (col == 2) {
            //View table
        }
        if (col == 3) {
            duplicate_table();
        }
        if (col == 4) {

            Window p = (Window) this;
            Confirm nd = Confirm.create(p, true);
            nd.setTitle("");
            if (dash == null) {
                nd.do_pass(jPanel1.getRootPane());
            } else {
                nd.do_pass(dash.getRootPane());
            }

            nd.setCallback(new Confirm.Callback() {
                @Override
                public void ok(CloseDialog closeDialog, Confirm.OutputData data) {
                    closeDialog.ok();
                    jProgressBar1.setString("Loading...Please wait...");
                    jProgressBar1.setIndeterminate(true);
                    Thread t = new Thread(new Runnable() {

                        @Override
                        public void run() {
                            String text = Mysql.drop_table(db_name, to.table_name, hostname, port, username, password);
                            jTextArea1.setText(text);
                            loadData_tables(Mysql.get_tables(db_name, hostname, port, username, password));
                            jLabel11.setText("" + tbl_tables_ALM.size());
                            jProgressBar1.setString("Finished...");
                            jProgressBar1.setIndeterminate(false);
                        }
                    });
                    t.start();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
        if (col == 5) {
            Window p = (Window) this;
            Confirm nd = Confirm.create(p, true);
            nd.setTitle("");
            if (dash == null) {
                nd.do_pass(jPanel1.getRootPane());
            } else {
                nd.do_pass(dash.getRootPane());
            }
            nd.setCallback(new Confirm.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Confirm.OutputData data) {
                    closeDialog.ok();
                    jProgressBar1.setString("Loading...Please wait...");
                    jProgressBar1.setIndeterminate(true);
                    Thread t = new Thread(new Runnable() {

                        @Override
                        public void run() {
                            String text = Mysql.empty_table(db_name, to.table_name, hostname, port, username, password);
                            jTextArea1.setText(text);
                            loadData_tables(Mysql.get_tables(db_name, hostname, port, username, password));
                            jLabel11.setText("" + tbl_tables_ALM.size());
                            jProgressBar1.setString("Finished...");
                            jProgressBar1.setIndeterminate(false);
                        }
                    });
                    t.start();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);

        }
        if (col == 6) {
            Window p = (Window) this;
            Dlg_add_column nd = Dlg_add_column.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_add_column.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, final Dlg_add_column.OutputData data) {
                    closeDialog.ok();
                    jProgressBar1.setString("Loading...Please wait...");
                    jProgressBar1.setIndeterminate(true);
                    Thread t = new Thread(new Runnable() {

                        @Override
                        public void run() {
                            String text = Mysql.add_column(db_name, to.table_name, hostname, port, username, password, data.column_name, data.data_type, data.size);
                            jTextArea1.setText(text);
                            loadData_tables(Mysql.get_tables(db_name, hostname, port, username, password));
                            jProgressBar1.setString("Finished...");
                            jProgressBar1.setIndeterminate(false);
                        }
                    });
                    t.start();
                }
            });
            Point point = jButton5.getLocationOnScreen();
            nd.setLocation(point.x + 35, point.y + 34);
            nd.setVisible(true);
        }
    }

    private void duplicate_table() {
        int row = tbl_tables.getSelectedRow();
        if (row < 0) {
            return;
        }

        final Mysql.tables to = (Mysql.tables) tbl_tables_ALM.get(row);
        final String db_name = lbl_db.getText();
        final String hostname = jLabel2.getText();
        final String port = jLabel3.getText();
        final String username = jLabel5.getText();
        final String password = jLabel8.getText();

        Window p = (Window) this;
        Dlg_mysql_duplicate_table nd = Dlg_mysql_duplicate_table.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_mysql_duplicate_table.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, final Dlg_mysql_duplicate_table.OutputData data) {
                closeDialog.ok();

                jProgressBar1.setString("Loading...Please wait...");
                jProgressBar1.setIndeterminate(true);
                Thread t = new Thread(new Runnable() {

                    @Override
                    public void run() {
                        List<Mysql.columns> datas = Mysql.get_columns(db_name, to.table_name, hostname, port, username, password);
                        String text = Mysql.duplicate_table(db_name, to.table_name, hostname, port, username, password, data.table_name, datas);
                        jTextArea1.setText(text);
                        loadData_tables(Mysql.get_tables(db_name, hostname, port, username, password));
                        jLabel11.setText("" + tbl_tables_ALM.size());

                        jProgressBar1.setString("Finished...");
                        jProgressBar1.setIndeterminate(false);
                    }
                });
                t.start();
            }
        });
        Point point = jButton5.getLocationOnScreen();

        nd.setLocation(point.x + 35, point.y + 34);

        nd.setVisible(true);
    }

    private void view_columns() {
        int row = tbl_tables.getSelectedRow();
        if (row < 0) {
            return;
        }

        Mysql.tables to = (Mysql.tables) tbl_tables_ALM.get(row);
        String db_name = lbl_db.getText();
        final String hostname = jLabel2.getText();
        final String port = jLabel3.getText();
        final String username = jLabel5.getText();
        final String password = jLabel8.getText();
        List<Mysql.columns> datas = Mysql.get_columns(db_name, to.table_name, hostname, port, username, password);

        Window p = (Window) this;
        Dlg_mysql_columns nd = Dlg_mysql_columns.create(p, true);
        nd.setTitle("");
        nd.do_pass(datas, to.table_name, db_name);
        nd.setCallback(new Dlg_mysql_columns.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_mysql_columns.OutputData data) {
                closeDialog.ok();

            }

            @Override
            public void transfer_object(CloseDialog closeDialog, Dlg_mysql_columns.OutputData data) {
                closeDialog.ok();
                jTextArea1.setText(data.ret_val);
                copy_paste(data.ret_val);
            }

            @Override
            public void insert(CloseDialog closeDialog, Dlg_mysql_columns.OutputData data) {
                closeDialog.ok();
                jTextArea1.setText(data.ret_val);
                copy_paste(data.ret_val);
            }

            @Override
            public void update(CloseDialog closeDialog, Dlg_mysql_columns.OutputData data) {
                closeDialog.ok();
                jTextArea1.setText(data.ret_val);
                copy_paste(data.ret_val);
            }

            @Override
            public void delete(CloseDialog closeDialog, Dlg_mysql_columns.OutputData data) {
                closeDialog.ok();
                jTextArea1.setText(data.ret_val);
                copy_paste(data.ret_val);
            }

            @Override
            public void select(CloseDialog closeDialog, Dlg_mysql_columns.OutputData data) {
                closeDialog.ok();
                jTextArea1.setText(data.ret_val);
                copy_paste(data.ret_val);
            }

            @Override
            public void table(CloseDialog closeDialog, Dlg_mysql_columns.OutputData data) {
                closeDialog.ok();
                jTextArea1.setText(data.ret_val);
                copy_paste(data.ret_val);
            }

            @Override
            public void crud(CloseDialog closeDialog, Dlg_mysql_columns.OutputData data) {
                closeDialog.ok();
                jTextArea1.setText(data.ret_val);
                copy_paste(data.ret_val);
            }

        });
        Point point = jButton5.getLocationOnScreen();

        nd.setLocation(point.x + 35, point.y + 34);

        nd.setPreferredSize(new Dimension(380, jScrollPane1.getHeight()));
        nd.setVisible(true);
    }

    private void copy_paste(String output) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        StringSelection strSel = new StringSelection(output);
        clipboard.setContents(strSel, null);
        String result = "";

        try {
            result = (String) clipboard.getData(DataFlavor.stringFlavor);
        } catch (UnsupportedFlavorException e) {
        } catch (IOException e) {
        }
    }

    private void add_table() {
        final String hostname = jLabel2.getText();
        final String port = jLabel3.getText();
        final String username = jLabel5.getText();
        final String password = jLabel8.getText();
        Window p = (Window) this;
        Dlg_mysql_create_table_columns nd = Dlg_mysql_create_table_columns.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_mysql_create_table_columns.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, final Dlg_mysql_create_table_columns.OutputData data) {
                closeDialog.ok();
                jProgressBar1.setString("Loading...Please wait...");
                jProgressBar1.setIndeterminate(true);
                Thread t = new Thread(new Runnable() {

                    @Override
                    public void run() {
                        String text = Mysql.create_table(lbl_db.getText(), data.table_name, data.columns, hostname, port, username, password);
                        loadData_tables(Mysql.get_tables(lbl_db.getText(), hostname, port, username, password));
                        jLabel11.setText("" + tbl_tables_ALM.size());
                        jTextArea1.setText(text);
                        jProgressBar1.setString("Finished...");
                        jProgressBar1.setIndeterminate(false);
                    }
                });
                t.start();

            }
        });
        Point point = jButton5.getLocationOnScreen();
        nd.setPreferredSize(new Dimension(nd.getWidth(), jScrollPane1.getHeight() + 34));
        nd.setLocation(point.x + 40, point.y);
        nd.setVisible(true);
    }

}
