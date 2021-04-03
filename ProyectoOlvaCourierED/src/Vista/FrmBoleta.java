/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class FrmBoleta extends javax.swing.JFrame {

    /**
     * Creates new form FrmBoleta
     */
    public FrmBoleta() {
        initComponents();
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

        Fondo = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        TituloBoleta = new javax.swing.JLabel();
        etiquetaFechaLlegada = new javax.swing.JPanel();
        etiquetaFechaEmision = new javax.swing.JLabel();
        respuestaFechaEmision = new javax.swing.JLabel();
        etiquetaFechaLlegad = new javax.swing.JLabel();
        respuestaFechaLlegada = new javax.swing.JLabel();
        etiquetaOrigen = new javax.swing.JLabel();
        respuestaOrigen = new javax.swing.JLabel();
        etiquetaDestino = new javax.swing.JLabel();
        respuestaDestino = new javax.swing.JLabel();
        etiquetaCliente = new javax.swing.JLabel();
        respuestaCliente = new javax.swing.JLabel();
        etiquetaDNI = new javax.swing.JLabel();
        respuestaDNI = new javax.swing.JLabel();
        etiquetaValorTotal = new javax.swing.JLabel();
        respuestaValorTotal = new javax.swing.JLabel();
        etiquetaIGV = new javax.swing.JLabel();
        respuestaIGV = new javax.swing.JLabel();
        etiquetaTotal = new javax.swing.JLabel();
        respuestaTotal = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TituloBoleta.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        TituloBoleta.setText("Boleta");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TituloBoleta)
                .addGap(319, 319, 319))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(TituloBoleta)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        etiquetaFechaEmision.setText("Fecha Emision:  ");

        etiquetaFechaLlegad.setText("Fecha Llegada:  ");

        etiquetaOrigen.setText("Origen: ");

        etiquetaDestino.setText("Destino: ");

        etiquetaCliente.setText("Cliente:");

        etiquetaDNI.setText("DNI:");

        etiquetaValorTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaValorTotal.setText("Valor Total:");

        etiquetaIGV.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaIGV.setText("IGV:");

        etiquetaTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaTotal.setText("Importe Total:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nombre Producto", "Valor unitario"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        botonAceptar.setText("Acepto");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout etiquetaFechaLlegadaLayout = new javax.swing.GroupLayout(etiquetaFechaLlegada);
        etiquetaFechaLlegada.setLayout(etiquetaFechaLlegadaLayout);
        etiquetaFechaLlegadaLayout.setHorizontalGroup(
            etiquetaFechaLlegadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(etiquetaFechaLlegadaLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(etiquetaFechaLlegadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(etiquetaFechaLlegadaLayout.createSequentialGroup()
                        .addGroup(etiquetaFechaLlegadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etiquetaValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiquetaIGV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiquetaTotal, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(etiquetaFechaLlegadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(respuestaValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(respuestaIGV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(respuestaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(etiquetaFechaLlegadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(etiquetaFechaLlegadaLayout.createSequentialGroup()
                            .addGroup(etiquetaFechaLlegadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(etiquetaFechaLlegadaLayout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addGroup(etiquetaFechaLlegadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(etiquetaFechaEmision)
                                        .addComponent(etiquetaFechaLlegad)))
                                .addComponent(etiquetaOrigen)
                                .addComponent(etiquetaDestino))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(etiquetaFechaLlegadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(etiquetaFechaLlegadaLayout.createSequentialGroup()
                                    .addGroup(etiquetaFechaLlegadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(respuestaFechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(respuestaFechaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(123, 123, 123)
                                    .addGroup(etiquetaFechaLlegadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(etiquetaFechaLlegadaLayout.createSequentialGroup()
                                            .addComponent(etiquetaCliente)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(respuestaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(etiquetaFechaLlegadaLayout.createSequentialGroup()
                                            .addComponent(etiquetaDNI)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(respuestaDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(respuestaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(respuestaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, etiquetaFechaLlegadaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAceptar)
                .addGap(87, 87, 87))
        );
        etiquetaFechaLlegadaLayout.setVerticalGroup(
            etiquetaFechaLlegadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(etiquetaFechaLlegadaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(etiquetaFechaLlegadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(etiquetaFechaLlegadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(respuestaFechaEmision, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(etiquetaFechaLlegadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaCliente)
                            .addComponent(etiquetaFechaEmision)))
                    .addComponent(respuestaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(etiquetaFechaLlegadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(etiquetaFechaLlegadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etiquetaDNI)
                        .addComponent(etiquetaFechaLlegad))
                    .addComponent(respuestaFechaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(respuestaDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(etiquetaFechaLlegadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaOrigen)
                    .addComponent(respuestaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(etiquetaFechaLlegadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaDestino)
                    .addComponent(respuestaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(etiquetaFechaLlegadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(respuestaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(etiquetaFechaLlegadaLayout.createSequentialGroup()
                        .addGroup(etiquetaFechaLlegadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(etiquetaFechaLlegadaLayout.createSequentialGroup()
                                .addGroup(etiquetaFechaLlegadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaValorTotal)
                                    .addComponent(respuestaValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(etiquetaIGV))
                            .addComponent(respuestaIGV, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(etiquetaTotal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(botonAceptar)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaFechaLlegada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(etiquetaFechaLlegada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
       int input = JOptionPane.showConfirmDialog(null, "¿Estás seguro de los cambios establecidos?");
        // 0=yes, 1=no, 2=cancel
       if(input==0){
           FrmCliente cliente = new FrmCliente();
           this.dispose();
       }
    }//GEN-LAST:event_botonAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBoleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel TituloBoleta;
    private javax.swing.JButton botonAceptar;
    private javax.swing.JLabel etiquetaCliente;
    private javax.swing.JLabel etiquetaDNI;
    private javax.swing.JLabel etiquetaDestino;
    private javax.swing.JLabel etiquetaFechaEmision;
    private javax.swing.JLabel etiquetaFechaLlegad;
    private javax.swing.JPanel etiquetaFechaLlegada;
    private javax.swing.JLabel etiquetaIGV;
    private javax.swing.JLabel etiquetaOrigen;
    private javax.swing.JLabel etiquetaTotal;
    private javax.swing.JLabel etiquetaValorTotal;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel respuestaCliente;
    private javax.swing.JLabel respuestaDNI;
    private javax.swing.JLabel respuestaDestino;
    private javax.swing.JLabel respuestaFechaEmision;
    private javax.swing.JLabel respuestaFechaLlegada;
    private javax.swing.JLabel respuestaIGV;
    private javax.swing.JLabel respuestaOrigen;
    private javax.swing.JLabel respuestaTotal;
    private javax.swing.JLabel respuestaValorTotal;
    // End of variables declaration//GEN-END:variables
}
