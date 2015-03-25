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
 * @author maicolsteven
 */
public class App {

    public static void main(String[] args) throws SQLException {

        
        Cuenta cut1 = new Cuenta();

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

            String i = JOptionPane.showInputDialog("Escriba el documento");
            String o = JOptionPane.showInputDialog("Escriba el numero de documento");

            String sql = "SELECT * FROM akuavida.cuenta where Tipo_Documento= '" + i + "' and Numero_Documento= '" + o + "'";

            System.out.println(sql);
            rs = sentencia.executeQuery(sql);

            while (rs.next()) {

                cut1.setTipoDeDocumento(rs.getString("Tipo_Documento"));
                cut1.setNumeroDeDocumento(rs.getString("Numero_Documento"));
                cut1.setPrimerNombre(rs.getString("Primer_Nombre"));
                cut1.setSegundoNombre(rs.getString("Segundo_Nombre"));
                cut1.setPrimerApellido(rs.getString("Primer_Apellido"));
                cut1.setSegundoApellido(rs.getString("Segundo_Apellido"));
                cut1.setContrasena(rs.getString("Contraseña"));
                cut1.setCorreo(rs.getString("Correo"));
                cut1.setDireccion(rs.getString("Direccion"));
                cut1.setTelefono(rs.getString("Telefono"));
                cut1.setRool(rs.getString("Rool"));
                cut1.setActivo(rs.getBoolean("Activo"));
                cut1.setIdusuario(rs.getString("Ususario_idUsusario"));
            }

            
            System.out.println(cut1.toString());
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
