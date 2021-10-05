/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.gestionventas;
import com.ceep.dominio.*;
/**
 *
 * @author Alumno Mañana
 */
public class GestionVentas {

    
    public static void main(String[] args) {
        Orden pedido1 = new Orden();
        Producto prod1 = new Producto("peras",5.4);
        Producto prod2 = new Producto("Manzanas",6.4);
        Producto prod3 = new Producto("Platanos",7);
        pedido1.agregarPrducto(prod1);
        pedido1.agregarPrducto(prod2);
        pedido1.agregarPrducto(prod3);
        pedido1.mostrarOOrden();
    }
            
    
}
