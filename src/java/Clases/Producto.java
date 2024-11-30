/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author ASUS TUF
 */
public class Producto {
    private int id_producto;
    private int stock;
    private double precio_unitario;
    private String unidad;
    private Clasificacion id_clasificaion;
    private Proveedores id_proveedor;
    private boolean iva;

    public Producto() {
    }

    public Producto(int id_producto, int stock, double precio_unitario, String unidad, Clasificacion id_clasificaion, Proveedores id_proveedor, boolean iva) {
        this.id_producto = id_producto;
        this.stock = stock;
        this.precio_unitario = precio_unitario;
        this.unidad = unidad;
        this.id_clasificaion = id_clasificaion;
        this.id_proveedor = id_proveedor;
        this.iva = iva;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public Clasificacion getId_clasificaion() {
        return id_clasificaion;
    }

    public void setId_clasificaion(Clasificacion id_clasificaion) {
        this.id_clasificaion = id_clasificaion;
    }

    public Proveedores getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(Proveedores id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public boolean isIva() {
        return iva;
    }

    public void setIva(boolean iva) {
        this.iva = iva;
    }



    @Override
    public String toString() {
        return "Producto{" + "id_producto=" + id_producto + ", stock=" + stock + ", precio_unitario=" + precio_unitario + ", unidad=" + unidad + ", id_clasificaion=" + id_clasificaion + ", id_proveedor=" + id_proveedor + ", iva=" + iva + '}';
    } 
    
}
