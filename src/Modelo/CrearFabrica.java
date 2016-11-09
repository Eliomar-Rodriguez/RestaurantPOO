/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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
    public Empleado crearEmpleado(String direccion, String correo, String nombreCompleto, String cedula, String telefono) {
        return new Empleado(direccion,correo,nombreCompleto,cedula,telefono);
    }
    
}
