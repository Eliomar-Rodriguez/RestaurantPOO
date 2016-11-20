/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Empleados.Cocinero;
import Empleados.Empleado;
import Empleados.Mesero;
import ServicioRestaurante.Restaurant;

/**
 *
 * @author Antonio Rodriguez
 */
public class BorrarEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form BorrarEmpleado
     */
    String cedula;
    public BorrarEmpleado() {
        initComponents();
        setResizable(false);
        lblAviso.setVisible(false);
        
        lblListo.setVisible(false);
        lblNoEnc.setVisible(false);
        btnEliminar.setEnabled(false);
        lblOpcion.setVisible(false);
        txtOpcion.setVisible(false);
        setTitle("Eliminar empleados");
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtDireccion = new java.awt.TextField();
        btnBuscar = new javax.swing.JButton();
        lblAviso = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtId = new java.awt.TextField();
        txtName = new java.awt.TextField();
        txtTelefono = new java.awt.TextField();
        txtCorreo = new java.awt.TextField();
        lblNoEnc = new javax.swing.JLabel();
        lblListo = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        txtOpcion = new java.awt.TextField();
        lblOpcion = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(922, 520));
        setMinimumSize(new java.awt.Dimension(922, 520));
        setPreferredSize(new java.awt.Dimension(922, 520));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 30)); // NOI18N
        jLabel1.setText("Cédula");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 50, 90, 35);

        txtDireccion.setEditable(false);
        txtDireccion.setFont(new java.awt.Font("Monotype Corsiva", 0, 21)); // NOI18N
        getContentPane().add(txtDireccion);
        txtDireccion.setBounds(320, 250, 350, 35);

        btnBuscar.setFont(new java.awt.Font("Monotype Corsiva", 0, 28)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(540, 50, 110, 40);

        lblAviso.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblAviso.setForeground(new java.awt.Color(255, 51, 0));
        lblAviso.setText("*");
        getContentPane().add(lblAviso);
        lblAviso.setBounds(500, 60, 20, 30);

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 0, 28)); // NOI18N
        jLabel3.setText("Dirección");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 250, 130, 32);

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 0, 28)); // NOI18N
        jLabel4.setText("Correo");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(160, 210, 140, 32);

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 0, 28)); // NOI18N
        jLabel5.setText("Teléfono");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(160, 170, 140, 32);

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 0, 28)); // NOI18N
        jLabel6.setText("Nombre");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(160, 130, 140, 32);

        txtId.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        getContentPane().add(txtId);
        txtId.setBounds(260, 50, 230, 35);

        txtName.setEditable(false);
        txtName.setFont(new java.awt.Font("Monotype Corsiva", 0, 21)); // NOI18N
        getContentPane().add(txtName);
        txtName.setBounds(320, 130, 350, 35);

        txtTelefono.setEditable(false);
        txtTelefono.setFont(new java.awt.Font("Monotype Corsiva", 0, 21)); // NOI18N
        getContentPane().add(txtTelefono);
        txtTelefono.setBounds(320, 170, 350, 35);

        txtCorreo.setEditable(false);
        txtCorreo.setFont(new java.awt.Font("Monotype Corsiva", 0, 21)); // NOI18N
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCorreo);
        txtCorreo.setBounds(320, 210, 350, 35);

        lblNoEnc.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        lblNoEnc.setForeground(new java.awt.Color(204, 0, 0));
        lblNoEnc.setText("No se encontro el empleado");
        getContentPane().add(lblNoEnc);
        lblNoEnc.setBounds(330, 340, 270, 28);

        lblListo.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        lblListo.setForeground(new java.awt.Color(0, 153, 51));
        lblListo.setText("Eliminado de manera correcta");
        getContentPane().add(lblListo);
        lblListo.setBounds(320, 340, 300, 30);

        btnEliminar.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(380, 390, 150, 40);

        txtOpcion.setEditable(false);
        txtOpcion.setFont(new java.awt.Font("Monotype Corsiva", 0, 21)); // NOI18N
        getContentPane().add(txtOpcion);
        txtOpcion.setBounds(320, 290, 350, 35);

        lblOpcion.setFont(new java.awt.Font("Monotype Corsiva", 0, 28)); // NOI18N
        lblOpcion.setText("nombre");
        getContentPane().add(lblOpcion);
        lblOpcion.setBounds(160, 290, 130, 32);

        btnAtras.setFont(new java.awt.Font("Monotype Corsiva", 0, 28)); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras);
        btnAtras.setBounds(10, 10, 100, 40);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 0, 22)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\Sistema de restaurant\\SistemaRestaurant\\src\\Images\\fondo2.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-30, 0, 920, 498);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Cocinero cocinero = null;
        Mesero mesero = null;
        
        if(txtId.getText().isEmpty()){
            lblAviso.setVisible(true);
        }
        else{
            lblAviso.setVisible(false);
            cedula = txtId.getText();
            if (Restaurant.getInstance().getEmpleado(cedula) == null){ // sino lo encuentra
                lblNoEnc.setVisible(true);                
                lblListo.setVisible(false);
                txtCorreo.setText("");
                txtDireccion.setText("");
                txtName.setText("");
                txtTelefono.setText("");  
                
                txtOpcion.setVisible(false);
                lblOpcion.setVisible(false);
                btnEliminar.setEnabled(true);
            }
            else if (Restaurant.getInstance().getEmpleado(cedula) instanceof Mesero){ // si lo que encuentra es un mesero
                lblNoEnc.setVisible(false);
                mesero = (Mesero) Restaurant.getInstance().getEmpleado(cedula);
                txtCorreo.setText(mesero.getCorreo());
                txtDireccion.setText(mesero.getDireccion());
                txtName.setText(mesero.getNombreCompleto());
                txtTelefono.setText(mesero.getTelefono());

                txtOpcion.setText(mesero.getIdiomasDomina());
                txtOpcion.setVisible(true);
                lblOpcion.setText("Idiomas");
                lblOpcion.setVisible(true);

                btnEliminar.setEnabled(true);
            }
            else if (Restaurant.getInstance().getEmpleado(cedula) instanceof Cocinero){ // si lo que encuentra es un cocinero
                lblNoEnc.setVisible(false);
                cocinero = (Cocinero) Restaurant.getInstance().getEmpleado(cedula);
                txtCorreo.setText(cocinero.getCorreo());
                txtDireccion.setText(cocinero.getDireccion());
                txtName.setText(cocinero.getNombreCompleto());
                txtTelefono.setText(cocinero.getTelefono());    
                txtOpcion.setText(cocinero.getEspecialidad());
                lblOpcion.setText("Especialidad");
                btnEliminar.setEnabled(true);
                lblOpcion.setVisible(true);
                txtOpcion.setVisible(true);
            }            
        }               
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Restaurant.getInstance().eliminarEmpleado(cedula);
        txtId.setText("");
        lblListo.setVisible(true);
        System.out.println("Eliminado con exito");
        lblNoEnc.setVisible(false); 
        txtCorreo.setText("");
        txtDireccion.setText("");
        txtName.setText("");
        txtTelefono.setText("");

        txtOpcion.setVisible(false);
        lblOpcion.setVisible(false);
        btnEliminar.setEnabled(true);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        AdministracionDatos atras = new AdministracionDatos();
        atras.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(BorrarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrarEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblListo;
    private javax.swing.JLabel lblNoEnc;
    private javax.swing.JLabel lblOpcion;
    private java.awt.TextField txtCorreo;
    private java.awt.TextField txtDireccion;
    private java.awt.TextField txtId;
    private java.awt.TextField txtName;
    private java.awt.TextField txtOpcion;
    private java.awt.TextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
