/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5decomportamiento.method;

/**
 *
 * @author maicolsteven
 */
public class Usuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pedido pedidoEspana = new PedidoEspana();
        pedidoEspana.setImporteSinIVA(10000);
        pedidoEspana.calculaPrecioIVA();
        pedidoEspana.visualiza();

        Pedido pedidoLuxemburgo = new PedidoLuxemburgo();
        pedidoLuxemburgo.setImporteSinIVA(10000);
        pedidoLuxemburgo.calculaPrecioIVA();
        pedidoLuxemburgo.visualiza();
    }

}
