/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synsoftech.fields;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Guinness
 */
public class Label {

    public static class Separator extends JLabel {

        public Separator() {
            this.setIcon(new javax.swing.ImageIcon(Field.class.getResource("/synsoftech/fields/separator2.png")));
            this.setText("");
        }
    }

    public static class Separator2 extends JLabel {

        public Separator2() {
            this.setIcon(new javax.swing.ImageIcon(Field.class.getResource("/synsoftech/fields/separator3.png")));
            this.setText("");
        }
    }

    public static class Normal extends JLabel {

        String customer_id = "";
        String customer_name = "";
        String customer_no = "";

        public Normal() {
        }

        public String getCustomer_id() {
            return customer_id;
        }

        public void setCustomer_id(String customer_id) {
            this.customer_id = customer_id;
        }

        public String getCustomer_name() {
            return customer_name;
        }

        public void setCustomer_name(String customer_name) {
            this.customer_name = customer_name;
        }

        public String getCustomer_no() {
            return customer_no;
        }

        public void setCustomer_no(String customer_no) {
            this.customer_no = customer_no;
        }

        public void clearAll() {
            customer_id = "";
            customer_name = "";
            customer_no = "";
        }
    }

    public static class Status extends JLabel {

        String id = "";
        int status = 0;
        String name = "";

        public Status() {
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public void clearAll() {
            id = "";
            status = 0;
            name = "";
        }
    }

    public static class Item_discount extends JLabel {

        String discount_name = "";
        String discount_customer_name = "";
        String discount_customer_id = "";
        double discount_rate = 0;
        double discount_amount = 0;

        public Item_discount() {

        }

        public void clearAll() {
            discount_name = "";
            discount_customer_name = "";
            discount_customer_id = "";
            discount_rate = 0;
            discount_amount = 0;
        }

        public String getDiscount_name() {
            return discount_name;
        }

        public void setDiscount_name(String discount_name) {
            this.discount_name = discount_name;
        }

        public String getDiscount_customer_name() {
            return discount_customer_name;
        }

        public void setDiscount_customer_name(String discount_customer_name) {
            this.discount_customer_name = discount_customer_name;
        }

        public String getDiscount_customer_id() {
            return discount_customer_id;
        }

        public void setDiscount_customer_id(String discount_customer_id) {
            this.discount_customer_id = discount_customer_id;
        }

        public double getDiscount_rate() {
            return discount_rate;
        }

        public void setDiscount_rate(double discount_rate) {
            this.discount_rate = discount_rate;
        }

        public double getDiscount_amount() {
            return discount_amount;
        }

        public void setDiscount_amount(double discount_amount) {
            this.discount_amount = discount_amount;
        }

    }

    public static class Default extends JLabel {

        public Default() {
            this.setBackground(new java.awt.Color(240, 240, 240));
            this.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            this.setForeground(new java.awt.Color(0, 0, 0));
            this.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, false));
            this.setFocusable(false);
            this.setOpaque(true);

            this.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseEntered(MouseEvent e) {
                    Default.this.setBackground(new java.awt.Color(230, 230, 230));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    Default.this.setBackground(new java.awt.Color(240, 240, 240));
                }

            });
        }

    }

    public static class Search extends JLabel {

        public Search() {
            this.setBackground(new java.awt.Color(240, 240, 240));
            this.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            this.setForeground(new java.awt.Color(0, 0, 0));
            this.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, false));

            this.setFocusable(false);
            this.setOpaque(true);

            this.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    if (Search.this.isEnabled()) {
                        Search.this.setBackground(new java.awt.Color(230, 230, 230));
                    }

                }

                @Override
                public void mouseExited(MouseEvent e) {
                    if (Search.this.isEnabled()) {
                        Search.this.setBackground(new java.awt.Color(240, 240, 240));
                    }

                }

            });
        }

        public void load() {
            Search.this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/synsoftech/fields/wall24.png"))); // NOI18N
            Search.this.setBackground(new java.awt.Color(241, 218, 218));
            Search.this.enable(false);
            Search.this.setEnabled(false);
            Search.this.setToolTipText("Loading, Please wait...");

        }

        public void finish() {
            Search.this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/synsoftech/fields/search19.png"))); // NOI18N
            Search.this.setBackground(new java.awt.Color(240, 240, 240));
            Search.this.enable(true);
            Search.this.setEnabled(true);
        }
    }

    public static class Primary extends JLabel {

        public Primary() {
            this.setBackground(new java.awt.Color(66, 139, 202));

            this.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            this.setForeground(new java.awt.Color(255, 255, 255));
            this.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, false));
            this.setFocusable(false);
            this.setOpaque(true);
            this.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    Primary.this.setBackground(new java.awt.Color(48, 113, 169));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    Primary.this.setBackground(new java.awt.Color(66, 139, 202));
                }

            });
        }
    }

    public static class Success extends JLabel {

        public Success() {
            this.setBackground(new java.awt.Color(92, 184, 92));
            this.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            this.setForeground(new java.awt.Color(255, 255, 255));
            this.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, false));
            this.setFocusable(false);
            this.setOpaque(true);

            this.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseEntered(MouseEvent e) {
                    Success.this.setBackground(new java.awt.Color(83, 165, 83));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    Success.this.setBackground(new java.awt.Color(92, 184, 92));
                }

            });
        }
    }

    public static class Info extends JLabel {

        public Info() {
            this.setBackground(new java.awt.Color(91, 192, 222));
            this.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            this.setForeground(new java.awt.Color(255, 255, 255));
            this.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, false));
            this.setFocusable(false);
            this.setOpaque(true);

            this.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseEntered(MouseEvent e) {
                    Info.this.setBackground(new java.awt.Color(49, 176, 213));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    Info.this.setBackground(new java.awt.Color(91, 192, 222));
                }

            });
        }
    }

    public static class Warning extends JLabel {

        public Warning() {
            this.setBackground(new java.awt.Color(240, 173, 78));
            this.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            this.setForeground(new java.awt.Color(255, 255, 255));
            this.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, false));
            this.setFocusable(false);
            this.setOpaque(true);
            this.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    Warning.this.setBackground(new java.awt.Color(236, 151, 31));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    Warning.this.setBackground(new java.awt.Color(240, 173, 78));
                }
            });
        }

    }

    public static class Dangerous extends JLabel {

        public Dangerous() {
            this.setBackground(new java.awt.Color(217, 83, 79));
            this.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            this.setForeground(new java.awt.Color(255, 255, 255));
            this.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, false));
            this.setFocusable(false);
            this.setOpaque(true);

            this.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseEntered(MouseEvent e) {
                    Dangerous.this.setBackground(new java.awt.Color(201, 48, 44));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    Dangerous.this.setBackground(new java.awt.Color(217, 83, 79));
                }

            });
        }
    }

    public static class Orange extends JLabel {

        public Orange() {
            this.setBackground(new java.awt.Color(48, 113, 169));
            this.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            this.setForeground(new java.awt.Color(255, 255, 255));
            this.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, false));
            this.setFocusable(false);
            this.setOpaque(true);

            this.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseEntered(MouseEvent e) {
                    Orange.this.setBackground(new java.awt.Color(238, 156, 7));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    Orange.this.setBackground(new java.awt.Color(48, 113, 169));
                }

            });
        }
    }
}
