/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5_11921019;

import java.util.UUID;

/**
 *
 * @author daba5
 */
public class ProductoLimpieza {
    
    private String tipo;
    private String marca;
    private String codigo;
    private int precio;
    private int inventario;
    private String proveedor;
    private String nombre;

    public ProductoLimpieza(String tipo, String marca, int precio, int inventario, String proveedor, String nombre) {
        this.tipo = tipo;
        this.marca = marca;
        this.codigo = generateAlphanum();
        this.precio = precio;
        this.inventario = inventario;
        this.proveedor = proveedor;
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //METODOS

    @Override
    public String toString() {
        return "tipo=" + tipo + ", marca=" + marca + ", codigo=" + codigo + ", precio=" + precio + ", inventario=" + inventario + ", proveedor=" + proveedor + ", nombre=" + nombre; 
    }
    
    public static String generateAlphanum() {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        return uuid;
    }
}
