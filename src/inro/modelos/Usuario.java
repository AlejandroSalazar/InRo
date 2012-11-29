/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inro.modelos;

/**
 *
 * @author Abiee Alejandro
 */
public class Usuario {
    
    private int id_usuario;
    private PersonalHospital personal;
    private String nombreUsuario;
    private String contasena;

    public Usuario(PersonalHospital personal, String nombreUsuario, String contasena) {
        this.personal = personal;
        this.nombreUsuario = nombreUsuario;
        this.contasena = contasena;
    }

    public Usuario(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contasena = contasena;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public PersonalHospital getPersonal() {
        return personal;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContasena() {
        return contasena;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setPersonal(PersonalHospital personal) {
        this.personal = personal;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContasena(String contasena) {
        this.contasena = contasena;
    }
    
}
