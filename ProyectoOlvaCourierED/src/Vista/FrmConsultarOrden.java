/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Sistema.OlvaCourier;

/**
 *
 * @author Alex
 */
public class FrmConsultarOrden extends javax.swing.JFrame {

    /**
     * Creates new form RegistroEnvio
     */
    public FrmConsultarOrden() {
        initComponents();
        llenarTabla();
        respuestaNroBoleta.setText(String.valueOf(OlvaCourier.boletaActual.getCodigo()));
        respuestaEstado.setText(OlvaCourier.boletaActual.getEstado());
        etiquetaNombre.setText(OlvaCourier.clienteActual.getNombres()+OlvaCourier.clienteActual.getApellidos());
        setVisible(true);
    }
    
    public void llenarTabla(){
        String matriz[][] = new String[5][2];
        
        for(int i=0;i<5;i++){
            if(OlvaCourier.boletaActual.getListaPedidos().getPedidoXPos(i).getProducto().getNombreProducto()!=""){
                matriz[i][0]=String.valueOf(OlvaCourier.boletaActual.getListaPedidos().getPedidoXPos(i).getCodigo());
                matriz[i][1]=String.valueOf(OlvaCourier.boletaActual.getListaPedidos().getPedidoXPos(i).getProducto().getNombreProducto());
                Tabla.setValueAt(matriz[i][0], i, 0);
                Tabla.setValueAt(matriz[i][1], i, 1);
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

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        fondo = new javax.swing.JPanel();
        Body = new javax.swing.JPanel();
        etiquetaNroBoleta = new javax.swing.JLabel();
        respuestaNroBoleta = new javax.swing.JLabel();
        respuestaEstado = new javax.swing.JLabel();
        etiquetaNroBoleta2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Header = new javax.swing.JPanel();
        TituloRegistroEnvio = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaHora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setLayout(new java.awt.BorderLayout());

        Body.setBackground(new java.awt.Color(64, 170, 173));

        etiquetaNroBoleta.setText("Nro Boleta:");

        respuestaEstado.setText(" ");

        etiquetaNroBoleta2.setText("Estado:");

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo Pedido", "Nombre Producto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
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
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaNroBoleta)
                            .addComponent(etiquetaNroBoleta2))
                        .addGap(18, 18, 18)
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(respuestaNroBoleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(respuestaEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)))
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        BodyLayout.setVerticalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNroBoleta)
                    .addComponent(respuestaNroBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(respuestaEstado)
                    .addComponent(etiquetaNroBoleta2))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        fondo.add(Body, java.awt.BorderLayout.CENTER);

        Header.setBackground(new java.awt.Color(64, 170, 173));

        TituloRegistroEnvio.setFont(new java.awt.Font("Yu Gothic UI", 1, 26)); // NOI18N
        TituloRegistroEnvio.setForeground(new java.awt.Color(34, 35, 34));
        TituloRegistroEnvio.setText("Orden");

        etiquetaNombre.setText("Nombre del cliente");

        etiquetaHora.setText("Hora actual");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(TituloRegistroEnvio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(etiquetaNombre)
                .addGap(89, 89, 89)
                .addComponent(etiquetaHora)
                .addGap(100, 100, 100))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombre)
                    .addComponent(etiquetaHora)
                    .addComponent(TituloRegistroEnvio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fondo.add(Header, java.awt.BorderLayout.NORTH);

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
            java.util.logging.Logger.getLogger(FrmConsultarOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConsultarOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConsultarOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConsultarOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConsultarOrden().setVisible(true);
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
    private javax.swing.JLabel etiquetaNroBoleta;
    private javax.swing.JLabel etiquetaNroBoleta2;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JPanel fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel respuestaEstado;
    private javax.swing.JLabel respuestaNroBoleta;
    // End of variables declaration//GEN-END:variables
}
