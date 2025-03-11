package org.example;

import java.util.ArrayList;
import java.util.List;

public class PRODUCTO {
    public PRODUCTO(int cantidad, String nombre, int codigo, int precio) {
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }

    private int cantidad;
    private String nombre;
    private int codigo;
    private int precio;


    public void ingresarproducto(int valor) {
        this.cantidad += valor;
        System.out.println("nuevo inventario es: " + this.cantidad);
    }

    public void venta (int cantidad) {
        if (cantidad > this.cantidad) {
            System.out.println("No hay cantidades disponibles");
        } else {
            this.cantidad -= cantidad;
            System.out.println(" Nuevo stock de " + this.nombre + ": " + this.cantidad);
        }
    }


    public void descuento(int vdescuento) {
                this.precio -= this.precio*(vdescuento/100);
        System.out.println("nuevo precio es: " + this.precio);
    }

    public void cambioprecio(int vaumento) {
        this.precio += this.precio*(vaumento/100);
        System.out.println("nuevo precio es: " + this.precio);
    }

    public void Infoproducto() {
        System.out.println("nombre del producto :" + this.nombre);
        System.out.println("inventario del producto :" + this.cantidad);
        System.out.println("precio del producto :" + this.precio);
        System.out.println("total inventario del producto :" + this.precio);
    }


    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}


