/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5_11921019;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author daba5
 */
public class Tarea5_11921019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Scanner sc  = new Scanner(System.in);
        String vs;
        
        ArrayList<GranoBasico> granosBasicos = new ArrayList<>();
        ArrayList<ProductoLimpieza> productosLimpieza = new ArrayList<>();
        ArrayList<Liquido> liquidos = new ArrayList<>();
        ArrayList<CarneEmbutido> carnesEmbutidos = new ArrayList<>();
        ArrayList<FrutaVerdura> frutasVerduras = new ArrayList<>();
        
        OUTER:
        while(true) {
            System.out.print("Menu: \n"
                    + "1) Agregar producto\n"
                    + "2) Modificar producto\n"
                    + "3) Eliminar producto\n"
                    + "4) Reporte\n"
                    + "5) Salida\n"
                    + "Su opcion: ");
            int opcion = sc.nextInt();
            vs = sc.nextLine();
            
            switch (opcion) {
                case 1:
                    OUTER1:
                    while (true) {
                        System.out.print("Agregar: \n"
                                + "1) Grano Basico\n"
                                + "2) Producto de limpieza\n"
                                + "3) Líquido\n"
                                + "4) Carne o embutido\n"
                                + "5) Fruta o verdura\n"
                                + "6) Parar de agregar\n"
                                + "Su elección: ");
                        opcion = sc.nextInt();
                        vs = sc.nextLine();
                        
                        switch (opcion) {
                            case 1:
                                System.out.print("Nombre: ");
                                String nombre = sc.nextLine();
                                
                                System.out.print("Cantidad de quintales: ");
                                int quintales = sc.nextInt();
                                vs = sc.nextLine();
                                
                                System.out.print("Precio: ");
                                int precio = sc.nextInt();
                                vs = sc.nextLine();
                                
                                System.out.print("Unidad de medida (libra,media,kilo): ");
                                String unidad = sc.nextLine();
                                
                                System.out.print("Lugar de procedencia: ");
                                String origen = sc.nextLine();
                                
                                granosBasicos.add(new GranoBasico(nombre,quintales,precio,unidad,origen));
                                
                                break;
                            case 2:
                                System.out.print("Tipo(liquido,polvo): ");
                                String tipo = sc.nextLine();
                                
                                System.out.print("Marca: ");
                                String marca = sc.nextLine();
                                
                                System.out.print("Precio: ");
                                precio = sc.nextInt();
                                vs = sc.nextLine();
                                
                                System.out.print("Cantidad en el inventario: ");
                                int inventario = sc.nextInt();
                                vs = sc.nextLine();
                                
                                System.out.print("Proveedor: ");
                                String proveedor = sc.nextLine();
                                
                                System.out.print("Nombre: ");
                                nombre = sc.nextLine();
                                
                                productosLimpieza.add(new ProductoLimpieza(tipo,marca,precio,inventario,proveedor,nombre));
                                
                                break;
                            case 3:
                                System.out.println("Ingrese la categoría (lacteos, gaseosas, jugos, agua): ");
                                String categoria = sc.nextLine();
                                
                                System.out.println("Ingrese la forma de empaque (botella/bote, caja, lata): ");
                                String empaque = sc.nextLine();
                                
                                System.out.println("Ingrese el tamaño (pequeño, mediano, grande): ");
                                String size = sc.nextLine();
                                
                                System.out.print("Nombre: ");
                                nombre = sc.nextLine();
                                
                                System.out.print("Precio: ");
                                precio = sc.nextInt();
                                vs = sc.nextLine();
                                
                                System.out.print("Ingrese una fecha (dd/MM/yyyy): ");
                                String fecha = sc.next();
                                
                                liquidos.add(new Liquido(categoria,empaque,size,nombre,precio,fecha));
                                break;
                            case 4:
                                System.out.print("Lugar de procedencia: ");
                                origen = sc.nextLine();
                                
                                System.out.print("Cantidad en el inventario: ");
                                inventario = sc.nextInt();
                                vs = sc.nextLine();
                                
                                System.out.print("Tipo (res, carne blanca, cerdo): ");
                                tipo = sc.nextLine();
                                
                                System.out.println("Precio: ");
                                precio = sc.nextInt();
                                vs = sc.nextLine();
                                
                                carnesEmbutidos.add(new CarneEmbutido(origen,inventario,tipo,precio));
                                break;
                            case 5:
                                System.out.println("Precio: ");
                                precio = sc.nextInt();
                                vs = sc.nextLine();
                                
                                System.out.print("Cantidad A inventariar: ");
                                inventario = sc.nextInt();
                                vs = sc.nextLine();
                                
                                System.out.print("Ingrese la categoria(fruta,verdura): \n"
                                        + "1) Fruta\n"
                                        + "2) Verduras\n"
                                        + "Su elección: ");
                                opcion = sc.nextInt();
                                vs = sc.nextLine();
                                
                                String valor;
                                
                                if (opcion == 1) {
                                    System.out.println("Escoja un valor (cítricos, tropical, de grano o rica en fibra): ");
                                    valor = sc.nextLine();
                                    
                                    categoria = "fruta";
                                }
                                
                                else {
                                    System.out.println("Escoja un valor (tubérculos, legumbres, de hojas): ");
                                    valor = sc.nextLine();
                                    
                                    categoria = "verdura";
                                }
                                
                                frutasVerduras.add(new FrutaVerdura(precio,inventario,categoria,valor));
                                break;
                            case 6:
                                
                                break OUTER1;
                        }
                    }
                    break;
                case 2:
                    OUTER2:
                    while (true) {
                        System.out.print("Modificar: \n"
                                + "1) Grano Basico\n"
                                + "2) Producto de limpieza\n"
                                + "3) Líquido\n"
                                + "4) Carne o embutido\n"
                                + "5) Fruta o verdura\n"
                                + "6) Parar de modificar\n"
                                + "Su elección: ");
                        opcion = sc.nextInt();
                        vs = sc.nextLine();

                        int posicion = -1;
                        int count = 0;

                        switch (opcion) {
                            case 1:
                                if (granosBasicos.isEmpty()) {
                                    System.out.println("Inventario vacío");
                                    break;
                                }
                                
                                for (GranoBasico gb : granosBasicos) {
                                    System.out.println("#" + count + ": " + gb.toString());
                                    count++;
                                }
                                count = 0;
                                
                                while (posicion < 0 || posicion > granosBasicos.size() - 1) {
                                    System.out.println("Elija la posición del grano que desea modificar: ");
                                    posicion = sc.nextInt();
                                    vs = sc.nextLine();
                                }
                                
                                System.out.print("Nombre: ");
                                String nombre = sc.nextLine();
                                
                                granosBasicos.get(posicion).setNombre(nombre);
                                
                                System.out.print("Cantidad de quintales: ");
                                int quintales = sc.nextInt();
                                vs = sc.nextLine();
                                
                                granosBasicos.get(posicion).setQuintales(quintales);

                                System.out.print("Precio: ");
                                int precio = sc.nextInt();
                                vs = sc.nextLine();
                                
                                granosBasicos.get(posicion).setPrecio(precio);

                                System.out.print("Unidad de medida (libra,media,kilo): ");
                                String unidad = sc.nextLine();
                                
                                granosBasicos.get(posicion).setUnidadM(unidad);

                                System.out.print("Lugar de procedencia: ");
                                String origen = sc.nextLine();
                                
                                granosBasicos.get(posicion).setOrigen(origen);
                                
                                posicion = -1;
                                break;
                            case 2:
                                 if (productosLimpieza.isEmpty()) {
                                    System.out.println("Inventario vacío");
                                    break;
                                }
                                for (ProductoLimpieza pl : productosLimpieza) {
                                    System.out.println("#" + count + ": " + pl.toString());
                                    count++;
                                }
                                count = 0;
                                
                                while (posicion < 0 || posicion > productosLimpieza.size() - 1) {
                                    System.out.println("Elija la posición del producto que desea modificar: ");
                                    posicion = sc.nextInt();
                                    vs = sc.nextLine();
                                }
                                System.out.print("Tipo(liquido,polvo): ");
                                String tipo = sc.nextLine();
                                
                                productosLimpieza.get(posicion).setTipo(tipo);

                                System.out.print("Marca: ");
                                String marca = sc.nextLine();
                                
                                productosLimpieza.get(posicion).setMarca(marca);

                                System.out.print("Precio: ");
                                precio = sc.nextInt();
                                vs = sc.nextLine();
                                
                                productosLimpieza.get(posicion).setPrecio(precio);

                                System.out.print("Cantidad en el inventario: ");
                                int inventario = sc.nextInt();
                                vs = sc.nextLine();
                                
                                productosLimpieza.get(posicion).setInventario(inventario);

                                System.out.print("Proveedor: ");
                                String proveedor = sc.nextLine();
                                
                                productosLimpieza.get(posicion).setProveedor(proveedor);

                                System.out.print("Nombre: ");
                                nombre = sc.nextLine();
                                
                                productosLimpieza.get(posicion).setNombre(nombre);

                                posicion = -1;
                                break;
                            case 3:
                                if (liquidos.isEmpty()) {
                                    System.out.println("Inventario vacío");
                                    break;
                                }
                                for (Liquido l : liquidos) {
                                    System.out.println("#" + count + ": " + l.toString());
                                    count++;
                                }
                                count = 0;
                                
                                while (posicion < 0 || posicion > liquidos.size() - 1) {
                                    System.out.println("Elija la posición del liquido que desea modificar: ");
                                    posicion = sc.nextInt();
                                    vs = sc.nextLine();
                                }
                                
                                System.out.println("Ingrese la categoría (lacteos, gaseosas, jugos, agua): ");
                                String categoria = sc.nextLine();
                                
                                liquidos.get(posicion).setCategoria(categoria);

                                System.out.println("Ingrese la forma de empaque (botella/bote, caja, lata): ");
                                String empaque = sc.nextLine();
                                
                                liquidos.get(posicion).setEmpaque(empaque);

                                System.out.println("Ingrese el tamaño (pequeño, mediano, grande): ");
                                String size = sc.nextLine();
                                
                                liquidos.get(posicion).setSize(size);

                                System.out.print("Nombre: ");
                                nombre = sc.nextLine();
                                
                                liquidos.get(posicion).setNombre(nombre);

                                System.out.print("Precio: ");
                                precio = sc.nextInt();
                                vs = sc.nextLine();
                                
                                liquidos.get(posicion).setPrecio(precio);

                                System.out.print("Ingrese una fecha (dd/MM/yyyy): ");
                                String fecha = sc.next();
                                
                                liquidos.get(posicion).setFechaV(fecha);

                                posicion = -1;
                                break;
                            case 4:
                                if (carnesEmbutidos.isEmpty()) {
                                    System.out.println("Inventario vacío");
                                    break;
                                }
                                for (CarneEmbutido ce : carnesEmbutidos) {
                                    System.out.println("#" + count + ": " + ce.toString());
                                    count++;
                                }
                                count = 0;
                                
                                while (posicion < 0 || posicion > carnesEmbutidos.size() - 1) {
                                    System.out.println("Elija la posición de la carne o el embutido que desea modificar: ");
                                    posicion = sc.nextInt();
                                    vs = sc.nextLine();
                                }
                                
                                System.out.print("Lugar de procedencia: ");
                                origen = sc.nextLine();
                                
                                carnesEmbutidos.get(posicion).setProcedencia(origen);

                                System.out.print("Cantidad en el inventario: ");
                                inventario = sc.nextInt();
                                vs = sc.nextLine();
                                
                                carnesEmbutidos.get(posicion).setInventario(inventario);

                                System.out.print("Tipo (res, carne blanca, cerdo): ");
                                tipo = sc.nextLine();
                                
                                carnesEmbutidos.get(posicion).setTipo(tipo);

                                System.out.println("Precio: ");
                                precio = sc.nextInt();
                                vs = sc.nextLine();
                                
                                carnesEmbutidos.get(posicion).setPrecio(precio);

                                posicion = -1;
                                break;
                            case 5:
                                if (frutasVerduras.isEmpty()) {
                                    System.out.println("Inventario vacío");
                                    break;
                                }
                                for (FrutaVerdura fv : frutasVerduras) {
                                    System.out.println("#" + count + ": " + fv.toString());
                                    count++;
                                }
                                count = 0;
                                
                                while (posicion < 0 || posicion > frutasVerduras.size() - 1) {
                                    System.out.println("Elija la posición de la fruta/verdura que desea modificar: ");
                                    posicion = sc.nextInt();
                                    vs = sc.nextLine();
                                }
                                System.out.println("Precio: ");
                                precio = sc.nextInt();
                                vs = sc.nextLine();
                                
                                frutasVerduras.get(posicion).setPrecio(precio);

                                System.out.print("Cantidad A inventariar: ");
                                inventario = sc.nextInt();
                                vs = sc.nextLine();

                                frutasVerduras.get(posicion).setInventario(inventario);
                                
                                System.out.println("Categoria: ");
                                categoria = sc.nextLine();
                                
                                frutasVerduras.get(posicion).setCategoria(categoria);
                                
                                System.out.println("Valor: ");
                                String valor = sc.nextLine();
                                
                                frutasVerduras.get(posicion).setValor(valor);
                                
                                posicion = -1;
                                break;
                            case 6:
                                
                                break OUTER2;
                        }
                    }
                        
                    
                    break;
                case 3:
                    OUTER3:
                    while (true) {
                        System.out.print("Eliminar: \n"
                                + "1) Grano Basico\n"
                                + "2) Producto de limpieza\n"
                                + "3) Líquido\n"
                                + "4) Carne o embutido\n"
                                + "5) Fruta o verdura\n"
                                + "6) Parar de eliminar\n"
                                + "Su elección: ");
                        opcion = sc.nextInt();
                        vs = sc.nextLine();

                        int posicion = -1;
                        int count = 0;

                        switch (opcion) {
                            case 1:
                                if (granosBasicos.isEmpty()) {
                                    System.out.println("Inventario vacío");
                                    break;
                                }
                                
                                for (GranoBasico gb : granosBasicos) {
                                    System.out.println("#" + count + ": " + gb.toString());
                                    count++;
                                }
                                
                                while (posicion < 0 || posicion > granosBasicos.size() - 1) {
                                    System.out.println("Elija la posición del grano que desea eliminar: ");
                                    posicion = sc.nextInt();
                                    vs = sc.nextLine();
                                }
                                
                                granosBasicos.remove(posicion);
                                break;
                            case 2:
                                if (productosLimpieza.isEmpty()) {
                                    System.out.println("Inventario vacío");
                                    break;
                                }
                                for (ProductoLimpieza pl : productosLimpieza) {
                                    System.out.println("#" + count + ": " + pl.toString());
                                    count++;
                                }
                                
                                while (posicion < 0 || posicion > productosLimpieza.size() - 1) {
                                    System.out.println("Elija la posición del producto que desea eliminar: ");
                                    posicion = sc.nextInt();
                                    vs = sc.nextLine();
                                }
                                productosLimpieza.remove(posicion);
                                break;
                            case 3:
                                if (liquidos.isEmpty()) {
                                    System.out.println("Inventario vacío");
                                    break;
                                }
                                for (Liquido l : liquidos) {
                                    System.out.println("#" + count + ": " + l.toString());
                                    count++;
                                }
                                
                                
                                while (posicion < 0 || posicion > liquidos.size() - 1) {
                                    System.out.println("Elija la posición del liquido que desea eliminar: ");
                                    posicion = sc.nextInt();
                                    vs = sc.nextLine();
                                }
                                liquidos.remove(posicion);
                                break;
                            case 4:
                                if (carnesEmbutidos.isEmpty()) {
                                    System.out.println("Inventario vacío");
                                    break;
                                }
                                for (CarneEmbutido ce : carnesEmbutidos) {
                                    System.out.println("#" + count + ": " + ce.toString());
                                    count++;
                                }

                                while (posicion < 0 || posicion > carnesEmbutidos.size() - 1) {
                                    System.out.println("Elija la posición de la carne o el embutido que desea eliminar: ");
                                    posicion = sc.nextInt();
                                    vs = sc.nextLine();
                                }
                                carnesEmbutidos.remove(posicion);
                                break;
                            case 5:
                                if (frutasVerduras.isEmpty()) {
                                    System.out.println("Inventario vacío");
                                    break;
                                }
                                for (FrutaVerdura fv : frutasVerduras) {
                                    System.out.println("#" + count + ": " + fv.toString());
                                    count++;
                                }
                                
                                while (posicion < 0 || posicion > frutasVerduras.size() - 1) {
                                    System.out.println("Elija la posición de la fruta/verdura que desea eliminar: ");
                                    posicion = sc.nextInt();
                                    vs = sc.nextLine();
                                }
                                frutasVerduras.remove(posicion);
                                break;
                            case 6:
                                break OUTER3;
                        }
                    }
                    
                    break;
                case 4:
                    int count = 0;
                    System.out.println("Inventario total: \n"
                            + "Granos básicos: ");
                    for (GranoBasico gb : granosBasicos) {
                        System.out.println("#" + count + ": " + gb.toString());
                        count++;
                    }
                    count = 0;

                    System.out.println("Productos de Limpieza: ");
                    for (ProductoLimpieza pl : productosLimpieza) {
                        System.out.println("#" + count + ": " + pl.toString());
                        count++;
                    }
                    count = 0;
                    
                    System.out.println("Liquidos: ");
                    for (Liquido l : liquidos) {
                        System.out.println("#" + count + ": " + l.toString());
                        count++;
                    }
                    count = 0;
                    
                    System.out.println("Carnes y embutidos: ");
                    for (CarneEmbutido ce : carnesEmbutidos) {
                        System.out.println("#" + count + ": " + ce.toString());
                        count++;
                    }
                    count = 0;
                    
                    System.out.println("Frutas y verduras: ");
                    for (FrutaVerdura fv : frutasVerduras) {
                        System.out.println("#" + count + ": " + fv.toString());
                        count++;
                    }
                    count = 0;
                    break;
                case 5:
                    
                    break OUTER;    
            }
        }
    }
    
}
