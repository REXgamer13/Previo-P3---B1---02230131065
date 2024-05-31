
package Punto2;


import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Seguimiento {
    private List<Creacion_Y_Gestion_Activos> activos;

    public Seguimiento() {
        this.activos = new ArrayList<>();
    }

    public void addActivo(Creacion_Y_Gestion_Activos activo) {
        this.activos.add(activo);
    }

    public void actualizarPrecios() {
        
    }

    public double calcularGananciaPerdida(Creacion_Y_Gestion_Activos activo, double precioCompra, int cantidad) {
        double precioActual = activo.getPrecioActual();
        return (precioActual - precioCompra) * cantidad;
    }

    public void generarNotificaciones() {
        
    }

    Iterable<Creacion_Y_Gestion_Activos> getActivos() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

  
}
