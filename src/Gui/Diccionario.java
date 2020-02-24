/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import actores.Cliente;
import java.awt.Dialog;
import java.awt.event.WindowEvent;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;

/**
 *
 * @author ACER 53F4
 */
public class Diccionario extends javax.swing.JFrame {
    
    private Cliente cliente;
    
    /**
     * Creates new form Diccionario
     */
    public Diccionario() {
        try {
            cliente =  new Cliente();
        } catch (SocketException ex) {
            Logger.getLogger(Diccionario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Diccionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        //pone la ventana en el Centro de la pantalla
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

        lblDiccionario = new javax.swing.JLabel();
        lblBuscar = new javax.swing.JLabel();
        txtFieldBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFieldDefinicion = new javax.swing.JTextArea();
        lblDefinicion = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Diccionario");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDiccionario.setFont(new java.awt.Font("Georgia", 0, 48)); // NOI18N
        lblDiccionario.setText("Diccionario");
        getContentPane().add(lblDiccionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, 50));

        lblBuscar.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblBuscar.setText("Buscar:");
        getContentPane().add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 67, 60, 30));
        getContentPane().add(txtFieldBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 289, 25));

        btnBuscar.setText("O");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        txtFieldDefinicion.setColumns(20);
        txtFieldDefinicion.setRows(5);
        jScrollPane1.setViewportView(txtFieldDefinicion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 143, 386, 178));

        lblDefinicion.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblDefinicion.setText("Definición");
        getContentPane().add(lblDefinicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        btnAgregar.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 168, 50));

        btnListar.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        getContentPane().add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 168, 54));

        btnSalir.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 168, 54));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
//        String respuesta = cliente.procesar(txtFieldBuscar.getText());
//        txtFieldDefinicion.setText(respuesta);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    CreateTermino nv = new CreateTermino(this,true);
    nv.setCliente(cliente);
    nv.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
    ListTerminos nv = new ListTerminos(this,true);
    nv.setVisible(true);
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.processWindowEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Diccionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diccionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diccionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diccionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Diccionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblDefinicion;
    private javax.swing.JLabel lblDiccionario;
    private javax.swing.JTextField txtFieldBuscar;
    private javax.swing.JTextArea txtFieldDefinicion;
    // End of variables declaration//GEN-END:variables
}