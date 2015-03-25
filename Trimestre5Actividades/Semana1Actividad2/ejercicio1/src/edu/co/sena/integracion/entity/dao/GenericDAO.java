/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.integracion.entity.dao;

import edu.co.sena.integracion.modelo.dto.PeopleDTO;

/**
 *
 * @author ColsutecR
 */
public interface GenericDAO {

    public void insert(PeopleDTO p);
    public void update(PeopleDTO p);
    public void delete(PeopleDTO p);
    public void findById(PeopleDTO p);

}
