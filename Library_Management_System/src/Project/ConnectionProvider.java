/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author Harshavardhan
 */
public class ConnectionProvider {
   public static Connection getCon() {
    Connection con = null;
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms", "root", "harsha@18");
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return con;
}
}