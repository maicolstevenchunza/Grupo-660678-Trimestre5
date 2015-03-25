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
public abstract class FormularioMatriculacion {
    
    protected String contenido;
    protected FormularioImpl implementacion;
    
    public FormularioMatriculacion(FormularioImpl implementacion) {
        this.implementacion = implementacion;
    }
    
    public void visualiza() {
        
        implementacion.dibujaTexto("numero de matricula existente: ");
    }
    
    public void generaDocumento() {
        
        implementacion.dibujaTexto("Solicitud de matriculacion");
        implementacion.dibujaTexto("numero de maricula: " + contenido);
    }
    
    public boolean admistraZona() {
        
        contenido = implementacion.administraZonaIndicada();
        return this.controlZona(contenido);
    }
    
    protected abstract boolean controlZona(String matricula);
}
