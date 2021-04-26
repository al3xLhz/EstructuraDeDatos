/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Estructuras.Cola;
import Estructuras.Pila;
import Grafo.DijkstraMapa;
import Sistema.OlvaCourier;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class FrmElegirMapa extends javax.swing.JFrame {
    
    DijkstraMapa miD = new DijkstraMapa(OlvaCourier.miGrafo);
    Pila pilaGeneral;
    
    int auxI;
    int auxF;
    int aux;
    int opc=0;
    int c=0;
    public FrmElegirMapa() {
        initComponents();
        pilaGeneral = new Pila();
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        try{
        auxI=OlvaCourier.boletaActual.getAgenciaInicial().getNumero();
        auxF=OlvaCourier.boletaActual.getAgenciaFinal().getNumero();
        }catch(Exception e){
        //Solo funciona en los no prime    
        }
        
        botonSiguiente.setEnabled(false);
        //Condicional para que aparezca cuando eres admin y no cliente
        if(OlvaCourier.usuarioActual.getTipoFuncion()==1){ //Cliente
            botonVerInventarioAgencias.setVisible(false);
            etiquetaOrigenEstablecido.setVisible(false);
            etiquetaDestinoEstablecido.setVisible(false);
            rptaDestinoEstablecido.setVisible(false);
            rptaOrigenEstablecido.setVisible(false);
        }else{ //Admin
            botonVerInventarioAgencias.setVisible(true);
            botonAplicar.setText("Añadir");
            etiquetaOrigenEstablecido.setVisible(true);
            etiquetaDestinoEstablecido.setVisible(true);
            rptaDestinoEstablecido.setVisible(true);
            rptaOrigenEstablecido.setVisible(true);
            botonSiguiente.setText("Finalizar");
            rptaOrigenEstablecido.setText(OlvaCourier.boletaActual.getAgenciaInicial().getUbicacion());
            rptaDestinoEstablecido.setText(OlvaCourier.boletaActual.getAgenciaFinal().getUbicacion());
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
        etiquetaOrigenEstablecido = new javax.swing.JLabel();
        rptaOrigenEstablecido = new javax.swing.JLabel();
        rptaDestinoEstablecido = new javax.swing.JLabel();
        etiquetaDestinoEstablecido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
            .addGap(0, 1090, Short.MAX_VALUE)
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
        panelLateralDerecho.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccion de Agencias", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        panelLateralDerecho.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        comboOrigen.setFont(new java.awt.Font("Yu Gothic UI", 0, 13)); // NOI18N
        comboOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amazonas", "Ancash", "Apurimac", "Arequipa", "Ayacucho", "Cajamarca", "Cusco", "Huancavelica", "Huanuco", "Ica", "Junin", "La Libertad", "Lambayeque", "Lima", "Loreto", "Madre de Dios", "Moquegua", "Pasco", "Piura", "Puno", "San Martin", "Tacna", "Tumbes", "Ucayali" }));
        comboOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOrigenActionPerformed(evt);
            }
        });

        comboDestino.setFont(new java.awt.Font("Yu Gothic UI", 0, 13)); // NOI18N
        comboDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amazonas", "Ancash", "Apurimac", "Arequipa", "Ayacucho", "Cajamarca", "Cusco", "Huancavelica", "Huanuco", "Ica", "Junin", "La Libertad", "Lambayeque", "Lima", "Loreto", "Madre de Dios", "Moquegua", "Pasco", "Piura", "Puno", "San Martin", "Tacna", "Tumbes", "Ucayali" }));
        comboDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDestinoActionPerformed(evt);
            }
        });

        etiquetaDestino.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        etiquetaDestino.setText("Agencia Destino");

        etiquetaAgenciaOrigen.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        etiquetaAgenciaOrigen.setText("Agencia Origen");

        botonSiguiente.setBackground(new java.awt.Color(255, 255, 255));
        botonSiguiente.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        botonSiguiente.setText("Siguiente");
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });

        botonAplicar.setBackground(new java.awt.Color(255, 255, 255));
        botonAplicar.setText("Aplicar");
        botonAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAplicarActionPerformed(evt);
            }
        });

        botonVerInventarioAgencias.setBackground(new java.awt.Color(255, 255, 255));
        botonVerInventarioAgencias.setText("Ver inventario de agencias");
        botonVerInventarioAgencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerInventarioAgenciasActionPerformed(evt);
            }
        });

        etiquetaOrigenEstablecido.setText("Origen establecido: ");

        etiquetaDestinoEstablecido.setText("Destino establecido: ");

        javax.swing.GroupLayout panelLateralDerechoLayout = new javax.swing.GroupLayout(panelLateralDerecho);
        panelLateralDerecho.setLayout(panelLateralDerechoLayout);
        panelLateralDerechoLayout.setHorizontalGroup(
            panelLateralDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLateralDerechoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelLateralDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLateralDerechoLayout.createSequentialGroup()
                        .addComponent(botonSiguiente)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLateralDerechoLayout.createSequentialGroup()
                        .addComponent(botonVerInventarioAgencias)
                        .addGap(52, 52, 52))))
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
                        .addComponent(botonAplicar))
                    .addGroup(panelLateralDerechoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(panelLateralDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLateralDerechoLayout.createSequentialGroup()
                                .addComponent(etiquetaDestinoEstablecido)
                                .addGap(18, 18, 18)
                                .addComponent(rptaDestinoEstablecido, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLateralDerechoLayout.createSequentialGroup()
                                .addComponent(etiquetaOrigenEstablecido)
                                .addGap(18, 18, 18)
                                .addComponent(rptaOrigenEstablecido, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addGroup(panelLateralDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaOrigenEstablecido)
                    .addComponent(rptaOrigenEstablecido, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLateralDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaDestinoEstablecido)
                    .addComponent(rptaDestinoEstablecido, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
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

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed

        int input = JOptionPane.showConfirmDialog(null, "¿Estás seguro de los cambios establecidos?");
        // 0=yes, 1=no, 2=cancel
        if(input==0){
            if(OlvaCourier.usuarioActual.getTipoFuncion()==1){
                try{
                    OlvaCourier.boletaActual.setAgenciaInicial(OlvaCourier.agencias.getAgencia(comboOrigen.getSelectedItem().toString()));//4019
                    OlvaCourier.boletaActual.setAgenciaFinal(OlvaCourier.agencias.getAgencia(comboDestino.getSelectedItem().toString()));

                    FrmBoletaLlenar boleta = new FrmBoletaLlenar();
                    this.dispose();
                }catch(Exception e){}
                
            }else if(OlvaCourier.usuarioActual.getTipoFuncion()==2){
                //guardar datos
                if(OlvaCourier.boletaActual.getAgenciaFinal().getNumero() == auxF){
                    OlvaCourier.boletaActual.setCamino(pilaGeneral.ConvertirAString());
                    OlvaCourier.clientes.buscar(OlvaCourier.clienteActual).getListaBoletas().getBoleta(OlvaCourier.boletaActual.getCodigoBoleta()).actualizarDatos(OlvaCourier.boletaActual);
                    System.out.println(OlvaCourier.boletaActual.getCamino());
                    FrmAdministrador fa = new FrmAdministrador();
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null,"Todavia no llegas al destino final establecido");
                }
                
            }
            
        }
        

    }//GEN-LAST:event_botonSiguienteActionPerformed

    private void MapaImagenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MapaImagenMousePressed
        //System.out.println(evt.getX());
        //System.out.println(evt.getY());
    }//GEN-LAST:event_MapaImagenMousePressed

    private void botonAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAplicarActionPerformed
        
        
        if(OlvaCourier.usuarioActual.getTipoFuncion()==1){
            miD = new DijkstraMapa(OlvaCourier.miGrafo);
            if(comboDestino.getSelectedItem().equals(comboOrigen.getSelectedItem())){
            JOptionPane.showMessageDialog(null, "No puedes colocar el mismo ORIGEN Y DESTINO ");
            }else{
            
            miD.setNodoInicio(comboOrigen.getSelectedIndex());
            miD.setNodoFin(comboDestino.getSelectedIndex());
            miD.dijkstra();
            miD.empilar();
            pilaGeneral.agregarPilaDebajoDeLaPila(miD.getPila());
            
            System.out.println("Mostrando Recorrido ");miD.getPila().Recorrido();
            opc = 1;
            repaint();
            /*Notacion adicional cuando solo quieras ejecutar FrmEligirMapa*/
            try{
                OlvaCourier.boletaActual.getFechadeEntrega().add(Calendar.DAY_OF_YEAR,(miD.getPila().getLongitud()-1));
            }catch(Exception e){
                System.out.println("Para que funcione tiene que ejecutarse desde la app, porque no se declaro la boleta");
            }
            
            
            botonSiguiente.setEnabled(true);
            }
            
        }else if(OlvaCourier.usuarioActual.getTipoFuncion()==2){
            
            if(comboDestino.getSelectedItem().equals(comboOrigen.getSelectedItem())){
            JOptionPane.showMessageDialog(null, "No puedes colocar el mismo ORIGEN Y DESTINO ");
            }else{
                if(comboOrigen.getSelectedIndex()==auxI){
                    miD.setNodoInicio(comboOrigen.getSelectedIndex());
                    miD.setNodoFin(comboDestino.getSelectedIndex());
                    auxF=comboDestino.getSelectedIndex();
                    miD.dijkstra();
                    miD.empilar();
                    pilaGeneral.agregarPilaDebajoDeLaPila(miD.getPila());
                    auxI=comboDestino.getSelectedIndex();
                    opc = 1;
                    repaint();
                    botonSiguiente.setEnabled(true);
                }else{
                    JOptionPane.showMessageDialog(null, "El punto inicial no es igual al final del tramo anterior ");
                }
            
            }
            botonSiguiente.setEnabled(true);
            
        }
         
        
    }//GEN-LAST:event_botonAplicarActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        
    }//GEN-LAST:event_formMousePressed

    private void comboDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboDestinoActionPerformed

    private void botonVerInventarioAgenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerInventarioAgenciasActionPerformed
        FrmInventarioAgencia fi = new FrmInventarioAgencia();
        
    }//GEN-LAST:event_botonVerInventarioAgenciasActionPerformed

    private void comboOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboOrigenActionPerformed

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
        Pila p = new Pila();
        int pos,pos2;
        super.paint(g);
        switch(opc){
            case 0: break;
            case 1: p.copiarDatos(pilaGeneral);
                    while(!p.pilaVacia()){
                        pos = (int) p.Desempilar();
                        Graphics2D g2 = (Graphics2D) g;
                        g2.fillOval(OlvaCourier.miGrafo.getCoordeX(pos), OlvaCourier.miGrafo.getCoordeY(pos), 15  , 15);g2.setStroke(new BasicStroke(3));
                        g2.setColor(Color.red);
                        if(!p.pilaVacia()){
                            pos2= (int)p.getCima();
                            g2.fillOval(OlvaCourier.miGrafo.getCoordeX(pos2), OlvaCourier.miGrafo.getCoordeY(pos2), 15  , 15);
                            g2.setColor(Color.red);
                            g2.drawLine(OlvaCourier.miGrafo.getCoordeX(pos)+6, OlvaCourier.miGrafo.getCoordeY(pos)+6, OlvaCourier.miGrafo.getCoordeX(pos2)+6, OlvaCourier.miGrafo.getCoordeY(pos2)+6);
                            g2.setStroke(new BasicStroke(3));
                        }
                    };break;
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
    private javax.swing.JLabel etiquetaDestinoEstablecido;
    private javax.swing.JLabel etiquetaOrigenEstablecido;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel panelLateralDerecho;
    private javax.swing.JPanel panelMapa;
    private javax.swing.JLabel rptaDestinoEstablecido;
    private javax.swing.JLabel rptaOrigenEstablecido;
    // End of variables declaration//GEN-END:variables
}
