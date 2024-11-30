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
public class competencia_Rol {
    private int permiso_rol;
    private  Rol rol;
    private Competencia competencia;

    public competencia_Rol() {
    }

    public competencia_Rol(int permiso_rol, Rol rol, Competencia competencia) {
        this.permiso_rol = permiso_rol;
        this.rol = rol;
        this.competencia = competencia;
    }

    public int getPermiso_rol() {
        return permiso_rol;
    }

    public void setPermiso_rol(int permiso_rol) {
        this.permiso_rol = permiso_rol;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Competencia getCompetencia() {
        return competencia;
    }

    public void setCompetencia(Competencia competencia) {
        this.competencia = competencia;
    }

    @Override
    public String toString() {
        return "competencia_Rol{" + "permiso_rol=" + permiso_rol + ", rol=" + rol + ", competencia=" + competencia + '}';
    }
    
    
    
    
}
