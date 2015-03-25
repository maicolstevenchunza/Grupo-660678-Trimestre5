/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejerciciocallablestament;

/**
 *
 * @author ColsutecR
 */
public class ProductoTO {
 
    private String idProducto;
    private String nombre;
    private double precio;
    private String descripcion;
    private int cantidad;
    private short activo;
    private double impuesto;
    private int categoria_idCategoria;

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public short getActivo() {
        return activo;
    }

    public void setActivo(short activo) {
        this.activo = activo;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public int getCategoria_idCategoria() {
        return categoria_idCategoria;
    }

    public void setCategoria_idCategoria(int categoria_idCategoria) {
        this.categoria_idCategoria = categoria_idCategoria;
    }

    @Override
    public String toString() {
        return "ProductoTO{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion + ", cantidad=" + cantidad + ", activo=" + activo + ", impuesto=" + impuesto + ", categoria_idCategoria=" + categoria_idCategoria + '}';
    }
    
    
    
}