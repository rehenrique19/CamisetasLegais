/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devweb.camisaslegais;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Lucas Rogério
 */
public class ConexaoBancoDados {
    public Connection getConnection() {
        try {
            System.out.println("oi");
            return DriverManager.getConnection("jdbc:mysql://35.198.36.118/loja","db-loja","dev2019");
        } catch (SQLException e) {
            System.out.println("FALHÔ");
            throw new RuntimeException(e);
        }
    }
}
