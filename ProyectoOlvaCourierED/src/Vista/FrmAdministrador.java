/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Sistema.OlvaCourier;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class FrmAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form FrmAdministrador
     */
    public FrmAdministrador() {
        initComponents();
        etiquetaBienvenida.setText("Bienvenido "+OlvaCourier.administradorActual.getNombres());
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

        Bienvenida = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Fondo = new javax.swing.JPanel();
        PanelOpciones = new javax.swing.JPanel();
        botonInventarioAgencia = new javax.swing.JButton();
        botonConsular = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        botonSeguimientoEnvio = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        inventario = new javax.swing.JLabel();
        consulta = new javax.swing.JLabel();
        historial = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        Cliente = new javax.swing.JButton();
        cliente = new javax.swing.JLabel();
        etiquetaBienvenida = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        Bienvenida.setBackground(new java.awt.Color(64, 170, 173));

        javax.swing.GroupLayout BienvenidaLayout = new javax.swing.GroupLayout(Bienvenida);
        Bienvenida.setLayout(BienvenidaLayout);
        BienvenidaLayout.setHorizontalGroup(
            BienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );
        BienvenidaLayout.setVerticalGroup(
            BienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 135, Short.MAX_VALUE)
        );

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Fondo.setBackground(new java.awt.Color(64, 170, 173));
        Fondo.setPreferredSize(new java.awt.Dimension(650, 520));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelOpciones.setBackground(new java.awt.Color(64, 170, 173));
        PanelOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonInventarioAgencia.setBackground(new java.awt.Color(64, 170, 173));
        botonInventarioAgencia.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        botonInventarioAgencia.setText("Inventario de Agencia");
        botonInventarioAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInventarioAgenciaActionPerformed(evt);
            }
        });
        PanelOpciones.add(botonInventarioAgencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        botonConsular.setBackground(new java.awt.Color(64, 170, 173));
        botonConsular.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        botonConsular.setText("Consultar de orden");
        botonConsular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsularActionPerformed(evt);
            }
        });
        PanelOpciones.add(botonConsular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jButton3.setBackground(new java.awt.Color(64, 170, 173));
        jButton3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButton3.setText("Historial");
        PanelOpciones.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, -1, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/camioneta.png"))); // NOI18N
        jLabel6.setFocusable(false);
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelOpciones.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, 102));

        botonSeguimientoEnvio.setBackground(new java.awt.Color(64, 170, 173));
        botonSeguimientoEnvio.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        botonSeguimientoEnvio.setText("Seguimiento de envios");
        botonSeguimientoEnvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeguimientoEnvioActionPerformed(evt);
            }
        });
        PanelOpciones.add(botonSeguimientoEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 187, -1));

        salir.setBackground(new java.awt.Color(64, 170, 173));
        salir.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        PanelOpciones.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, -1));

        inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/inventario_agencia.png"))); // NOI18N
        PanelOpciones.add(inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        consulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/consulta_orden.png"))); // NOI18N
        PanelOpciones.add(consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/registro2.png"))); // NOI18N
        PanelOpciones.add(historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salir.png"))); // NOI18N
        exit.setToolTipText("");
        PanelOpciones.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, -1));

        Cliente.setBackground(new java.awt.Color(64, 170, 173));
        Cliente.setText("Clientes");
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });
        PanelOpciones.add(Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clientes.png"))); // NOI18N
        PanelOpciones.add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 120, -1));

        Fondo.add(PanelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 640, 410));

        etiquetaBienvenida.setFont(new java.awt.Font("Yu Gothic", 1, 26)); // NOI18N
        etiquetaBienvenida.setForeground(new java.awt.Color(34, 35, 34));
        etiquetaBienvenida.setText("Bienvenido Admin.getNombre()");
        etiquetaBienvenida.setMaximumSize(new java.awt.Dimension(402, 43));
        etiquetaBienvenida.setMinimumSize(new java.awt.Dimension(402, 43));
        etiquetaBienvenida.setPreferredSize(new java.awt.Dimension(402, 43));
        Fondo.add(etiquetaBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 400, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo_olva 4.0.png"))); // NOI18N
        fondo.setText("jLabel1");
        Fondo.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInventarioAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInventarioAgenciaActionPerformed
        FrmInventarioAgencia fi = new FrmInventarioAgencia();
        
    }//GEN-LAST:event_botonInventarioAgenciaActionPerformed

    private void botonSeguimientoEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeguimientoEnvioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSeguimientoEnvioActionPerformed

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
        //FrmDatosCliente tablaClientes= new FrmDatosCliente();
        //tablaClientes.setVisible(true);
       
            new FrmDatosCliente().setVisible(true);
        
        //this.dispose();
    }//GEN-LAST:event_ClienteActionPerformed

    private void botonConsularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsularActionPerformed

        String codigoCliente = JOptionPane.showInputDialog("Digite el codigo del cliente");
        
        
        if(OlvaCourier.clientes.buscarXCodigoCliente(codigoCliente)!=null){
            OlvaCourier.clienteActual = OlvaCourier.clientes.buscarXCodigoCliente(codigoCliente);
            String codigo=JOptionPane.showInputDialog("Digite el codigo de la boleta");
            if(OlvaCourier.clienteActual.getListaBoletas().buscarXCodigoCliente(codigo)!=null){
                OlvaCourier.boletaActual = OlvaCourier.clienteActual.getListaBoletas().getBoleta(Integer.valueOf(codigo));
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro la boleta");
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se encontro el cliente");
        }
        
        
        
    }//GEN-LAST:event_botonConsularActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bienvenida;
    private javax.swing.JButton Cliente;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel PanelOpciones;
    private javax.swing.JButton botonConsular;
    private javax.swing.JButton botonInventarioAgencia;
    private javax.swing.JButton botonSeguimientoEnvio;
    private javax.swing.JLabel cliente;
    private javax.swing.JLabel consulta;
    private javax.swing.JLabel etiquetaBienvenida;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel historial;
    private javax.swing.JLabel inventario;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
