/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synsoftech.util;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Ronald
 */
public class MyBorder {

    public static void setBorder(JTextArea tf) {
        Border empty = new EmptyBorder(10, 20, 20, 20);
        CompoundBorder border2 = new CompoundBorder(null, empty);
        tf.setBorder(border2);
    }

    public static void setBorder2(JTextArea tf) {
        Border line = BorderFactory.createLineBorder(new java.awt.Color(249, 154, 4));
        Border empty = new EmptyBorder(0, 20, 0, 0);
        CompoundBorder border2 = new CompoundBorder(line, empty);
        tf.setBorder(border2);
    }

    public static void setBorder(JTextField tf) {
        Border empty = new EmptyBorder(0, 20, 0, 0);
        CompoundBorder border2 = new CompoundBorder(null, empty);
        tf.setBorder(border2);
    }

    public static void setBorder2(JTextField tf) {
        Border line = BorderFactory.createLineBorder(new java.awt.Color(249, 154, 4));
        Border empty = new EmptyBorder(0, 20, 0, 0);
        CompoundBorder border2 = new CompoundBorder(line, empty);
        tf.setBorder(border2);
    }

    public static void setBorder2(JTextField[] tf) {
        Border line = BorderFactory.createLineBorder(new java.awt.Color(157, 122, 67));
        Border empty = new EmptyBorder(0, 20, 0, 0);

        for (JTextField t : tf) {
            CompoundBorder border2 = new CompoundBorder(line, empty);
            t.setBorder(border2);
        }
    }

    public static void setBorder3(JTextField[] tf) {
        Border line = BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153));
        Border empty = new EmptyBorder(0, 5, 0, 0);

        for (JTextField t : tf) {
            CompoundBorder border2 = new CompoundBorder(line, empty);
            t.setBorder(border2);
        }
    }

    public static void setBorder(JLabel tf) {
        Border empty = new EmptyBorder(0, 20, 0, 0);
        CompoundBorder border2 = new CompoundBorder(null, empty);
        tf.setBorder(border2);
    }

    public static void setBorder2(JLabel tf) {
        Border line = BorderFactory.createLineBorder(new java.awt.Color(249, 154, 4));
        Border empty = new EmptyBorder(0, 20, 0, 0);
        CompoundBorder border2 = new CompoundBorder(line, empty);
        tf.setBorder(border2);
    }
}
