package Punto3;

import java.util.Date;
import java.util.Scanner;

public class CentroMedico {

    private static Administrador administrador;
    private static gestion gestion;

    public static void main(String[] args) {
        administrador = new Administrador("Administrador", "admin@centromedico.com");
        gestion = new gestion();

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== Sistema de Gestión de Centros Médicos ===");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Programar cita");
            System.out.println("3. Registrar diagnóstico y prescripción");
            System.out.println("4. Gestionar disponibilidad de médicos y salas");
            System.out.println("5. Generar notificaciones");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    registrarPaciente(scanner);
                    break;
                case 2:
                    programarCita(scanner);
                    break;
                case 3:
                    registrarDiagnosticoYPrescripcion(scanner);
                    break;
                case 4:
                    gestionarDisponibilidad();
                    break;
                case 5:
                    generarNotificaciones();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 6);

        scanner.close();
    }

    private static void registrarPaciente(Scanner scanner) {
        System.out.print("Ingrese el nombre del paciente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la dirección del paciente: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese el teléfono del paciente: ");
        String telefono = scanner.nextLine();
        System.out.print("Ingrese la fecha de nacimiento (YYYY-MM-DD): ");
        String fechaNacimientoStr = scanner.nextLine();
        Date fechaNacimiento = java.sql.Date.valueOf(fechaNacimientoStr);

        Paciente paciente = new Paciente(nombre, direccion, telefono, fechaNacimiento);
        gestion.addPaciente(paciente);
        System.out.println("Paciente registrado exitosamente.");
    }

    private static void programarCita(Scanner scanner) {
        System.out.print("Ingrese el nombre del paciente: ");
        String nombrePaciente = scanner.nextLine();
        Paciente paciente = buscarPacientePorNombre(nombrePaciente);

        if (paciente == null) {
            System.out.println("Paciente no encontrado.");
            return;
        }

        System.out.print("Ingrese el nombre del médico: ");
        String nombreMedico = scanner.nextLine();
        System.out.print("Ingrese la fecha y hora de la cita (YYYY-MM-DD HH:MM): ");
        String fechaHoraStr = scanner.nextLine();
        Date fechaHora = java.sql.Timestamp.valueOf(fechaHoraStr.replace(" ", "T") + ":00");

        System.out.print("Ingrese la sala de consulta: ");
        String sala = scanner.nextLine();

        citas cita = new citas(paciente.getNombre(), nombreMedico, fechaHora, sala);
        gestion.addCita(cita);
        paciente.addCitaProgramada(cita);
        System.out.println("Cita programada exitosamente.");
    }

    private static void registrarDiagnosticoYPrescripcion(Scanner scanner) {
        System.out.print("Ingrese el nombre del paciente: ");
        String nombrePaciente = scanner.nextLine();
        Paciente paciente = buscarPacientePorNombre(nombrePaciente);

        if (paciente == null) {
            System.out.println("Paciente no encontrado.");
            return;
        }

        System.out.print("Ingrese el diagnóstico: ");
        String diagnostico = scanner.nextLine();
        paciente.addHistorialMedico("Diagnóstico: " + diagnostico);

        System.out.print("Ingrese la prescripción: ");
        String prescripcion = scanner.nextLine();
        paciente.addHistorialMedico("Prescripción: " + prescripcion);

        System.out.println("Diagnóstico y prescripción registrados exitosamente.");
    }

    private static Paciente buscarPacientePorNombre(String nombre) {
        for (Punto3.gestion.Paciente paciente : gestion.getPacientes()) {
            if (paciente.getNombre().equalsIgnoreCase(nombre)) {
                return paciente;
            }
        }
        return null;
    }

    private static void gestionarDisponibilidad() {
        administrador.gestionarDisponibilidadMedicos();
        administrador.gestionarSalasDeConsulta();
        System.out.println("Disponibilidad de médicos y salas gestionada.");
    }

    private static void generarNotificaciones() {
        for (citas cita : gestion.getCitas()) {
            // Lógica para generar notificaciones para citas próximas
            Date fechaActual = new Date();
            long diferencia = cita.getFecha().getTime() - fechaActual.getTime();
            long diasRestantes = diferencia / (1000 * 60 * 60 * 24);

            if (diasRestantes <= 1) {
                Notificacion notificacion = new Notificacion(
                    "Recordatorio: Tiene una cita programada con el Dr. " + cita.getMedico() + " el " + cita.getFecha(),
                    new Date()
                );
                administrador.addNotificacion(notificacion);
            }
        }

        System.out.println("Notificaciones generadas.");
    }
}
