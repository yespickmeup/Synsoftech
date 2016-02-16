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
public class ImageRenderer1 extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = new JLabel();

        if (value != null) {
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setIcon(new javax.swing.ImageIcon(getClass().getResource(value.toString())));
            if (isSelected) {
                label.setOpaque(true);

            }
            if (column == 2) {
                label.setToolTipText("View Table");
            }
            if (column == 3) {
                label.setToolTipText("Duplicate Table");
            }
            if (column == 4) {
                label.setToolTipText("Drop Table");
            }
            if (column == 5) {
                label.setToolTipText("Empty Table");
            }
            if (column == 6) {
                label.setToolTipText("Add Column");
            }
        }
        return label;
    }

}
