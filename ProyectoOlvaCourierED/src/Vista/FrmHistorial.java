/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Boleta;
import Sistema.OlvaCourier;
import java.util.Calendar;

/**
 *
 * @author Alex
 */
public class FrmHistorial extends javax.swing.JFrame {

    /**
     * Creates new form FrmHistorial
     */
    public FrmHistorial() {
        initComponents();
        llenarTabla();
        etiquetaNombre.setText(OlvaCourier.clienteActual.getNombres()+OlvaCourier.clienteActual.getApellidos());
        etiquetaHora.setText(Calendar.getInstance().getTime().toString());
        setVisible(true);
    }

    public void llenarTabla(){
        
        String matriz[][] = new String[OlvaCourier.clienteActual.getListaBoletas().getTamaño()][8];//Que me devulva la cantidad max de la lista de boletas
        
        int n=1;
        for(int i=0;i<OlvaCourier.clienteActual.getListaBoletas().getTamaño();i++){
            Boleta b = (Boleta) OlvaCourier.clienteActual.getListaBoletas().getXPos(i);
            
            if(b!=null){
                
                matriz[i][0]=String.valueOf(n);
                matriz[i][1]=String.valueOf(b.getCodigo());
                matriz[i][2]=String.valueOf(b.getAgenciaInicial().getUbicacion());
                matriz[i][3]=String.valueOf(b.getAgenciaFinal().getUbicacion());
                matriz[i][4]=String.valueOf(b.getEstado());
                matriz[i][5]=String.valueOf(b.getFechaEmision().getTime().toString());
                matriz[i][6]=String.valueOf(b.getFechadeEntrega().getTime().toString());
                matriz[i][7]=String.valueOf(b.getTotal());
                Tabla.setValueAt(matriz[i][0], i, 0);
                Tabla.setValueAt(matriz[i][1], i, 1);
                Tabla.setValueAt(matriz[i][2], i, 2);
                Tabla.setValueAt(matriz[i][3], i, 3);
                Tabla.setValueAt(matriz[i][4], i, 4);
                Tabla.setValueAt(matriz[i][5], i, 5);
                Tabla.setValueAt(matriz[i][6], i, 6);
                Tabla.setValueAt(matriz[i][7], i, 7);
                n++;
            }
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        TituloRegistroEnvio = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaHora = new javax.swing.JLabel();
        Body = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setLayout(new java.awt.BorderLayout());

        Header.setBackground(new java.awt.Color(64, 170, 173));

        TituloRegistroEnvio.setFont(new java.awt.Font("Yu Gothic UI", 1, 26)); // NOI18N
        TituloRegistroEnvio.setForeground(new java.awt.Color(34, 35, 34));
        TituloRegistroEnvio.setText("HISTORIAL");

        etiquetaNombre.setText("Nombre del cliente");

        etiquetaHora.setText("Hora actual");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(TituloRegistroEnvio)
                .addGap(212, 212, 212)
                .addComponent(etiquetaNombre)
                .addGap(152, 152, 152)
                .addComponent(etiquetaHora)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TituloRegistroEnvio)
                    .addComponent(etiquetaNombre)
                    .addComponent(etiquetaHora))
                .addGap(16, 16, 16))
        );

        fondo.add(Header, java.awt.BorderLayout.NORTH);

        Body.setBackground(new java.awt.Color(64, 170, 173));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N°", "Nro Boleta", "Agencia Inicial", "Agencia Final", "Estado", "Fecha Emision", "Fecha Llegada", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla);

        jButton1.setText("Ordenar por codigo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jButton1))
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        BodyLayout.setVerticalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        fondo.add(Body, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmHistorial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JPanel Header;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel TituloRegistroEnvio;
    private javax.swing.JLabel etiquetaHora;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JPanel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
