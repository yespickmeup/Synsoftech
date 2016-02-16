/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synsoftech.util;

import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Guinness
 */
public class TableRender {

    public static class set1 extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            JLabel label = new JLabel();

            if (value != null) {
                label.setHorizontalAlignment(JLabel.CENTER);
                label.setIcon(new javax.swing.ImageIcon(getClass().getResource(value.toString())));
                if (isSelected) {
                    label.setOpaque(true);
                }
            }
            return label;
        }
    }

    public static class set2 extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            JLabel label = new JLabel();
            Color gridColor = new java.awt.Color(237, 234, 234);
            setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, gridColor));

            if (value != null) {
                label.setHorizontalAlignment(JLabel.RIGHT);
                label.setIcon(new javax.swing.ImageIcon(getClass().getResource(value.toString())));
              
                if (isSelected) {
                    label.setOpaque(true);
                }
            }
            return label;
        }
    }

    public static class set3 extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            JLabel label = new JLabel();
            Color gridColor = new java.awt.Color(237, 234, 234);
            setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, gridColor));

            if (value != null) {
                label.setHorizontalAlignment(JLabel.LEFT);
                setBackground(gridColor);
                if (isSelected) {
                    label.setOpaque(true);
                }
            }
            return label;
        }
    }
}
