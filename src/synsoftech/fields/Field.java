/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synsoftech.fields;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Insets;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import org.jdesktop.swingx.prompt.BuddySupport;
import org.jdesktop.swingx.prompt.BuddySupport.Position;
import org.jdesktop.swingx.prompt.PromptSupport;

/**
 *
 * @author Guinness
 */
public class Field {

    //<editor-fold defaultstate="collapsed" desc=" Password ">
    public static class Password extends JPasswordField {

        private String id;

        public Password() {
            init();
        }

        private void init() {

            Border empty = new EmptyBorder(0, 5, 0, 0);
            CompoundBorder border = javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), empty);
            this.setBorder(border);
            this.addFocusListener(new FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    Password.this.selectAll();
                    Border empty = new EmptyBorder(0, 5, 0, 0);
                    CompoundBorder border = javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(115, 184, 238), 1, false), empty);
                    Password.this.setBorder(border);
                }

                @Override
                public void focusLost(FocusEvent e) {
                    Border empty = new EmptyBorder(0, 5, 0, 0);
                    CompoundBorder border = javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), empty);
                    Password.this.setBorder(border);

                }
            });
        }

        public Password(String promptText) {
            init();
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Password(String promptText, Color promptForeground) {
            init();
        }

        public Password(String promptText, Color promptForeground,
                Color promptBackground) {
            init();
        }

        /**
         * @return @see
         * PromptSupport#getFocusBehavior(javax.swing.text.JTextComponent)
         */
        public PromptSupport.FocusBehavior getFocusBehavior() {
            return PromptSupport.getFocusBehavior(this);
        }

        /**
         * @return @see PromptSupport#getPrompt(javax.swing.text.JTextComponent)
         */
        public String getPrompt() {
            return PromptSupport.getPrompt(this);
        }

        /**
         * @return @see
         * PromptSupport#getForeground(javax.swing.text.JTextComponent)
         */
        public Color getPromptForeground() {
            return PromptSupport.getForeground(this);
        }

        /**
         * @return @see
         * PromptSupport#getForeground(javax.swing.text.JTextComponent)
         */
        public Color getPromptBackground() {
            return PromptSupport.getBackground(this);
        }

        /**
         * @return @see
         * PromptSupport#getFontStyle(javax.swing.text.JTextComponent)
         */
        public Integer getPromptFontStyle() {
            return PromptSupport.getFontStyle(this);
        }

        /**
         * @param focusBehavior
         * @see PromptSupport#getFocusBehavior(javax.swing.text.JTextComponent)
         */
        public void setFocusBehavior(PromptSupport.FocusBehavior focusBehavior) {
            PromptSupport.setFocusBehavior(focusBehavior, this);
        }

        /**
         * @param labelText
         * @see PromptSupport#setPrompt(String, javax.swing.text.JTextComponent)
         */
        public void setPrompt(String labelText) {
            PromptSupport.setPrompt(labelText, this);
        }

        /**
         * @param promptTextColor
         * @see PromptSupport#setForeground(Color,
         * javax.swing.text.JTextComponent)
         */
        public void setPromptForeground(Color promptTextColor) {
            PromptSupport.setForeground(promptTextColor, this);
        }

        /**
         * @param promptTextColor
         * @see PromptSupport#setBackground(Color,
         * javax.swing.text.JTextComponent)
         */
        public void setPromptBackround(Color promptTextColor) {
            PromptSupport.setBackground(promptTextColor, this);
        }

        /**
         * @param fontStyle
         * @see PromptSupport#setFontStyle(Integer,
         * javax.swing.text.JTextComponent)
         */
        public void setPromptFontStyle(Integer fontStyle) {
            PromptSupport.setFontStyle(fontStyle, this);
        }

        /**
         * @param margin
         * @see BuddySupport#setOuterMargin(JTextField, Insets)
         */
        public void setOuterMargin(Insets margin) {
            BuddySupport.setOuterMargin(this, margin);
        }

        /**
         * @return @see BuddySupport#getOuterMargin(JTextField)
         */
        public Insets getOuterMargin() {
            return BuddySupport.getOuterMargin(this);
        }

        /**
         * @param buddy
         * @param pos
         * @see BuddySupport#add(Component, Position, JTextField)
         */
        public void addBuddy(Component buddy, BuddySupport.Position pos) {
            BuddySupport.add(buddy, pos, this);
        }

        /**
         * @param width
         * @param pos
         * @see BuddySupport#addGap(int, Position, JTextField)
         */
        public void addGap(int width, BuddySupport.Position pos) {
            BuddySupport.addGap(width, pos, this);
        }

        /**
         * @param pos
         * @return
         * @see BuddySupport#getBuddies(Position, JTextField)
         */
        public List<Component> getBuddies(BuddySupport.Position pos) {
            return BuddySupport.getBuddies(pos, this);
        }

        /**
         * @see BuddySupport#removeAll(JTextField)
         */
        public void removeAllBuddies() {
            BuddySupport.removeAll(this);
        }
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Search ">
    public static class Search extends JTextField {

        private String id;

        public Search() {
            init();
        }

        private void init() {
            JLabel lbl = new JLabel();
            lbl.setIcon(new javax.swing.ImageIcon(Field.class.getResource("/synsoftech/fields/search.png")));
            this.setPrompt("Search");
            this.addBuddy(lbl, BuddySupport.Position.RIGHT);
            Border empty = new EmptyBorder(0, 5, 0, 0);
            CompoundBorder border = javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), empty);
            this.setBorder(border);
            this.addFocusListener(new FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    Search.this.selectAll();
                    Border empty = new EmptyBorder(0, 5, 0, 0);
                    CompoundBorder border = javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(115, 184, 238), 1, false), empty);
                    Search.this.setBorder(border);
                }

                @Override
                public void focusLost(FocusEvent e) {
                    Border empty = new EmptyBorder(0, 5, 0, 0);
                    CompoundBorder border = javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), empty);
                    Search.this.setBorder(border);

                }
            });
        }

        public Search(String promptText) {
            init();
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Search(String promptText, Color promptForeground) {
            init();
        }

        public Search(String promptText, Color promptForeground,
                Color promptBackground) {
            init();
        }

        /**
         * @return @see
         * PromptSupport#getFocusBehavior(javax.swing.text.JTextComponent)
         */
        public PromptSupport.FocusBehavior getFocusBehavior() {
            return PromptSupport.getFocusBehavior(this);
        }

        /**
         * @return @see PromptSupport#getPrompt(javax.swing.text.JTextComponent)
         */
        public String getPrompt() {
            return PromptSupport.getPrompt(this);
        }

        /**
         * @return @see
         * PromptSupport#getForeground(javax.swing.text.JTextComponent)
         */
        public Color getPromptForeground() {
            return PromptSupport.getForeground(this);
        }

        /**
         * @return @see
         * PromptSupport#getForeground(javax.swing.text.JTextComponent)
         */
        public Color getPromptBackground() {
            return PromptSupport.getBackground(this);
        }

        /**
         * @return @see
         * PromptSupport#getFontStyle(javax.swing.text.JTextComponent)
         */
        public Integer getPromptFontStyle() {
            return PromptSupport.getFontStyle(this);
        }

        /**
         * @param focusBehavior
         * @see PromptSupport#getFocusBehavior(javax.swing.text.JTextComponent)
         */
        public void setFocusBehavior(PromptSupport.FocusBehavior focusBehavior) {
            PromptSupport.setFocusBehavior(focusBehavior, this);
        }

        /**
         * @param labelText
         * @see PromptSupport#setPrompt(String, javax.swing.text.JTextComponent)
         */
        public void setPrompt(String labelText) {
            PromptSupport.setPrompt(labelText, this);
        }

        /**
         * @param promptTextColor
         * @see PromptSupport#setForeground(Color,
         * javax.swing.text.JTextComponent)
         */
        public void setPromptForeground(Color promptTextColor) {
            PromptSupport.setForeground(promptTextColor, this);
        }

        /**
         * @param promptTextColor
         * @see PromptSupport#setBackground(Color,
         * javax.swing.text.JTextComponent)
         */
        public void setPromptBackround(Color promptTextColor) {
            PromptSupport.setBackground(promptTextColor, this);
        }

        /**
         * @param fontStyle
         * @see PromptSupport#setFontStyle(Integer,
         * javax.swing.text.JTextComponent)
         */
        public void setPromptFontStyle(Integer fontStyle) {
            PromptSupport.setFontStyle(fontStyle, this);
        }

        /**
         * @param margin
         * @see BuddySupport#setOuterMargin(JTextField, Insets)
         */
        public void setOuterMargin(Insets margin) {
            BuddySupport.setOuterMargin(this, margin);
        }

        /**
         * @return @see BuddySupport#getOuterMargin(JTextField)
         */
        public Insets getOuterMargin() {
            return BuddySupport.getOuterMargin(this);
        }

        /**
         * @param buddy
         * @param pos
         * @see BuddySupport#add(Component, Position, JTextField)
         */
        public void addBuddy(Component buddy, BuddySupport.Position pos) {
            BuddySupport.add(buddy, pos, this);
        }

        /**
         * @param width
         * @param pos
         * @see BuddySupport#addGap(int, Position, JTextField)
         */
        public void addGap(int width, BuddySupport.Position pos) {
            BuddySupport.addGap(width, pos, this);
        }

        /**
         * @param pos
         * @return
         * @see BuddySupport#getBuddies(Position, JTextField)
         */
        public List<Component> getBuddies(BuddySupport.Position pos) {
            return BuddySupport.getBuddies(pos, this);
        }

        /**
         * @see BuddySupport#removeAll(JTextField)
         */
        public void removeAllBuddies() {
            BuddySupport.removeAll(this);
        }

    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Input ">
    public static class Input extends JTextField {

        private String id;

        public Input() {
            init();
        }

        private void init() {
            Border empty = new EmptyBorder(0, 5, 0, 0);
            CompoundBorder border = javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), empty);
            this.setBorder(border);
            this.addFocusListener(new FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    Input.this.selectAll();
                    Border empty = new EmptyBorder(0, 5, 0, 0);
                    CompoundBorder border = javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(115, 184, 238), 1, false), empty);
                    Input.this.setBorder(border);
                }

                @Override
                public void focusLost(FocusEvent e) {
                    Border empty = new EmptyBorder(0, 5, 0, 0);
                    CompoundBorder border = javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), empty);
                    Input.this.setBorder(border);

                }
            });
        }

        public Input(String promptText) {
            init();
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Input(String promptText, Color promptForeground) {
            init();
        }

        public Input(String promptText, Color promptForeground,
                Color promptBackground) {
            init();
        }

        /**
         * @return @see
         * PromptSupport#getFocusBehavior(javax.swing.text.JTextComponent)
         */
        public PromptSupport.FocusBehavior getFocusBehavior() {
            return PromptSupport.getFocusBehavior(this);
        }

        /**
         * @return @see PromptSupport#getPrompt(javax.swing.text.JTextComponent)
         */
        public String getPrompt() {
            return PromptSupport.getPrompt(this);
        }

        /**
         * @return @see
         * PromptSupport#getForeground(javax.swing.text.JTextComponent)
         */
        public Color getPromptForeground() {
            return PromptSupport.getForeground(this);
        }

        /**
         * @return @see
         * PromptSupport#getForeground(javax.swing.text.JTextComponent)
         */
        public Color getPromptBackground() {
            return PromptSupport.getBackground(this);
        }

        /**
         * @return @see
         * PromptSupport#getFontStyle(javax.swing.text.JTextComponent)
         */
        public Integer getPromptFontStyle() {
            return PromptSupport.getFontStyle(this);
        }

        /**
         * @param focusBehavior
         * @see PromptSupport#getFocusBehavior(javax.swing.text.JTextComponent)
         */
        public void setFocusBehavior(PromptSupport.FocusBehavior focusBehavior) {
            PromptSupport.setFocusBehavior(focusBehavior, this);
        }

        /**
         * @param labelText
         * @see PromptSupport#setPrompt(String, javax.swing.text.JTextComponent)
         */
        public void setPrompt(String labelText) {
            PromptSupport.setPrompt(labelText, this);
        }

        /**
         * @param promptTextColor
         * @see PromptSupport#setForeground(Color,
         * javax.swing.text.JTextComponent)
         */
        public void setPromptForeground(Color promptTextColor) {
            PromptSupport.setForeground(promptTextColor, this);
        }

        /**
         * @param promptTextColor
         * @see PromptSupport#setBackground(Color,
         * javax.swing.text.JTextComponent)
         */
        public void setPromptBackround(Color promptTextColor) {
            PromptSupport.setBackground(promptTextColor, this);
        }

        /**
         * @param fontStyle
         * @see PromptSupport#setFontStyle(Integer,
         * javax.swing.text.JTextComponent)
         */
        public void setPromptFontStyle(Integer fontStyle) {
            PromptSupport.setFontStyle(fontStyle, this);
        }

        /**
         * @param margin
         * @see BuddySupport#setOuterMargin(JTextField, Insets)
         */
        public void setOuterMargin(Insets margin) {
            BuddySupport.setOuterMargin(this, margin);
        }

        /**
         * @return @see BuddySupport#getOuterMargin(JTextField)
         */
        public Insets getOuterMargin() {
            return BuddySupport.getOuterMargin(this);
        }

        /**
         * @param buddy
         * @param pos
         * @see BuddySupport#add(Component, Position, JTextField)
         */
        public void addBuddy(Component buddy, BuddySupport.Position pos) {
            BuddySupport.add(buddy, pos, this);
        }

        /**
         * @param width
         * @param pos
         * @see BuddySupport#addGap(int, Position, JTextField)
         */
        public void addGap(int width, BuddySupport.Position pos) {
            BuddySupport.addGap(width, pos, this);
        }

        /**
         * @param pos
         * @return
         * @see BuddySupport#getBuddies(Position, JTextField)
         */
        public List<Component> getBuddies(BuddySupport.Position pos) {
            return BuddySupport.getBuddies(pos, this);
        }

        /**
         * @see BuddySupport#removeAll(JTextField)
         */
        public void removeAllBuddies() {
            BuddySupport.removeAll(this);
        }

    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Combo ">
    public static class Combo extends JTextField {

        private String id;

        public Combo() {
            init();
        }

        private void init() {
            JLabel lbl = new JLabel();
            lbl.setIcon(new javax.swing.ImageIcon(Field.class.getResource("/synsoftech/fields/combo.png")));
            this.setPrompt("Select");
            this.addBuddy(lbl, BuddySupport.Position.RIGHT);
            Border empty = new EmptyBorder(0, 5, 0, 0);
            CompoundBorder border = javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), empty);
            this.setBorder(border);
            this.addFocusListener(new FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    Combo.this.selectAll();
                    Border empty = new EmptyBorder(0, 5, 0, 0);
                    CompoundBorder border = javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(115, 184, 238), 1, false), empty);
                    Combo.this.setBorder(border);
                }

                @Override
                public void focusLost(FocusEvent e) {
                    Border empty = new EmptyBorder(0, 5, 0, 0);
                    CompoundBorder border = javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), empty);
                    Combo.this.setBorder(border);

                }
            });
        }

        public Combo(String promptText) {
            init();
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Combo(String promptText, Color promptForeground) {
            init();
        }

        public Combo(String promptText, Color promptForeground,
                Color promptBackground) {
            init();
        }

        /**
         * @return @see
         * PromptSupport#getFocusBehavior(javax.swing.text.JTextComponent)
         */
        public PromptSupport.FocusBehavior getFocusBehavior() {
            return PromptSupport.getFocusBehavior(this);
        }

        /**
         * @return @see PromptSupport#getPrompt(javax.swing.text.JTextComponent)
         */
        public String getPrompt() {
            return PromptSupport.getPrompt(this);
        }

        /**
         * @return @see
         * PromptSupport#getForeground(javax.swing.text.JTextComponent)
         */
        public Color getPromptForeground() {
            return PromptSupport.getForeground(this);
        }

        /**
         * @return @see
         * PromptSupport#getForeground(javax.swing.text.JTextComponent)
         */
        public Color getPromptBackground() {
            return PromptSupport.getBackground(this);
        }

        /**
         * @return @see
         * PromptSupport#getFontStyle(javax.swing.text.JTextComponent)
         */
        public Integer getPromptFontStyle() {
            return PromptSupport.getFontStyle(this);
        }

        /**
         * @param focusBehavior
         * @see PromptSupport#getFocusBehavior(javax.swing.text.JTextComponent)
         */
        public void setFocusBehavior(PromptSupport.FocusBehavior focusBehavior) {
            PromptSupport.setFocusBehavior(focusBehavior, this);
        }

        /**
         * @param labelText
         * @see PromptSupport#setPrompt(String, javax.swing.text.JTextComponent)
         */
        public void setPrompt(String labelText) {
            PromptSupport.setPrompt(labelText, this);
        }

        /**
         * @param promptTextColor
         * @see PromptSupport#setForeground(Color,
         * javax.swing.text.JTextComponent)
         */
        public void setPromptForeground(Color promptTextColor) {
            PromptSupport.setForeground(promptTextColor, this);
        }

        /**
         * @param promptTextColor
         * @see PromptSupport#setBackground(Color,
         * javax.swing.text.JTextComponent)
         */
        public void setPromptBackround(Color promptTextColor) {
            PromptSupport.setBackground(promptTextColor, this);
        }

        /**
         * @param fontStyle
         * @see PromptSupport#setFontStyle(Integer,
         * javax.swing.text.JTextComponent)
         */
        public void setPromptFontStyle(Integer fontStyle) {
            PromptSupport.setFontStyle(fontStyle, this);
        }

        /**
         * @param margin
         * @see BuddySupport#setOuterMargin(JTextField, Insets)
         */
        public void setOuterMargin(Insets margin) {
            BuddySupport.setOuterMargin(this, margin);
        }

        /**
         * @return @see BuddySupport#getOuterMargin(JTextField)
         */
        public Insets getOuterMargin() {
            return BuddySupport.getOuterMargin(this);
        }

        /**
         * @param buddy
         * @param pos
         * @see BuddySupport#add(Component, Position, JTextField)
         */
        public void addBuddy(Component buddy, BuddySupport.Position pos) {
            BuddySupport.add(buddy, pos, this);
        }

        /**
         * @param width
         * @param pos
         * @see BuddySupport#addGap(int, Position, JTextField)
         */
        public void addGap(int width, BuddySupport.Position pos) {
            BuddySupport.addGap(width, pos, this);
        }

        /**
         * @param pos
         * @return
         * @see BuddySupport#getBuddies(Position, JTextField)
         */
        public List<Component> getBuddies(BuddySupport.Position pos) {
            return BuddySupport.getBuddies(pos, this);
        }

        /**
         * @see BuddySupport#removeAll(JTextField)
         */
        public void removeAllBuddies() {
            BuddySupport.removeAll(this);
        }

    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Input ">
    public static class Input_w_clear extends JTextField {

        private String id;

        public Input_w_clear() {
            init();
        }

        private void init() {
//        JLabel lbl = new JLabel();
//        lbl.setIcon(new javax.swing.ImageIcon(FieldPassword.class.getResource("/synsoftech/fields/search.png")));
//        this.setPrompt("Search");
//        this.addBuddy(lbl, BuddySupport.Position.RIGHT);
            Border empty = new EmptyBorder(0, 5, 0, 0);
            CompoundBorder border = javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), empty);
            this.setBorder(border);
            this.addFocusListener(new FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    Input_w_clear.this.selectAll();
                    Border empty = new EmptyBorder(0, 5, 0, 0);
                    CompoundBorder border = javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(115, 184, 238), 1, false), empty);
                    Input_w_clear.this.setBorder(border);
                }

                @Override
                public void focusLost(FocusEvent e) {
                    Border empty = new EmptyBorder(0, 5, 0, 0);
                    CompoundBorder border = javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), empty);
                    Input_w_clear.this.setBorder(border);

                }
            });

            JLabel lbl = new JLabel();
            lbl.setFocusable(false);

            lbl.setSize(10, 10);
            lbl.setIcon(new javax.swing.ImageIcon(Field.class.getResource("/synsoftech/fields/remove11.png")));
            lbl.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Input_w_clear.this.addBuddy(lbl, BuddySupport.Position.RIGHT);
            lbl.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent e) {
                    Input_w_clear.this.setText("");
                }

            });

        }

        public Input_w_clear(String promptText) {
            init();
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Input_w_clear(String promptText, Color promptForeground) {
            init();
        }

        public Input_w_clear(String promptText, Color promptForeground,
                Color promptBackground) {
            init();
        }

        /**
         * @return @see
         * PromptSupport#getFocusBehavior(javax.swing.text.JTextComponent)
         */
        public PromptSupport.FocusBehavior getFocusBehavior() {
            return PromptSupport.getFocusBehavior(this);
        }

        /**
         * @return @see PromptSupport#getPrompt(javax.swing.text.JTextComponent)
         */
        public String getPrompt() {
            return PromptSupport.getPrompt(this);
        }

        /**
         * @return @see
         * PromptSupport#getForeground(javax.swing.text.JTextComponent)
         */
        public Color getPromptForeground() {
            return PromptSupport.getForeground(this);
        }

        /**
         * @return @see
         * PromptSupport#getForeground(javax.swing.text.JTextComponent)
         */
        public Color getPromptBackground() {
            return PromptSupport.getBackground(this);
        }

        /**
         * @return @see
         * PromptSupport#getFontStyle(javax.swing.text.JTextComponent)
         */
        public Integer getPromptFontStyle() {
            return PromptSupport.getFontStyle(this);
        }

        /**
         * @param focusBehavior
         * @see PromptSupport#getFocusBehavior(javax.swing.text.JTextComponent)
         */
        public void setFocusBehavior(PromptSupport.FocusBehavior focusBehavior) {
            PromptSupport.setFocusBehavior(focusBehavior, this);
        }

        /**
         * @param labelText
         * @see PromptSupport#setPrompt(String, javax.swing.text.JTextComponent)
         */
        public void setPrompt(String labelText) {
            PromptSupport.setPrompt(labelText, this);
        }

        /**
         * @param promptTextColor
         * @see PromptSupport#setForeground(Color,
         * javax.swing.text.JTextComponent)
         */
        public void setPromptForeground(Color promptTextColor) {
            PromptSupport.setForeground(promptTextColor, this);
        }

        /**
         * @param promptTextColor
         * @see PromptSupport#setBackground(Color,
         * javax.swing.text.JTextComponent)
         */
        public void setPromptBackround(Color promptTextColor) {
            PromptSupport.setBackground(promptTextColor, this);
        }

        /**
         * @param fontStyle
         * @see PromptSupport#setFontStyle(Integer,
         * javax.swing.text.JTextComponent)
         */
        public void setPromptFontStyle(Integer fontStyle) {
            PromptSupport.setFontStyle(fontStyle, this);
        }

        /**
         * @param margin
         * @see BuddySupport#setOuterMargin(JTextField, Insets)
         */
        public void setOuterMargin(Insets margin) {
            BuddySupport.setOuterMargin(this, margin);
        }

        /**
         * @return @see BuddySupport#getOuterMargin(JTextField)
         */
        public Insets getOuterMargin() {
            return BuddySupport.getOuterMargin(this);
        }

        /**
         * @param buddy
         * @param pos
         * @see BuddySupport#add(Component, Position, JTextField)
         */
        public void addBuddy(Component buddy, BuddySupport.Position pos) {
            BuddySupport.add(buddy, pos, this);
        }

        /**
         * @param width
         * @param pos
         * @see BuddySupport#addGap(int, Position, JTextField)
         */
        public void addGap(int width, BuddySupport.Position pos) {
            BuddySupport.addGap(width, pos, this);
        }

        /**
         * @param pos
         * @return
         * @see BuddySupport#getBuddies(Position, JTextField)
         */
        public List<Component> getBuddies(BuddySupport.Position pos) {
            return BuddySupport.getBuddies(pos, this);
        }

        /**
         * @see BuddySupport#removeAll(JTextField)
         */
        public void removeAllBuddies() {
            BuddySupport.removeAll(this);
        }

    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Input with department ">
    public static class Input_w_department extends JTextField {

        private String id;
        private String department;
        private String department_id;

        public Input_w_department() {
            init();
        }

        private void init() {
            Border empty = new EmptyBorder(0, 5, 0, 0);
            CompoundBorder border = javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), empty);
            this.setBorder(border);
            this.addFocusListener(new FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    Input_w_department.this.selectAll();
                    Border empty = new EmptyBorder(0, 5, 0, 0);
                    CompoundBorder border = javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(115, 184, 238), 1, false), empty);
                    Input_w_department.this.setBorder(border);
                }

                @Override
                public void focusLost(FocusEvent e) {
                    Border empty = new EmptyBorder(0, 5, 0, 0);
                    CompoundBorder border = javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, false), empty);
                    Input_w_department.this.setBorder(border);

                }
            });
        }

        public Input_w_department(String promptText) {
            init();
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getDepartment_id() {
            return department_id;
        }

        public void setDepartment_id(String department_id) {
            this.department_id = department_id;
        }

        public Input_w_department(String promptText, Color promptForeground) {
            init();
        }

        public Input_w_department(String promptText, Color promptForeground,
                Color promptBackground) {
            init();
        }

        /**
         * @return @see
         * PromptSupport#getFocusBehavior(javax.swing.text.JTextComponent)
         */
        public PromptSupport.FocusBehavior getFocusBehavior() {
            return PromptSupport.getFocusBehavior(this);
        }

        /**
         * @return @see PromptSupport#getPrompt(javax.swing.text.JTextComponent)
         */
        public String getPrompt() {
            return PromptSupport.getPrompt(this);
        }

        /**
         * @return @see
         * PromptSupport#getForeground(javax.swing.text.JTextComponent)
         */
        public Color getPromptForeground() {
            return PromptSupport.getForeground(this);
        }

        /**
         * @return @see
         * PromptSupport#getForeground(javax.swing.text.JTextComponent)
         */
        public Color getPromptBackground() {
            return PromptSupport.getBackground(this);
        }

        /**
         * @return @see
         * PromptSupport#getFontStyle(javax.swing.text.JTextComponent)
         */
        public Integer getPromptFontStyle() {
            return PromptSupport.getFontStyle(this);
        }

        /**
         * @param focusBehavior
         * @see PromptSupport#getFocusBehavior(javax.swing.text.JTextComponent)
         */
        public void setFocusBehavior(PromptSupport.FocusBehavior focusBehavior) {
            PromptSupport.setFocusBehavior(focusBehavior, this);
        }

        /**
         * @param labelText
         * @see PromptSupport#setPrompt(String, javax.swing.text.JTextComponent)
         */
        public void setPrompt(String labelText) {
            PromptSupport.setPrompt(labelText, this);
        }

        /**
         * @param promptTextColor
         * @see PromptSupport#setForeground(Color,
         * javax.swing.text.JTextComponent)
         */
        public void setPromptForeground(Color promptTextColor) {
            PromptSupport.setForeground(promptTextColor, this);
        }

        /**
         * @param promptTextColor
         * @see PromptSupport#setBackground(Color,
         * javax.swing.text.JTextComponent)
         */
        public void setPromptBackround(Color promptTextColor) {
            PromptSupport.setBackground(promptTextColor, this);
        }

        /**
         * @param fontStyle
         * @see PromptSupport#setFontStyle(Integer,
         * javax.swing.text.JTextComponent)
         */
        public void setPromptFontStyle(Integer fontStyle) {
            PromptSupport.setFontStyle(fontStyle, this);
        }

        /**
         * @param margin
         * @see BuddySupport#setOuterMargin(JTextField, Insets)
         */
        public void setOuterMargin(Insets margin) {
            BuddySupport.setOuterMargin(this, margin);
        }

        /**
         * @return @see BuddySupport#getOuterMargin(JTextField)
         */
        public Insets getOuterMargin() {
            return BuddySupport.getOuterMargin(this);
        }

        /**
         * @param buddy
         * @param pos
         * @see BuddySupport#add(Component, Position, JTextField)
         */
        public void addBuddy(Component buddy, BuddySupport.Position pos) {
            BuddySupport.add(buddy, pos, this);
        }

        /**
         * @param width
         * @param pos
         * @see BuddySupport#addGap(int, Position, JTextField)
         */
        public void addGap(int width, BuddySupport.Position pos) {
            BuddySupport.addGap(width, pos, this);
        }

        /**
         * @param pos
         * @return
         * @see BuddySupport#getBuddies(Position, JTextField)
         */
        public List<Component> getBuddies(BuddySupport.Position pos) {
            return BuddySupport.getBuddies(pos, this);
        }

        /**
         * @see BuddySupport#removeAll(JTextField)
         */
        public void removeAllBuddies() {
            BuddySupport.removeAll(this);
        }

    }

    //</editor-fold>
}
