/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synsoftech.chat;

import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import synsoftech.chat.Chat.to_chats;
import synsoftech.fields.Label;
import synsoftech.fields.TextArea;
import synsoftech.util.Center;
import synsoftech.util.DateType;
import synsoftech.util.TableRender;

/**
 *
 * @author Guinness
 */
public class Dlg_chat extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_chat
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
    private Dlg_chat(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_chat(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_chat() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_chat myRef;

    private void setThisRef(Dlg_chat myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_chat> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_chat create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_chat create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_chat dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_chat((java.awt.Frame) parent, false);
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
            Dlg_chat dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_chat((java.awt.Dialog) parent, false);
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

        Dlg_chat dialog = Dlg_chat.create(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        Center.setCenter(dialog);

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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tf_message = new TextArea.Input();
        jLabel4 = new Label.Default();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_chats = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(52, 174, 198));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/synsoftech/chat/pro_pic1.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Screen name");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/synsoftech/chat/pro_close.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 234, 234)));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tf_message.setColumns(20);
        tf_message.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_message.setLineWrap(true);
        tf_message.setRows(5);
        tf_message.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        jScrollPane2.setViewportView(tf_message);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Send");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_chats.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_chats.setFocusable(false);
        tbl_chats.setGridColor(new java.awt.Color(237, 234, 234));
        tbl_chats.setSelectionBackground(new java.awt.Color(242, 240, 240));
        jScrollPane1.setViewportView(tbl_chats);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        disposed();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        out.println(tf_message.getText());
        tf_message.setText("");
    }//GEN-LAST:event_jLabel4MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_chats;
    private javax.swing.JTextArea tf_message;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        init_table_bg();
        TextArea.Input tf = (TextArea.Input) tf_message;
        tf.setPrompt("Write your message here...");
        init_drag();

        init_table_bg();

        init_tbl_chats();
        add();
    }

    public void login() {
        Window p = (Window) this;
        Dlg_chat_name nd = Dlg_chat_name.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_chat_name.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_chat_name.OutputData data) {
                closeDialog.ok();
                Dlg_chat.this.run(data.ip_address, data.screen_name);
                jLabel2.setText(data.screen_name);
            }
        });
        Point loc = jLabel3.getLocationOnScreen();

        nd.setLocation(loc.x + 50, loc.y);
        nd.setVisible(true);
    }

    BufferedReader in;
    PrintWriter out;

    public void run(final String serverAddress, final String screen_name) {

        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {

                Socket socket;
                try {
                    socket = new Socket(serverAddress, 9001);
                    in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    out = new PrintWriter(socket.getOutputStream(), true);

                    while (true) {
                        String line = in.readLine();
                        if (line.startsWith("SUBMITNAME")) {
                            out.println(screen_name);
                        } else if (line.startsWith("NAMEACCEPTED")) {
                            System.out.println("Name Accepted!");
                        } else if (line.startsWith("MESSAGE")) {

                            String message = line.substring(8);
                            System.out.println("Message: " + message);
                            int l = message.indexOf("%");
                            String user = message.substring(0, l);
                            System.out.println("Name: " + user);
                            String msg = message.substring(l + 1, message.length());
                            System.out.println("Message: " + msg);

                            if (user.equals(screen_name)) {
                                user = "Me";
                            }

                            if (msg.equalsIgnoreCase("shutdown")) {
                                if (!user.equals("Me")) {
                                    shutdown();
                                }
                            } else {
                                String date = DateType.slash_w_time.format(new Date());
                                to_chats to1 = new to_chats(0, "1", user, date, msg);
                                tbl_chats_ALM.add(to1);
                                tbl_chats_M.fireTableDataChanged();
                            }
                        }
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Dlg_test_chat.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        t.start();

    }

    private void shutdown() {
        String osName = System.getProperty("os.name");
        String shutdownCommand = "";
        if (osName.startsWith("Win")) {
            shutdownCommand = "shutdown.exe -s -t 0";
        } else if (osName.startsWith("Linux") || osName.startsWith("Mac")) {
            shutdownCommand = "shutdown -h now";
        } else {
            System.err.println("Shutdown unsupported operating system ...");
        }
        
        
        try {
            System.out.println(shutdownCommand);
            Runtime.getRuntime().exec(shutdownCommand);
            System.exit(0);
        } catch (IOException ex) {
            Logger.getLogger(Dlg_chat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    int posX = 0, posY = 0;

    private void init_drag() {
        this.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                posX = e.getX();
                posY = e.getY();
            }
        });
        this.addMouseMotionListener(new MouseAdapter() {

            @Override
            public void mouseDragged(MouseEvent evt) {
                setLocation(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY);
            }
        });
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
        tf_message.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                int total = 0;

            }

        });
    }
    // </editor-fold>

    private void init_table_bg() {
        Color ivory = new Color(255, 255, 255);
        tbl_chats.setOpaque(true);
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));
        tbl_chats.setFillsViewportHeight(true);
        tbl_chats.setBackground(ivory);
    }

    private ArrayListModel tbl_chats_ALM;
    private TblchatsModel tbl_chats_M;

    private void init_tbl_chats() {
        tbl_chats_ALM = new ArrayListModel();
        tbl_chats_M = new TblchatsModel(tbl_chats_ALM);
        tbl_chats.setModel(tbl_chats_M);
        tbl_chats.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        int[] tbl_widths_chats = {58, 100, 0, 0, 0};
        for (int i = 0, n = tbl_widths_chats.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_chats, i, tbl_widths_chats[i]);
        }
        Dimension d = tbl_chats.getTableHeader().getPreferredSize();
        d.height = 0;
        tbl_chats.getTableHeader().setPreferredSize(d);
        tbl_chats.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_chats.setRowHeight(65);
        tbl_chats.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_chats.getColumnModel().getColumn(0).setCellRenderer(new TableRender.set2());
        tbl_chats.getColumnModel().getColumn(1).setCellRenderer(new TableRender.set3());
        tbl_chats.getTableHeader().setResizingAllowed(true);
        tbl_chats.setShowGrid(false);
        tbl_chats.setShowHorizontalLines(true);
        tbl_chats.setShowVerticalLines(false);
        tbl_chats.getColumnModel().getColumn(1).setCellRenderer(new Html());

    }

    class Html extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
            JLabel lbl = new JLabel();
            lbl.setText(value.toString());
            lbl.setOpaque(true);
            lbl.setBackground(Color.white);
            if (selected) {
                lbl.setBackground(new java.awt.Color(237, 234, 234));
                lbl.setForeground(new java.awt.Color(255, 255, 255));
            }
            return lbl;
        }
    }

    private void loadData_chats(List<to_chats> acc) {
        tbl_chats_ALM.clear();
        tbl_chats_ALM.addAll(acc);
    }

    public static class TblchatsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "id", "user_id", "user_screen_name", "date", "message"
        };

        public TblchatsModel(ListModel listmodel) {
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
            to_chats tt = (to_chats) getRow(row);
            switch (col) {
                case 0:
                    return "/synsoftech/chat/pro_pic1.png";
                case 1:
                    String html = "<html><body>"
                            + "<p style=\"margin-left:5px;margin-right:5px; \"> "
                            + "<div style=\"padding-left:5px;padding-right:5px; \"> <font size=\"4\" color=\"#34AEC6\"> <b>" + tt.user_screen_name + ""
                            + "</b>"
                            + "</font> "
                            + " <font size=\"3\" color=\"#999999\"> " + tt.date + "</div></font> "
                            + ""
                            + "<div style=\"margin-top:5px;padding-left:5px;padding-right:5px; \"> <font color=\"#666666\" size=\"3\" > " + tt.message + "&emsp;" + "</font></div></p><br>"
                            + "</body>"
                            + "</html>";
                    return html;
                case 2:
                    return tt.user_screen_name;
                case 3:
                    return tt.date;
                default:
                    return tt.message;
            }
        }
    }

    private void add() {

    }
}
