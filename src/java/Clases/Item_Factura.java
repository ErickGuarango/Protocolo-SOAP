/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS TUF
 */
public class Item_Factura {
    private int id_item_factura;
    private Factura id_factura;
    private Producto id_producto;
    private int cantidad;
    private double precio;
    private double subtotal;
    private List<Factura> facturas;

    public Item_Factura() {
          this.facturas = new ArrayList<>();
    }

    public Item_Factura(int id_item_factura, Factura id_factura, Producto id_producto, int cantidad, double precio, double subtotal) {
        this.id_item_factura = id_item_factura;
        this.id_factura = id_factura;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subtotal = subtotal;
        this.facturas = facturas;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }

  

    public int getId_item_factura() {
        return id_item_factura;
    }

    public void setId_item_factura(int id_item_factura) {
        this.id_item_factura = id_item_factura;
    }

    public Factura getId_factura() {
        return id_factura;
    }

    public void setId_factura(Factura id_factura) {
        this.id_factura = id_factura;
    }

    public Producto getId_producto() {
        return id_producto;
    }

    public void setId_producto(Producto id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    public void agregarfactura(Factura facturass) {
        this.facturas.add(facturass);
    }

    @Override
    public String toString() {
        return "Item_Factura{" + "id_item_factura=" + id_item_factura + ", id_factura=" + id_factura + ", id_producto=" + id_producto + ", cantidad=" + cantidad + ", precio=" + precio + ", subtotal=" + subtotal + '}';
    }

   
    
    
    
    
}
