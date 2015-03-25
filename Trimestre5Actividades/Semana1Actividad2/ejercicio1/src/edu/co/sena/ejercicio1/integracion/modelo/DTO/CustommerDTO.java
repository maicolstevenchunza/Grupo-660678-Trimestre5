/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.integracion.modelo.DTO;

import java.io.Serializable;

/**
 *
 * @author maicolsteven
 */
public class CustommerDTO extends PeopleDTO implements Serializable{
    
    private String idCustommerDTO;
    
    
    public CustommerDTO() {
    }

    public String getIdCustommer() {
        return idCustommerDTO;
    }

    public void setIdCustommer(String idCustommer) {
        this.idCustommerDTO = idCustommer;
    }
    
    @Override
    public String toString() {
        return "CustomerDTO{" + "idCustomerDTO: " + idCustommerDTO + 
                 ", primerNombre: " + this.getPrimerNombre() +
                 ", segundoNombre: " + this.getSegundoNombre() +
                 ", PrimerApellido: " + this.getPrimerApellido() +
                 ", segundoApellido: " + this.getSegundoApellido() + '}' ;
    }

}
