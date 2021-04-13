/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Grafo.GrafoMapa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex
 */
public class FrmElegirMapa extends javax.swing.JFrame {

    /**
     * Creates new form FrmElegirMapa
     */
    public FrmElegirMapa() {
        initComponents();
    }

    public void dibujarMapa(){
        
        
       
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        Head = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Body = new javax.swing.JPanel();
        panelMapa = new javax.swing.JPanel();
        MapaImagen = new javax.swing.JLabel();
        Foot = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        LateralDerecho = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("MAPA");

        javax.swing.GroupLayout HeadLayout = new javax.swing.GroupLayout(Head);
        Head.setLayout(HeadLayout);
        HeadLayout.setHorizontalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1)
                .addContainerGap(811, Short.MAX_VALUE))
        );
        HeadLayout.setVerticalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        fondo.add(Head, java.awt.BorderLayout.NORTH);

        Body.setBackground(new java.awt.Color(255, 51, 51));
        Body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMapa.setBackground(new java.awt.Color(255, 255, 204));
        panelMapa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        MapaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MAPAPERU.png"))); // NOI18N

        javax.swing.GroupLayout panelMapaLayout = new javax.swing.GroupLayout(panelMapa);
        panelMapa.setLayout(panelMapaLayout);
        panelMapaLayout.setHorizontalGroup(
            panelMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMapaLayout.createSequentialGroup()
                .addComponent(MapaImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMapaLayout.setVerticalGroup(
            panelMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MapaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 660, Short.MAX_VALUE)
        );

        Body.add(panelMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 580, 660));

        fondo.add(Body, java.awt.BorderLayout.CENTER);

        jButton1.setText("jButton1");

        javax.swing.GroupLayout FootLayout = new javax.swing.GroupLayout(Foot);
        Foot.setLayout(FootLayout);
        FootLayout.setHorizontalGroup(
            FootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FootLayout.createSequentialGroup()
                .addGap(471, 471, 471)
                .addComponent(jButton1)
                .addContainerGap(391, Short.MAX_VALUE))
        );
        FootLayout.setVerticalGroup(
            FootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FootLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        fondo.add(Foot, java.awt.BorderLayout.SOUTH);

        javax.swing.GroupLayout LateralDerechoLayout = new javax.swing.GroupLayout(LateralDerecho);
        LateralDerecho.setLayout(LateralDerechoLayout);
        LateralDerechoLayout.setHorizontalGroup(
            LateralDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 187, Short.MAX_VALUE)
        );
        LateralDerechoLayout.setVerticalGroup(
            LateralDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 704, Short.MAX_VALUE)
        );

        fondo.add(LateralDerecho, java.awt.BorderLayout.EAST);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmElegirMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmElegirMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmElegirMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmElegirMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmElegirMapa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JPanel Foot;
    private javax.swing.JPanel Head;
    private javax.swing.JPanel LateralDerecho;
    private javax.swing.JLabel MapaImagen;
    private javax.swing.JPanel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelMapa;
    // End of variables declaration//GEN-END:variables
}