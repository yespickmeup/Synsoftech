/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synsoftech.util;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Guinness
 */
public class ImageRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = new JLabel();

        if (value != null) {
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setIcon(new javax.swing.ImageIcon(getClass().getResource(value.toString())));
            if (isSelected) {
                label.setOpaque(true);
//                label.setBackground(new java.awt.Color(51, 153, 255));
            }
        }
        return label;
    }
}
