
package Vista;

import Sistema.OlvaCourier;
import javax.swing.JOptionPane;


public class FrmCliente extends javax.swing.JFrame {

    public FrmCliente() {
        initComponents();
        etiquetaBienvenida.setText("Bienvenido "+OlvaCourier.clienteActual.getNombres());
        setLocationRelativeTo(null);
        setVisible(true);
        if(OlvaCourier.clienteActual.getVersionPagada()==1){
            etiquetaUpgrade.setVisible(false);
            botonUpgrade.setVisible(false);
        }else{
            etiquetaUpgrade.setVisible(true);
            botonUpgrade.setVisible(true);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Bienvenida = new javax.swing.JPanel();
        Fondo = new javax.swing.JPanel();
        PanelOpciones = new javax.swing.JPanel();
        botonConsultarOrden = new javax.swing.JButton();
        botonRegistroEnvio = new javax.swing.JButton();
        botonHistorial = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        botonUpgrade = new javax.swing.JButton();
        etiquetaUpgrade = new javax.swing.JLabel();
        EtiquetaRegistraProducto = new javax.swing.JLabel();
        EtiquetaConsultarOrden = new javax.swing.JLabel();
        EtiquetaHistorial = new javax.swing.JLabel();
        EtiquetaSalir = new javax.swing.JLabel();
        etiquetaBienvenida = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel9.setText("jLabel9");

        Bienvenida.setBackground(new java.awt.Color(64, 170, 173));
        Bienvenida.setMaximumSize(new java.awt.Dimension(3276, 3276));

        javax.swing.GroupLayout BienvenidaLayout = new javax.swing.GroupLayout(Bienvenida);
        Bienvenida.setLayout(BienvenidaLayout);
        BienvenidaLayout.setHorizontalGroup(
            BienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        BienvenidaLayout.setVerticalGroup(
            BienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Fondo.setBackground(new java.awt.Color(87, 86, 86));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelOpciones.setBackground(new java.awt.Color(138, 196, 208));

        botonConsultarOrden.setBackground(new java.awt.Color(64, 170, 173));
        botonConsultarOrden.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        botonConsultarOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pregunta.png"))); // NOI18N
        botonConsultarOrden.setBorderPainted(false);
        botonConsultarOrden.setContentAreaFilled(false);
        botonConsultarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarOrdenActionPerformed(evt);
            }
        });

        botonRegistroEnvio.setBackground(new java.awt.Color(64, 170, 173));
        botonRegistroEnvio.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        botonRegistroEnvio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/paquete.png"))); // NOI18N
        botonRegistroEnvio.setToolTipText("");
        botonRegistroEnvio.setBorderPainted(false);
        botonRegistroEnvio.setContentAreaFilled(false);
        botonRegistroEnvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistroEnvioActionPerformed(evt);
            }
        });

        botonHistorial.setBackground(new java.awt.Color(64, 170, 173));
        botonHistorial.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        botonHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/registro.png"))); // NOI18N
        botonHistorial.setBorderPainted(false);
        botonHistorial.setContentAreaFilled(false);
        botonHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHistorialActionPerformed(evt);
            }
        });

        botonSalir.setBackground(new java.awt.Color(64, 170, 173));
        botonSalir.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salir.png"))); // NOI18N
        botonSalir.setBorderPainted(false);
        botonSalir.setContentAreaFilled(false);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonUpgrade.setBackground(new java.awt.Color(0, 0, 0));
        botonUpgrade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconoUpgrade.png"))); // NOI18N
        botonUpgrade.setBorder(null);
        botonUpgrade.setBorderPainted(false);
        botonUpgrade.setContentAreaFilled(false);
        botonUpgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUpgradeActionPerformed(evt);
            }
        });

        etiquetaUpgrade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaUpgrade.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaUpgrade.setText("Adquirir Servicio Mejorado");

        EtiquetaRegistraProducto.setBackground(new java.awt.Color(0, 0, 0));
        EtiquetaRegistraProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EtiquetaRegistraProducto.setForeground(new java.awt.Color(0, 0, 0));
        EtiquetaRegistraProducto.setText("Registro de productos");

        EtiquetaConsultarOrden.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EtiquetaConsultarOrden.setForeground(new java.awt.Color(0, 0, 0));
        EtiquetaConsultarOrden.setText(" Consultar Orden");

        EtiquetaHistorial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EtiquetaHistorial.setForeground(new java.awt.Color(0, 0, 0));
        EtiquetaHistorial.setText("Historial");

        EtiquetaSalir.setBackground(new java.awt.Color(255, 255, 255));
        EtiquetaSalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EtiquetaSalir.setForeground(new java.awt.Color(0, 0, 0));
        EtiquetaSalir.setText("Salir");

        javax.swing.GroupLayout PanelOpcionesLayout = new javax.swing.GroupLayout(PanelOpciones);
        PanelOpciones.setLayout(PanelOpcionesLayout);
        PanelOpcionesLayout.setHorizontalGroup(
            PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesLayout.createSequentialGroup()
                .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOpcionesLayout.createSequentialGroup()
                        .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelOpcionesLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(botonRegistroEnvio))
                            .addGroup(PanelOpcionesLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(EtiquetaRegistraProducto)))
                        .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelOpcionesLayout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(botonConsultarOrden))
                            .addGroup(PanelOpcionesLayout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(EtiquetaConsultarOrden))))
                    .addGroup(PanelOpcionesLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOpcionesLayout.createSequentialGroup()
                        .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelOpcionesLayout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(botonHistorial))
                            .addGroup(PanelOpcionesLayout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(EtiquetaHistorial)))
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(botonUpgrade)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(PanelOpcionesLayout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(EtiquetaSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaUpgrade)
                .addGap(119, 119, 119))
        );
        PanelOpcionesLayout.setVerticalGroup(
            PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesLayout.createSequentialGroup()
                .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOpcionesLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonConsultarOrden)
                            .addComponent(botonHistorial))
                        .addGap(18, 18, 18)
                        .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EtiquetaConsultarOrden)
                            .addComponent(EtiquetaHistorial)))
                    .addGroup(PanelOpcionesLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(botonRegistroEnvio)
                        .addGap(18, 18, 18)
                        .addComponent(EtiquetaRegistraProducto)))
                .addGap(36, 36, 36)
                .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonSalir)
                    .addComponent(botonUpgrade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaSalir)
                    .addComponent(etiquetaUpgrade))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        Fondo.add(PanelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 720, 410));

        etiquetaBienvenida.setFont(new java.awt.Font("Yu Gothic", 1, 26)); // NOI18N
        etiquetaBienvenida.setForeground(new java.awt.Color(34, 35, 34));
        etiquetaBienvenida.setText("Bienvenido Cliente.getNombre()");
        Fondo.add(etiquetaBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 310, 60));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo_olva 2.0.png"))); // NOI18N
        Fondo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 110));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/repartidor.png"))); // NOI18N
        Fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 710, Short.MAX_VALUE)
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

    private void botonConsultarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarOrdenActionPerformed
        
        //try{
            int codigoABuscar = Integer.parseInt(JOptionPane.showInputDialog("Digite el código a buscar"));
            System.out.println(OlvaCourier.clienteActual.getListaBoletas().getTamaño());
            OlvaCourier.boletaActual = OlvaCourier.clienteActual.getListaBoletas().getBoleta(codigoABuscar);
            FrmConsultarOrden frmCO = new  FrmConsultarOrden();
            
            this.dispose();
        //}catch(Exception e){
            //JOptionPane.showMessageDialog(null, "No se encontró el código buscado");
        //}
            
    }//GEN-LAST:event_botonConsultarOrdenActionPerformed

    
    private void botonRegistroEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistroEnvioActionPerformed

        FrmRegistroProducto formularioRegistroEnvio= new FrmRegistroProducto();
        this.dispose();
    }//GEN-LAST:event_botonRegistroEnvioActionPerformed

    private void botonHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHistorialActionPerformed
        
        FrmHistorial frmh = new FrmHistorial();
        this.dispose();
    }//GEN-LAST:event_botonHistorialActionPerformed

    private void botonUpgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUpgradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonUpgradeActionPerformed

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
    private javax.swing.JLabel EtiquetaConsultarOrden;
    private javax.swing.JLabel EtiquetaHistorial;
    private javax.swing.JLabel EtiquetaRegistraProducto;
    private javax.swing.JLabel EtiquetaSalir;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel PanelOpciones;
    private javax.swing.JButton botonConsultarOrden;
    private javax.swing.JButton botonHistorial;
    private javax.swing.JButton botonRegistroEnvio;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonUpgrade;
    private javax.swing.JLabel etiquetaBienvenida;
    private javax.swing.JLabel etiquetaUpgrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
