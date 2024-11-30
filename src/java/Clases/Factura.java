/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ASUS TUF
 */
public class Factura {
    private int id_factura;
    private String ruc;
    private Persona id_persona;
    private Date fecha;
    private Tipo_Pago id_tipo_pago;
    private double descuento;
    private double total;
    private List<Persona> personas;
    private List<Item_Factura> items = new ArrayList<>();

    public List<Item_Factura> getItems() {
        return items;
    }

    public void setItems(List<Item_Factura> items) {
        this.items = items;
    }

    public Factura() {
        this.personas = new ArrayList<>();
    }

    public Factura(int id_factura, String ruc, Persona id_persona, Date fecha, Tipo_Pago id_tipo_pago, double descuento, double total) {
        this.id_factura = id_factura;
        this.ruc = ruc;
        this.id_persona = id_persona;
        this.fecha = fecha;
        this.id_tipo_pago = id_tipo_pago;
        this.descuento = descuento;
        this.total = total;
        this.personas = new ArrayList<>();
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public Persona getId_persona() {
        return id_persona;
    }

    public void setId_persona(Persona id_persona) {
        this.id_persona = id_persona;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Tipo_Pago getId_tipo_pago() {
        return id_tipo_pago;
    }

    public void setId_tipo_pago(Tipo_Pago id_tipo_pago) {
        this.id_tipo_pago = id_tipo_pago;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public void agregarPersona(Persona personas) {
        this.personas.add(personas);
    }
     public void agregarItem(Item_Factura items) {
        this.items.add(items);
    }


    @Override
    public String toString() {
        return "Factura{" + "id_factura=" + id_factura + ", ruc=" + ruc + ", id_persona=" + id_persona + ", fecha=" + fecha + ", id_tipo_pago=" + id_tipo_pago + ", descuento=" + descuento + ", total=" + total + '}';
    }
    

    
    
    
}
