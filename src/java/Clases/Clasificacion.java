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
public class Clasificacion {
    private int id_clasificaion;
    private String grupo;

    public Clasificacion() {
    }

    public Clasificacion(int id_clasificaion, String grupo) {
        this.id_clasificaion = id_clasificaion;
        this.grupo = grupo;
    }

    public int getId_clasificaion() {
        return id_clasificaion;
    }

    public void setId_clasificaion(int id_clasificaion) {
        this.id_clasificaion = id_clasificaion;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Clasificacion{" + "id_clasificaion=" + id_clasificaion + ", grupo=" + grupo + '}';
    }
    
    
    
    
    
}
