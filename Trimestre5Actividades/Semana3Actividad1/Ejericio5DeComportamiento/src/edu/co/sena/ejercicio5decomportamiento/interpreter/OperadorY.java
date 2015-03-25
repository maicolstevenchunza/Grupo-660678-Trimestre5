/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5decomportamiento.interpreter;

/**
 *
 * @author maicolsteven
 */
public class OperadorY extends OperadoBinario{

    public OperadorY(Expresion operandoIzquierdo, Expresion operandoDerecho) {
        super(operandoIzquierdo, operandoDerecho);
    }
    
    @Override
    public boolean evalua(String descripcion) {

    return  operandoIzquierdo.evalua(descripcion) && operandoDerecho.evalua(descripcion);
    }
    
    public static Expresion parsea() throws Exception{
    
    Expresion resultadoIzquierdo, resultadoderecho;
    resultadoIzquierdo = Expresion.parsea();
        while ((pieza != null) && (pieza.equals("y")))  {            
            siguientePieza();
            resultadoderecho=Expresion.parsea();
            resultadoIzquierdo= new OperadorY(resultadoIzquierdo, resultadoderecho);
        }
    return resultadoIzquierdo;
    }
}
