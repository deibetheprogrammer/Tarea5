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
public class FrutaVerdura {
    private int precio;
    private int inventario;
    private String categoria;
    private String valor;

    public FrutaVerdura(int precio, int inventario, String categoria, String valor) {
        this.precio = precio;
        this.inventario = inventario;
        this.categoria = categoria;
        this.valor = valor;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    //METODOS

    @Override
    public String toString() {
        return "precio=" + precio + ", inventario=" + inventario + ", categoria=" + categoria + ", valor=" + valor;
    }
    
    
}
