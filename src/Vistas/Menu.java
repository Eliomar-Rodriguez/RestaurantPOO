/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Empleados.Mesero;
import ServicioRestaurante.Bebida;
import ServicioRestaurante.Detalle;
import ServicioRestaurante.Mesa;
import ServicioRestaurante.Orden;
import ServicioRestaurante.Plato;
import ServicioRestaurante.Producto;
import ServicioRestaurante.Restaurant;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Antonio Rodriguez
 */
public class Menu extends javax.swing.JFrame {
    
    Producto producto = null;
    Orden orden = null;
    int indexTable=0;
    Mesa mesaCliente = null;
    Mesero meseroAtendio = null;
    Color color = null;
    ArrayList<Producto> productosOrden = new ArrayList();
    int total = 0,contador=0;
    ArrayList<String> noUsar;
    
    public Menu(Mesa mesa,Mesero mesero,Color color) {
        initComponents();
        this.mesaCliente = mesa;
        this.meseroAtendio = mesero;
        this.color = color;
        lblNomPlato.setVisible(false);
        setSize(1198, 723);
        setLocationRelativeTo(null);
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAtras = new javax.swing.JButton();
        lblNomPlato = new javax.swing.JLabel();
        txtNomPlato = new java.awt.TextField();
        panelProducto = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblTipIngr = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblCalTam = new javax.swing.JLabel();
        lblIdProducto = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblTipoIngredientes = new javax.swing.JLabel();
        lblCaloriasTamano = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblTipIngr1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(6, 0), new java.awt.Dimension(6, 0), new java.awt.Dimension(6, 32767));
        jScrollPane3 = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextArea();
        txtIdPlato = new java.awt.TextField();
        btnBuscar = new javax.swing.JButton();
        lblNoEncontrado = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panelOrden = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        lblNomPlato1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnOrdenar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1198, 710));
        getContentPane().setLayout(null);

        btnAtras.setFont(new java.awt.Font("Monotype Corsiva", 0, 28)); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras);
        btnAtras.setBounds(40, 20, 100, 40);

        lblNomPlato.setFont(new java.awt.Font("Monotype Corsiva", 0, 22)); // NOI18N
        lblNomPlato.setForeground(new java.awt.Color(204, 0, 0));
        lblNomPlato.setText("*Debe buscar con UN metodo de búsqueda");
        getContentPane().add(lblNomPlato);
        lblNomPlato.setBounds(50, 180, 400, 25);

        txtNomPlato.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        getContentPane().add(txtNomPlato);
        txtNomPlato.setBounds(240, 120, 190, 35);

        panelProducto.setBackground(new java.awt.Color(255, 233, 183));
        panelProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelProducto.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel2.setText("Id Producto");
        panelProducto.add(jLabel2);
        jLabel2.setBounds(10, 70, 160, 28);

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel3.setText("Nombre");
        panelProducto.add(jLabel3);
        jLabel3.setBounds(10, 100, 130, 28);

        lblTipIngr.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        lblTipIngr.setText("Tipo");
        panelProducto.add(lblTipIngr);
        lblTipIngr.setBounds(10, 190, 170, 28);

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel6.setText("Precio");
        panelProducto.add(jLabel6);
        jLabel6.setBounds(10, 130, 90, 28);

        lblCalTam.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        lblCalTam.setText("kcals");
        panelProducto.add(lblCalTam);
        lblCalTam.setBounds(10, 160, 120, 28);

        lblIdProducto.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        lblIdProducto.setText(". . .");
        lblIdProducto.setToolTipText("");
        panelProducto.add(lblIdProducto);
        lblIdProducto.setBounds(150, 70, 330, 28);

        lblNombre.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        lblNombre.setText(". . .");
        lblNombre.setToolTipText("");
        panelProducto.add(lblNombre);
        lblNombre.setBounds(150, 100, 330, 28);

        lblTipoIngredientes.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        lblTipoIngredientes.setText(". . .");
        lblTipoIngredientes.setToolTipText("");
        panelProducto.add(lblTipoIngredientes);
        lblTipoIngredientes.setBounds(150, 190, 330, 28);

        lblCaloriasTamano.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        lblCaloriasTamano.setText(". . .");
        lblCaloriasTamano.setToolTipText("");
        panelProducto.add(lblCaloriasTamano);
        lblCaloriasTamano.setBounds(150, 160, 330, 28);

        lblPrecio.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        lblPrecio.setText(". . .");
        lblPrecio.setToolTipText("");
        panelProducto.add(lblPrecio);
        lblPrecio.setBounds(150, 130, 330, 28);

        jLabel13.setFont(new java.awt.Font("Monotype Corsiva", 1, 30)); // NOI18N
        jLabel13.setText("Información acerca del producto");
        panelProducto.add(jLabel13);
        jLabel13.setBounds(40, 20, 410, 30);

        lblTipIngr1.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        lblTipIngr1.setText("Observaciones (comentarios)");
        panelProducto.add(lblTipIngr1);
        lblTipIngr1.setBounds(10, 220, 280, 28);
        panelProducto.add(filler1);
        filler1.setBounds(190, 170, 200, 70);

        txtComentario.setColumns(20);
        txtComentario.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        txtComentario.setLineWrap(true);
        txtComentario.setRows(5);
        txtComentario.setText(" ");
        txtComentario.setToolTipText("Espacio que especifíca datos que debe de tener el cocinero a la hora de la preparación de un platillo");
        jScrollPane3.setViewportView(txtComentario);

        panelProducto.add(jScrollPane3);
        jScrollPane3.setBounds(10, 250, 470, 130);

        getContentPane().add(panelProducto);
        panelProducto.setBounds(50, 260, 490, 390);

        txtIdPlato.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        getContentPane().add(txtIdPlato);
        txtIdPlato.setBounds(70, 120, 100, 35);

        btnBuscar.setFont(new java.awt.Font("Monotype Corsiva", 0, 28)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("Busqueda por id de plato o por nombre SOLAMENTE UNO");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(460, 120, 110, 40);

        lblNoEncontrado.setFont(new java.awt.Font("Monotype Corsiva", 0, 22)); // NOI18N
        lblNoEncontrado.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lblNoEncontrado);
        lblNoEncontrado.setBounds(50, 210, 430, 50);

        jLabel10.setFont(new java.awt.Font("Monotype Corsiva", 1, 26)); // NOI18N
        jLabel10.setText("Id de producto  o  Nombre de producto");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 80, 390, 30);

        panelOrden.setBackground(new java.awt.Color(255, 233, 183));
        panelOrden.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelOrden.setName(""); // NOI18N
        panelOrden.setLayout(null);

        tablaProductos.setFont(new java.awt.Font("Monotype Corsiva", 0, 27)); // NOI18N
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Precio total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProductos.setRowHeight(26);
        jScrollPane1.setViewportView(tablaProductos);

        panelOrden.add(jScrollPane1);
        jScrollPane1.setBounds(10, 40, 580, 340);

        lblNomPlato1.setFont(new java.awt.Font("Monotype Corsiva", 0, 22)); // NOI18N
        lblNomPlato1.setForeground(new java.awt.Color(204, 0, 0));
        lblNomPlato1.setText("*Debe buscar SOLO con un metodo de búsqueda");
        panelOrden.add(lblNomPlato1);
        lblNomPlato1.setBounds(50, 180, 400, 25);

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 0, 26)); // NOI18N
        jLabel4.setText("Orden esta conformada por:");
        panelOrden.add(jLabel4);
        jLabel4.setBounds(10, 0, 270, 40);

        getContentPane().add(panelOrden);
        panelOrden.setBounds(550, 260, 600, 390);

        btnOrdenar.setFont(new java.awt.Font("Monotype Corsiva", 0, 28)); // NOI18N
        btnOrdenar.setText("Ordenar");
        btnOrdenar.setToolTipText("");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrdenar);
        btnOrdenar.setBounds(710, 120, 120, 40);

        btnAgregar.setFont(new java.awt.Font("Monotype Corsiva", 0, 28)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setToolTipText("");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar);
        btnAgregar.setBounds(580, 120, 120, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\Sistema de restaurant\\SistemaRestaurant\\src\\Images\\fondoOrden.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1180, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Restaurant.getInstance().ponerMesaDisponible(mesaCliente.getNumMesa());
        for (int i = 0; i < Restaurant.getInstance().getMesas().size(); i++) {            
            if(Restaurant.getInstance().getMesas().get(i).getNumMesa() == mesaCliente.getNumMesa()){
                Restaurant.getInstance().getMesas().get(i).setBackground(color);
                break;
            }
        }       
           
        VistaMesas atras = new VistaMesas();
        atras.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //int idProducto = Integer.parseInt(txtIdPlato.getText());
        
        if (txtIdPlato.getText().isEmpty() & txtNomPlato.getText().isEmpty()){ // si alguno de los metodos de busqueda esta vacio entonces 
            lblNomPlato.setVisible(true);
        }
        else{
            if (!txtIdPlato.getText().isEmpty() & txtNomPlato.getText().isEmpty()){
                int idProducto = Integer.parseInt(txtIdPlato.getText());
                producto = Restaurant.getInstance().getMenu().buscarProducto(String.valueOf(idProducto));

                if (producto == null){ // no encontro el producto
                        lblNoEncontrado.setText("El producto no se encuentró, AGREGALO");
                        lblNomPlato.setVisible(false);
                    }
                else {                
                    if (producto instanceof Plato){
                        Plato plato = (Plato) producto;
                        lblIdProducto.setText(String.valueOf(idProducto));                    
                        lblCaloriasTamano.setText(String.valueOf(plato.getCantCalorias()));                    
                        lblNombre.setText(plato.getNombre());
                        lblPrecio.setText("¢ "+String.valueOf(plato.getPrecio()));
                        lblTipoIngredientes.setText(plato.getIngredientes());
                        lblTipIngr.setText("Ingredientes");
                        lblCalTam.setText("kcals");
                    } 
                    else if (producto instanceof Bebida){
                        Bebida bebida = (Bebida) producto;
                        lblIdProducto.setText(String.valueOf(idProducto));
                        lblNombre.setText(bebida.getNombre());
                        lblPrecio.setText("¢ "+String.valueOf(bebida.getPrecio()));

                        lblCalTam.setText("Tamaño");
                        lblCaloriasTamano.setText(String.valueOf(bebida.getTamano())+" ML");
                        lblTipIngr.setText("Tipo bebida");
                        lblTipoIngredientes.setText(bebida.getTipo());
                    }               
                }
            }
            else if (txtIdPlato.getText().isEmpty() & !txtNomPlato.getText().isEmpty()){
                String nomProducto = txtNomPlato.getText();
                producto = Restaurant.getInstance().getMenu().buscarProducto(nomProducto);
                
                if (producto == null){ // no encontro el producto
                        lblNoEncontrado.setText("El producto no se encuentró, AGREGALO");
                        lblNomPlato.setVisible(false);
                    }
                else {                
                    if (producto instanceof Plato){
                        Plato plato = (Plato) producto;
                        lblIdProducto.setText(String.valueOf(producto.getIdProducto()));                    
                        lblCaloriasTamano.setText(String.valueOf(plato.getCantCalorias()));                    
                        lblNombre.setText(plato.getNombre());
                        lblPrecio.setText("¢ "+String.valueOf(plato.getPrecio()));
                        lblTipoIngredientes.setText(plato.getIngredientes());
                        lblTipIngr.setText("Ingredientes");
                        lblCalTam.setText("kcals");
                    } 
                    else if (producto instanceof Bebida){
                        Bebida bebida = (Bebida) producto;
                        lblIdProducto.setText(String.valueOf(producto.getIdProducto()));
                        lblNombre.setText(bebida.getNombre());
                        lblPrecio.setText("¢ "+String.valueOf(bebida.getPrecio()));

                        lblCalTam.setText("Tamaño");
                        lblCaloriasTamano.setText(String.valueOf(bebida.getTamano())+" ML");
                        lblTipIngr.setText("Tipo bebida");
                        lblTipoIngredientes.setText(bebida.getTipo());
                    }               
                }
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int montoTotal = 0;
        if (txtIdPlato.getText().isEmpty()){
            lblNomPlato.setVisible(true);
        }
        else{
            int idp=Integer.parseInt(lblIdProducto.getText());
            if(existeProducto(idp)==false){
                    productosOrden.add(producto);
                    tablaProductos.setValueAt(productosOrden.get(indexTable).getNombre(),indexTable, 0);
                    tablaProductos.setValueAt(indexTable, indexTable, 1);
                    tablaProductos.setValueAt(montoTotal, indexTable, 2);
                    montoTotal+=producto.getPrecio();
                    indexTable++;

            }
            else{
                tablaProductos.setValueAt(productosOrden.get(indexTable).getNombre(),indexTable, 0);
                tablaProductos.setValueAt(indexTable, indexTable, 1);
                tablaProductos.setValueAt(montoTotal, indexTable, 2);
                montoTotal+=producto.getPrecio();
                indexTable++;
              }
            
            /*for (int i = 0; i <productosOrden.size(); i++) {
                for (int j = 0; j < productosOrden.size(); j++) {
                    if (productosOrden.get(i).getNombre().equals(producto.getNombre())){
                        total++;
                        montoTotal += productosOrden.get(i).getPrecio();
                        
                    }                    
                }*/
                
            
        }           
    }//GEN-LAST:event_btnAgregarActionPerformed
    public boolean existeProducto(int id){
        if(productosOrden.equals(null)){
            return false;
        }
        else{
            for(int x=0;x<productosOrden.size();x++){
                if(productosOrden.get(x).getIdProducto()==String.valueOf(id)){
                    return true;
                }
            }
            return false;
        
            }
    }

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        int cantidad=0;
        orden.setMesa(mesaCliente);
        orden.setMesero(meseroAtendio);
        
        for (int i = 0; i < productosOrden.size(); i++) {
            for (int j = 0; j < productosOrden.size(); j++) {
                if (productosOrden.get(i).getIdProducto() == productosOrden.get(j).getIdProducto()){
                    cantidad ++;
                }
            }
            Detalle detalle = new Detalle();
            detalle.setCantidad(cantidad);
            detalle.setProducto(productosOrden.get(i));
            Restaurant.getInstance().setOrden(orden);
            System.out.println(orden.toString());
        }
        
        Restaurant.getInstance().setOrden(orden);
    }//GEN-LAST:event_btnOrdenarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCalTam;
    private javax.swing.JLabel lblCaloriasTamano;
    private javax.swing.JLabel lblIdProducto;
    private javax.swing.JLabel lblNoEncontrado;
    private javax.swing.JLabel lblNomPlato;
    private javax.swing.JLabel lblNomPlato1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTipIngr;
    private javax.swing.JLabel lblTipIngr1;
    private javax.swing.JLabel lblTipoIngredientes;
    private javax.swing.JPanel panelOrden;
    private javax.swing.JPanel panelProducto;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextArea txtComentario;
    private java.awt.TextField txtIdPlato;
    private java.awt.TextField txtNomPlato;
    // End of variables declaration//GEN-END:variables
}
