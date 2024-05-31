
package Punto3;

import java.util.ArrayList;
import java.util.List;

public class gestion {
    private List<Paciente> pacientes;
    private List<Citas> citas;

    void addPaciente(Punto3.Paciente paciente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void addCita(citas cita) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    private static class Paciente {

        public Paciente() {
        }
    }

    private static class Citas {

        public Citas() {
        }
    }

    public gestion() {
        this.pacientes = new ArrayList<>();
        this.citas = new ArrayList<>();
    }

    public void addPaciente(Paciente paciente) {
        this.pacientes.add(paciente);
    }

    public void addCita(Citas cita) {
        this.citas.add(cita);
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public List<Citas> getCitas() {
        return citas;
    }



}

