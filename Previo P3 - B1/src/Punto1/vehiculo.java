package Punto1;

import java.util.ArrayList;
import java.util.List;



public class vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private int kilometraje;
    private List<Mantenimiento> mantenimientos;

    public vehiculo(String marca, String modelo, int año, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.kilometraje = kilometraje;
        this.mantenimientos = new ArrayList<>();
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void addMantenimiento(Mantenimiento mantenimiento) {
        this.mantenimientos.add(mantenimiento);
    }

    public List<Mantenimiento> getMantenimientos() {
        return mantenimientos;
    }


}
