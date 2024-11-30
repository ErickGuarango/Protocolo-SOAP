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
public class Competencia {
    private int id_competencia;
    private String nombre;
    private String descrpcion;

    public Competencia() {
    }

    public Competencia(int id_competencia, String nombre, String descrpcion) {
        this.id_competencia = id_competencia;
        this.nombre = nombre;
        this.descrpcion = descrpcion;
    }

    public int getId_competencia() {
        return id_competencia;
    }

    public void setId_competencia(int id_competencia) {
        this.id_competencia = id_competencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescrpcion() {
        return descrpcion;
    }

    public void setDescrpcion(String descrpcion) {
        this.descrpcion = descrpcion;
    }
    
   public boolean siexisteComp(String nombre) {
        return this.nombre.equals(nombre);
    }

    @Override
    public String toString() {
        return "Competencia{" + "id_competencia=" + id_competencia + ", nombre=" + nombre + ", descrpcion=" + descrpcion + '}';
    }
    
    
}
