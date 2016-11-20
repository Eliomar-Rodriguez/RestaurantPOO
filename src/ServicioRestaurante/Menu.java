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

    public void borrarProducto(String idP) {
        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i).getIdProducto()==idP){
                listaProductos.remove(i);                        
            }            
        }
    }

    public Producto buscarProducto(String idP) {
        //System.out.println("cantidad de productos en menu "+listaProductos.size());
        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i)==null){
                System.out.println("No encontrado compa");
            }
            else if (listaProductos.get(i).getIdProducto().equals(idP)) {
                return listaProductos.get(i);
            }           
        }        
        return null;
    }
    
    
    public Producto buscarProductoXNombre(String nombre) {
        //System.out.println("cantidad de productos en menu "+listaProductos.size());
        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i)==null){
                System.out.println("No encontrado compa");
            }
            else if (listaProductos.get(i).getNombre().equals(nombre)) {
                return listaProductos.get(i);
            }           
        }        
        return null;
    }

    
        
}
