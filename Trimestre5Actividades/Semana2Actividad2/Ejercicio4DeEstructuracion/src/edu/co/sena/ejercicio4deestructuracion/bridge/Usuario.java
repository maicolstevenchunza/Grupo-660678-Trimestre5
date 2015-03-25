/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4deestructuracion.bridge;

/**
 *
 * @author maicolsteven
 */
public class Usuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FormularioMatriculacionPortugal formulario1 = new FormularioMatriculacionPortugal(new FormHtmlImpl());
        formulario1.visualiza();
        if (formulario1.admistraZona()) {
            formulario1.generaDocumento();
        }
        System.out.println();
        FormularioMatriculacionEspaña formulario2 = new FormularioMatriculacionEspaña(new FormAppletImpl());
        formulario2.visualiza();
        if (formulario2.admistraZona()) {
            formulario2.generaDocumento();
        }

    }

}
