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
public class FacturaJoin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

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
            String ax = JOptionPane.showInputDialog("Escriba el id");
            String sql = "select item.Cantidad, pro.Nombre, item.Costo_Unitario, item.Costo_Total from akuavida.producto pro inner join  akuavida.item item inner join akuavida.pedido ped inner join akuavida.factura fac on  pro.ID_producto=item.Producto_ID_producto and ped.Factura_ID_Factura=item.Pedido_Factura_ID_Factura and fac.ID_Factura=item.Pedido_Factura_ID_Factura where fac.ID_Factura= '" + ax + "';";

            System.out.println(sql);
            rs = sentencia.executeQuery(sql);
            if (!rs.wasNull()) {

                while (rs.next() == true) {
                    System.out.print("Nombre: " + rs.getString("Nombre"));
                    System.out.print("  Cantidad: " + rs.getString("Cantidad"));
                    System.out.print("  precio unitario: " + rs.getString("Costo_Unitario"));
                    System.out.print("  Precio total: " + rs.getString("Costo_Total"));
                    System.out.print("----------------");
                }
            } else {
                System.out.println("no existe el producto");
            }

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
