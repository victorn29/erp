/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erp.viji.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Javier
 */
public class GestorBBDD {

    private Connection c = null;
    private Statement stmt = null;
    private ResultSet rs;
    static PreparedStatement pst;

    public void conectar() throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.jdbc.Driver";
        Class.forName(driver);
        String servidor = "jdbc:mysql://sql8.freesqldatabase.com";
        String user = "sql8153216";
        String pass = "QPE7dqrUjR";
        c = DriverManager.getConnection(servidor, user, pass);
        System.out.println("Conexión establecida");
    }
}
