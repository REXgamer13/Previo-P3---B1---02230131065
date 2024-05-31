package Punto1;

import java.util.ArrayList;
import java.util.List;

public class administrador {
    private String nombre;
    private String email;
    private List<vehiculo> vehiculos;
    private List<notificaciones> notificaciones;

    public administrador(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.vehiculos = new ArrayList<>();
        this.notificaciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public void addVehiculo(vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }

    public void addNotificacion(notificaciones notificaciones) {
        this.notificaciones.add(notificaciones);
    }

    public List<vehiculo> getVehiculos() {
        return vehiculos;
    }

    public List<notificaciones> getNotificaciones() {
        return notificaciones;
    }

    public void generarInforme() {

    }

  
}
