/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados;

import ServicioRestaurante.Cliente;

/**
 *
 * @author Peniche
 */
public class CrearFabrica implements Factory{

    @Override
    public Cliente crearCliente(int visitasRealizadas, String nombreCompleto, String cedula, String telefono) {
        return new Cliente(visitasRealizadas,nombreCompleto,cedula,telefono);
    }

    @Override
    public Mesero crearMesero(String idiomasDomina, String direccion, String correo, String nombreCompleto, String cedula, String telefono) {
        return new Mesero(idiomasDomina,direccion,correo,nombreCompleto,cedula,telefono);
    }
    
    @Override
    public Cocinero creaCocinero(int cantPlatosCocinados, int cantidadBebidasHechas, String especialidad, String direccion, String correo, String nombreCompleto, String cedula, String telefono) {
        return new Cocinero(cantPlatosCocinados, cantidadBebidasHechas,especialidad,direccion,correo,nombreCompleto,cedula,telefono);
    }
    
}
