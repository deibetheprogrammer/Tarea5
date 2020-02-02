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
public class CarneEmbutido {
    
    private String procedencia;
    private int inventario;
    private String tipo;
    private int precio;

    public CarneEmbutido(String procedencia, int inventario, String tipo, int precio) {
        this.procedencia = procedencia;
        this.inventario = inventario;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    //METODOS

    @Override
    public String toString() {
        return "procedencia=" + procedencia + ", inventario=" + inventario + ", tipo=" + tipo + ", precio=" + precio ;
    }
    
}
