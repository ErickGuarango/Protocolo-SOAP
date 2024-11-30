/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author ASUS TUF
 */
public class UsuarioRol {
    private int id_usuariorol;
    private Rol id_rol;
    private Usuario id_usuario;
  

    public UsuarioRol() {
    }

    public UsuarioRol(int id_usuariorol, Rol id_rol, Usuario id_usuario) {
        this.id_usuariorol = id_usuariorol;
        this.id_rol = id_rol;
        this.id_usuario = id_usuario;
       
    }

    public int getId_usuariorol() {
        return id_usuariorol;
    }

    public void setId_usuariorol(int id_usuariorol) {
        this.id_usuariorol = id_usuariorol;
    }

    public Rol getId_rol() {
        return id_rol;
    }

    public void setId_rol(Rol id_rol) {
        this.id_rol = id_rol;
    }

    public Usuario getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Usuario id_usuario) {
        this.id_usuario = id_usuario;
    }

   

    @Override
    public String toString() {
        return "UsuarioRol{" + "id_usuariorol=" + id_usuariorol + ", id_rol=" + id_rol + ", id_usuario=" + id_usuario + ", fecha_asignacion=" + '}';
    }
    
    
    
    
}
