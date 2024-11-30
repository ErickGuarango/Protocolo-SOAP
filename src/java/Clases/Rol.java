package Clases;

import java.util.ArrayList;
import java.util.List;

public class Rol {
    private int id_rol;
    private String rol;
    private String descripcion;
    private List<Competencia> listaCompetencias; // Lista para almacenar competencias

    public Rol() {
        this.listaCompetencias = new ArrayList<>(); // Inicialización de la lista
    }

    public Rol(int id_rol, String rol, String descripcion) {
        this.id_rol = id_rol;
        this.rol = rol;
        this.descripcion = descripcion;
        this.listaCompetencias = new ArrayList<>(); // Inicialización de la lista
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Competencia> getListaCompetencias() {
        return listaCompetencias;
    }

    public void setListaCompetencias(List<Competencia> listaCompetencias) {
        this.listaCompetencias = listaCompetencias;
    }

    // Método para agregar competencias a la lista
    public void agregarCompetencia(Competencia competencia) {
        this.listaCompetencias.add(competencia);
    }

    @Override
    public String toString() {
        return "Rol{" + "id_rol=" + id_rol + ", rol=" + rol + ", descripcion=" + descripcion + ", listaCompetencias=" + listaCompetencias + '}';
    }
}
