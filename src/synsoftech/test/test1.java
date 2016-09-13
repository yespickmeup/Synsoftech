/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synsoftech.test;

/**
 *
 * @author Guinness
 */
public class test1 {
    public static void main(String[] args) {
        String table_name="users";
        String table=table_name.substring(0, 1).toUpperCase();
        System.out.println(table+table_name.substring(1, table_name.length()));
    }
}
