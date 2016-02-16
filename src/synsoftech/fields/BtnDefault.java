/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synsoftech.fields;

import javax.swing.JButton;

/**
 *
 * @author Guinness
 */
public class BtnDefault extends JButton {

    public BtnDefault() {
        this.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        this.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        this.setContentAreaFilled(false);
        this.setFocusable(false);
    }

}
