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
public class Persona {

    private int id_persona;
    private String nombre;
    private String apellido;
    private String dni;
    private String celular;
    private String correo;
    private List<Factura> facturas = new ArrayList<>();



    public Persona() {
        this.facturas = new ArrayList<>();

    }

    public Persona(int id_persona, String nombre, String apellido, String dni, String celular, String correo) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.celular = celular;
        this.correo = correo;
        this.facturas = new ArrayList<>();
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
        public List<Factura> getFacturas() {
        return facturas;
    }

    public void agregarFactura(Factura factura) {
        if (!facturas.contains(factura)) {
            facturas.add(factura);
            factura.agregarPersona(this); // Actualiza también la lista en Factura
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "id_persona=" + id_persona + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", celular=" + celular + ", correo=" + correo + '}';
    }

    public Persona buscarP(String dni) {
        if (this.dni.equals(dni)) {
            return this;
        }
        return null;
    }

    public String nombreCompl(String dni) {
        if (this.dni.equals(dni)) {
            return nombre + " " + apellido;
        }
        return null;
    }

}
