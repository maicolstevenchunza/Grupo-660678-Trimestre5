/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejerciciocallablestament;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ColsutecR
 */
public class ProductoApp {

    public Connection conexion = null;
    public CallableStatement sentencia = null;
    public ResultSet rs = null;
    String servidor = "jdbc:mysql://localhost/akuavida";
    String usuarioDB = "root";
    String passwordDB = "123456789";

    public void insertarProducto(ProductoTO prod) throws SQLException {
        String sql = "CALL akuavida.insertProducto(?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?);";

        System.out.println(sql);

        try {
            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto");

            sentencia = conexion.prepareCall(sql);
            sentencia.setString(1, prod.getIdProducto());
            sentencia.setInt(2, prod.getCategoria_idCategoria());
            sentencia.setString(3, prod.getNombre());
            sentencia.setDouble(4, prod.getPrecio());
            sentencia.setString(5, prod.getDescripcion());
            sentencia.setInt(6, prod.getCantidad());
            sentencia.setShort(7, prod.getActivo());
            sentencia.setDouble(8, prod.getImpuesto());
            
            System.out.println("sentencia ejecutada " + sql);

            sentencia.execute();

        } catch (SQLException e) {
            System.err.println("error: " + e.toString());
        } finally {
            //cerrar el statement
            if (sentencia != null) {
                sentencia.close();
                System.out.println("se cerro el statement");
            }

            //cerre la conexion
            if (conexion != null) {
                conexion.close();
                System.out.println("se cerro la conexion correctamente");
            }
        }
    }

    public static void main(String[] args) throws SQLException {

        ProductoTO prod = new ProductoTO();
        prod.setIdProducto("545646");
        prod.setCategoria_idCategoria(2);
        prod.setNombre("Acero");
        prod.setPrecio(420000);
        prod.setDescripcion("acero alargado bonito");
        prod.setCantidad(5);
        prod.setActivo(new Short("1"));
        prod.setImpuesto(1.16);
        

        ProductoApp pro = new ProductoApp();
        pro.insertarProducto(prod);

    }
}
