/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synsoftech.fields;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import org.jdesktop.swingx.prompt.PromptSupport;

/**
 *
 * @author Guinness
 */
public class TextArea {

    public static class Input extends JTextArea {

        private String id;

        public Input() {
            init();
        }

        private void init() {
//        JLabel lbl = new JLabel();
//        lbl.setIcon(new javax.swing.ImageIcon(FieldPassword.class.getResource("/synsoftech/fields/search.png")));
//        this.setPrompt("Search");
//        this.addBuddy(lbl, BuddySupport.Position.RIGHT);
            Border empty = new EmptyBorder(5, 5, 5, 5);
            CompoundBorder border = javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, false), empty);
            this.setBorder(border);
            
            this.addFocusListener(new FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
//                    Input.this.selectAll();
                    Border empty = new EmptyBorder(5, 5, 5, 5);
                    CompoundBorder border = javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, false), empty);
                    Input.this.setBorder(border);
                }

                @Override
                public void focusLost(FocusEvent e) {
                    Border empty = new EmptyBorder(5, 5, 5, 5);
                    CompoundBorder border = javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, false), empty);
//                    Input.this.setBorder(border);

                }
            });

            JLabel lbl = new JLabel();
            lbl.setFocusable(false);

            lbl.setSize(10, 10);
            lbl.setIcon(new javax.swing.ImageIcon(Field.class.getResource("/synsoftech/fields/remove11.png")));
            lbl.setCursor(new Cursor(Cursor.HAND_CURSOR));

            lbl.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent e) {
                    Input.this.setText("");
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
        /**
         * @return @see BuddySupport#getOuterMargin(JTextField)
         */
        /**
         * @param buddy
         * @param pos
         * @see BuddySupport#add(Component, Position, JTextField)
         */
        /**
         * @param width
         * @param pos
         * @see BuddySupport#addGap(int, Position, JTextField)
         */
        /**
         * @param pos
         * @return
         * @see BuddySupport#getBuddies(Position, JTextField)
         */
        /**
         * @see BuddySupport#removeAll(JTextField)
         */
    }

    //</editor-fold>
}
