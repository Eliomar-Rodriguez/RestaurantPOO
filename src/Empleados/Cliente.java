package Empleados;

import Empleados.Persona;
import ServicioRestaurante.Factura;
import java.util.ArrayList;

public class Cliente extends Persona {

    private int visitasRealizadas; // cantidad de visitas para luego buscar el cliente con mayor visitas
    
    public Cliente(int visitasRealizadas, String nombreCompleto, String cedula, String telefono) {
        super(nombreCompleto, cedula, telefono);
        this.visitasRealizadas = visitasRealizadas;
    }

    public Cliente() {
    }
      

    public int getVisitasRealizadas() {
        return visitasRealizadas;
    }

    public void setVisitasRealizadas(int vR) {
        this.visitasRealizadas=vR;
    } 

    @Override
    public String toString() {
        return "Cliente{" + "visitasRealizadas=" + visitasRealizadas + '}';
    }

    @Override
    public String mostrar() {
        return "Cliente{" + "Visitas=" + visitasRealizadas + ",Nombre=" + nombreCompleto + ",Cedula=" + cedula + ",Telefono=" + telefono + '}';
    }
    
}
