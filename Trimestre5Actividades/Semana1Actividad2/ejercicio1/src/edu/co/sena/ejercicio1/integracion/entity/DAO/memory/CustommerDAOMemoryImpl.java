/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.integracion.entity.DAO.memory;
import edu.co.sena.ejercicio2.integracion.entity.DAO.CustommerDAO;
import edu.co.sena.ejercicio2.integracion.modelo.DTO.PeopleDTO;
import java.util.Collection;

/**
 *
 * @author ColsutecR
 */
public class CustommerDAOMemoryImpl implements CustommerDAO {

    @Override
    public void insert(PeopleDTO e) {
        System.out.println("inserte el cliente en memory " + e.toString());
    }

    @Override
    public void update(PeopleDTO e) {
        System.out.println("actualize cliente en memory " + e.toString());
    }

    @Override
    public void delete(PeopleDTO e) {
        System.out.println("borre cliente en memory " + e.toString());
    }

    @Override
    public void findByAll(PeopleDTO e) {
        System.out.println(" no se encuentra ");
    }

    @Override
    public void insert(Collection <PeopleDTO> a){

        for (PeopleDTO p1: a) {
            System.out.println("inserto en memory" + p1.toString());
            
        }
        
       
    }

}
