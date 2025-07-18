/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author MyBook Hype AMD
 */
public class koneksi {
    private static Connection mysqlconfig;
    public static Connection konek() {
    try {
        String url = "jdbc:mysql://localhost:3306/kasir";
        String user = "root";
        String pass = "12345"; 

        mysqlconfig = DriverManager.getConnection(url,user,pass);
        return DriverManager.getConnection(url, user, pass);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Koneksi gagal: " + e.getMessage());
        return null;
    }
}

}

