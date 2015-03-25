/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.akuavida.ejercicio;

import edu.co.sena.akuavida.integracion.dao.CarritoDeComprasDao;
import edu.co.sena.akuavida.integracion.dao.CuentaDao;
import edu.co.sena.akuavida.integracion.dao.UsusarioDao;
import edu.co.sena.akuavida.integracion.dto.CarritoDeCompras;
import edu.co.sena.akuavida.integracion.dto.Cuenta;
import edu.co.sena.akuavida.integracion.dto.Ususario;
import edu.co.sena.akuavida.integracion.exceptions.CuentaDaoException;
import edu.co.sena.akuavida.integracion.exceptions.UsusarioDaoException;
import edu.co.sena.akuavida.integracion.factory.CuentaDaoFactory;
import edu.co.sena.akuavida.integracion.factory.UsusarioDaoFactory;
import edu.co.sena.akuavida.integracion.jdbc.UsusarioDaoImpl;
import edu.co.sena.akuavida.negocio.example.CuentaDaoSample;
import static edu.co.sena.akuavida.negocio.example2.CarritoDeComprasDaoSample.display;
import static edu.co.sena.akuavida.negocio.example2.CarritoDeComprasDaoSample.getCarritoDeComprasDao;
import javax.swing.JOptionPane;

/**
 *
 * @author ColsutecR
 */
public class Ejercicio {

    public static void main(String[] args) throws UsusarioDaoException, CuentaDaoException {

        System.out.println("USUARIO");

        Ususario usu = new Ususario();
        usu.setIdUsusario("6");
        usu.setPassword("5640mncfskf");
        usu.setRol("Cliente");
        usu.setEstado("Activo");

        UsusarioDao daoUsuario = UsusarioDaoFactory.create();
        //daoUsuario.insert(usu);
        Ususario aregloUsusario[] = daoUsuario.findAll();

        for (int i = 0; i < aregloUsusario.length; i++) {

            aregloUsusario[i].toString();
        }
        usu.setPassword("451");
        // daoUsuario.update(usu.createPk(), usu);

        String sql = "SELECT * FROM akuavida.ususario c where c.idUsusario=?;";

        String parametro[] = new String[1];
        parametro[0] = usu.getIdUsusario();
        Ususario areglo2Usuario[] = daoUsuario.findByDynamicSelect(sql, parametro);
        for (int i = 0; i < areglo2Usuario.length; i++) {

            System.out.println(areglo2Usuario[i].toString());
        }

        System.out.println("-------------------------------------------------------");

        String sql2 = "idUsusario=?;";

        String parametro1[] = new String[1];
        parametro1[0] = usu.getIdUsusario();
        Ususario areglo3Us[] = daoUsuario.findByDynamicWhere(sql2, parametro1);
        for (int i = 0; i < areglo3Us.length; i++) {
            System.out.println(areglo3Us[i].toString());

        }

        Ususario buscarUsuario = daoUsuario.findByPrimaryKey("6");
        System.out.println(buscarUsuario.toString());
        System.out.println("se busco Usuario6");

        usu.setIdUsusario("1");
        Ususario buscarUsu = daoUsuario.findByPrimaryKey(usu.createPk());
        System.out.println(buscarUsu.toString());
        System.out.println("se busco usuario1");

        Ususario buscarEstadoUsuario[] = daoUsuario.findWhereEstadoEquals("Activo");
        for (int i = 0; i < buscarEstadoUsuario.length; i++) {
            System.out.println(buscarEstadoUsuario[i].toString());
            System.out.println("se busco el estado ");
        }

        Ususario buscarIdUsusario[] = daoUsuario.findWhereIdUsusarioEquals("6");
        for (int i = 0; i < buscarIdUsusario.length; i++) {
            System.out.println(buscarIdUsusario[i].toString());
            System.out.println("se busco el ID ");
        }

        Ususario buscarPassUsu[] = daoUsuario.findWherePasswordEquals("5640mncfskf");
        for (int i = 0; i < buscarPassUsu.length; i++) {
            System.out.println(buscarPassUsu[i].toString());
            System.out.println("se busco el password");

        }

        Ususario bucarRolUsuario[] = daoUsuario.findWhereRolEquals("Cliente");
        for (int i = 0; i < bucarRolUsuario.length; i++) {
            System.out.println(bucarRolUsuario[i].toString());
            System.out.println("se busco el rol ");
        }

        UsusarioDaoImpl user = new UsusarioDaoImpl();
        System.out.println(user.getTableName());
  
        usu.setIdUsusario("6");
        //daoUsuario.delete(usu.createPk());

        System.out.println("CUENTA");

        Cuenta cuen = new Cuenta();
        cuen.setTipoDocumento("TI");
        cuen.setNumeroDocumento("97101306287");
        cuen.setPrimerNombre("Maicol");
        cuen.setSegundoNombre("Steven");
        cuen.setPrimerApellido("Chunza");
        cuen.setSegundoApellido("Alfonso");
        cuen.setContrasena("45454212");
        cuen.setCorreo("maicol@hotmail.com");
        cuen.setDireccion("calle 69 B 32-15 b sur");
        cuen.setTelefono("41257632");
        cuen.setRool("Cliente");
        cuen.setActivo(new Short("1"));
        cuen.setUsusarioIdususario("6");

        CuentaDao daoCuenta = CuentaDaoFactory.create();
        daoCuenta.insert(cuen);
        
        Cuenta aregloCuenta[] = daoCuenta.findAll();
        for (int i = 0; i < aregloCuenta.length; i++) {
            System.out.println(aregloCuenta[i].toString());
        }
        
        cuen.setCorreo("maicol45op@gmail.com");
        cuen.setDireccion("Crr 1a # 78-17 sur");
        cuen.setTelefono("7688011");
        daoCuenta.update(cuen.createPk(), cuen);
        
        
        
    }
}
