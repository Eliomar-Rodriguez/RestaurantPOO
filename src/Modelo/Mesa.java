package Modelo;

public class Mesa {

    private int numMesa;

    private int cantPersonas;

    private boolean estado;

    public Mesa() {
    }

    public Mesa(int numMesa, int cantPersonas, boolean estado) {
        this.numMesa = numMesa;
        this.cantPersonas = cantPersonas;
        this.estado = estado;
    }

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public void limpiarMesa() {
    }

    @Override
    public String toString() {
        return "Mesa{" + "numMesa=" + numMesa + ", cantPersonas=" + cantPersonas + ", estado=" + estado + '}';
    }
    
    
}
