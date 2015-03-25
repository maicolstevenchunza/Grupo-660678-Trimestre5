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
public class Cuenta {

    public Connection conexion = null;
    public CallableStatement sentencia = null;
    public ResultSet rs = null;
    String servidor = "jdbc:mysql://localhost/akuavida";
    String usuarioDB = "root";
    String passwordDB = "123456789";

    public void insertarCuenta(CuentaTO cuen ) throws SQLException{
        String sql = "CALL akuavida.insertCuenta(?,"
                + "?, "
                + "?, "
                + "?, "
                + "?, "
                + "?, "
                + "?, "
                + "?, "
                + "?, "
                + "?, "
                + "?, "
                + "?, "
                + "?);";

        System.out.println(sql);

        try {
            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto");

            sentencia = conexion.prepareCall(sql);
             sentencia.setString(1, cuen.getTipoDeDocumento());
            sentencia.setString(2, cuen.getNumeroDeDocumento());
            sentencia.setString(3, cuen.getPrimerNombre());
            sentencia.setString(4, cuen.getSegundoNombre());
            sentencia.setString(5, cuen.getPrimerApellido());
            sentencia.setString(6, cuen.getSegundoApellido());
            sentencia.setString(7, cuen.getContrasena());
            sentencia.setString(8, cuen.getCorreo());
            sentencia.setString(9, cuen.getDireccion());
            sentencia.setString(10, cuen.getTelefono());
            sentencia.setString(11, cuen.getRool());
            sentencia.setShort(12, cuen.isActivo());
            sentencia.setString(13, cuen.getIdusuario());
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

        
        CuentaTO cuenta1 = new CuentaTO();
        cuenta1.setTipoDeDocumento("C.C");
        cuenta1.setNumeroDeDocumento("10230064587");
        cuenta1.setPrimerNombre("Adriana");
        cuenta1.setSegundoNombre("Mariia");
        cuenta1.setPrimerApellido("Hoyos");
        cuenta1.setSegundoApellido("Rodriguez");
        cuenta1.setContrasena("4512gjgsd");
        cuenta1.setCorreo("anaHoy@yahoo.es");
        cuenta1.setDireccion("calle 45 b 56-56");
        cuenta1.setTelefono("7546824");
        cuenta1.setRool("Cliente");
        cuenta1.setActivo(new Short("1"));
        cuenta1.setIdusuario("4");
        
        Cuenta cu = new Cuenta();
        cu.insertarCuenta(cuenta1);
    }
}
