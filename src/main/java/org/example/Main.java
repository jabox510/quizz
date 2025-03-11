package org.example;
import java.util.Scanner;
import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        ArrayList<PRODUCTO> productos = new ArrayList<>();

        do {
            System.out.println("--- PRODUCTOS  ---");
            for (PRODUCTO producto : productos) {
                System.out.println("Codigo:" + producto.getCodigo() + "  nombre :  "+ producto.getNombre() + " - cantidad: " + producto.getCantidad());
            }

            System.out.println("\nSELECCIONE LA TRANSACCION QUE QUIERE REALIZAR:");
            System.out.println("1. INGRESAR PRODUCTO");
            System.out.println("2. VENDER PRODUCTO");
            System.out.println("3. INFO PRODUCTO");
            System.out.println("4. CREAR PRODUCTO");
            System.out.println("5. ELIMINAR PRODUCTO");
            System.out.println("6. SALIR");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            if (opcion == 1 || opcion == 5 || opcion == 3) {
                System.out.print("INGRESE EL CODIGO DEL PRODUCTO: ");
                int codproducto = scanner.nextInt();
                PRODUCTO productosele = null;

                for (PRODUCTO produc : productos) {
                    if (produc.getCodigo() == codproducto) {
                        productosele = produc;
                        break;
                    }
                }
                if (productosele == null) {
                    System.out.println("CODIGO NO VALIDO");
                    continue;


                }
                switch (opcion) {
                    case 1:
                        System.out.print("INGRESE CANTIDAD A INGRESAR : ");
                        int cantidadingreso = scanner.nextInt();
                        productosele.ingresarproducto(cantidadingreso);
                        break;
                    case 2:
                            System.out.print("INGRESE CANTIDAD A VENDER");
                            int unidadventa = scanner.nextInt();
                            productosele.venta(unidadventa);
                        System.out.println("total venta :"+ (unidadventa * productosele.getPrecio()));

                        break;
                    case 3:
                        productosele.Infoproducto();
                        break;
                }
            }else if (opcion == 4) {
                System.out.print("INGRESE NOMBRE DEL PRODUCTO: ");
                scanner.nextLine();
                String nuevoNombre = scanner.nextLine();

                System.out.print("INGRESE CODIGO PRODUCO : ");
                int nuevoCodigo = scanner.nextInt();

                System.out.print("INGRESE PRECIO : ");
                int nuevoPrecio = scanner.nextInt();

                System.out.print("INGRESE CANTIDAD INICIAL : ");
                int nuevaCantidad = scanner.nextInt();


                PRODUCTO nuevoProducto = new PRODUCTO(nuevaCantidad,nuevoNombre,nuevoCodigo,nuevoPrecio);
                productos.add(nuevoProducto);
                System.out.println("PRODUCTO CREADO EXITOSAMENTE");


            }
        }while (opcion != 6) ;
    }
}
