/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synsoftech.chat;

/**
 *
 * @author Guinness
 */
public class Chat {

    public static void main(String[] args) {
        Dlg_chat chat = new Dlg_chat();
        chat.setVisible(true);
        chat.login();
//        chat.run();
    }

    public static class to_chats {
        public final int id;
        public final String user_id;
        public final String user_screen_name;
        public final String date;
        public final String message;
        public to_chats(int id, String user_id, String user_screen_name, String date, String message) {
            this.id = id;
            this.user_id = user_id;
            this.user_screen_name = user_screen_name;
            this.date = date;
            this.message = message;
        }
    }

    
}
