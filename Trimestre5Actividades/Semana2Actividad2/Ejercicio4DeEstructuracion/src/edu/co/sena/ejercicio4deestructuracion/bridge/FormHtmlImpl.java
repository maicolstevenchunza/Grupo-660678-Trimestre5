/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4deestructuracion.bridge;

import java.util.Scanner;

/**
 *
 * @author maicolsteven
 */
public class FormHtmlImpl implements FormularioImpl {

    Scanner reader = new Scanner(System.in);

    @Override
    public void dibujaTexto(String texto) {

        System.out.println("HTML: " + texto);
    }

    @Override
    public String administraZonaIndicada() {

        return reader.next();
    }

}
