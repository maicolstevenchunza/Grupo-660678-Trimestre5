/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.integracion.entity.DAO.mysql;
import edu.co.sena.ejercicio2.integracion.entity.DAO.EmployeedDAO;
import edu.co.sena.ejercicio2.integracion.modelo.DTO.PeopleDTO;
import java.util.Collection;

/**
 *
 * @author ColsutecR
 */
public class EmployeedDAOMySQLImpl implements EmployeedDAO{
    
    @Override
    public void insert(PeopleDTO e) {
        System.out.println("inserte el empleado en mySQl " + e.toString());
    }

    @Override
    public void update(PeopleDTO e) {
        System.out.println("actualize empleado en mySQl " + e.toString());
    }

    @Override
    public void delete(PeopleDTO e) {
        System.out.println("borre empleado en mySQl " + e.toString());
    }

    @Override
    public void findByAll(PeopleDTO e) {
        System.out.println(" no se encuentra ");
    }
    
    @Override
    public void insert(Collection <PeopleDTO> a){

        for (PeopleDTO p1: a) {
            System.out.println("inserto en MySQL" + p1.toString());
            
        }
        
       
    }
}
