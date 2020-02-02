/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5_11921019;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author daba5
 */
public class Liquido {
    
    private String categoria;
    private String empaque;
    private String size;
    private String nombre;
    private int precio;
    private Date fechaV;

    public Liquido(String categoria, String empaque, String size, String nombre, int precio, String fechaV) throws ParseException {
        this.categoria = categoria;
        this.empaque = empaque;
        this.size = size;
        this.nombre = nombre;
        this.precio = precio;
        setFechaV(fechaV);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEmpaque() {
        return empaque;
    }

    public void setEmpaque(String empaque) {
        this.empaque = empaque;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Date getFechaV() {
        return fechaV;
    }

    public void setFechaV(String fechaV) throws ParseException {
        SimpleDateFormat tiempo = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = tiempo.parse(fechaV);
        this.fechaV = fecha;
    }
    
    //METODOS

    @Override
    public String toString() {
        return "categoria=" + categoria + ", empaque=" + empaque + ", size=" + size + ", nombre=" + nombre + ", precio=" + precio + ", fechaV=" + fechaV;
    }
    
    
}
