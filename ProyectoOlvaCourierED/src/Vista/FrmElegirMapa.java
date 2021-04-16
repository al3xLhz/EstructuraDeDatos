/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Grafo.DijkstraMapa;
import Sistema.OlvaCourier;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Calendar;
import javax.sound.midi.MidiEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class FrmElegirMapa extends javax.swing.JFrame {
    
    DijkstraMapa miD = new DijkstraMapa(OlvaCourier.miGrafo);
    
    int opc=0;
    int c=0;
    public FrmElegirMapa() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        botonSiguiente.setEnabled(false);
        //Condicional para que aparezca cuando eres admin y no cliente
        if(OlvaCourier.usuarioActual.getTipoFuncion()==1){
            botonVerInventarioAgencias.setVisible(false);
        }else{
            botonVerInventarioAgencias.setVisible(true);
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        Head = new javax.swing.JPanel();
        LateralIzquierdo = new javax.swing.JPanel();
        panelMapa = new javax.swing.JPanel();
        MapaImagen = new javax.swing.JLabel();
        LateralDerecho = new javax.swing.JPanel();
        panelLateralDerecho = new javax.swing.JPanel();
        comboOrigen = new javax.swing.JComboBox<>();
        comboDestino = new javax.swing.JComboBox<>();
        etiquetaDestino = new javax.swing.JLabel();
        etiquetaAgenciaOrigen = new javax.swing.JLabel();
        botonSiguiente = new javax.swing.JButton();
        botonAplicar = new javax.swing.JButton();
        botonVerInventarioAgencias = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 800));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        fondo.setBackground(new java.awt.Color(34, 44, 61));
        fondo.setLayout(new java.awt.BorderLayout());

        Head.setBackground(new java.awt.Color(34, 44, 61));

        javax.swing.GroupLayout HeadLayout = new javax.swing.GroupLayout(Head);
        Head.setLayout(HeadLayout);
        HeadLayout.setHorizontalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1055, Short.MAX_VALUE)
        );
        HeadLayout.setVerticalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        fondo.add(Head, java.awt.BorderLayout.NORTH);

        LateralIzquierdo.setBackground(new java.awt.Color(34, 44, 61));
        LateralIzquierdo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMapa.setBackground(new java.awt.Color(34, 44, 61));

        MapaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MAPAPERU.png"))); // NOI18N
        MapaImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MapaImagenMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelMapaLayout = new javax.swing.GroupLayout(panelMapa);
        panelMapa.setLayout(panelMapaLayout);
        panelMapaLayout.setHorizontalGroup(
            panelMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMapaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MapaImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        panelMapaLayout.setVerticalGroup(
            panelMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMapaLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(MapaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        LateralIzquierdo.add(panelMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 580, 660));

        fondo.add(LateralIzquierdo, java.awt.BorderLayout.WEST);

        LateralDerecho.setBackground(new java.awt.Color(34, 44, 61));

        panelLateralDerecho.setBackground(new java.awt.Color(255, 255, 255));
        panelLateralDerecho.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccion de Agencias", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        panelLateralDerecho.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        comboOrigen.setFont(new java.awt.Font("Yu Gothic UI", 0, 13)); // NOI18N
        comboOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amazonas", "Ancash", "Apurimac", "Arequipa", "Ayacucho", "Cajamarca", "Cusco", "Huancavelica", "Huanuco", "Ica", "Junín", "La Libertad", "Lambayeque", "Lima", "Loreto", "Madre de Dios", "Moquegua", "Pasco", "Piura", "Puno", "San Martín", "Tacna", "Tumbes", "Ucayali" }));
        comboOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOrigenActionPerformed(evt);
            }
        });

        comboDestino.setFont(new java.awt.Font("Yu Gothic UI", 0, 13)); // NOI18N
        comboDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amazonas", "Ancash", "Apurimac", "Arequipa", "Ayacucho", "Cajamarca", "Cusco", "Huancavelica", "Huanuco", "Ica", "Junín", "La Libertad", "Lambayeque", "Lima", "Loreto", "Madre de Dios", "Moquegua", "Pasco", "Piura", "Puno", "San Martín", "Tacna", "Tumbes", "Ucayali" }));
        comboDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDestinoActionPerformed(evt);
            }
        });

        etiquetaDestino.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        etiquetaDestino.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaDestino.setText("Agencia Destino");

        etiquetaAgenciaOrigen.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        etiquetaAgenciaOrigen.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaAgenciaOrigen.setText("Agencia Origen");

        botonSiguiente.setBackground(new java.awt.Color(255, 255, 255));
        botonSiguiente.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        botonSiguiente.setForeground(new java.awt.Color(0, 0, 0));
        botonSiguiente.setText("Siguiente");
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });

        botonAplicar.setBackground(new java.awt.Color(255, 255, 255));
        botonAplicar.setForeground(new java.awt.Color(0, 0, 0));
        botonAplicar.setText("Aplicar");
        botonAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAplicarActionPerformed(evt);
            }
        });

        botonVerInventarioAgencias.setBackground(new java.awt.Color(255, 255, 255));
        botonVerInventarioAgencias.setForeground(new java.awt.Color(0, 0, 0));
        botonVerInventarioAgencias.setText("Ver inventario de agencias");
        botonVerInventarioAgencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerInventarioAgenciasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLateralDerechoLayout = new javax.swing.GroupLayout(panelLateralDerecho);
        panelLateralDerecho.setLayout(panelLateralDerechoLayout);
        panelLateralDerechoLayout.setHorizontalGroup(
            panelLateralDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateralDerechoLayout.createSequentialGroup()
                .addGroup(panelLateralDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLateralDerechoLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(panelLateralDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaAgenciaOrigen)
                            .addComponent(etiquetaDestino))
                        .addGap(34, 34, 34)
                        .addGroup(panelLateralDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLateralDerechoLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(botonAplicar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLateralDerechoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelLateralDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLateralDerechoLayout.createSequentialGroup()
                        .addComponent(botonSiguiente)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLateralDerechoLayout.createSequentialGroup()
                        .addComponent(botonVerInventarioAgencias)
                        .addGap(52, 52, 52))))
        );
        panelLateralDerechoLayout.setVerticalGroup(
            panelLateralDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateralDerechoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelLateralDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaAgenciaOrigen)
                    .addComponent(comboOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLateralDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaDestino)
                    .addComponent(comboDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonAplicar)
                .addGap(80, 80, 80)
                .addComponent(botonVerInventarioAgencias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 267, Short.MAX_VALUE)
                .addComponent(botonSiguiente)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout LateralDerechoLayout = new javax.swing.GroupLayout(LateralDerecho);
        LateralDerecho.setLayout(LateralDerechoLayout);
        LateralDerechoLayout.setHorizontalGroup(
            LateralDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LateralDerechoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(panelLateralDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        LateralDerechoLayout.setVerticalGroup(
            LateralDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LateralDerechoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(panelLateralDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        fondo.add(LateralDerecho, java.awt.BorderLayout.EAST);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboOrigenActionPerformed

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed

        int input = JOptionPane.showConfirmDialog(null, "¿Estás seguro de los cambios establecidos?");
        // 0=yes, 1=no, 2=cancel
        if(input==0){

            OlvaCourier.boletaActual.setAgenciaInicial(OlvaCourier.agencias.getAgencia(comboOrigen.getSelectedItem().toString()));
            OlvaCourier.boletaActual.setAgenciaFinal(OlvaCourier.agencias.getAgencia(comboDestino.getSelectedItem().toString()));

            FrmBoletaLlenar boleta = new FrmBoletaLlenar();
            this.dispose();
        }
        

    }//GEN-LAST:event_botonSiguienteActionPerformed

    private void MapaImagenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MapaImagenMousePressed
        System.out.println(evt.getX());
        System.out.println(evt.getY());
    }//GEN-LAST:event_MapaImagenMousePressed

    private void botonAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAplicarActionPerformed

        if(comboDestino.getSelectedItem().equals(comboOrigen.getSelectedItem())){
            JOptionPane.showMessageDialog(null, "No puedes colocar el mismo ORIGEN Y DESTINO ");
        }else{
            
            miD.setNodoInicio(comboOrigen.getSelectedIndex());
            miD.setNodoFin(comboDestino.getSelectedIndex());
            miD.dijkstra();
            //miD.getNodos();
            miD.empilar();
            /*Notacion adicional cuando solo quieras ejecutar FrmEligirMapa*/
            try{
                OlvaCourier.boletaActual.getFechadeEntrega().add(Calendar.DAY_OF_YEAR,(miD.getPila().getLongitud()-1));
            }catch(Exception e){
                System.out.println("Para que funcione tiene que ejecutarse desde la app, porque no se declaro la boleta");
            }
            
            opc = 1;
            repaint();
            botonSiguiente.setEnabled(true);
        }
    }//GEN-LAST:event_botonAplicarActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        
    }//GEN-LAST:event_formMousePressed

    private void comboDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboDestinoActionPerformed

    private void botonVerInventarioAgenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerInventarioAgenciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVerInventarioAgenciasActionPerformed

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
    
    @Override
    public void paint(Graphics g){
        int pos,pos2;
        super.paint(g);
        switch(opc){
            case 0: break;
            case 1: do{
                        pos = (int)miD.getPila().Desempilar();
                        Graphics2D g2 = (Graphics2D) g;
                        g2.fillOval(OlvaCourier.miGrafo.getCoordeX(pos), OlvaCourier.miGrafo.getCoordeY(pos), 15  , 15);g2.setStroke(new BasicStroke(3));
                        g2.setColor(Color.red);
                        if(!miD.getPila().pilaVacia()){
                            pos2= (int)miD.getPila().getCima();
                            g2.fillOval(OlvaCourier.miGrafo.getCoordeX(pos2), OlvaCourier.miGrafo.getCoordeY(pos2), 15  , 15);
                            g2.setColor(Color.red);
                            g2.drawLine(OlvaCourier.miGrafo.getCoordeX(pos)+6, OlvaCourier.miGrafo.getCoordeY(pos)+6, OlvaCourier.miGrafo.getCoordeX(pos2)+6, OlvaCourier.miGrafo.getCoordeY(pos2)+6);
                            g2.setStroke(new BasicStroke(3));
                        }
                    }while(!miD.getPila().pilaVacia());
            case 2: if(OlvaCourier.agencias.getAgencia("Amazonas").getListaBolestas().listaVacia()){
                    
                    }
                
        }
    }
        
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Head;
    private javax.swing.JPanel LateralDerecho;
    private javax.swing.JPanel LateralIzquierdo;
    private javax.swing.JLabel MapaImagen;
    private javax.swing.JButton botonAplicar;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JButton botonVerInventarioAgencias;
    private javax.swing.JComboBox<String> comboDestino;
    private javax.swing.JComboBox<String> comboOrigen;
    private javax.swing.JLabel etiquetaAgenciaOrigen;
    private javax.swing.JLabel etiquetaDestino;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel panelLateralDerecho;
    private javax.swing.JPanel panelMapa;
    // End of variables declaration//GEN-END:variables
}
