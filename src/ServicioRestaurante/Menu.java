package ServicioRestaurante;

import java.util.ArrayList;

//CLASE QUE CONTIENE TODO LO RELACIONADO A COMIDAS Y BEBIDAS
public class Menu {
    
    private ArrayList<Producto> listaProductos;

    public Menu() {
    }
    
    public Menu(int cantBebidas, int cantPlatos) {
        this.listaProductos = new ArrayList();
    }
    
    public int agregarProducto(Producto p) {
        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i).getIdProducto()==p.getIdProducto()){
                System.out.println("Este plato ya existe");   
                return 0;
            }            
        }
        this.listaProductos.add(p);
        return 0;
    }

    public void borrarProducto(int idP) {
        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i).getIdProducto()==idP){
                listaProductos.remove(i);                        
            }            
        }
    }

    public Producto buscarProducto(int idP) {
        int pos = 0;
        for (int i = 0; i < listaProductos.size(); i++) {
            pos = i;
            if (listaProductos.get(i).getIdProducto()==idP) {
                break;
            }           
        }
        return listaProductos.get(pos);
    }

    
        
}
