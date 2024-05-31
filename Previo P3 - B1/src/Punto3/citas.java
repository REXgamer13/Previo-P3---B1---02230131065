
package Punto3;

import java.util.Date;

public class citas {
    private String paciente;
    private String medico;
    private Date fecha;
    private String sala;

    public citas(String paciente, String medico, Date fecha, String sala) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.sala = sala;
    }

    public String getPaciente() {
        return paciente;
    }

    public String getMedico() {
        return medico;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getSala() {
        return sala;
    }


}
