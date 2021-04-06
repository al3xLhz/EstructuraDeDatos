/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

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
        setVisible(true);
        etiquetaNombre.setText(OlvaCourier.clienteActual.getNombres()+OlvaCourier.clienteActual.getApellidos());
        etiquetaHora.setText(Calendar.getInstance().getTime().toString());
    }

    public void llenarTabla(){
        String matriz[][] = new String[OlvaCourier.clienteActual.getListaBoletas().cantidadBoletas()+1][7];//Que me devulva la cantidad max de la lista de boletas
        for(int i=0;i<OlvaCourier.clienteActual.getListaBoletas().cantidadBoletas()+1;i++){
            if(OlvaCourier.clienteActual.getListaBoletas().getBoletaXPos(i)!=null){
                matriz[i][0]=String.valueOf(OlvaCourier.clienteActual.getListaBoletas().getBoletaXPos(i).getCodigo());
                matriz[i][1]=String.valueOf(OlvaCourier.clienteActual.getListaBoletas().getBoletaXPos(i).getAgenciaInicial().getUbicacion());
                matriz[i][2]=String.valueOf(OlvaCourier.clienteActual.getListaBoletas().getBoletaXPos(i).getAgenciaFinal().getUbicacion());
                matriz[i][3]=String.valueOf(OlvaCourier.clienteActual.getListaBoletas().getBoletaXPos(i).getEstado());
                matriz[i][4]=String.valueOf(OlvaCourier.clienteActual.getListaBoletas().getBoletaXPos(i).getFechaEmision().getTime().toString());
                matriz[i][5]=String.valueOf(OlvaCourier.clienteActual.getListaBoletas().getBoletaXPos(i).getFechadeEntrega().getTime().toString());
                matriz[i][6]=String.valueOf(OlvaCourier.clienteActual.getListaBoletas().getBoletaXPos(i).getTotal());
                Tabla.setValueAt(matriz[i][0], i, 0);
                Tabla.setValueAt(matriz[i][1], i, 1);
                Tabla.setValueAt(matriz[i][2], i, 2);
                Tabla.setValueAt(matriz[i][3], i, 3);
                Tabla.setValueAt(matriz[i][4], i, 4);
                Tabla.setValueAt(matriz[i][5], i, 5);
                Tabla.setValueAt(matriz[i][6], i, 6);
            }
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(etiquetaNombre)
                .addGap(135, 135, 135)
                .addComponent(etiquetaHora)
                .addGap(111, 111, 111))
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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nro Boleta", "Agencia Inicial", "Agencia Final", "Estado", "Fecha Emision", "Fecha Llegada", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla);

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        BodyLayout.setVerticalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
