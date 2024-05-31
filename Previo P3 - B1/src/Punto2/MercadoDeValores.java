
package Punto2;

import java.util.Date;
import java.util.Scanner;

public class MercadoDeValores {

    private static Admin administrador;
    private static Seguimiento seguimiento;

    public static void main(String[] args) {
        administrador = new Admin("Administrador", "admin@mercado.com");
        seguimiento = new Seguimiento();

        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== Simulación de Mercado de Valores ===");
            System.out.println("1. Crear activo financiero");
            System.out.println("2. Comprar activo financiero");
            System.out.println("3. Vender activo financiero");
            System.out.println("4. Actualizar precios del mercado");
            System.out.println("5. Generar informe de rendimiento del mercado");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    crearActivoFinanciero(teclado);
                    break;
                case 2:
                    realizarCompraVenta(teclado, "compra");
                    break;
                case 3:
                    realizarCompraVenta(teclado, "venta");
                    break;
                case 4:
                    actualizarPreciosDelMercado();
                    break;
                case 5:
                    generarInformeDeRendimiento();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 6);

        teclado.close();
    }

    private static void crearActivoFinanciero(Scanner scanner) {
        System.out.print("Ingrese el nombre del activo: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el tipo de activo (acción, bono, fondo mutuo, etc.): ");
        String tipo = scanner.nextLine();
        System.out.print("Ingrese el precio actual: ");
        double precioActual = scanner.nextDouble();
        System.out.print("Ingrese la volatilidad: ");
        double volatilidad = scanner.nextDouble();

        Creacion_Y_Gestion_Activos activo = new Creacion_Y_Gestion_Activos(nombre, tipo, precioActual, volatilidad);
        seguimiento.addActivo(activo);
        System.out.println("Activo financiero creado exitosamente.");
    }

    private static void realizarCompraVenta(Scanner scanner, String tipo) {
        System.out.print("Ingrese el nombre del activo: ");
        String nombreActivo = scanner.nextLine();
        Creacion_Y_Gestion_Activos activo = buscarActivoPorNombre(nombreActivo);

        if (activo == null) {
            System.out.println("Activo no encontrado.");
            return;
        }

        System.out.print("Ingrese la cantidad: ");
        int cantidad = scanner.nextInt();
        System.out.print("Ingrese el precio de " + tipo + ": ");
        double precio = scanner.nextDouble();
        Date fecha = new Date();

        CompraVenta transaccion = new CompraVenta(tipo, activo, cantidad, precio, fecha);
        System.out.println("Transacción de " + tipo + " realizada exitosamente.");

        
    }

    private static Creacion_Y_Gestion_Activos buscarActivoPorNombre(String nombre) {
        for (Creacion_Y_Gestion_Activos activo : seguimiento.getActivos()) {
            if (activo.getNombre().equalsIgnoreCase(nombre)) {
                return activo;
            }
        }
        return null;
    }

    private static void actualizarPreciosDelMercado() {
        seguimiento.actualizarPrecios();
        System.out.println("Precios del mercado actualizados.");
    }

    private static void generarInformeDeRendimiento() {
        administrador.generarInforme();
        System.out.println("Informe de rendimiento del mercado generado.");
    }
}
