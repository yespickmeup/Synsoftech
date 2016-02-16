package synsoftech.util;

import java.awt.Window;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;
import synsoftech.notifications.Dlg_notification;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Guinness
 */
public class Show {

    public static void main(String[] args) {
        notification(3, "asdasdasdasdadsad asdasd");
    }

    public static void notification(int status, String message) {
        Window p = (Window) new JFrame();
        Dlg_notification nd = Dlg_notification.create(p, true);
        nd.setShape(new RoundRectangle2D.Double(1, 1, 508, 115, 5, 5));
        nd.setTitle("");
        nd.do_pass(status, message);
        nd.setCallback(new Dlg_notification.Callback() {
            @Override
            public void ok(Dlg_notification.OutputData data) {
            }
        });

        nd.setLocationRelativeTo(null);
        nd.setVisible(true);

    }
}
