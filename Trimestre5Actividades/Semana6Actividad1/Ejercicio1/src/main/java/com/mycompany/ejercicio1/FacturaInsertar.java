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
public class FacturaInsertar {

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
        String a1 = JOptionPane.showInputDialog("Escriba el id de la factura");
        String a2 = JOptionPane.showInputDialog("Escriba la fecha");
        String a3 = JOptionPane.showInputDialog("Escriba el tipo de documento ");
        String a4 = JOptionPane.showInputDialog("Escriba el numero de documento");
        String sql = "INSERT INTO akuavida.factura "
                + "(`ID_Factura`,"
                + "`Fecha`,"
                + "`Cuenta_Tipo_Documento`,"
                + "`Cuenta_Numero_Documento`)"
                + " VALUES "
                + "(" + a1 + ","
                + "'" + a2 + "',"
                + "'" + a3 + "',"
                + "'" + a4 + "');";
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
