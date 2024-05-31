package Punto3;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class registro {
    private String nombre;
    private String direccion;
    private String telefono;
    private Date fechaNacimiento;
    private List<String> historialMedico;
    private List<citas> citasProgramadas;

    public registro(String nombre, String direccion, String telefono, Date fechaNacimiento) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.historialMedico = new ArrayList<>();
        this.citasProgramadas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public List<String> getHistorialMedico() {
        return historialMedico;
    }

    public void addHistorialMedico(String registro) {
        this.historialMedico.add(registro);
    }

    public List<citas> getCitasProgramadas() {
        return citasProgramadas;
    }

    public void addCitaProgramada(citas cita) {
        this.citasProgramadas.add(cita);
    }


}

