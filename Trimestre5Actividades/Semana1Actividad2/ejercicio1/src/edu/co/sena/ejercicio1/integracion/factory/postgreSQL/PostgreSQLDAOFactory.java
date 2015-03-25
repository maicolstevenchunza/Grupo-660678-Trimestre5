/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.integracion.factory.postgreSQL;

import edu.co.sena.ejercicio2.integracion.entity.DAO.CustommerDAO;
import edu.co.sena.ejercicio2.integracion.entity.DAO.EmployeedDAO;
import edu.co.sena.ejercicio2.integracion.factory.DAOAbstractFactory;
import edu.co.sena.ejercicio2.integracion.entity.DAO.postgresql.CustommerDAOPostgreSQLImpl;
import edu.co.sena.ejercicio2.integracion.entity.DAO.postgresql.EmployeedDAOPostgreSQLImpl;
/**
 *
 * @author ColsutecR
 */
public class PostgreSQLDAOFactory extends DAOAbstractFactory {

    @Override
    public EmployeedDAO createEmployeedDAO() {
        return new EmployeedDAOPostgreSQLImpl();
    }

    @Override
    public CustommerDAO createCustommerDAO() {
        return new CustommerDAOPostgreSQLImpl();
    }
}
