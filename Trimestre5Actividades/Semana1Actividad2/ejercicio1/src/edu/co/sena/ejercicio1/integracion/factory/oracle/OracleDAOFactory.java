/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.integracion.factory.oracle;

import edu.co.sena.ejercicio2.integracion.entity.DAO.oracle.CustommerDAOOracleImpl;
import edu.co.sena.ejercicio2.integracion.factory.DAOAbstractFactory;
import edu.co.sena.ejercicio2.integracion.entity.DAO.EmployeedDAO;
import edu.co.sena.ejercicio2.integracion.entity.DAO.CustommerDAO;
import edu.co.sena.ejercicio2.integracion.entity.DAO.oracle.EmployeedDAOOracleImpl;


/**
 *
 * @author ColsutecR
 */
public class OracleDAOFactory extends DAOAbstractFactory {

    public OracleDAOFactory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EmployeedDAO createEmployeedDAO() {
        return new EmployeedDAOOracleImpl();
    }

    @Override
    public CustommerDAO createCustommerDAO() {
        return new CustommerDAOOracleImpl();

    }

}
