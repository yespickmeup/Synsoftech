/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synsoftech.tooltip;

import java.awt.Point;
import java.awt.Window;
import javax.swing.JDialog;
import mijzcx.synapse.desk.utils.CloseDialog;

/**
 *
 * @author Guinness
 */
public class Tip {

    public static void set(JDialog parent, Point point, String message) {
        Window p = (Window) parent;
        Dlg_tooltip nd = Dlg_tooltip.create(p, true);
        nd.setTitle("");
        nd.do_pass(message);
        nd.setCallback(new Dlg_tooltip.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_tooltip.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocation(point);
        nd.setVisible(true);
    }

    public static void set2(JDialog parent, Point point, String message) {
        Window p = (Window) parent;
        Dlg_tooltip2 nd = Dlg_tooltip2.create(p, true);
        nd.setTitle("");
        nd.do_pass(message);
        nd.setCallback(new Dlg_tooltip2.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_tooltip2.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocation(point);
        nd.setVisible(true);
    }
}
