/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5_11921019;

/**
 *
 * @author daba5
 */
public class GranoBasico {
    
    
    private String nombre;
    private int quintales;
    private int precio;
    private String unidadM;
    private String origen;

    public GranoBasico(String nombre, int quintales, int precio, String unidadM, String origen) {
        this.nombre = nombre;
        this.quintales = quintales;
        this.precio = precio;
        this.unidadM = unidadM;
        this.origen = origen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getQuintales() {
        return quintales;
    }

    public void setQuintales(int quintales) {
        this.quintales = quintales;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getUnidadM() {
        return unidadM;
    }

    public void setUnidadM(String unidadM) {
        this.unidadM = unidadM;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
    
    //METODOS

    @Override
    public String toString() {
        return  "nombre=" + nombre + ", quintales=" + quintales + ", precio=" + precio + ", unidadM=" + unidadM + ", origen=" + origen;
    }
    
    
    
}
