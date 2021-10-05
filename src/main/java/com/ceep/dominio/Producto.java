/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.dominio;

import java.time.chrono.ThaiBuddhistEra;

public class Producto {
    private static int idProducto;
    private String nombre;
    private double Precio;
    private static int contadorProductos;

    public Producto() {
        this.idProducto = ++contadorProductos;
    }

    public Producto(String nombre, double Precio) {
        this();
        this.nombre = nombre;
        this.Precio = Precio;
    }

    public int getIdProducto() {
        return this.idProducto;
    }

    public static void setIdProducto(int idProducto) {
        Producto.idProducto = idProducto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getContadorProductos() {
        return this.contadorProductos;
    }

    public static void setContadorProductos(int contadorProductos) {
        Producto.contadorProductos = contadorProductos;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", Precio=" + Precio + '}';
    }

}
