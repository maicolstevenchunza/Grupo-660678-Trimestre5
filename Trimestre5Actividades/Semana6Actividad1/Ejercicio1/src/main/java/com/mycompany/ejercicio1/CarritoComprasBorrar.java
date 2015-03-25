/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio1;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author maicolsteven
 */
public class CarritoComprasBorrar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        String servidor = "jdbc:mysql://localhost/akuavida";
        String usuarioDB = "root";
        String passwordDB = "123456789";

        Statement sentencia = null;
        ResultSet rs = null;
        java.sql.Connection conexion = null;
        String a1 = JOptionPane.showInputDialog("Escriba el id del carrito de compras");

        String sql = "DELETE FROM akuavida.carrito_de_compras "
                + "WHERE ID_Carrito="+a1+";";

        System.out.println(sql);
        try {

            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("Se conecto");
            sentencia = conexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);

            boolean resul = sentencia.execute(sql);
            if (resul = true) {
                System.out.println("Se inserto");
            } else {
                System.out.println("no se inserto");
            }
        } catch (SQLException e) {

            System.out.println(e.toString());
        } finally {
            if (sentencia != null) {
                sentencia.close();
                System.out.println("Se cerro el statement");
            }
            if (conexion != null) {
                conexion.close();
                System.out.println("Se cerro la conexion correctamente");
            }
        }
    }

}
