/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Pedido;
import Sistema.OlvaCourier;
import static Vista.FrmRegistroProducto.RegistrarPedidos2;
import static Vista.FrmRegistroProducto.RegistrarPedidosBD;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */public class FrmBoletaLlenar extends javax.swing.JFrame {

    /**
     * Creates new form FrmBoleta
     */
    public FrmBoletaLlenar() {
        initComponents();
        //Uso de los atributos de la boletaActual para mostrar en el FrmBoletaLlenar
        respuestaOrigen.setText(OlvaCourier.boletaActual.getAgenciaInicial().getUbicacion());
        respuestaDestino.setText(OlvaCourier.boletaActual.getAgenciaFinal().getUbicacion());
        respuestaCliente.setText(OlvaCourier.clienteActual.getNombres()+" "+OlvaCourier.clienteActual.getApellidos());
        respuestaDNI.setText(String.valueOf(OlvaCourier.clienteActual.getCodigo()));
        respuestaFechaEmision.setText(Calendar.getInstance().getTime().toLocaleString());
        respuestaFechaLlegada.setText(OlvaCourier.boletaActual.getFechadeEntrega().getTime().toLocaleString());
        respuestaValorTotal.setText(String.valueOf(OlvaCourier.boletaActual.getImporteTotal()));
        respuestaIGV.setText(String.valueOf(OlvaCourier.boletaActual.getIGV()));
        respuestaTotal.setText(String.valueOf(OlvaCourier.boletaActual.getTotal()));
        respuestaNroBoleta.setText(String.valueOf(OlvaCourier.boletaActual.getCodigo()));
        
        llenarTabla();
        
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void llenarTabla(){
        String matriz[][] = new String[5][3];
        
        for(int i=0;i<5;i++){
            Pedido pe = (Pedido) OlvaCourier.boletaActual.getListaPedidos().getXPos(i);
            if(pe.getProducto().getNombreProducto()!=""){
                matriz[i][0]=String.valueOf(pe.getCodigo());
                matriz[i][1]=String.valueOf(pe.getProducto().getNombreProducto());
                matriz[i][2]=String.valueOf(pe.getValor());
                tabla.setValueAt(matriz[i][0], i, 0);
                tabla.setValueAt(matriz[i][1], i, 1);
                tabla.setValueAt(matriz[i][2], i, 2);
            }else{
                Pedido.codigoPedido--;
            }
            
        }
        
    }
    
    public void LlenarBoletaBD(){
        try {
                        CallableStatement entrada = Conexion.Conexion.getConexion().prepareCall("{Call EntradaBoleta(?,?,?,?,?,?,?,?,?,?)}");
                        entrada.setString(1, String.valueOf(OlvaCourier.boletaActual.getCodigo()));
                        entrada.setString(2, Calendar.getInstance().getTime().toString());
                        entrada.setString(3, OlvaCourier.boletaActual.getFechadeEntrega().getTime().toString());
                        entrada.setString(4, OlvaCourier.boletaActual.getAgenciaInicial().getUbicacion());
                        entrada.setString(5, OlvaCourier.boletaActual.getAgenciaFinal().getUbicacion());
                        entrada.setDouble(6, OlvaCourier.boletaActual.getImporteTotal());
                        entrada.setDouble(7, OlvaCourier.boletaActual.getIGV());
                        entrada.setDouble(8, OlvaCourier.boletaActual.getTotal());
                        entrada.setString(9, OlvaCourier.boletaActual.getEstado());
                        entrada.setString(10, OlvaCourier.boletaActual.getPropietarioDNI());
                        entrada.execute();
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(FrmRegistroProducto.class.getName()).log(Level.SEVERE, null, ex);
                    }
        
         try{
            PreparedStatement pps = Conexion.Conexion.getConexion().prepareStatement("update Pedido set CodigoB = " + OlvaCourier.boletaActual.getCodigo() + "where CodigoB is null" );
            pps.executeUpdate();
        }
        catch(SQLException e){           
        }
         
          try{
            PreparedStatement pps = Conexion.Conexion.getConexion().prepareStatement("Update Clientes set CodigoA = (select codigo from Administrador INNER JOIN Boleta ON Boleta.AgenciaI = Administrador.agencia where AgenciaI = '" + OlvaCourier.boletaActual.getAgenciaInicial().getUbicacion() + "' Group by codigo) where codigo = '" + OlvaCourier.clienteActual.getCodigo() + "'");
            pps.executeUpdate();
        }
        catch(SQLException e){           
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
        tabla = new javax.swing.JTable();
        botonAceptar = new javax.swing.JButton();
        etiquetaNroBoleta = new javax.swing.JLabel();
        respuestaNroBoleta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fondo.setLayout(new java.awt.BorderLayout());

        Header.setBackground(new java.awt.Color(64, 170, 173));

        TituloBoleta.setFont(new java.awt.Font("Yu Gothic", 1, 26)); // NOI18N
        TituloBoleta.setForeground(new java.awt.Color(34, 35, 34));
        TituloBoleta.setText("Boleta");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(TituloBoleta)
                .addContainerGap(306, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(TituloBoleta)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        Fondo.add(Header, java.awt.BorderLayout.NORTH);

        etiquetaFechaLlegada.setBackground(new java.awt.Color(64, 170, 173));

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

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabla);

        botonAceptar.setText("Acepto");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        etiquetaNroBoleta.setText("Nro Boleta: ");

        javax.swing.GroupLayout etiquetaFechaLlegadaLayout = new javax.swing.GroupLayout(etiquetaFechaLlegada);
        etiquetaFechaLlegada.setLayout(etiquetaFechaLlegadaLayout);
        etiquetaFechaLlegadaLayout.setHorizontalGroup(
            etiquetaFechaLlegadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(etiquetaFechaLlegadaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(etiquetaFechaLlegadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonAceptar)
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
                                .addComponent(respuestaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(etiquetaFechaLlegadaLayout.createSequentialGroup()
                                    .addGroup(etiquetaFechaLlegadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(etiquetaFechaLlegadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(respuestaFechaLlegada, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(respuestaFechaEmision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(respuestaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(64, 64, 64)
                                    .addGroup(etiquetaFechaLlegadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(etiquetaFechaLlegadaLayout.createSequentialGroup()
                                            .addComponent(etiquetaNroBoleta)
                                            .addGap(18, 18, 18)
                                            .addComponent(respuestaNroBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(etiquetaFechaLlegadaLayout.createSequentialGroup()
                                            .addComponent(etiquetaCliente)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(respuestaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(etiquetaFechaLlegadaLayout.createSequentialGroup()
                                            .addComponent(etiquetaDNI)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(respuestaDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(respuestaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(respuestaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        etiquetaFechaLlegadaLayout.setVerticalGroup(
            etiquetaFechaLlegadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(etiquetaFechaLlegadaLayout.createSequentialGroup()
                .addGroup(etiquetaFechaLlegadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(etiquetaFechaLlegadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(etiquetaFechaLlegadaLayout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(etiquetaFechaLlegadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(etiquetaCliente)
                                .addComponent(etiquetaFechaEmision)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, etiquetaFechaLlegadaLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(respuestaFechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(respuestaCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(respuestaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(etiquetaFechaLlegadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etiquetaNroBoleta)
                        .addComponent(respuestaNroBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(botonAceptar)
                .addGap(68, 68, 68))
        );

        Fondo.add(etiquetaFechaLlegada, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
       int input = JOptionPane.showConfirmDialog(null, "¿Estás seguro de los cambios establecidos?");
        // 0=yes, 1=no, 2=cancel
       if(input==0){
           RegistrarPedidosBD();
           RegistrarPedidos2();
           LlenarBoletaBD();
           
           //Guarda la boleta creada al cliente que ha iniciado sesion
            OlvaCourier.clienteActual.getListaBoletas().insertarNodoPorFinal(OlvaCourier.boletaActual);

            //System.out.println(OlvaCourier.clienteActual.getListaBoletas().getBoletaXPos(0).getListaPedidos().getPedidoXPos(0).getProducto().getNombreProducto()); Funciona
            //asegurar que el cliente actual guarde la informacion donde se comenzo
            OlvaCourier.boletas.insertarNodoPorFinal(OlvaCourier.boletaActual);
            
            //Ahora tenemos que guardar todo en el cliente usado, porque sigue en el borrador que es Cliente actual
            
            OlvaCourier.clientes.actualizarCliente(OlvaCourier.clienteActual);
            
         
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
            java.util.logging.Logger.getLogger(FrmBoletaLlenar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBoletaLlenar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBoletaLlenar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBoletaLlenar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBoletaLlenar().setVisible(true);
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
    private javax.swing.JLabel etiquetaNroBoleta;
    private javax.swing.JLabel etiquetaOrigen;
    private javax.swing.JLabel etiquetaTotal;
    private javax.swing.JLabel etiquetaValorTotal;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel respuestaCliente;
    private javax.swing.JLabel respuestaDNI;
    private javax.swing.JLabel respuestaDestino;
    private javax.swing.JLabel respuestaFechaEmision;
    private javax.swing.JLabel respuestaFechaLlegada;
    private javax.swing.JLabel respuestaIGV;
    private javax.swing.JLabel respuestaNroBoleta;
    private javax.swing.JLabel respuestaOrigen;
    private javax.swing.JLabel respuestaTotal;
    private javax.swing.JLabel respuestaValorTotal;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
