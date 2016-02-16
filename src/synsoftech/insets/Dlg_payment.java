/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synsoftech.insets;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import synsoftech.fields.Label;

/**
 *
 * @author Guinness
 */
public class Dlg_payment extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_payment
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
    private Dlg_payment(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_payment(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_payment() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_payment myRef;

    private void setThisRef(Dlg_payment myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_payment> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_payment create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_payment create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_payment dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_payment((java.awt.Frame) parent, false);
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
            Dlg_payment dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_payment((java.awt.Dialog) parent, false);
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

        Dlg_payment dialog = Dlg_payment.create(new javax.swing.JFrame(), true);
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
        btn_cash = new javax.swing.JButton();
        lbl_cash = new javax.swing.JButton();
        btn_credit = new javax.swing.JButton();
        lbl_credit = new javax.swing.JButton();
        btn_gift = new javax.swing.JButton();
        lbl_gift = new javax.swing.JButton();
        btn_prepaid = new javax.swing.JButton();
        lbl_prepaid = new javax.swing.JButton();
        lbl_cheque = new javax.swing.JButton();
        btn_cheque = new javax.swing.JButton();
        btn_charge = new javax.swing.JButton();
        lbl_charge = new javax.swing.JButton();
        btn_charge1 = new javax.swing.JButton();
        btn_charge2 = new javax.swing.JButton();
        btn_charge3 = new javax.swing.JButton();
        btn_charge4 = new javax.swing.JButton();
        btn_charge5 = new javax.swing.JButton();
        btn_charge6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_charge11 = new javax.swing.JButton();
        btn_charge13 = new javax.swing.JButton();
        btn_charge14 = new javax.swing.JButton();
        btn_charge15 = new javax.swing.JButton();
        btn_charge16 = new javax.swing.JButton();
        btn_charge12 = new javax.swing.JButton();
        btn_charge17 = new javax.swing.JButton();
        btn_charge18 = new javax.swing.JButton();
        btn_charge19 = new javax.swing.JButton();
        btn_charge20 = new javax.swing.JButton();
        btn_charge21 = new javax.swing.JButton();
        btn_charge22 = new javax.swing.JButton();
        btn_charge23 = new javax.swing.JButton();
        btn_charge24 = new javax.swing.JButton();
        btn_charge25 = new javax.swing.JButton();
        btn_charge26 = new javax.swing.JButton();
        tf_amount_tendered = new javax.swing.JTextField();
        btn_cash1 = new javax.swing.JButton();
        lbl_cash1 = new javax.swing.JButton();
        btn_cash2 = new javax.swing.JButton();
        lbl_cash2 = new javax.swing.JButton();
        lbl_separator1 = new Label.Separator2();
        btn_cash3 = new javax.swing.JButton();
        lbl_cash3 = new javax.swing.JButton();
        btn_cash4 = new javax.swing.JButton();
        lbl_cash4 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton31 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lbl_separator2 = new Label.Separator();
        btn_charge7 = new javax.swing.JButton();
        btn_charge8 = new javax.swing.JButton();
        btn_charge9 = new javax.swing.JButton();
        btn_charge10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_cash.setBackground(new java.awt.Color(230, 232, 233));
        btn_cash.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS/icon_payment/money17 (Custom).png"))); // NOI18N
        btn_cash.setText("Cash         ");
        btn_cash.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_cash.setContentAreaFilled(false);
        btn_cash.setFocusable(false);
        btn_cash.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_cash.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_cash.setOpaque(true);

        lbl_cash.setBackground(new java.awt.Color(230, 232, 233));
        lbl_cash.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_cash.setText("1,000.00");
        lbl_cash.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lbl_cash.setContentAreaFilled(false);
        lbl_cash.setFocusable(false);
        lbl_cash.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbl_cash.setOpaque(true);

        btn_credit.setBackground(new java.awt.Color(255, 255, 255));
        btn_credit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_credit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS/icon_payment/credit.png"))); // NOI18N
        btn_credit.setText("Credit");
        btn_credit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_credit.setContentAreaFilled(false);
        btn_credit.setFocusable(false);
        btn_credit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_credit.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_credit.setOpaque(true);

        lbl_credit.setBackground(new java.awt.Color(255, 255, 255));
        lbl_credit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_credit.setText("1,000.00");
        lbl_credit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lbl_credit.setContentAreaFilled(false);
        lbl_credit.setFocusable(false);
        lbl_credit.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbl_credit.setOpaque(true);

        btn_gift.setBackground(new java.awt.Color(255, 255, 255));
        btn_gift.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_gift.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS/icon_payment/gift50 (Custom).png"))); // NOI18N
        btn_gift.setText("Gift Certificate");
        btn_gift.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_gift.setContentAreaFilled(false);
        btn_gift.setFocusable(false);
        btn_gift.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_gift.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_gift.setOpaque(true);

        lbl_gift.setBackground(new java.awt.Color(255, 255, 255));
        lbl_gift.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_gift.setText("1,000.00");
        lbl_gift.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lbl_gift.setContentAreaFilled(false);
        lbl_gift.setFocusable(false);
        lbl_gift.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbl_gift.setOpaque(true);

        btn_prepaid.setBackground(new java.awt.Color(255, 255, 255));
        btn_prepaid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_prepaid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS/icon_payment/prepaid.png"))); // NOI18N
        btn_prepaid.setText("Prepaid");
        btn_prepaid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_prepaid.setContentAreaFilled(false);
        btn_prepaid.setFocusable(false);
        btn_prepaid.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_prepaid.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_prepaid.setOpaque(true);

        lbl_prepaid.setBackground(new java.awt.Color(255, 255, 255));
        lbl_prepaid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_prepaid.setText("1,000.00");
        lbl_prepaid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lbl_prepaid.setContentAreaFilled(false);
        lbl_prepaid.setFocusable(false);
        lbl_prepaid.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbl_prepaid.setOpaque(true);

        lbl_cheque.setBackground(new java.awt.Color(255, 255, 255));
        lbl_cheque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_cheque.setText("1,000.00");
        lbl_cheque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lbl_cheque.setContentAreaFilled(false);
        lbl_cheque.setFocusable(false);
        lbl_cheque.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbl_cheque.setOpaque(true);

        btn_cheque.setBackground(new java.awt.Color(255, 255, 255));
        btn_cheque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cheque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS/icon_payment/cheque.png"))); // NOI18N
        btn_cheque.setText("Cheque");
        btn_cheque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_cheque.setContentAreaFilled(false);
        btn_cheque.setFocusable(false);
        btn_cheque.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_cheque.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_cheque.setOpaque(true);

        btn_charge.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_charge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS/icon_payment/charge.png"))); // NOI18N
        btn_charge.setText("Charge");
        btn_charge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge.setContentAreaFilled(false);
        btn_charge.setFocusable(false);
        btn_charge.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_charge.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_charge.setOpaque(true);

        lbl_charge.setBackground(new java.awt.Color(255, 255, 255));
        lbl_charge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_charge.setText("1,000.00");
        lbl_charge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lbl_charge.setContentAreaFilled(false);
        lbl_charge.setFocusable(false);
        lbl_charge.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbl_charge.setOpaque(true);

        btn_charge1.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_charge1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS/icon_payment/close33 (Custom).png"))); // NOI18N
        btn_charge1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge1.setContentAreaFilled(false);
        btn_charge1.setFocusable(false);
        btn_charge1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge1.setOpaque(true);
        btn_charge1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge1ActionPerformed(evt);
            }
        });

        btn_charge2.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_charge2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS/icon_payment/close33 (Custom).png"))); // NOI18N
        btn_charge2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge2.setContentAreaFilled(false);
        btn_charge2.setFocusable(false);
        btn_charge2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge2.setOpaque(true);
        btn_charge2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge2ActionPerformed(evt);
            }
        });

        btn_charge3.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_charge3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS/icon_payment/close33 (Custom).png"))); // NOI18N
        btn_charge3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge3.setContentAreaFilled(false);
        btn_charge3.setFocusable(false);
        btn_charge3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge3.setOpaque(true);
        btn_charge3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge3ActionPerformed(evt);
            }
        });

        btn_charge4.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_charge4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS/icon_payment/close33 (Custom).png"))); // NOI18N
        btn_charge4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge4.setContentAreaFilled(false);
        btn_charge4.setFocusable(false);
        btn_charge4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge4.setOpaque(true);
        btn_charge4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge4ActionPerformed(evt);
            }
        });

        btn_charge5.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_charge5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS/icon_payment/close33 (Custom).png"))); // NOI18N
        btn_charge5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge5.setContentAreaFilled(false);
        btn_charge5.setFocusable(false);
        btn_charge5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge5.setOpaque(true);
        btn_charge5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge5ActionPerformed(evt);
            }
        });

        btn_charge6.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_charge6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS/icon_payment/close33 (Custom).png"))); // NOI18N
        btn_charge6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge6.setContentAreaFilled(false);
        btn_charge6.setFocusable(false);
        btn_charge6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge6.setOpaque(true);
        btn_charge6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge6ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        btn_charge11.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge11.setText("C");
        btn_charge11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge11.setContentAreaFilled(false);
        btn_charge11.setFocusable(false);
        btn_charge11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge11.setOpaque(true);
        btn_charge11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge11ActionPerformed(evt);
            }
        });

        btn_charge13.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge13.setText("0");
        btn_charge13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge13.setContentAreaFilled(false);
        btn_charge13.setFocusable(false);
        btn_charge13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge13.setOpaque(true);
        btn_charge13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge13ActionPerformed(evt);
            }
        });

        btn_charge14.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge14.setText(".");
        btn_charge14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge14.setContentAreaFilled(false);
        btn_charge14.setFocusable(false);
        btn_charge14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge14.setOpaque(true);
        btn_charge14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge14ActionPerformed(evt);
            }
        });

        btn_charge15.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge15.setText("2");
        btn_charge15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge15.setContentAreaFilled(false);
        btn_charge15.setFocusable(false);
        btn_charge15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge15.setOpaque(true);
        btn_charge15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge15ActionPerformed(evt);
            }
        });

        btn_charge16.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge16.setText("3");
        btn_charge16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge16.setContentAreaFilled(false);
        btn_charge16.setFocusable(false);
        btn_charge16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge16.setOpaque(true);
        btn_charge16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge16ActionPerformed(evt);
            }
        });

        btn_charge12.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge12.setText("1");
        btn_charge12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge12.setContentAreaFilled(false);
        btn_charge12.setFocusable(false);
        btn_charge12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge12.setOpaque(true);
        btn_charge12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge12ActionPerformed(evt);
            }
        });

        btn_charge17.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge17.setText("4");
        btn_charge17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge17.setContentAreaFilled(false);
        btn_charge17.setFocusable(false);
        btn_charge17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge17.setOpaque(true);
        btn_charge17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge17ActionPerformed(evt);
            }
        });

        btn_charge18.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge18.setText("6");
        btn_charge18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge18.setContentAreaFilled(false);
        btn_charge18.setFocusable(false);
        btn_charge18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge18.setOpaque(true);
        btn_charge18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge18ActionPerformed(evt);
            }
        });

        btn_charge19.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge19.setText("5");
        btn_charge19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge19.setContentAreaFilled(false);
        btn_charge19.setFocusable(false);
        btn_charge19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge19.setOpaque(true);
        btn_charge19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge19ActionPerformed(evt);
            }
        });

        btn_charge20.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge20.setText("7");
        btn_charge20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge20.setContentAreaFilled(false);
        btn_charge20.setFocusable(false);
        btn_charge20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge20.setOpaque(true);
        btn_charge20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge20ActionPerformed(evt);
            }
        });

        btn_charge21.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge21.setText("8");
        btn_charge21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge21.setContentAreaFilled(false);
        btn_charge21.setFocusable(false);
        btn_charge21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge21.setOpaque(true);
        btn_charge21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge21ActionPerformed(evt);
            }
        });

        btn_charge22.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge22.setText("9");
        btn_charge22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge22.setContentAreaFilled(false);
        btn_charge22.setFocusable(false);
        btn_charge22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge22.setOpaque(true);
        btn_charge22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge22ActionPerformed(evt);
            }
        });

        btn_charge23.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge23.setText("50");
        btn_charge23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge23.setContentAreaFilled(false);
        btn_charge23.setFocusable(false);
        btn_charge23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge23.setOpaque(true);
        btn_charge23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge23ActionPerformed(evt);
            }
        });

        btn_charge24.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge24.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge24.setText("1000");
        btn_charge24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge24.setContentAreaFilled(false);
        btn_charge24.setFocusable(false);
        btn_charge24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge24.setOpaque(true);
        btn_charge24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge24ActionPerformed(evt);
            }
        });

        btn_charge25.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge25.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge25.setText("500");
        btn_charge25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge25.setContentAreaFilled(false);
        btn_charge25.setFocusable(false);
        btn_charge25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge25.setOpaque(true);
        btn_charge25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge25ActionPerformed(evt);
            }
        });

        btn_charge26.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge26.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge26.setText("100");
        btn_charge26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge26.setContentAreaFilled(false);
        btn_charge26.setFocusable(false);
        btn_charge26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge26.setOpaque(true);
        btn_charge26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge26ActionPerformed(evt);
            }
        });

        tf_amount_tendered.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tf_amount_tendered.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tf_amount_tendered.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_amount_tendered)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_charge20, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_charge21, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_charge22, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_charge17, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_charge19, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_charge18, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_charge12, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_charge15, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_charge16, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_charge11, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_charge13, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_charge14, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_charge23, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_charge26, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_charge25, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_charge24, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf_amount_tendered, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_charge23, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_charge26, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_charge25, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_charge24, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_charge20, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_charge21, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_charge22, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_charge17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_charge19, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_charge18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_charge12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_charge15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_charge16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_charge11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_charge13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_charge14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        btn_cash1.setBackground(new java.awt.Color(255, 255, 255));
        btn_cash1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cash1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS/icon_payment/money13 (Custom).png"))); // NOI18N
        btn_cash1.setText("Amount Due");
        btn_cash1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_cash1.setContentAreaFilled(false);
        btn_cash1.setFocusable(false);
        btn_cash1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_cash1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_cash1.setOpaque(true);

        lbl_cash1.setBackground(new java.awt.Color(255, 255, 255));
        lbl_cash1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_cash1.setText("1,000.00");
        lbl_cash1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lbl_cash1.setContentAreaFilled(false);
        lbl_cash1.setFocusable(false);
        lbl_cash1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbl_cash1.setOpaque(true);

        btn_cash2.setBackground(new java.awt.Color(255, 255, 255));
        btn_cash2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cash2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS/icon_payment/money28 (Custom).png"))); // NOI18N
        btn_cash2.setText("Tendered");
        btn_cash2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_cash2.setContentAreaFilled(false);
        btn_cash2.setFocusable(false);
        btn_cash2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_cash2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_cash2.setOpaque(true);

        lbl_cash2.setBackground(new java.awt.Color(255, 255, 255));
        lbl_cash2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_cash2.setText("1,000.00");
        lbl_cash2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lbl_cash2.setContentAreaFilled(false);
        lbl_cash2.setFocusable(false);
        lbl_cash2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbl_cash2.setOpaque(true);

        btn_cash3.setBackground(new java.awt.Color(255, 255, 255));
        btn_cash3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cash3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS/icon_payment/coins14 (Custom).png"))); // NOI18N
        btn_cash3.setText("Change");
        btn_cash3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_cash3.setContentAreaFilled(false);
        btn_cash3.setFocusable(false);
        btn_cash3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_cash3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_cash3.setOpaque(true);

        lbl_cash3.setBackground(new java.awt.Color(255, 255, 255));
        lbl_cash3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_cash3.setText("1,000.00");
        lbl_cash3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lbl_cash3.setContentAreaFilled(false);
        lbl_cash3.setFocusable(false);
        lbl_cash3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbl_cash3.setOpaque(true);

        btn_cash4.setBackground(new java.awt.Color(255, 255, 255));
        btn_cash4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cash4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS/icon_payment/money25 (Custom).png"))); // NOI18N
        btn_cash4.setText("Balance Due");
        btn_cash4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_cash4.setContentAreaFilled(false);
        btn_cash4.setFocusable(false);
        btn_cash4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_cash4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_cash4.setOpaque(true);

        lbl_cash4.setBackground(new java.awt.Color(255, 255, 255));
        lbl_cash4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_cash4.setText("1,000.00");
        lbl_cash4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lbl_cash4.setContentAreaFilled(false);
        lbl_cash4.setFocusable(false);
        lbl_cash4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbl_cash4.setOpaque(true);

        jButton30.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton30.setForeground(new java.awt.Color(0, 150, 199));
        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS/icon_payment/shopping86.png"))); // NOI18N
        jButton30.setBorderPainted(false);
        jButton30.setContentAreaFilled(false);
        jButton30.setFocusable(false);
        jButton30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 150, 199));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Re - print");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 150, 199));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Void Payment");

        jButton31.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton31.setForeground(new java.awt.Color(0, 150, 199));
        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS/icon_payment/print44.png"))); // NOI18N
        jButton31.setBorderPainted(false);
        jButton31.setContentAreaFilled(false);
        jButton31.setFocusable(false);
        jButton31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton34.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton34.setForeground(new java.awt.Color(0, 150, 199));
        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS/icon_payment/ok1.png"))); // NOI18N
        jButton34.setBorderPainted(false);
        jButton34.setContentAreaFilled(false);
        jButton34.setFocusable(false);
        jButton34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 150, 199));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Done");

        btn_charge7.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_charge7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge7.setContentAreaFilled(false);
        btn_charge7.setFocusable(false);
        btn_charge7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge7.setOpaque(true);
        btn_charge7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge7ActionPerformed(evt);
            }
        });

        btn_charge8.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_charge8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge8.setContentAreaFilled(false);
        btn_charge8.setFocusable(false);
        btn_charge8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge8.setOpaque(true);
        btn_charge8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge8ActionPerformed(evt);
            }
        });

        btn_charge9.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_charge9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge9.setContentAreaFilled(false);
        btn_charge9.setFocusable(false);
        btn_charge9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge9.setOpaque(true);
        btn_charge9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge9ActionPerformed(evt);
            }
        });

        btn_charge10.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_charge10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge10.setContentAreaFilled(false);
        btn_charge10.setFocusable(false);
        btn_charge10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge10.setOpaque(true);
        btn_charge10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_cash, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_credit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_gift, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_prepaid, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_cheque, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_charge, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_gift, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(btn_charge3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_prepaid, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(btn_charge4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_cheque, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(btn_charge5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_charge, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(btn_charge6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_cash, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_credit, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_charge2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_charge1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_cash1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(lbl_cash1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_cash4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(lbl_cash4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_cash3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_cash2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbl_cash2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbl_cash3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btn_charge7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_charge8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btn_charge9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_charge10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lbl_separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lbl_separator2, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton34))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_charge7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_cash1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_cash1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_cash4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_cash4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_charge8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_cash, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_cash, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_charge1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_credit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_credit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btn_charge2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_gift, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn_prepaid, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn_cheque, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_gift, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_charge3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lbl_charge, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_charge, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_prepaid, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_charge4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbl_cheque, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_charge5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, 0)
                                        .addComponent(btn_charge6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(5, 5, 5)
                        .addComponent(lbl_separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_cash2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_cash2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_cash3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_cash3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_charge9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn_charge10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_separator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton31)
                            .addComponent(jButton30))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_charge1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge1ActionPerformed

    private void btn_charge2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge2ActionPerformed

    private void btn_charge3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge3ActionPerformed

    private void btn_charge4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge4ActionPerformed

    private void btn_charge5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge5ActionPerformed

    private void btn_charge6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge6ActionPerformed

    private void btn_charge7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge7ActionPerformed

    private void btn_charge8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge8ActionPerformed

    private void btn_charge9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge9ActionPerformed

    private void btn_charge10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge10ActionPerformed

    private void btn_charge11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge11ActionPerformed

    private void btn_charge13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge13ActionPerformed

    private void btn_charge14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge14ActionPerformed

    private void btn_charge15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge15ActionPerformed

    private void btn_charge16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge16ActionPerformed

    private void btn_charge12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge12ActionPerformed

    private void btn_charge17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge17ActionPerformed

    private void btn_charge18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge18ActionPerformed

    private void btn_charge19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge19ActionPerformed

    private void btn_charge20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge20ActionPerformed

    private void btn_charge21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge21ActionPerformed

    private void btn_charge22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge22ActionPerformed

    private void btn_charge23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge23ActionPerformed

    private void btn_charge24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge24ActionPerformed

    private void btn_charge25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge25ActionPerformed

    private void btn_charge26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge26ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cash;
    private javax.swing.JButton btn_cash1;
    private javax.swing.JButton btn_cash2;
    private javax.swing.JButton btn_cash3;
    private javax.swing.JButton btn_cash4;
    private javax.swing.JButton btn_charge;
    private javax.swing.JButton btn_charge1;
    private javax.swing.JButton btn_charge10;
    private javax.swing.JButton btn_charge11;
    private javax.swing.JButton btn_charge12;
    private javax.swing.JButton btn_charge13;
    private javax.swing.JButton btn_charge14;
    private javax.swing.JButton btn_charge15;
    private javax.swing.JButton btn_charge16;
    private javax.swing.JButton btn_charge17;
    private javax.swing.JButton btn_charge18;
    private javax.swing.JButton btn_charge19;
    private javax.swing.JButton btn_charge2;
    private javax.swing.JButton btn_charge20;
    private javax.swing.JButton btn_charge21;
    private javax.swing.JButton btn_charge22;
    private javax.swing.JButton btn_charge23;
    private javax.swing.JButton btn_charge24;
    private javax.swing.JButton btn_charge25;
    private javax.swing.JButton btn_charge26;
    private javax.swing.JButton btn_charge3;
    private javax.swing.JButton btn_charge4;
    private javax.swing.JButton btn_charge5;
    private javax.swing.JButton btn_charge6;
    private javax.swing.JButton btn_charge7;
    private javax.swing.JButton btn_charge8;
    private javax.swing.JButton btn_charge9;
    private javax.swing.JButton btn_cheque;
    private javax.swing.JButton btn_credit;
    private javax.swing.JButton btn_gift;
    private javax.swing.JButton btn_prepaid;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton34;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton lbl_cash;
    private javax.swing.JButton lbl_cash1;
    private javax.swing.JButton lbl_cash2;
    private javax.swing.JButton lbl_cash3;
    private javax.swing.JButton lbl_cash4;
    private javax.swing.JButton lbl_charge;
    private javax.swing.JButton lbl_cheque;
    private javax.swing.JButton lbl_credit;
    private javax.swing.JButton lbl_gift;
    private javax.swing.JButton lbl_prepaid;
    private javax.swing.JLabel lbl_separator1;
    private javax.swing.JLabel lbl_separator2;
    private javax.swing.JTextField tf_amount_tendered;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        init_payment();
    }

    private void init_payment() {

        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {

                Border paddingBorder = BorderFactory.createEmptyBorder(0, 10, 0, 0);
                Border paddingBorder2 = BorderFactory.createEmptyBorder(0, 0, 0, 0);
                Border paddingBorder3 = BorderFactory.createEmptyBorder(0, 10, 0, 10);
                Border border = BorderFactory.createMatteBorder(1, 1, 0, 0, new java.awt.Color(204, 204, 204));
                Border border2 = BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(204, 204, 204));
                Border border7 = BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204));
                Border border3 = BorderFactory.createMatteBorder(1, 0, 0, 1, new java.awt.Color(204, 204, 204));
                Border border4 = BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(204, 204, 204));
                Border border5 = BorderFactory.createMatteBorder(1, 0, 0, 1, new java.awt.Color(204, 204, 204));
                Border border6 = BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(204, 204, 204));
                Border border8 = BorderFactory.createMatteBorder(1, 0, 0, 1, new java.awt.Color(204, 204, 204));
                Border border9 = BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(204, 204, 204));
                Border border10 = BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204));
                btn_cash1.setBorder(BorderFactory.createCompoundBorder(border7, paddingBorder));
                tf_amount_tendered.setBorder(BorderFactory.createCompoundBorder(border7, paddingBorder3));

                btn_cash2.setBorder(BorderFactory.createCompoundBorder(border, paddingBorder));
                btn_cash3.setBorder(BorderFactory.createCompoundBorder(border2, paddingBorder));
                lbl_cash3.setBorder(BorderFactory.createCompoundBorder(border10, paddingBorder2));
                lbl_cash2.setBorder(BorderFactory.createCompoundBorder(border9, paddingBorder2));
                btn_cash1.setBorder(BorderFactory.createCompoundBorder(border, paddingBorder));
                btn_cash4.setBorder(BorderFactory.createCompoundBorder(border2, paddingBorder));
                lbl_cash1.setBorder(BorderFactory.createCompoundBorder(border9, paddingBorder2));

                lbl_cash4.setBorder(BorderFactory.createCompoundBorder(border4, paddingBorder2));
                lbl_cash4.setBorder(BorderFactory.createCompoundBorder(border10, paddingBorder2));

                btn_cash.setBorder(BorderFactory.createCompoundBorder(border, paddingBorder));
                btn_credit.setBorder(BorderFactory.createCompoundBorder(border, paddingBorder));
                btn_gift.setBorder(BorderFactory.createCompoundBorder(border, paddingBorder));
                btn_prepaid.setBorder(BorderFactory.createCompoundBorder(border, paddingBorder));
                btn_cheque.setBorder(BorderFactory.createCompoundBorder(border, paddingBorder));
                btn_charge.setBorder(BorderFactory.createCompoundBorder(border2, paddingBorder));

                lbl_cash.setBorder(BorderFactory.createCompoundBorder(border3, paddingBorder2));
                lbl_credit.setBorder(BorderFactory.createCompoundBorder(border3, paddingBorder2));
                lbl_gift.setBorder(BorderFactory.createCompoundBorder(border3, paddingBorder2));
                lbl_prepaid.setBorder(BorderFactory.createCompoundBorder(border3, paddingBorder2));
                lbl_cheque.setBorder(BorderFactory.createCompoundBorder(border3, paddingBorder2));
                lbl_charge.setBorder(BorderFactory.createCompoundBorder(border4, paddingBorder2));

                btn_charge7.setBorder(BorderFactory.createCompoundBorder(border8, paddingBorder2));
                btn_charge9.setBorder(BorderFactory.createCompoundBorder(border8, paddingBorder2));

                btn_charge1.setBorder(BorderFactory.createCompoundBorder(border3, paddingBorder2));
                btn_charge2.setBorder(BorderFactory.createCompoundBorder(border3, paddingBorder2));
                btn_charge3.setBorder(BorderFactory.createCompoundBorder(border3, paddingBorder2));
                btn_charge4.setBorder(BorderFactory.createCompoundBorder(border3, paddingBorder2));
                btn_charge5.setBorder(BorderFactory.createCompoundBorder(border3, paddingBorder2));
                btn_charge6.setBorder(BorderFactory.createCompoundBorder(border4, paddingBorder2));

                btn_charge8.setBorder(BorderFactory.createCompoundBorder(border4, paddingBorder2));
                btn_charge10.setBorder(BorderFactory.createCompoundBorder(border4, paddingBorder2));

            }
        });
        t.start();

        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                JButton[] btns = {btn_cash, btn_credit, btn_gift, btn_prepaid, btn_cheque, btn_cheque, btn_charge, btn_charge1, btn_charge2, btn_charge3, btn_charge4, btn_charge5, btn_charge6, btn_charge20, btn_charge21, btn_charge22, btn_charge17, btn_charge19, btn_charge18, btn_charge12, btn_charge15, btn_charge16, btn_charge11, btn_charge13, btn_charge14, btn_charge24, btn_charge25, btn_charge26, btn_charge23
                };
                for (final JButton btn : btns) {
                    btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    btn.addMouseListener(new MouseAdapter() {

                        @Override
                        public void mouseEntered(MouseEvent e) {
                            btn.setBackground(new java.awt.Color(230, 232, 233));

                        }

                        @Override
                        public void mouseExited(MouseEvent e) {
                            btn.setBackground(new java.awt.Color(255, 255, 255));
                        }

                    });
                }

            }
        });
        t.start();
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

}
