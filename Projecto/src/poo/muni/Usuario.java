/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni;

import sun.util.calendar.BaseCalendar.Date;

/**
 *
 * @author Capacitacion5
 */
public class Usuario {
    private String nombreUsuario;
    private char[] contraseña;
    private String nombre;
    private String apellido;
    private Date fechaSession;

    public Usuario() {
    }

    public Usuario(String nombreUsuario, char[] contraseña, String nombre, String apellido, Date fechaSession) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaSession = fechaSession;
    }

    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param nombreUsuario the nombreUsuario to set
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
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
     * @return the fechaSession
     */
    public Date getFechaSession() {
        return fechaSession;
    }

    /**
     * @param fechaSession the fechaSession to set
     */
    public void setFechaSession(Date fechaSession) {
        this.fechaSession = fechaSession;
    }
    
    
}
