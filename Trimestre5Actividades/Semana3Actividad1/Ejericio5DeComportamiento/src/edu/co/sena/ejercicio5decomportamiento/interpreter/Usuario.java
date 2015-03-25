/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5decomportamiento.interpreter;

import java.util.Scanner;

/**
 *
 * @author maicolsteven
 */
public class Usuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Expresion expresionConsulta= null;
        Scanner reader= new Scanner(System.in);
        System.out.println("Introduzca su consulta");
        String consulta= reader.nextLine();
        try {
            expresionConsulta=Expresion.analiza(consulta);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            expresionConsulta= null;
        }
        if (expresionConsulta != null) {
            System.out.println("Introduzca la descripcion del vehiculo: ");
            String descrpcion= reader.nextLine();
            if (expresionConsulta.evalua(descrpcion)) {
                System.out.println("La descripcion responde a la consulta");
            } else {
                System.out.println("La descripcion no responde a la consulta");
            }
        }
        
    }
    
}
