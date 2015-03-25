/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.integracion.factory;

import edu.co.sena.ejercicio2.integracion.factory.oracle.OracleDAOFactory;

/**
 *
 * @author ColsutecR
 */
public abstract class DAOAbstractFactory implements DAOFactory {

    public final static int ORACLE_FACTORY = 1;
    public final static int MYSQL_FACTORY = 2;
    public final static int MEMORY_FACTORY = 3;
    public final static int POSTGRESQL_FACTORY = 4;

    public final static OracleDAOFactory getdaofACTORY (int factoryType) throws Exception{
    switch (factoryType){
        case ORACLE_FACTORY:{
        return new OracleDAOFactory();
        }
        case MYSQL_FACTORY:{
        }
    }
        return null;
    
    }
}
