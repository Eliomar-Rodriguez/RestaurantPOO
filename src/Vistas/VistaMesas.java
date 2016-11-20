/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Empleados.Cliente;
import Empleados.CrearFabrica;
import Empleados.Mesero;
import Empleados.Persona;
import ServicioRestaurante.Mesa;
import ServicioRestaurante.Orden;
import ServicioRestaurante.Restaurant;
import java.util.ArrayList;
import ServicioRestaurante.Restaurant;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

/**
 *
 * @author Peniche
 */
public class VistaMesas extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarCliente
     */
    private static Mesa mesaSeleccionada = null;
    
    private static Mesero mesero = null;
    
    Color color;
    
    public VistaMesas() {
        initComponents();
        lblAviso.setVisible(false);
        
        setTitle("Vista de mesas");  
        setSize(996, 597);
        setResizable(false);
        setLocationRelativeTo(null);
        mesasDisponibles();
        setResizable(false);
        
        panelMesas.setLayout(new GridLayout(3, 4,0,0));
        //btnReservar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMesas = new javax.swing.JPanel();
        numPersonas = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        btnReservar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtMesero = new javax.swing.JTextField();
        lblAviso = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        panelMesas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panelMesasLayout = new javax.swing.GroupLayout(panelMesas);
        panelMesas.setLayout(panelMesasLayout);
        panelMesasLayout.setHorizontalGroup(
            panelMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );
        panelMesasLayout.setVerticalGroup(
            panelMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        getContentPane().add(panelMesas);
        panelMesas.setBounds(450, 30, 500, 500);

        numPersonas.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        numPersonas.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        numPersonas.setAlignmentX(1.0F);
        numPersonas.setAlignmentY(1.0F);
        numPersonas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        numPersonas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                numPersonasStateChanged(evt);
            }
        });
        getContentPane().add(numPersonas);
        numPersonas.setBounds(320, 80, 70, 40);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 30)); // NOI18N
        jLabel1.setText("Id Mesero");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 150, 120, 35);

        btnReservar.setFont(new java.awt.Font("Monotype Corsiva", 0, 30)); // NOI18N
        btnReservar.setText("Reservar mesa");
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });
        getContentPane().add(btnReservar);
        btnReservar.setBounds(160, 240, 190, 40);

        jButton2.setFont(new java.awt.Font("Monotype Corsiva", 0, 28)); // NOI18N
        jButton2.setText("Atrás");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(40, 20, 100, 40);

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 0, 30)); // NOI18N
        jLabel3.setText("Número de personas");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 80, 240, 35);

        txtMesero.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        getContentPane().add(txtMesero);
        txtMesero.setBounds(210, 150, 180, 40);

        lblAviso.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        lblAviso.setForeground(new java.awt.Color(204, 0, 0));
        lblAviso.setText("*");
        getContentPane().add(lblAviso);
        lblAviso.setBounds(400, 150, 110, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\Sistema de restaurant\\SistemaRestaurant\\src\\Images\\fondo.jpg")); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(1000, 670));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1000, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numPersonasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_numPersonasStateChanged
            mesasDisponibles();        
    }//GEN-LAST:event_numPersonasStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Main main = new Main();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        panelMesas.setLayout(new GridLayout(3, 4,0,0));
        mesaSeleccionada = null;
    }//GEN-LAST:event_formWindowOpened

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        String idEmpleado = txtMesero.getText();
        int x =0;
        if (txtMesero.getText().isEmpty() | mesaSeleccionada == null) // si mesa seleccionada es diferente de null quiere decir que se dio click en una mesa disponile
            lblAviso.setVisible(true);
        else{ 
            if (!mesaSeleccionada.getEstado() | txtMesero.getText().isEmpty())
                lblAviso.setVisible(true);
            else{                
            
                if (Restaurant.getInstance().getEmpleado(idEmpleado)!=null){
                    mesero = (Mesero) Restaurant.getInstance().getEmpleado(idEmpleado);
                    
                    for (int i = 0; i < Restaurant.getInstance().getMesas().size(); i++) {
                        if (Restaurant.getInstance().getMesas().get(i).getNumMesa() == mesaSeleccionada.getNumMesa()){ // si la mesa seleccionada para reservar es igual a la mesa que esta en la lista de mesas pongo ocupada la que esta e la lista del restaurant
                            
                            Restaurant.getInstance().getMesas().get(i).setEstado(false);
                            x=i;
                            break;
                        }
                    }
                    Menu m = new Menu(mesaSeleccionada, mesero, color);
                    m.setVisible(true);
                }
                else{
                    lblAviso.setVisible(true);
                }
                //System.out.println(Restaurant.getInstance().getMesas().get(x).getEstado());
            }
        }
    }//GEN-LAST:event_btnReservarActionPerformed

    public void mesasDisponibles(){
        //System.out.println("Entre al mesasDisponibles"); 
        Font fuente = new Font("Monotype Corsiva", 3, 24);
        
        ArrayList<Mesa> listaMesas = Restaurant.getInstance().getMesas();
        //System.out.println(listaMesas.size());
        for (int i = 0; i < listaMesas.size(); i++) {
            Mesa mesa = listaMesas.get(i);
            
            mesa.addActionListener((ActionEvent e)->{
                if(mesaSeleccionada == null){
                    mesaSeleccionada = mesa;
                    color = mesa.getBackground();
                    mesaSeleccionada.setBackground(Color.getHSBColor(210, 210, 210));
                }
                else{
                    mesaSeleccionada.setBackground(mesa.getBackground());
                    mesaSeleccionada = mesa;
                    mesaSeleccionada.setBackground(Color.getHSBColor(210, 210, 210));
                }
            });
            mesa.setText("Mesa: "+String.valueOf(mesa.getNumMesa()));
            mesa.setFont(fuente);
            if (mesa.getCantPersonas()>=(Integer)numPersonas.getValue()){
                mesa.setEnabled(true);
            }           
            if(mesa.getCantPersonas()<(Integer)numPersonas.getValue()){
                mesa.setEnabled(false);
            }
            if (!mesa.getEstado()){
                mesa.setEnabled(false);
            }
            panelMesas.add(mesa);
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMesas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReservar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JSpinner numPersonas;
    private javax.swing.JPanel panelMesas;
    private javax.swing.JTextField txtMesero;
    // End of variables declaration//GEN-END:variables
}
