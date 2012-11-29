/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inro.modelos;

/**
 *
 * @author Alejandro
 */
public class Ropa {

    private int claveRopa;
    private String nombre;
    private int stockMin;
    private double precio;
    private int cantidad;
    private String descripcion;
   
    public Ropa(String nombre, int stockMin, double precio, int cantidad, String descripcion) {
        this.nombre = nombre;
        this.stockMin = stockMin;
        this.precio = precio;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public int getClaveRopa() {
        return claveRopa;
    }

    public void setClaveRopa(int claveRopa) {
        this.claveRopa = claveRopa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStockMin() {
        return stockMin;
    }

    public void setStockMin(int stockMin) {
        this.stockMin = stockMin;
    }
    
}
