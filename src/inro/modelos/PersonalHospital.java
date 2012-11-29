/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inro.modelos;

/**
 *
 * @author Alejandro
 */
public class PersonalHospital {
    
    private int clavePersonal;
    private int claveDepartamento;
    private String nombre;
    private String apellido;
    private String domicilio;
    private String telefono;
    private int turno;
    private int status;
    
    public PersonalHospital(int clavePersonal, int claveDepartamento, String nombre, String apellido, String domicilio, String telefono, int turno, int status) {
        this.clavePersonal = clavePersonal;
        this.claveDepartamento = claveDepartamento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.turno = turno;
        this.status = status;
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getClaveDepartamento() {
        return claveDepartamento;
    }

    public void setClaveDepartamento(int claveDepartamento) {
        this.claveDepartamento = claveDepartamento;
    }

    public int getClavePersonal() {
        return clavePersonal;
    }

    public void setClavePersonal(int clavePersonal) {
        this.clavePersonal = clavePersonal;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

}
