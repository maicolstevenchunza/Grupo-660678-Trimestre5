/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.integracion.factory;

import edu.co.sena.integracion.entity.dao.CustomerDAO;
import edu.co.sena.integracion.entity.dao.EmployeedDAO;

/**
 *
 * @author ColsutecR
 */
public interface DAOFactory {

    public EmployeedDAO createEmployeedDAO();
    public CustomerDAO createCustomerDAO();

}
