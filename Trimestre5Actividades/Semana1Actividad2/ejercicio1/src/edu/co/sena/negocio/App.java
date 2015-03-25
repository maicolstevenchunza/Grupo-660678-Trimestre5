/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.negocio;

import edu.co.sena.integracion.modelo.dto.CustomerDTO;
import edu.co.sena.integracion.modelo.dto.EmployeedDTO;
import edu.co.sena.integracion.modelo.dto.PeopleDTO;

/**
 *
 * @author ColsutecR
 */
public class App {

    public static void main(String[] args) {

        CustomerDTO cus = new CustomerDTO();
        cus.setIdCustomerDTO("1");
        cus.setPrimerNombre("Juan");
        cus.setSegundoNombre("David");
        cus.setPrimerApellido("Montero");
        cus.setSegundoApellido("Bogota");

        System.out.println(cus.toString());

        EmployeedDTO emp = new EmployeedDTO();
        emp.setIdEmplyeedDTO("2");
        emp.setPrimerNombre("Carlos");
        emp.setSegundoNombre("Eduardo");
        emp.setPrimerApellido("Montoya");
        emp.setSegundoApellido("Patiño");

        System.out.println(emp.toString());

        PeopleDTO per = new PeopleDTO();
        per.setPrimerNombre("Andres");
        per.setSegundoNombre("Felipe");
        per.setPrimerApellido("Castañeda");
        per.setSegundoApellido("Sanchez");

        System.out.println(per.toString());

    }

}
