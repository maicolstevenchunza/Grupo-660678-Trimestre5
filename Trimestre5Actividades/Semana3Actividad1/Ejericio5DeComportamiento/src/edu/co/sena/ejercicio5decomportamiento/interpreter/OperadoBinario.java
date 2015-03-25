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
public abstract class OperadoBinario extends Expresion{
    
    protected Expresion operandoIzquierdo, operandoDerecho;

    public OperadoBinario(Expresion operandoIzquierdo, Expresion operandoDerecho) {
        this.operandoIzquierdo = operandoIzquierdo;
        this.operandoDerecho = operandoDerecho;
    }

    
    
    
}
