/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.MainRestaurante;
import Empleados.Cocinero;
import Empleados.CrearFabrica;
import Empleados.Mesero;
import ServicioRestaurante.Restaurant;
import javax.swing.JOptionPane;

/**
 *
 * @author Antonio Rodriguez
 */
public class EdicionEmpleados extends javax.swing.JFrame {

    /**
     * Creates new form EdicionEmpleados
     */
    Cocinero cocinero = null;
    Mesero mesero = null;
    String cedula;
    public EdicionEmpleados() {
        initComponents();
        setResizable(false);
        lblACed.setVisible(false);
        lblACor.setVisible(false);
        lblADir.setVisible(false);
        lblATel.setVisible(false);
        
        lblANom.setVisible(false);
        
        txtOp.setVisible(false);
        
        lblAOp.setVisible(false);
        lblOp.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtOp = new javax.swing.JTextField();
        lblOp = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        lblAOp = new javax.swing.JLabel();
        lblANom = new javax.swing.JLabel();
        lblADir = new javax.swing.JLabel();
        lblATel = new javax.swing.JLabel();
        lblACed = new javax.swing.JLabel();
        lblACor = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(888, 497));
        getContentPane().setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Monotype Corsiva", 1, 34)); // NOI18N
        lblTitulo.setText("Edición de información");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(270, 30, 350, 50);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel2.setText("Nombre completo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 134, 220, 28);

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel3.setText("Cedula");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 174, 220, 28);

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel4.setText("Telefono");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 216, 220, 28);

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel5.setText("Direccion");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 256, 220, 28);

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel6.setText("Correo");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(200, 296, 220, 28);

        txtNombre.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });
        getContentPane().add(txtNombre);
        txtNombre.setBounds(420, 130, 230, 35);

        txtCedula.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaKeyPressed(evt);
            }
        });
        getContentPane().add(txtCedula);
        txtCedula.setBounds(420, 170, 230, 35);

        txtTelefono.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyPressed(evt);
            }
        });
        getContentPane().add(txtTelefono);
        txtTelefono.setBounds(420, 210, 230, 35);

        txtDireccion.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDireccionKeyPressed(evt);
            }
        });
        getContentPane().add(txtDireccion);
        txtDireccion.setBounds(420, 250, 230, 35);

        txtCorreo.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCorreoKeyPressed(evt);
            }
        });
        getContentPane().add(txtCorreo);
        txtCorreo.setBounds(420, 290, 230, 35);

        txtOp.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        txtOp.setToolTipText("Ejemplo: Español, Inglés, Mandarín");
        txtOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOpActionPerformed(evt);
            }
        });
        txtOp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOpKeyPressed(evt);
            }
        });
        getContentPane().add(txtOp);
        txtOp.setBounds(420, 330, 230, 35);

        lblOp.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        lblOp.setText("Especialidad");
        getContentPane().add(lblOp);
        lblOp.setBounds(200, 330, 120, 28);

        btnRegistrar.setFont(new java.awt.Font("Monotype Corsiva", 1, 26)); // NOI18N
        btnRegistrar.setText("Guardar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(370, 450, 150, 40);

        lblAOp.setFont(new java.awt.Font("Monotype Corsiva", 1, 28)); // NOI18N
        lblAOp.setForeground(new java.awt.Color(204, 0, 0));
        lblAOp.setText("*");
        getContentPane().add(lblAOp);
        lblAOp.setBounds(660, 340, 20, 20);

        lblANom.setFont(new java.awt.Font("Monotype Corsiva", 1, 28)); // NOI18N
        lblANom.setForeground(new java.awt.Color(204, 0, 0));
        lblANom.setText("*");
        getContentPane().add(lblANom);
        lblANom.setBounds(660, 140, 51, 40);

        lblADir.setFont(new java.awt.Font("Monotype Corsiva", 1, 28)); // NOI18N
        lblADir.setForeground(new java.awt.Color(204, 0, 0));
        lblADir.setText("*");
        getContentPane().add(lblADir);
        lblADir.setBounds(660, 260, 51, 30);

        lblATel.setFont(new java.awt.Font("Monotype Corsiva", 1, 28)); // NOI18N
        lblATel.setForeground(new java.awt.Color(204, 0, 0));
        lblATel.setText("*");
        getContentPane().add(lblATel);
        lblATel.setBounds(660, 220, 51, 40);

        lblACed.setFont(new java.awt.Font("Monotype Corsiva", 1, 28)); // NOI18N
        lblACed.setForeground(new java.awt.Color(204, 0, 0));
        lblACed.setText("*");
        getContentPane().add(lblACed);
        lblACed.setBounds(660, 190, 51, 40);

        lblACor.setFont(new java.awt.Font("Monotype Corsiva", 1, 28)); // NOI18N
        lblACor.setForeground(new java.awt.Color(204, 0, 0));
        lblACor.setText("*");
        getContentPane().add(lblACor);
        lblACor.setBounds(660, 300, 20, 30);

        btnAtras.setFont(new java.awt.Font("Monotype Corsiva", 0, 28)); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras);
        btnAtras.setBounds(10, 10, 100, 40);

        jLabel9.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel9.setText("Id Empleado");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(160, 80, 150, 28);

        txtId.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKeyPressed(evt);
            }
        });
        getContentPane().add(txtId);
        txtId.setBounds(300, 80, 230, 35);

        lblId.setFont(new java.awt.Font("Monotype Corsiva", 1, 28)); // NOI18N
        lblId.setForeground(new java.awt.Color(204, 0, 0));
        lblId.setText("*");
        getContentPane().add(lblId);
        lblId.setBounds(541, 80, 40, 40);

        btnBuscar.setFont(new java.awt.Font("Monotype Corsiva", 0, 28)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(580, 80, 110, 40);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(-10, 0, 890, 0);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        lblANom.setVisible(false);
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtCedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyPressed
        lblACed.setVisible(false);
    }//GEN-LAST:event_txtCedulaKeyPressed

    private void txtTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyPressed
        lblATel.setVisible(false);
    }//GEN-LAST:event_txtTelefonoKeyPressed

    private void txtDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyPressed
        lblADir.setVisible(false);
    }//GEN-LAST:event_txtDireccionKeyPressed

    private void txtCorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyPressed
        lblACor.setVisible(false);
    }//GEN-LAST:event_txtCorreoKeyPressed

    private void txtOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOpActionPerformed

    private void txtOpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOpKeyPressed
        lblAOp.setVisible(false);
    }//GEN-LAST:event_txtOpKeyPressed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Restaurant rest = Restaurant.getInstance();
        
        
        if (txtNombre.getText().isEmpty() | txtCedula.getText().isEmpty() | txtTelefono.getText().isEmpty() | txtCorreo.getText().isEmpty() | txtDireccion.getText().isEmpty()){ // so algo esta vacio
            if (txtNombre.getText().isEmpty())
                lblANom.setVisible(true);
            if (txtCedula.getText().isEmpty())
                lblACed.setVisible(true);
            
            if (txtTelefono.getText().isEmpty())
                lblATel.setVisible(true);
            if (txtCorreo.getText().isEmpty())
                lblACor.setVisible(true);
            if (txtDireccion.getText().isEmpty())
                lblADir.setVisible(true);
        }
        
        
        else if (Restaurant.getInstance().getEmpleado(cedula) instanceof Mesero){
               
                mesero.setCorreo(txtCorreo.getText());
                mesero.setDireccion(txtDireccion.getText());
                mesero.setNombreCompleto(txtNombre.getText());
                mesero.setTelefono(txtTelefono.getText());
                Restaurant.getInstance().listaEmpleados.add(mesero);
               
        }
        else if (Restaurant.getInstance().getEmpleado(cedula) instanceof Cocinero){
                
                cocinero.setCorreo(txtCorreo.getText());
                cocinero.setDireccion(txtDireccion.getText());
                cocinero.setNombreCompleto(txtNombre.getText());
                cocinero.setTelefono(txtTelefono.getText());
                cocinero.setEspecialidad(txtOp.getText());
                Restaurant.getInstance().listaEmpleados.add(cocinero);
            }
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        AdministracionDatos atras = new AdministracionDatos();
        atras.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void txtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        if(txtId.getText().isEmpty()){
            lblId.setVisible(true);
        }
        else{
            lblId.setVisible(false);
            cedula = txtId.getText();
            if (Restaurant.getInstance().getEmpleado(cedula) == null){ // sino lo encuentra
                lblId.setVisible(true);  
                txtCorreo.setText("");
                txtDireccion.setText("");
                txtNombre.setText("");
                txtTelefono.setText("");  
                
                
                lblAOp.setVisible(false);
                
            }
            else if (Restaurant.getInstance().getEmpleado(cedula) instanceof Mesero){
                
                mesero = (Mesero) Restaurant.getInstance().getEmpleado(cedula);
                txtCorreo.setText(mesero.getCorreo());
                txtDireccion.setText(mesero.getDireccion());
                txtNombre.setText(mesero.getNombreCompleto());
                txtTelefono.setText(mesero.getTelefono());
                
            }
            else if (Restaurant.getInstance().getEmpleado(cedula) instanceof Cocinero){
                cocinero = (Cocinero) Restaurant.getInstance().getEmpleado(cedula);
                txtCorreo.setText(cocinero.getCorreo());
                txtDireccion.setText(cocinero.getDireccion());
                txtNombre.setText(cocinero.getNombreCompleto());
                txtTelefono.setText(cocinero.getTelefono());
                txtOp.setText(cocinero.getEspecialidad());
            }
            
            
            
        }               
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(EdicionEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EdicionEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EdicionEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EdicionEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EdicionEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblACed;
    private javax.swing.JLabel lblACor;
    private javax.swing.JLabel lblADir;
    private javax.swing.JLabel lblANom;
    private javax.swing.JLabel lblAOp;
    private javax.swing.JLabel lblATel;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblOp;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtOp;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
