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
 * @author ColsutecR
 */
public class ProdcutoBuscarYActualizar {

    public static void main(String[] args) throws SQLException {
        java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;

        String servidor = "jdbc:mysql://localhost/akuavida";
        String usuarioDB = "root";
        String passwordDB = "123456789";

        String idProducto = JOptionPane.showInputDialog("digite el ID del producto");
        String sql = "Select * from akuavida.producto pro where pro.ID_producto= '" + idProducto + "';";

        System.out.println(sql);

        try {

            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("Se conecto");
            sentencia = conexion.createStatement();
            rs = sentencia.executeQuery(sql);

            if (rs.next() == true) {
                rs.beforeFirst();
                while (rs.next() == true) {
                    System.out.println("id producto" + rs.getString("ID_producto"));
                    System.out.println("nombre producto" + rs.getString("Nombre"));
                    System.out.println("precio unitario del producto" + rs.getString("Precio"));
                    System.out.println("descripcion del producto" + rs.getString("Descripcion"));
                    System.out.println("cantidad del producto" + rs.getString("Cantidad"));
                    System.out.println("activo del producto" + rs.getString("Activo"));                    
                    System.out.println("impuesto del producto" + rs.getString("impuesto"));
                    System.out.println("id de categoria" + rs.getString("Categorias_ID_Categoria"));
                    System.out.println("-----------------------------------------------------------------------");
                }
            } else {
                System.out.println("no existe el producto");
            }

            String b1 = JOptionPane.showInputDialog("Escriba el nombre ");
            String b2 = JOptionPane.showInputDialog("Escriba el precio");
            String b3 = JOptionPane.showInputDialog("Escriba la descripcion ");
            String b4 = JOptionPane.showInputDialog("Escriba la cantidad ");
            String b5 = JOptionPane.showInputDialog("Escriba si esta activo ");
            String b6 = JOptionPane.showInputDialog("Escriba el impuesto");
            String b7 = JOptionPane.showInputDialog("Escriba el id de categoria ");
            String ax = JOptionPane.showInputDialog("Escriba el id");
            String sql2 = "UPDATE akuavida.producto "
                    + "SET "
                    + "Nombre = '" + b1 + "',"
                    + "Precio = " + b2 + ","
                    + "Descripcion = '" + b3 + "',"
                    + "Cantidad = " + b4 + ","
                    + "Activo = " + b5 + ","
                    + "impuesto = " + b6 + ","
                    + "Categorias_ID_Categoria= " + b7 + " "
                    + "WHERE ID_producto = '" + ax + "';";

            sentencia = conexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
            int resul = sentencia.executeUpdate(sql2);

            if (resul == 1) {
                System.out.println("Se modifico el producto");
            } else {
                System.out.println("no se pudo modificar el producto");
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
