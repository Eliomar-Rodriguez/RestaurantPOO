/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import ConsultasyReportes.ConsultayReporte;

import Empleados.Cliente;
import Empleados.Cocinero;
import Empleados.Mesero;
import ServicioRestaurante.Bebida;
import ServicioRestaurante.Factura;
import ServicioRestaurante.Orden;
import ServicioRestaurante.Plato;
import ServicioRestaurante.Restaurant;
import static ServicioRestaurante.Restaurant.facturas;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Extreme pc
 */
public class ConsultasReportes extends javax.swing.JFrame {

    /**
     * Creates new form ConsultasReportes
     */
    
    public static ConsultayReporte cr = new ConsultayReporte();
    
  
    

        
    public ConsultasReportes() {
        
        initComponents();
        setResizable(false);
        setSize(782, 531);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboConsulta = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaConsulta = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Consultas y Reportes");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(144, 16, 148, 20);

        comboConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1. El empleado del mes (mesero y cocinero).", "2. Los dos platos más consumidos por los clientes.", "3. En qué hora del día el restaurante está más lleno.", "4. ¿Cuál es el cliente más frecuente?", "5. Precio total, por cada plato servido en un mes en específico.", "6. Precio total, por tipo de bebidas servidas en un día en específico.", "7. Total vendido por mes.", "8. Total vendido por año.", "9. Total de clientes atendidos por mes.", "10. Total de clientes atendidos por año", " " }));
        comboConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboConsultaActionPerformed(evt);
            }
        });
        getContentPane().add(comboConsulta);
        comboConsulta.setBounds(15, 78, 490, 30);

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(153, 428, 99, 29);

        areaConsulta.setEditable(false);
        jScrollPane1.setViewportView(areaConsulta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(102, 145, 269, 229);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboConsultaActionPerformed
        
        
        
    }//GEN-LAST:event_comboConsultaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Cocinero cocinero = null;
        Mesero mesero = null;
        switch (comboConsulta.getSelectedIndex()) {
            case 0:
                // cocinero y mesero del mes
                cr.meseroDelmes();
                //cr.cocineroDelmes();               
                break;
            case 1:
                //dos platos mas consumidos
                cr.dosPlatosMasConsumidos();
                 
                break;
            case 2:
                //hora pico
                cr.horaPicoRest();
                break;
            case 3:
                //hora pico
                //cr.clienteFrecuente();
                break;
            case 4:
                //total de platos por mes
                //cr.totalPlatosxMes();
                break;
            case 5:
                //total de bebidas por dia
                //cr.totalBebidasXDia();
        
            case 6:
                // total vendido por mes
                //cr.totalVendidoXMes();
        
                break;
            case 7:
                //total vendido por ano
                //cr.totalVendidoXAno();
        
                
                break;
            case 8 :
                // total de clientes por mes
                //cr.totalClientesXMes();
                break;
                
            case 9 :
                // total de clientes por ano
                //cr.totalClientesXAno();
                break;
            default:
                break;
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultasReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultasReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultasReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultasReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultasReportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextPane areaConsulta;
    private javax.swing.JComboBox<String> comboConsulta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
