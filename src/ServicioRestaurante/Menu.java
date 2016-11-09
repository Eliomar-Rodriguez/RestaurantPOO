package ServicioRestaurante;

import java.util.ArrayList;

public class Menu {

    private int cantBebidas;

    private int cantPlatos;
    
    private ArrayList<Plato> listaPlatos;
    private ArrayList<Bebida> listaBebidas;

    public Menu() {
    }

    public Menu(int cantBebidas, int cantPlatos) {
        this.cantBebidas = cantBebidas;
        this.cantPlatos = cantPlatos;
        this.listaBebidas = new ArrayList();
        this.listaPlatos = new ArrayList();
    }

    public int agregarBebida(Bebida b) {
        for (int i = 0; i < listaBebidas.size(); i++) {
            if (listaBebidas.get(i).getIdBebida()==b.getIdBebida()){
                System.out.println("Este plato ya existe");   
                return 0;
            }            
        }
        this.listaBebidas.add(b);
        return 0;
    }

    public int agregarPlato(Plato plato) {
        for (int i = 0; i < listaPlatos.size(); i++) {
            if (listaPlatos.get(i).getIdPlato()==plato.getIdPlato()){
                System.out.println("Este plato ya existe");   
                return 0;
            }            
        }
        this.listaPlatos.add(plato);
        return 0;
    }

    public void borrarBebida(Bebida b) {
        for (int i = 0; i < listaBebidas.size(); i++) {
            if (listaBebidas.get(i).getIdBebida()==b.getIdBebida()){
                listaBebidas.remove(i);                        
            }            
        }
    }

    public void borrarPlato(Plato p) {
        for (int i = 0; i < listaPlatos.size(); i++) {
            if (listaPlatos.get(i).getIdPlato()==p.getIdPlato()){
                listaPlatos.remove(i);                        
            }            
        }
    }

    public Bebida buscarBebida(int id) {
        int pos = 0;
        for (int i = 0; i < listaBebidas.size(); i++) {
            pos = i;
            if (listaBebidas.get(i).getIdBebida()==id) {
                break;
            }           
        }
        return listaBebidas.get(pos);
    }

    public Plato buscarPlato(int id) {
        int pos =0;
        for (int i = 0; i < listaPlatos.size(); i++) {
            pos = i;
            if(listaPlatos.get(id).getIdPlato()==id){
                break;
            }
        }
        return listaPlatos.get(pos);
    }

    public int getCantBebidas() {
        return cantBebidas;
    }

    public void setCantBebidas(int cantBebidas) {
        this.cantBebidas = cantBebidas;
    }

    public int getCantPlatos() {
        return cantPlatos;
    }

    public void setCantPlatos(int cantPlatos) {
        this.cantPlatos = cantPlatos;
    }

    @Override
    public String toString() {
        return "Menu{" + "cantBebidas=" + cantBebidas + ", cantPlatos=" + cantPlatos + '}';
    }
    
}
