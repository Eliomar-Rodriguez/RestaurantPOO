/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Empleados.Cliente;
import Empleados.Cocinero;
import Empleados.CrearFabrica;
import Empleados.Mesero;
import ServicioRestaurante.Mesa;
import ServicioRestaurante.Producto;
import ServicioRestaurante.Restaurant;
import java.util.ArrayList;

/**
 *
 * @author Peniche
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Restaurant Dos Cielos TEC"); 
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdministrarDatos = new javax.swing.JButton();
        btnVistaCocinero = new javax.swing.JButton();
        btnFactura = new javax.swing.JButton();
        btnVistaMesero = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnTomarOrden = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnConsultasReportes1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(922, 520));
        setMinimumSize(new java.awt.Dimension(922, 520));
        setPreferredSize(new java.awt.Dimension(922, 520));
        setResizable(false);
        getContentPane().setLayout(null);

        btnAdministrarDatos.setFont(new java.awt.Font("Monotype Corsiva", 0, 28)); // NOI18N
        btnAdministrarDatos.setText("Administración de datos");
        btnAdministrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministrarDatosActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdministrarDatos);
        btnAdministrarDatos.setBounds(10, 70, 280, 40);

        btnVistaCocinero.setFont(new java.awt.Font("Monotype Corsiva", 0, 28)); // NOI18N
        btnVistaCocinero.setText("Vista Cocinero");
        btnVistaCocinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVistaCocineroActionPerformed(evt);
            }
        });
        getContentPane().add(btnVistaCocinero);
        btnVistaCocinero.setBounds(630, 120, 280, 40);

        btnFactura.setFont(new java.awt.Font("Monotype Corsiva", 0, 28)); // NOI18N
        btnFactura.setText("Cerrar Orden");
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });
        getContentPane().add(btnFactura);
        btnFactura.setBounds(10, 230, 280, 40);

        btnVistaMesero.setFont(new java.awt.Font("Monotype Corsiva", 0, 28)); // NOI18N
        btnVistaMesero.setText("Vista Mesero");
        btnVistaMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVistaMeseroActionPerformed(evt);
            }
        });
        getContentPane().add(btnVistaMesero);
        btnVistaMesero.setBounds(630, 70, 280, 40);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 1, 30)); // NOI18N
        jLabel2.setText("Funciones del restaurant");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 20, 320, 30);

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 1, 30)); // NOI18N
        jLabel4.setText("Vistas de los empleados");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(610, 20, 300, 30);

        btnTomarOrden.setFont(new java.awt.Font("Monotype Corsiva", 0, 28)); // NOI18N
        btnTomarOrden.setText("Tomar orden");
        btnTomarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomarOrdenActionPerformed(evt);
            }
        });
        getContentPane().add(btnTomarOrden);
        btnTomarOrden.setBounds(10, 120, 280, 40);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 920, 490);

        btnConsultasReportes1.setFont(new java.awt.Font("Monotype Corsiva", 0, 28)); // NOI18N
        btnConsultasReportes1.setText("Consultas y Reportes");
        btnConsultasReportes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasReportes1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultasReportes1);
        btnConsultasReportes1.setBounds(10, 170, 280, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdministrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministrarDatosActionPerformed
        AdministracionDatos  r = new AdministracionDatos();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAdministrarDatosActionPerformed

    private void btnVistaCocineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVistaCocineroActionPerformed
        VistaCocinero vistaC = new VistaCocinero();
        vistaC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVistaCocineroActionPerformed

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
        CerrarOrden co = new CerrarOrden();
        co.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFacturaActionPerformed

    private void btnVistaMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVistaMeseroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVistaMeseroActionPerformed

    private void btnTomarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomarOrdenActionPerformed
        VistaMesas  r = new VistaMesas();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTomarOrdenActionPerformed

    private void btnConsultasReportes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasReportes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultasReportes1ActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        CrearFabrica f = new CrearFabrica();
                      
        Cliente c1 = f.crearCliente(0, "Jose Carlos Rodriguez Arrieta", "2-0724-0382", "8528-2245");
        Cliente c2 = f.crearCliente(0, "Eliomar Rodriguez Arguedas", "2-0734-0342", "8458-3234");
        
        Mesero m1 = f.crearMesero("Ingles", "Los Chiles", "asd@hotmail.com", "Tulio Lopez", "2-0567-0945", "9876-4567");
        
        Cocinero co1 = f.creaCocinero(0, 0, "Postres", "Aguas Zarcas", "jperez24@gmail.com", "Juan Perez", "2345-5678", "83638-3455");
        
        System.out.println("Impresión de datos ingresados a \"pata\".\n"+c1.mostrar()+"\n"+c2.mostrar()+"\n"+co1.mostrar());
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministrarDatos;
    private javax.swing.JButton btnConsultasReportes1;
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnTomarOrden;
    private javax.swing.JButton btnVistaCocinero;
    private javax.swing.JButton btnVistaMesero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
