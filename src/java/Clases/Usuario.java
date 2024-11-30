package Clases;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private int id_usuario;
    private Persona id_persona;
    private String user;
    private String password;
    private List<Rol> roles; // Lista para almacenar roles asociados al usuario

    public Usuario() {
        this.roles = new ArrayList<>(); // Inicializar la lista de roles
    }

    public Usuario(int id_usuario, Persona id_persona, String user, String password) {
        this.id_usuario = id_usuario;
        this.id_persona = id_persona;
        this.user = user;
        this.password = password;
        this.roles = new ArrayList<>(); // Inicializar la lista de roles
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Persona getId_persona() {
        return id_persona;
    }

    public void setId_persona(Persona id_persona) {
        this.id_persona = id_persona;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Rol> getRoles() {
        return roles;
    }

    // Método para agregar un rol al usuario
    public void agregarRol(Rol rol) {
        this.roles.add(rol);
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + id_usuario + ", id_persona=" + id_persona + ", user=" + user + ", password=" + password + ", roles=" + roles + '}';
    }

    public boolean siExiste(String user, String password) {
        return this.user.equals(user) && this.password.equals(password);
    }

//    
//    public boolean siExiste(String user, String password){
//        return this.user.equals(user) && this.password.equals(password);
//    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }
}
