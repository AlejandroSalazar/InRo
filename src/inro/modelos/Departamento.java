/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inro.modelos;

/**
 *
 * @author Abiee Alejandro
 */
public class Departamento {

    private int claveDepartamento;
    private String nombre;

    public Departamento(int claveDepartamento, String nombre) {
        this.claveDepartamento = claveDepartamento;
        this.nombre = nombre;
    }
    
    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    public int getClaveDepartamento() {
        return claveDepartamento;
    }

    public void setClaveDepartamento(int claveDepartamento) {
        this.claveDepartamento = claveDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
