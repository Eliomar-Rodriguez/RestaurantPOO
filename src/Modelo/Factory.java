package Modelo;

public class Factory {

    public Mesero crearMesero() {
        return new Mesero();
    }

    public Cocinero crearCocinero(String especialidad) {
        return new Cocinero(0, 0, especialidad);
    }

    public Cliente crearCliente() {
        return new Cliente(0,"","","");
    }
}
