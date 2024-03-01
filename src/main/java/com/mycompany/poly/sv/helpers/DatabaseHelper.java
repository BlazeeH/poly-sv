/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poly.sv.helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Utech
 */
public class DatabaseHelper {

    /**
     *
     * @return
     */
    public static Connection openConnection() throws Exception {
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
     String connectionUrl = "jdbc:sqlserver://DESKTOP-DT03IGN\\HOPMAI;database=poly-app";
     String username = "sa";
     String password = "123456";
     Connection con = DriverManager.getConnection(connectionUrl, username, password);
     return con;
    }
}
 
