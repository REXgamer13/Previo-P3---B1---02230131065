
package Punto2;

import java.util.ArrayList;
import java.util.List;

public class Creacion_Y_Gestion_Activos {
    private String nombre;
    private String tipo; 
    private double precioActual;
    private List<Double> historicoPrecios;
    private double volatilidad;

    public Creacion_Y_Gestion_Activos(String nombre, String tipo, double precioActual, double volatilidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precioActual = precioActual;
        this.volatilidad = volatilidad;
        this.historicoPrecios = new ArrayList<>();
        this.historicoPrecios.add(precioActual);
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(double precioActual) {
        this.precioActual = precioActual;
        this.historicoPrecios.add(precioActual);
    }

    public List<Double> getHistoricoPrecios() {
        return historicoPrecios;
    }

    public double getVolatilidad() {
        return volatilidad;
    }

    public void setVolatilidad(double volatilidad) {
        this.volatilidad = volatilidad;
    }

}
