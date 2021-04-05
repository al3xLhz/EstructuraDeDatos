/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Sistema.OlvaCourier;
import javax.swing.JOptionPane;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Alex
 */
public class FrmCliente extends javax.swing.JFrame {

    /**
     * Creates new form FrmCliente
     */
    public FrmCliente() {
        initComponents();
        etiquetaBienvenida.setText("Bienvenido "+OlvaCourier.clienteActual.getNombres());
        setLocationRelativeTo(null);
        setVisible(true);
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
        jLabel9 = new javax.swing.JLabel();
        Fondo = new javax.swing.JPanel();
        Bienvenida = new javax.swing.JPanel();
        PanelOpciones = new javax.swing.JPanel();
        botonRegistroEnvio = new javax.swing.JButton();
        botonConsultarOrden = new javax.swing.JButton();
        botonHistorial = new javax.swing.JButton();
        botonCalcularEnvio = new javax.swing.JButton();
        botonSeguimientoEnvio = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        etiquetaBienvenida = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fondo.setBackground(new java.awt.Color(87, 86, 86));

        Bienvenida.setBackground(new java.awt.Color(64, 170, 173));
        Bienvenida.setMaximumSize(new java.awt.Dimension(3276, 3276));

        PanelOpciones.setBackground(new java.awt.Color(64, 170, 173));

        botonRegistroEnvio.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        botonRegistroEnvio.setText("Registro de productos");
        botonRegistroEnvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistroEnvioActionPerformed(evt);
            }
        });

        botonConsultarOrden.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        botonConsultarOrden.setText("Consultar orden");
        botonConsultarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarOrdenActionPerformed(evt);
            }
        });

        botonHistorial.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        botonHistorial.setText("Historial");

        botonCalcularEnvio.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        botonCalcularEnvio.setText("Calcular envio");

        botonSeguimientoEnvio.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        botonSeguimientoEnvio.setText("Seguimiento de envios");
        botonSeguimientoEnvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeguimientoEnvioActionPerformed(evt);
            }
        });

        botonSalir.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/paquete.png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 210, 91));
        jLabel5.setForeground(new java.awt.Color(255, 210, 91));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pregunta.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        etiquetaBienvenida.setFont(new java.awt.Font("Yu Gothic", 1, 26)); // NOI18N
        etiquetaBienvenida.setForeground(new java.awt.Color(34, 35, 34));
        etiquetaBienvenida.setText("Bienvenido Cliente.getNombre()");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/camioneta.png"))); // NOI18N
        jLabel6.setFocusable(false);
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pago.png"))); // NOI18N

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salir.png"))); // NOI18N
        jLabel7.setToolTipText("");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/registro.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/OdeOlva.png"))); // NOI18N

        javax.swing.GroupLayout PanelOpcionesLayout = new javax.swing.GroupLayout(PanelOpciones);
        PanelOpciones.setLayout(PanelOpcionesLayout);
        PanelOpcionesLayout.setHorizontalGroup(
            PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesLayout.createSequentialGroup()
                .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOpcionesLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonRegistroEnvio)
                            .addComponent(botonSeguimientoEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelOpcionesLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelOpcionesLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel6)))
                .addGap(39, 39, 39)
                .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelOpcionesLayout.createSequentialGroup()
                        .addComponent(botonConsultarOrden)
                        .addGap(49, 49, 49)
                        .addComponent(botonHistorial)
                        .addGap(168, 168, 168))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelOpcionesLayout.createSequentialGroup()
                        .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelOpcionesLayout.createSequentialGroup()
                                .addComponent(botonCalcularEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelOpcionesLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PanelOpcionesLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(57, 57, 57)
                                        .addComponent(jLabel7))
                                    .addGroup(PanelOpcionesLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(72, 72, 72)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(PanelOpcionesLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(etiquetaBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelOpcionesLayout.setVerticalGroup(
            PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesLayout.createSequentialGroup()
                .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOpcionesLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(etiquetaBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOpcionesLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelOpcionesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOpcionesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonRegistroEnvio))
                    .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonConsultarOrden)
                        .addComponent(botonHistorial)))
                .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOpcionesLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelOpcionesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSeguimientoEnvio)
                    .addComponent(botonCalcularEnvio)
                    .addComponent(botonSalir))
                .addGap(38, 38, 38))
        );

        jLabel6.getAccessibleContext().setAccessibleParent(jLabel6);

        javax.swing.GroupLayout BienvenidaLayout = new javax.swing.GroupLayout(Bienvenida);
        Bienvenida.setLayout(BienvenidaLayout);
        BienvenidaLayout.setHorizontalGroup(
            BienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 594, Short.MAX_VALUE)
        );
        BienvenidaLayout.setVerticalGroup(
            BienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        FrmIniciarSesion fr= new FrmIniciarSesion();
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonSeguimientoEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeguimientoEnvioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSeguimientoEnvioActionPerformed

    private void botonConsultarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarOrdenActionPerformed
        JOptionPane.showInputDialog("Digite el código a buscar");
    }//GEN-LAST:event_botonConsultarOrdenActionPerformed

    private void botonRegistroEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistroEnvioActionPerformed

        FrmRegistroProducto formularioRegistroEnvio= new FrmRegistroProducto();
        this.dispose();
    }//GEN-LAST:event_botonRegistroEnvioActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bienvenida;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel PanelOpciones;
    private javax.swing.JButton botonCalcularEnvio;
    private javax.swing.JButton botonConsultarOrden;
    private javax.swing.JButton botonHistorial;
    private javax.swing.JButton botonRegistroEnvio;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonSeguimientoEnvio;
    private javax.swing.JLabel etiquetaBienvenida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
