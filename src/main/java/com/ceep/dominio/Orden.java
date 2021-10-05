/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.dominio;

/**
 *
 * @author Alumno Mañana
 */
public class Orden {
    private final int idOrden;
    Producto productos[] = new Producto[10];
    private static int contadorOrdenes;
    private static int contadorProductos;
    
    private static final int MAX_PRODUCTOS= 10;
     
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        
    }
    public void agregarPrducto(Producto producto){
        if (Orden.contadorProductos <  Orden.MAX_PRODUCTOS) {
            productos[Orden.contadorProductos] = producto;
           
        }else{
            System.out.println("has alcanzado el másimo de productos de "+ Orden.MAX_PRODUCTOS);
        }
    }
    public double calcualrTotal(){
        var res =0.0;
        for (int i = 0; i < Orden.contadorProductos; i++) {
            res += productos[i].getPrecio();
        }
        return 0.0;
    }
       public void mostrarOOrden(){
           System.out.println("Id de Orden: "+ this.idOrden);
           for (int i = 0; i < Orden.contadorProductos; i++) {
               System.out.println("Nombre producto["+i+"] ->"+productos[i].getNombre());
               System.out.println("Precio producto["+i+"] ->"+productos[i].getPrecio());
           }
       }
}
