/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.MainRestaurante;
import Empleados.Cocinero;
import Empleados.CrearFabrica;
import Empleados.Empleado;
import Empleados.Factory;
import Empleados.Mesero;
import ServicioRestaurante.Restaurant;

/**
 *
 * @author Extreme pc
 */
public class RegistroEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form RegistroEmpleado
     */
    
    
    
    public RegistroEmpleado() {
        initComponents();
        
        lblIdioma.setVisible(false);        
        txtIdiomas.setVisible(false);
        
        lblEspecialidad.setVisible(false);
        txtEspecialidad.setVisible(false);
        
        lblACed.setVisible(false);
        lblACor.setVisible(false);
        lblADir.setVisible(false);
        lblANom.setVisible(false);
        lblATel.setVisible(false);
        lblTipoEmp.setVisible(false);
        lblOpcion.setVisible(false);
        
        setTitle("Registro de empleados.");
        setSize(897, 520);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboEmpleado = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        lblIdioma = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtIdiomas = new javax.swing.JTextField();
        lblEspecialidad = new javax.swing.JLabel();
        txtEspecialidad = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        lblOpcion = new javax.swing.JLabel();
        lblANom = new javax.swing.JLabel();
        lblADir = new javax.swing.JLabel();
        lblATel = new javax.swing.JLabel();
        lblACed = new javax.swing.JLabel();
        lblACor = new javax.swing.JLabel();
        lblTipoEmp = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel1.setText("Registro de Empleados");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 30, 350, 50);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel2.setText("Nombre completo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 100, 220, 28);

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel3.setText("Cedula");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 140, 220, 28);

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel4.setText("Telefono");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 180, 220, 28);

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel5.setText("Direccion");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 220, 220, 28);

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel6.setText("Correo");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(200, 260, 220, 28);

        comboEmpleado.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        comboEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cocinero", "Mesero" }));
        comboEmpleado.setSelectedIndex(-1);
        comboEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(comboEmpleado);
        comboEmpleado.setBounds(420, 291, 230, 35);

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel7.setText("Tipo de empleado");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(200, 297, 230, 28);

        lblIdioma.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        lblIdioma.setText("Idiomas que domina");
        getContentPane().add(lblIdioma);
        lblIdioma.setBounds(200, 335, 220, 28);

        txtNombre.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });
        getContentPane().add(txtNombre);
        txtNombre.setBounds(420, 96, 230, 35);

        txtCedula.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaKeyPressed(evt);
            }
        });
        getContentPane().add(txtCedula);
        txtCedula.setBounds(420, 135, 230, 35);

        txtTelefono.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyPressed(evt);
            }
        });
        getContentPane().add(txtTelefono);
        txtTelefono.setBounds(420, 174, 230, 35);

        txtDireccion.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDireccionKeyPressed(evt);
            }
        });
        getContentPane().add(txtDireccion);
        txtDireccion.setBounds(420, 213, 230, 35);

        txtCorreo.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCorreoKeyPressed(evt);
            }
        });
        getContentPane().add(txtCorreo);
        txtCorreo.setBounds(420, 252, 230, 35);

        txtIdiomas.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        txtIdiomas.setToolTipText("Ejemplo: Español, Inglés, Mandarín");
        txtIdiomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdiomasActionPerformed(evt);
            }
        });
        txtIdiomas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdiomasKeyPressed(evt);
            }
        });
        getContentPane().add(txtIdiomas);
        txtIdiomas.setBounds(420, 330, 230, 35);

        lblEspecialidad.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        lblEspecialidad.setText("Especialidad");
        getContentPane().add(lblEspecialidad);
        lblEspecialidad.setBounds(200, 335, 120, 28);

        txtEspecialidad.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        txtEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEspecialidadActionPerformed(evt);
            }
        });
        txtEspecialidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEspecialidadKeyPressed(evt);
            }
        });
        getContentPane().add(txtEspecialidad);
        txtEspecialidad.setBounds(420, 330, 230, 35);

        btnRegistrar.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(380, 400, 140, 37);

        lblOpcion.setFont(new java.awt.Font("Monotype Corsiva", 1, 28)); // NOI18N
        lblOpcion.setForeground(new java.awt.Color(204, 0, 0));
        lblOpcion.setText("*");
        getContentPane().add(lblOpcion);
        lblOpcion.setBounds(660, 340, 20, 20);

        lblANom.setFont(new java.awt.Font("Monotype Corsiva", 1, 28)); // NOI18N
        lblANom.setForeground(new java.awt.Color(204, 0, 0));
        lblANom.setText("*");
        getContentPane().add(lblANom);
        lblANom.setBounds(660, 100, 51, 40);

        lblADir.setFont(new java.awt.Font("Monotype Corsiva", 1, 28)); // NOI18N
        lblADir.setForeground(new java.awt.Color(204, 0, 0));
        lblADir.setText("*");
        getContentPane().add(lblADir);
        lblADir.setBounds(660, 220, 51, 30);

        lblATel.setFont(new java.awt.Font("Monotype Corsiva", 1, 28)); // NOI18N
        lblATel.setForeground(new java.awt.Color(204, 0, 0));
        lblATel.setText("*");
        getContentPane().add(lblATel);
        lblATel.setBounds(660, 178, 51, 40);

        lblACed.setFont(new java.awt.Font("Monotype Corsiva", 1, 28)); // NOI18N
        lblACed.setForeground(new java.awt.Color(204, 0, 0));
        lblACed.setText("*");
        getContentPane().add(lblACed);
        lblACed.setBounds(660, 140, 51, 40);

        lblACor.setFont(new java.awt.Font("Monotype Corsiva", 1, 28)); // NOI18N
        lblACor.setForeground(new java.awt.Color(204, 0, 0));
        lblACor.setText("*");
        getContentPane().add(lblACor);
        lblACor.setBounds(660, 260, 20, 30);

        lblTipoEmp.setFont(new java.awt.Font("Monotype Corsiva", 1, 28)); // NOI18N
        lblTipoEmp.setForeground(new java.awt.Color(204, 0, 0));
        lblTipoEmp.setText("*");
        getContentPane().add(lblTipoEmp);
        lblTipoEmp.setBounds(660, 300, 20, 20);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\Sistema de restaurant\\SistemaRestaurant\\src\\Images\\fondo2.jpg")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 900, 498);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdiomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdiomasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdiomasActionPerformed

    private void txtEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEspecialidadActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Restaurant rest = Restaurant.getInstance();
        if (txtNombre.getText().isEmpty() | txtCedula.getText().isEmpty() | txtTelefono.getText().isEmpty() | txtCorreo.getText().isEmpty() | txtDireccion.getText().isEmpty() | comboEmpleado.getSelectedIndex()==-1){ // so algo esta vacio
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
            if (comboEmpleado.getSelectedIndex()==-1)
                lblTipoEmp.setVisible(true);                        
        }
        if (comboEmpleado.getSelectedIndex()==0){
            if (txtEspecialidad.getText().isEmpty()){
                lblOpcion.setVisible(true);
            }
            else{
                txtEspecialidad.setVisible(true);
                lblEspecialidad.setVisible(true);

                txtIdiomas.setVisible(false);
                lblIdioma.setVisible(false);
            }                
        }
        else if (comboEmpleado.getSelectedIndex()==1){
            if (txtIdiomas.getText().isEmpty()){
                lblOpcion.setVisible(true);
            }
            else{
                txtEspecialidad.setVisible(false);
                lblEspecialidad.setVisible(false);

                txtIdiomas.setVisible(true);
                lblIdioma.setVisible(true);
            } 
        }
        if (!txtNombre.getText().isEmpty() & !txtCedula.getText().isEmpty() & !txtTelefono.getText().isEmpty() & !txtCorreo.getText().isEmpty() & !txtDireccion.getText().isEmpty() & comboEmpleado.getSelectedIndex()!=-1){ // so algo esta vacio       
            System.out.println("ELSE");
            CrearFabrica factory = new CrearFabrica();
            if (comboEmpleado.getSelectedIndex()==0){ // cocinero
                System.out.println("COCINERO");
                Cocinero cocinero = factory.creaCocinero(0, 0, txtEspecialidad.getText(), txtDireccion.getText(), txtCorreo.getText(), txtNombre.getText(), txtCedula.getText(), txtTelefono.getText());
                rest.agregarEmpleado(cocinero);
            }
            else if (comboEmpleado.getSelectedIndex()==1){ // mesero
                System.out.println("MESERO");
                Mesero mesero = factory.crearMesero(txtIdiomas.getText(), txtDireccion.getText(), txtCorreo.getText(), txtNombre.getText(), txtCedula.getText(), txtTelefono.getText());
                MainRestaurante.rest.agregarEmpleado(mesero);
            }
        }
        System.out.println(rest.getCantidadEmpleados());
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void comboEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEmpleadoActionPerformed
         if (comboEmpleado.getSelectedIndex()==0){ // cocinero
            txtEspecialidad.setVisible(true);
            lblEspecialidad.setVisible(true);
            
            lblIdioma.setVisible(false);
            txtIdiomas.setVisible(false);
        }
        else if(comboEmpleado.getSelectedIndex()==1){ // mesero
            txtEspecialidad.setVisible(false);
            lblEspecialidad.setVisible(false);
            
            lblIdioma.setVisible(true);
            txtIdiomas.setVisible(true);
        }
    }//GEN-LAST:event_comboEmpleadoActionPerformed

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

    private void txtIdiomasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdiomasKeyPressed
        lblOpcion.setVisible(false);
    }//GEN-LAST:event_txtIdiomasKeyPressed

    private void txtEspecialidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEspecialidadKeyPressed
        lblOpcion.setVisible(false);
    }//GEN-LAST:event_txtEspecialidadKeyPressed

    /**
     * @param args the command line arguments
     */
    
    
    private void limpiar(){
        txtNombre.setText("");
        txtCedula.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtCorreo.setText("");
        txtIdiomas.setText("");
        comboEmpleado.setSelectedIndex(-1);
    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> comboEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblACed;
    private javax.swing.JLabel lblACor;
    private javax.swing.JLabel lblADir;
    private javax.swing.JLabel lblANom;
    private javax.swing.JLabel lblATel;
    private javax.swing.JLabel lblEspecialidad;
    private javax.swing.JLabel lblIdioma;
    private javax.swing.JLabel lblOpcion;
    private javax.swing.JLabel lblTipoEmp;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtIdiomas;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
