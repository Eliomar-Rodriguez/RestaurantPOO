package Empleados;

import Empleados.Persona;
import ServicioRestaurante.Factura;
import java.util.ArrayList;

public class Cliente extends Persona {

    private int visitasRealizadas;

    public Cliente() {
    }

    public Cliente(String nombreCompleto, String cedula, String telefono, int visitasRealizadas) {
        super(nombreCompleto, cedula, telefono);
        this.visitasRealizadas = visitasRealizadas;
    }

    public int getVisitasRealizadas() {
        return visitasRealizadas;
    }

    public void setVisitasRealizadas(int visitasRealizadas) {
        this.visitasRealizadas = visitasRealizadas;
    }

    @Override
    public String toString() {
        return "Cliente{" + "visitasRealizadas=" + visitasRealizadas + '}';
    }

    @Override
    public String mostrar() {
        return "hola";
    }    
}
