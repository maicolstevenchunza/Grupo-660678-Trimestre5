/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio2;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ColsutecR
 */
public class AppFactura {

    public static void main(String[] args) throws SQLException {

        Factura fac1 = new Factura();

        java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;
        try {

            String servidor = "jdbc:mysql://localhost/akuavida";
            String usuarioDB = "root";
            String passwordDB = "123456789";

            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("Se conecto");
            sentencia = conexion.createStatement();

            String i = JOptionPane.showInputDialog("Escriba el id de la factura");
          

            String sql = "SELECT * FROM akuavida.factura where ID_Factura= " + i + "";

            System.out.println(sql);
            rs = sentencia.executeQuery(sql);

            while (rs.next()) {

                fac1.setIdFactura(rs.getInt("ID_Factura"));
                fac1.setFecha(rs.getDate("Fecha"));
                fac1.setTipoDocumento(rs.getString("cuenta_Tipo_Documento"));
                fac1.setNumeroDocumento(rs.getString("Cuenta_Numero_Documento"));

            }

            System.out.println(fac1.toString());

        } catch (SQLException e) {

            System.out.println(e.toString());
        } finally {
            if (sentencia != null) {
                sentencia.close();
                System.out.println("Se cerro el statement");
            }
            if (rs != null) {
                rs.close();
                System.out.println("Se cerro el RS");
            }
            if (conexion != null) {
                conexion.close();
                System.out.println("Se cerro la conexion correctamente");
            }
        }

    }

}
