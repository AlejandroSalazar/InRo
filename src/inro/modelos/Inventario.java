/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inro.modelos;

/**
 *
 * @author Abiee Alejandro
 */
public class Inventario {

    private int claveRopa;
    private String nombre;
    private String descripcion;
    private int cantidad;

    public Inventario(int claveRopa, String nombre, String descripcion, int cantidad) {
        this.claveRopa = claveRopa;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public int getClaveRopa() {
        return claveRopa;
    }

    public void setClaveRopa(int claveRopa) {
        this.claveRopa = claveRopa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
        
}
