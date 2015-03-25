/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.integracion.factory.mysql;

import edu.co.sena.ejercicio2.integracion.entity.DAO.CustommerDAO;
import edu.co.sena.ejercicio2.integracion.entity.DAO.EmployeedDAO;
import edu.co.sena.ejercicio2.integracion.factory.DAOAbstractFactory;
import edu.co.sena.ejercicio2.integracion.entity.DAO.mysql.CustommerDAOMySQLImpl;
import edu.co.sena.ejercicio2.integracion.entity.DAO.mysql.EmployeedDAOMySQLImpl;

/**
 *
 * @author ColsutecR
 */
public class MySQLDAOFactory extends DAOAbstractFactory{
    
    @Override
    public EmployeedDAO createEmployeedDAO() {
        return new EmployeedDAOMySQLImpl();
    }

    @Override
    public CustommerDAO createCustommerDAO(){
        return new CustommerDAOMySQLImpl();

    }
}
