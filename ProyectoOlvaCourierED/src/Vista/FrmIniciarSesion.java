/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Estructura.ListaUsuario;
import Modelo.Administrador;
import Modelo.Cliente;
import Modelo.RRHH;
import Sistema.OlvaCourier;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class FrmIniciarSesion extends javax.swing.JFrame {
    /**
     * Creates new form FrmIniciarSesion
     * 
     */
    ListaUsuario l = new ListaUsuario();
    
    public FrmIniciarSesion() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel1, "Images/olva-courier.png");
    }
    
    
    public void iniciarSesion(){
        String user = CampoUsuario.getText();
        String password = CampoContraseña.getText();
        
        OlvaCourier.usuarioActual = OlvaCourier.personas.validar(user, password);

        if(OlvaCourier.usuarioActual != null){
            JOptionPane.showMessageDialog(null, "Bienvenido");
            int tUsuario = OlvaCourier.usuarioActual.getTipoFuncion();
            
            switch (tUsuario) {
                case 1:
                    
                    //Cliente
                    OlvaCourier.clienteActual = (Cliente) OlvaCourier.personas.getPersona(OlvaCourier.usuarioActual);
                    FrmCliente form = new FrmCliente();
                    this.dispose();
                    break;
                    
                case 2:
                    //Administrador
                    
                    OlvaCourier.administradorActual = (Administrador) OlvaCourier.personas.getPersona(OlvaCourier.usuarioActual);
                    FrmAdministrador fa = new FrmAdministrador();
                    this.dispose();
                    
                    break;
                case 3:
                    //RRHH
                    OlvaCourier.rrhhActual = (RRHH) OlvaCourier.personas.getPersona(OlvaCourier.usuarioActual);
                    
                    FrmRRHH frh = new FrmRRHH();
                    
                    this.dispose();
                    
                    break;
            }

        }else{//datos erroneos
            JOptionPane.showMessageDialog(null,"ERROR");

            this.CampoUsuario.setText("");
            this.CampoContraseña.setText("");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Fondo = new javax.swing.JPanel();
        IngresoDatos = new javax.swing.JPanel();
        CampoUsuario = new javax.swing.JTextField();
        etiquetaUsuario = new javax.swing.JLabel();
        etiquetaContraseña = new javax.swing.JLabel();
        CampoContraseña = new javax.swing.JPasswordField();
        botonIngresar = new javax.swing.JButton();
        FondoMarca = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        Fondo.setLayout(new java.awt.BorderLayout());

        IngresoDatos.setBackground(new java.awt.Color(64, 170, 173));

        CampoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoUsuarioActionPerformed(evt);
            }
        });
        CampoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CampoUsuarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoUsuarioKeyTyped(evt);
            }
        });

        etiquetaUsuario.setText("Usuario");

        etiquetaContraseña.setText("Contraseña");

        CampoContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoContraseñaActionPerformed(evt);
            }
        });
        CampoContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CampoContraseñaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoContraseñaKeyTyped(evt);
            }
        });

        botonIngresar.setBackground(new java.awt.Color(204, 204, 204));
        botonIngresar.setText("Ingresar");
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IngresoDatosLayout = new javax.swing.GroupLayout(IngresoDatos);
        IngresoDatos.setLayout(IngresoDatosLayout);
        IngresoDatosLayout.setHorizontalGroup(
            IngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngresoDatosLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(IngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngresoDatosLayout.createSequentialGroup()
                        .addGroup(IngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaContraseña)
                            .addComponent(etiquetaUsuario)
                            .addComponent(CampoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngresoDatosLayout.createSequentialGroup()
                        .addComponent(botonIngresar)
                        .addGap(137, 137, 137))))
        );
        IngresoDatosLayout.setVerticalGroup(
            IngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngresoDatosLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(etiquetaUsuario)
                .addGap(18, 18, 18)
                .addComponent(CampoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaContraseña)
                .addGap(18, 18, 18)
                .addComponent(CampoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(botonIngresar)
                .addGap(54, 54, 54))
        );

        Fondo.add(IngresoDatos, java.awt.BorderLayout.CENTER);

        FondoMarca.setBackground(new java.awt.Color(64, 170, 173));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/olva-courier.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(87, 86, 86));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("\" El courier más grande del Perú\"");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout FondoMarcaLayout = new javax.swing.GroupLayout(FondoMarca);
        FondoMarca.setLayout(FondoMarcaLayout);
        FondoMarcaLayout.setHorizontalGroup(
            FondoMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoMarcaLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoMarcaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        FondoMarcaLayout.setVerticalGroup(
            FondoMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoMarcaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        Fondo.add(FondoMarca, java.awt.BorderLayout.NORTH);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoUsuarioActionPerformed

    private void CampoContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoContraseñaActionPerformed
        
    }//GEN-LAST:event_CampoContraseñaActionPerformed
    
    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        //OlvaCourier.CargarListas(l);
        //l.desplegarLista();
        
        iniciarSesion();
       
    }//GEN-LAST:event_botonIngresarActionPerformed

    private void CampoUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoUsuarioKeyTyped

    }//GEN-LAST:event_CampoUsuarioKeyTyped

    private void CampoContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoContraseñaKeyTyped
        
    }//GEN-LAST:event_CampoContraseñaKeyTyped

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped

    }//GEN-LAST:event_formKeyTyped

    private void CampoUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoUsuarioKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            iniciarSesion();
        }
        
        /*if(CampoUsuario.getText().length()<8){
            CampoUsuario.setBackground(Color.red);
        }else{
            CampoUsuario.setBackground(Color.WHITE);
        }*/
    }//GEN-LAST:event_CampoUsuarioKeyPressed

    private void CampoContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoContraseñaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            iniciarSesion();
        }
    }//GEN-LAST:event_CampoContraseñaKeyPressed
    
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
            java.util.logging.Logger.getLogger(FrmIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmIniciarSesion().setVisible(true);
            }
        });
        
        //Colocarlo en el main principal 
        /*Conexion.Conexion.getConexion();*/
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CampoContraseña;
    private javax.swing.JTextField CampoUsuario;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel FondoMarca;
    private javax.swing.JPanel IngresoDatos;
    private javax.swing.JButton botonIngresar;
    private javax.swing.JLabel etiquetaContraseña;
    private javax.swing.JLabel etiquetaUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
