/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.negocio;

import edu.co.sena.ejercicio2.integracion.entity.DAO.EmployeedDAO;
import edu.co.sena.ejercicio2.integracion.entity.DAO.CustommerDAO;
import edu.co.sena.ejercicio2.integracion.entity.DAO.memory.CustommerDAOMemoryImpl;
import edu.co.sena.ejercicio2.integracion.factory.DAOAbstractFactory;
import edu.co.sena.ejercicio2.integracion.factory.DAOFactory;
import edu.co.sena.ejercicio2.integracion.modelo.DTO.CustommerDTO;
import edu.co.sena.ejercicio2.integracion.modelo.DTO.EmployeedDTO;
import edu.co.sena.ejercicio2.integracion.modelo.DTO.PeopleDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maicolsteven
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        PeopleDTO p1 = new PeopleDTO();
        p1.setPrimerNombre("Maicol");
        p1.setSegundoNombre("Steven");
        p1.setPrimerApellido("Chunza");
        p1.setSegundoApellido("Alfonso");
        System.out.println(p1.toString());     
        System.out.println("--------------------");
        
        EmployeedDTO p2= new EmployeedDTO();
        p2.setPrimerNombre("Jaime");
        p2.setSegundoNombre("Andres");
        p2.setPrimerApellido("Rubiano");
        p2.setSegundoApellido("Chunza");
        p2.setIdEmplyeedDTO("121");
        System.out.println(p2.toString());
        System.out.println("--------------------");
        
        CustommerDTO p3= new CustommerDTO();
        p3.setPrimerNombre("Leidy");
        p3.setSegundoNombre("Dayana");
        p3.setPrimerApellido("Alfonso");
        p3.setSegundoApellido("Malaver");
        p3.setIdCustommer("456");
        System.out.println(p3.toString());
     
        
        DAOFactory fabrica = DAOAbstractFactory.getDaoFActory (DAOAbstractFactory.PostgreSql_FACTORY);
        EmployeedDAO  emplSalidaFabrica = fabrica.createEmployeedDAO();
        CustommerDAO clilSalidaFabrica = fabrica.createCustommerDAO();
        
        emplSalidaFabrica.insert(p1);
        System.out.println("---------------------");
        emplSalidaFabrica.update(p1);
        System.out.println("---------------------");
        emplSalidaFabrica.delete(p1);
        System.out.println("---------------------");
        emplSalidaFabrica.findByAll(p1);
        System.out.println("---------------------");
        
        clilSalidaFabrica.insert(p2);
        System.out.println("---------------------");
        clilSalidaFabrica.update(p2);
        System.out.println("---------------------");
        clilSalidaFabrica.delete(p2);
        System.out.println("---------------------");
        clilSalidaFabrica.findByAll(p2);
        System.out.println("---------------------");
        
        List<PeopleDTO> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(p1);
        listaEmpleados.add(p1);
        listaEmpleados.add(p1);
        listaEmpleados.add(p1);
        listaEmpleados.add(p1);
        
        emplSalidaFabrica.insert(listaEmpleados);
        
        System.out.println("---------------------");
        
        List<PeopleDTO> listaClientes= new ArrayList<>();
        listaClientes.add(p2);
        listaClientes.add(p2);
        listaClientes.add(p2);
        
        clilSalidaFabrica.insert(listaClientes);
    }
    
}
