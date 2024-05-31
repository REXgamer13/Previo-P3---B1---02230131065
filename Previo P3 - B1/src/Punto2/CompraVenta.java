
package Punto2;

import java.util.Date;

public class CompraVenta {
    private String tipo;
    private Creacion_Y_Gestion_Activos activo;
    private int cantidad;
    private double precio;
    private Date fecha;

    public CompraVenta(String tipo, Creacion_Y_Gestion_Activos activo, int cantidad, double precio, Date fecha) {
        this.tipo = tipo;
        this.activo = activo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public Creacion_Y_Gestion_Activos getActivo() {
        return activo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public Date getFecha() {
        return fecha;
    }


}
