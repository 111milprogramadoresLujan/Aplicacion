/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni;

/**
 *
 * @author Capacitacion5
 */
public class AltaUsuario {
    private String nombre;
    private String apellido;
    private String usuario;
    private char[] contraseña;
    private char[] confirmarContraseña;
    private String email;

    public AltaUsuario() {
    }

    public AltaUsuario(String nombre, String apellido, String usuario, char[] contraseña, char[] confirmarContraseña, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.confirmarContraseña = confirmarContraseña;
        this.email = email;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contraseña
     */
    public char[] getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(char[] contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * @return the confirmarContraseña
     */
    public char[] getConfirmarContraseña() {
        return confirmarContraseña;
    }

    /**
     * @param confirmarContraseña the confirmarContraseña to set
     */
    public void setConfirmarContraseña(char[] confirmarContraseña) {
        this.confirmarContraseña = confirmarContraseña;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
