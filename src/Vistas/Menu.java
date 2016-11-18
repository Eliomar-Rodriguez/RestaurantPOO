/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import ServicioRestaurante.Mesa;

/**
 *
 * @author Antonio Rodriguez
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
        lblNomPlato.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAtras = new javax.swing.JButton();
        panelProducto = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblIdProducto = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblCalorias = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblNomPlato = new javax.swing.JLabel();
        txtNomPlato = new java.awt.TextField();
        txtIdPlato = new java.awt.TextField();
        btnBuscar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(999, 559));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
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

        panelProducto.setBackground(new java.awt.Color(255, 255, 204));
        panelProducto.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel2.setText("Id Producto");
        panelProducto.add(jLabel2);
        jLabel2.setBounds(30, 20, 160, 28);

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel3.setText("Nombre");
        panelProducto.add(jLabel3);
        jLabel3.setBounds(30, 50, 130, 28);

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel4.setText("Tipo");
        panelProducto.add(jLabel4);
        jLabel4.setBounds(30, 80, 80, 28);

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel5.setText("jLabel2");
        panelProducto.add(jLabel5);
        jLabel5.setBounds(30, 170, 100, 28);

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel6.setText("Precio");
        panelProducto.add(jLabel6);
        jLabel6.setBounds(30, 140, 90, 28);

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel7.setText("kcals");
        panelProducto.add(jLabel7);
        jLabel7.setBounds(30, 110, 120, 28);

        lblIdProducto.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        lblIdProducto.setText(". . .");
        lblIdProducto.setToolTipText("");
        panelProducto.add(lblIdProducto);
        lblIdProducto.setBounds(210, 20, 110, 28);

        lblNombre.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        lblNombre.setText(". . .");
        lblNombre.setToolTipText("");
        panelProducto.add(lblNombre);
        lblNombre.setBounds(210, 50, 80, 28);

        lblTipo.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        lblTipo.setText(". . .");
        lblTipo.setToolTipText("");
        panelProducto.add(lblTipo);
        lblTipo.setBounds(210, 80, 25, 28);

        lblCalorias.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        lblCalorias.setText(". . .");
        lblCalorias.setToolTipText("");
        panelProducto.add(lblCalorias);
        lblCalorias.setBounds(210, 110, 70, 28);

        lblPrecio.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        lblPrecio.setText(". . .");
        lblPrecio.setToolTipText("");
        panelProducto.add(lblPrecio);
        lblPrecio.setBounds(210, 140, 25, 28);

        jLabel13.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel13.setText(". . .");
        jLabel13.setToolTipText("");
        panelProducto.add(jLabel13);
        jLabel13.setBounds(210, 170, 25, 28);

        getContentPane().add(panelProducto);
        panelProducto.setBounds(40, 270, 540, 250);

        lblNomPlato.setFont(new java.awt.Font("Monotype Corsiva", 0, 22)); // NOI18N
        lblNomPlato.setForeground(new java.awt.Color(204, 0, 0));
        lblNomPlato.setText("*Debe buscar al menos por un metodo de busqueda");
        getContentPane().add(lblNomPlato);
        lblNomPlato.setBounds(40, 180, 400, 25);

        txtNomPlato.setFont(new java.awt.Font("Monotype Corsiva", 0, 28)); // NOI18N
        getContentPane().add(txtNomPlato);
        txtNomPlato.setBounds(250, 130, 160, 35);

        txtIdPlato.setFont(new java.awt.Font("Monotype Corsiva", 0, 28)); // NOI18N
        txtIdPlato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdPlatoKeyPressed(evt);
            }
        });
        getContentPane().add(txtIdPlato);
        txtIdPlato.setBounds(80, 130, 100, 35);

        btnBuscar.setFont(new java.awt.Font("Monotype Corsiva", 0, 28)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(460, 130, 110, 40);

        jLabel10.setFont(new java.awt.Font("Monotype Corsiva", 1, 26)); // NOI18N
        jLabel10.setText("Id de plato    o    Nombre de plato");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(70, 90, 360, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\Sistema de restaurant\\SistemaRestaurant\\src\\Images\\fondo.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        VistaMesas atras = new VistaMesas();
        atras.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String nombre = txtNomPlato.getText();
        String idPlato = txtIdPlato.getText();
        if (nombre.isEmpty() & idPlato.isEmpty()){ // si alguno de los metodos de busqueda esta vacio entonces 
            
        }
        else{
            
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void txtIdPlatoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdPlatoKeyPressed
        
    }//GEN-LAST:event_txtIdPlatoKeyPressed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblCalorias;
    private javax.swing.JLabel lblIdProducto;
    private javax.swing.JLabel lblNomPlato;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPanel panelProducto;
    private java.awt.TextField txtIdPlato;
    private java.awt.TextField txtNomPlato;
    // End of variables declaration//GEN-END:variables
}
