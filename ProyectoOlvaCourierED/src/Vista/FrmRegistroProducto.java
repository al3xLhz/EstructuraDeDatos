/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Boleta;
import Modelo.Cliente;
import Modelo.Pedido;
import Modelo.Producto;
import Sistema.OlvaCourier;
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
 */
public class FrmRegistroProducto extends javax.swing.JFrame {

    static private Producto p1;
    static private Producto p2;
    static private Producto p3;
    static private Producto p4;
    static private Producto p5;
    
    public FrmRegistroProducto() {
        initComponents();
        etiquetaHora.setText(OlvaCourier.horaActual.getTime().toLocaleString());
        etiquetaNombre.setText("Hola, "+OlvaCourier.clienteActual.getNombres());
        p1 = new Producto("", 0, 0, 0, 0, 0);
        p2 = new Producto("", 0, 0, 0, 0, 0);
        p3 = new Producto("", 0, 0, 0, 0, 0);
        p4 = new Producto("", 0, 0, 0, 0, 0);
        p5 = new Producto("", 0, 0, 0, 0, 0);
        OlvaCourier.boletaActual = new Boleta(null, null, "");
        comprobarVersionPagada(OlvaCourier.clienteActual);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    
    
    public void instanciarValores(Producto p){
        campoNombreProducto.setText(p.getNombreProducto());
        campoPeso.setText(String.valueOf(p.getPeso()));
        campoLargo.setText(String.valueOf(p.getLargo()));
        campoAlto.setText(String.valueOf(p.getAlto()));
        campoAncho.setText(String.valueOf(p.getAncho()));
         
    }
    
    public static void RegistrarProductosBD(){
           if(p1.getNombreProducto()!= ""){
                try {
                        CallableStatement entrada = Conexion.Conexion.getConexion().prepareCall("{Call EntradaProductos(?,?,?,?,?)}");
                        entrada.setString(1, p1.getNombreProducto());
                        entrada.setDouble(2, p1.getPeso());
                        entrada.setDouble(3, p1.getLargo());
                        entrada.setDouble(4, p1.getAlto());
                        entrada.setDouble(5, p1.getAncho());
                        entrada.execute();
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(FrmRegistroProducto.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(p2.getNombreProducto()!= ""){
                    try {
                        CallableStatement entrada = Conexion.Conexion.getConexion().prepareCall("{Call EntradaProductos(?,?,?,?,?)}");
                        entrada.setString(1, p2.getNombreProducto());
                        entrada.setDouble(2, p2.getPeso());
                        entrada.setDouble(3, p2.getLargo());
                        entrada.setDouble(4, p2.getAlto());
                        entrada.setDouble(5, p2.getAncho());
                        entrada.execute();

                    } catch (SQLException ex) {
                        Logger.getLogger(FrmRegistroProducto.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(p3.getNombreProducto()!= ""){
                    try {
                        CallableStatement entrada = Conexion.Conexion.getConexion().prepareCall("{Call EntradaProductos(?,?,?,?,?)}");
                        entrada.setString(1, p3.getNombreProducto());
                        entrada.setDouble(2, p3.getPeso());
                        entrada.setDouble(3, p3.getLargo());
                        entrada.setDouble(4, p3.getAlto());
                        entrada.setDouble(5, p3.getAncho());
                        entrada.execute();

                    } catch (SQLException ex) {
                        Logger.getLogger(FrmRegistroProducto.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(p4.getNombreProducto()!= ""){
                    try {
                        CallableStatement entrada = Conexion.Conexion.getConexion().prepareCall("{Call EntradaProductos(?,?,?,?,?)}");
                        entrada.setString(1, p4.getNombreProducto());
                        entrada.setDouble(2, p4.getPeso());
                        entrada.setDouble(3, p4.getLargo());
                        entrada.setDouble(4, p4.getAlto());
                        entrada.setDouble(5, p4.getAncho());
                        entrada.execute();

                    } catch (SQLException ex) {
                        Logger.getLogger(FrmRegistroProducto.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(p5.getNombreProducto()!= ""){
                    try {
                        CallableStatement entrada = Conexion.Conexion.getConexion().prepareCall("{Call EntradaProductos(?,?,?,?,?)}");
                        entrada.setString(1, p5.getNombreProducto());
                        entrada.setDouble(2, p5.getPeso());
                        entrada.setDouble(3, p5.getLargo());
                        entrada.setDouble(4, p5.getAlto());
                        entrada.setDouble(5, p5.getAncho());
                        entrada.execute();

                    } catch (SQLException ex) {
                        Logger.getLogger(FrmRegistroProducto.class.getName()).log(Level.SEVERE, null, ex);
                    }
       
        
                    }
        
    }
    
    public static void RegistrarPedidosBD(){
        if(p1.getNombreProducto()!= ""){
            Pedido pe = (Pedido) OlvaCourier.boletaActual.getListaPedidos().getXPos(0);
        try {   
                        
                        CallableStatement entrada = Conexion.Conexion.getConexion().prepareCall("{Call EntradaPedido(?,?)}");
                        entrada.setInt(1,(int) pe.getCodigo());
                        entrada.setDouble(2, pe.getValor());
                        entrada.execute();
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(FrmRegistroProducto.class.getName()).log(Level.SEVERE, null, ex);
                    }
        try{
            PreparedStatement pps = Conexion.Conexion.getConexion().prepareStatement("update Producto set CodigoPedido = " + pe.getCodigo() + "where nombrePro ='" + p1.getNombreProducto() + "'");
            pps.executeUpdate();
        }
        catch(SQLException e){           
        }
        
                }
        if(p2.getNombreProducto()!= ""){
            Pedido pe = (Pedido) OlvaCourier.boletaActual.getListaPedidos().getXPos(1);
        try {   
                        CallableStatement entrada = Conexion.Conexion.getConexion().prepareCall("{Call EntradaPedido(?,?)}");
                        entrada.setInt(1,(int) pe.getCodigo());
                        entrada.setDouble(2, pe.getValor());
                        entrada.execute();
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(FrmRegistroProducto.class.getName()).log(Level.SEVERE, null, ex);
                    }    
        try{
            PreparedStatement pps = Conexion.Conexion.getConexion().prepareStatement("update Producto set CodigoPedido = " + pe.getCodigo() + "where nombrePro ='" + p2.getNombreProducto() + "'");
            pps.executeUpdate();
        }
        catch(SQLException e){           
        }
                }
        if(p3.getNombreProducto()!= ""){
            Pedido pe = (Pedido) OlvaCourier.boletaActual.getListaPedidos().getXPos(2);
        try {   
                        CallableStatement entrada = Conexion.Conexion.getConexion().prepareCall("{Call EntradaPedido(?,?)}");
                        entrada.setInt(1,(int) pe.getCodigo());
                        entrada.setDouble(2, pe.getValor());
                        entrada.execute();
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(FrmRegistroProducto.class.getName()).log(Level.SEVERE, null, ex);
                    }
        try{
            PreparedStatement pps = Conexion.Conexion.getConexion().prepareStatement("update Producto set CodigoPedido = " + pe.getCodigo() + "where nombrePro ='" + p3.getNombreProducto() + "'");
            pps.executeUpdate();
        }
        catch(SQLException e){           
        }
                }
               
        if(p4.getNombreProducto()!= ""){
            Pedido pe = (Pedido) OlvaCourier.boletaActual.getListaPedidos().getXPos(3);
        try {
                        CallableStatement entrada = Conexion.Conexion.getConexion().prepareCall("{Call EntradaPedido(?,?)}");
                        entrada.setInt(1,(int) pe.getCodigo());
                        entrada.setDouble(2, pe.getValor());
                        entrada.execute();
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(FrmRegistroProducto.class.getName()).log(Level.SEVERE, null, ex);
                    } 
        try{
            PreparedStatement pps = Conexion.Conexion.getConexion().prepareStatement("update Producto set CodigoPedido = " + pe.getCodigo() + "where nombrePro ='" + p4.getNombreProducto() + "'");
            pps.executeUpdate();
        }
        catch(SQLException e){           
        }
                
                }
        if(p5.getNombreProducto()!= ""){
            Pedido pe = (Pedido) OlvaCourier.boletaActual.getListaPedidos().getXPos(4);
        try {
                        CallableStatement entrada = Conexion.Conexion.getConexion().prepareCall("{Call EntradaPedido(?,?)}");
                        entrada.setInt(1,(int) pe.getCodigo());
                        entrada.setDouble(2, pe.getValor());
                        entrada.execute();
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(FrmRegistroProducto.class.getName()).log(Level.SEVERE, null, ex);
                    }   
        try{
            PreparedStatement pps = Conexion.Conexion.getConexion().prepareStatement("update Producto set CodigoPedido = " + pe.getCodigo() + "where nombrePro ='" + p5.getNombreProducto() + "'");
            pps.executeUpdate();
        }
        catch(SQLException e){           
        }
    
    }
    
    }
    
    public void guardarValores(Producto p){
        try{
        p.setNombreProducto(campoNombreProducto.getText());
        p.setPeso(Double.parseDouble(campoPeso.getText()));
        p.setLargo(Double.parseDouble(campoLargo.getText()));
        p.setAlto(Double.parseDouble(campoAlto.getText()));
        p.setPeso(Double.parseDouble(campoPeso.getText()));
        p.setAncho(Double.parseDouble(campoAncho.getText()));
        }catch(NumberFormatException e){
            //OE TE NO HAY NADA EN LOS CAMPOS DE PESO Y BALA BLLBALBALBA
        }
    }
    
    public void comprobarVersionPagada(Cliente c){
        
        if(c.getVersionPagada()==1){
            etiquetaAgenciaOrigen.setVisible(false);
            etiquetaDestino.setVisible(false);
            comboDestino.setVisible(false);
            comboOrigen.setVisible(false);
        }else{
            etiquetaAgenciaOrigen.setVisible(true);
            etiquetaDestino.setVisible(true);
            comboDestino.setVisible(true);
            comboOrigen.setVisible(true);
            
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
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaHora = new javax.swing.JLabel();
        TituloRegistroEnvio = new javax.swing.JLabel();
        Body = new javax.swing.JPanel();
        ComboNProductos = new javax.swing.JComboBox<>();
        N = new javax.swing.JLabel();
        etiquetaNompreProducto = new javax.swing.JLabel();
        campoNombreProducto = new javax.swing.JTextField();
        etiquetaPeso = new javax.swing.JLabel();
        campoPeso = new javax.swing.JTextField();
        etiquetaAlto = new javax.swing.JLabel();
        campoAlto = new javax.swing.JTextField();
        etiquetaAncho = new javax.swing.JLabel();
        campoAncho = new javax.swing.JTextField();
        etiquetaLargo = new javax.swing.JLabel();
        campoLargo = new javax.swing.JTextField();
        etiquetaKg = new javax.swing.JLabel();
        etiquetacmAl = new javax.swing.JLabel();
        etiquetacmAn = new javax.swing.JLabel();
        etiquetacmL = new javax.swing.JLabel();
        botonGuardar = new javax.swing.JButton();
        botonSiguiente = new javax.swing.JButton();
        etiquetaAgenciaOrigen = new javax.swing.JLabel();
        comboOrigen = new javax.swing.JComboBox<>();
        comboDestino = new javax.swing.JComboBox<>();
        etiquetaDestino = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        fondo.setBackground(new java.awt.Color(64, 170, 173));
        fondo.setLayout(new java.awt.BorderLayout());

        Header.setBackground(new java.awt.Color(64, 170, 173));

        etiquetaNombre.setText("Nombre del cliente");

        etiquetaHora.setText("Hora actual");

        TituloRegistroEnvio.setFont(new java.awt.Font("Yu Gothic UI", 1, 26)); // NOI18N
        TituloRegistroEnvio.setForeground(new java.awt.Color(34, 35, 34));
        TituloRegistroEnvio.setText("Registro de Envio");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(TituloRegistroEnvio)
                .addGap(39, 39, 39)
                .addComponent(etiquetaNombre)
                .addGap(63, 63, 63)
                .addComponent(etiquetaHora)
                .addContainerGap())
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TituloRegistroEnvio)
                    .addComponent(etiquetaNombre)
                    .addComponent(etiquetaHora)))
        );

        fondo.add(Header, java.awt.BorderLayout.NORTH);

        Body.setBackground(new java.awt.Color(64, 170, 173));

        ComboNProductos.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        ComboNProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        ComboNProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboNProductosActionPerformed(evt);
            }
        });

        N.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        N.setText("N°");

        etiquetaNompreProducto.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        etiquetaNompreProducto.setText("Nombre producto: ");

        etiquetaPeso.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        etiquetaPeso.setText("Peso");

        etiquetaAlto.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        etiquetaAlto.setText("Alto");

        etiquetaAncho.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        etiquetaAncho.setText("Ancho");

        etiquetaLargo.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        etiquetaLargo.setText("Largo");

        etiquetaKg.setText("Kg.");

        etiquetacmAl.setText("cm.");

        etiquetacmAn.setText("cm.");

        etiquetacmL.setText("cm.");

        botonGuardar.setBackground(new java.awt.Color(64, 170, 173));
        botonGuardar.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonSiguiente.setBackground(new java.awt.Color(64, 170, 173));
        botonSiguiente.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        botonSiguiente.setText("Siguiente");
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });

        etiquetaAgenciaOrigen.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        etiquetaAgenciaOrigen.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaAgenciaOrigen.setText("Agencia Origen");

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

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(BodyLayout.createSequentialGroup()
                                    .addComponent(etiquetaNompreProducto)
                                    .addGap(18, 18, 18)
                                    .addComponent(campoNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(BodyLayout.createSequentialGroup()
                                    .addComponent(N)
                                    .addGap(18, 18, 18)
                                    .addComponent(ComboNProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(botonGuardar)))
                            .addGroup(BodyLayout.createSequentialGroup()
                                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BodyLayout.createSequentialGroup()
                                        .addComponent(etiquetaLargo)
                                        .addGap(18, 18, 18)
                                        .addComponent(campoLargo))
                                    .addGroup(BodyLayout.createSequentialGroup()
                                        .addComponent(etiquetaPeso)
                                        .addGap(18, 18, 18)
                                        .addComponent(campoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaKg)
                                    .addGroup(BodyLayout.createSequentialGroup()
                                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(etiquetaDestino)
                                            .addGroup(BodyLayout.createSequentialGroup()
                                                .addComponent(etiquetacmL)
                                                .addGap(32, 32, 32)
                                                .addComponent(etiquetaAlto)
                                                .addGap(18, 18, 18)
                                                .addComponent(campoAlto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(etiquetacmAl)
                                                .addGap(7, 7, 7)
                                                .addComponent(etiquetaAncho)))
                                        .addGap(18, 18, 18)
                                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoAncho, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(botonSiguiente, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetacmAn))
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(etiquetaAgenciaOrigen)
                        .addGap(39, 39, 39)
                        .addComponent(comboOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        BodyLayout.setVerticalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(N)
                    .addComponent(ComboNProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGuardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNompreProducto)
                    .addComponent(campoNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaPeso)
                    .addComponent(campoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaKg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaLargo)
                    .addComponent(campoLargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaAlto)
                    .addComponent(campoAlto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetacmL)
                    .addComponent(etiquetaAncho)
                    .addComponent(campoAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetacmAn)
                    .addComponent(etiquetacmAl))
                .addGap(75, 75, 75)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaAgenciaOrigen)
                    .addComponent(comboOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaDestino)
                    .addComponent(comboDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(botonSiguiente)
                .addContainerGap(97, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboNProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboNProductosActionPerformed
        int index= ComboNProductos.getSelectedIndex()+1;
        
        switch(index){
            case 1: instanciarValores(p1);break;
            case 2: instanciarValores(p2);break;
            case 3: instanciarValores(p3);break;
            case 4: instanciarValores(p4);break;
            case 5: instanciarValores(p5);break;
        }
        
    }//GEN-LAST:event_ComboNProductosActionPerformed

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
    
        if("".equals(p1.getNombreProducto())){
            JOptionPane.showMessageDialog(null, "No se colocó ningun producto ");
        }else{

            OlvaCourier.boletaActual.getListaPedidos().insertarNodoPorFinal(new Pedido(p1));
            OlvaCourier.boletaActual.getListaPedidos().insertarNodoPorFinal(new Pedido(p2));
            OlvaCourier.boletaActual.getListaPedidos().insertarNodoPorFinal(new Pedido(p3));
            OlvaCourier.boletaActual.getListaPedidos().insertarNodoPorFinal(new Pedido(p4));
            OlvaCourier.boletaActual.getListaPedidos().insertarNodoPorFinal(new Pedido(p5));
            OlvaCourier.boletaActual.setPrecioTotal();
            OlvaCourier.boletaActual.setPropietarioDNI(OlvaCourier.clienteActual.getCodigo());
        }
        
        
        if(OlvaCourier.clienteActual.getVersionPagada()==1){
            
            FrmElegirMapa mapa = new FrmElegirMapa();
            this.dispose();
        }else{
            if(comboDestino.getSelectedItem().equals(comboOrigen.getSelectedItem())){
                    JOptionPane.showMessageDialog(null, "No puedes colocar el mismo ORIGEN Y DESTINO ");
            }else{
                OlvaCourier.boletaActual.setAgenciaInicial(OlvaCourier.agencias.getAgencia(comboOrigen.getSelectedItem().toString()));
                OlvaCourier.boletaActual.setAgenciaFinal(OlvaCourier.agencias.getAgencia(comboDestino.getSelectedItem().toString()));
                OlvaCourier.boletaActual.getFechadeEntrega().add(Calendar.DAY_OF_MONTH, 5);//Falta establecer un adecuado fecha de entrega
                try{
                    FrmBoletaLlenar frmb = new FrmBoletaLlenar();
                    this.dispose();
                }catch(Exception e){}
            }
        }
        
        
        
        
    }//GEN-LAST:event_botonSiguienteActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        int index = ComboNProductos.getSelectedIndex()+1;
        
        switch(index){
            case 1: guardarValores(p1);break;
            case 2: guardarValores(p2);break;
            case 3: guardarValores(p3);break;
            case 4: guardarValores(p4);break;
            case 5: guardarValores(p5);break;
            
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void comboOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboOrigenActionPerformed

    private void comboDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboDestinoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistroProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JComboBox<String> ComboNProductos;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel N;
    private javax.swing.JLabel TituloRegistroEnvio;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JTextField campoAlto;
    private javax.swing.JTextField campoAncho;
    private javax.swing.JTextField campoLargo;
    private javax.swing.JTextField campoNombreProducto;
    private javax.swing.JTextField campoPeso;
    private javax.swing.JComboBox<String> comboDestino;
    private javax.swing.JComboBox<String> comboOrigen;
    private javax.swing.JLabel etiquetaAgenciaOrigen;
    private javax.swing.JLabel etiquetaAlto;
    private javax.swing.JLabel etiquetaAncho;
    private javax.swing.JLabel etiquetaDestino;
    private javax.swing.JLabel etiquetaHora;
    private javax.swing.JLabel etiquetaKg;
    private javax.swing.JLabel etiquetaLargo;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaNompreProducto;
    private javax.swing.JLabel etiquetaPeso;
    private javax.swing.JLabel etiquetacmAl;
    private javax.swing.JLabel etiquetacmAn;
    private javax.swing.JLabel etiquetacmL;
    private javax.swing.JPanel fondo;
    // End of variables declaration//GEN-END:variables
}
