/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Administrador;
import Modelo.Cliente;
import Sistema.OlvaCourier;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class FrmIniciarSesion extends javax.swing.JFrame {
 
    public FrmIniciarSesion() {
        initComponents();
        setLocationRelativeTo(null);//Coloca la ventana en el centro 
        setVisible(true);//Hace visible la ventana, porque por default no lo hace
    }
    
    //Funcion iniciar sesion
    public void iniciarSesion(){
        String user = CampoUsuario.getText();//Mediante el getText() extraemos lo que está en el CampoUsuario
        String password = CampoContraseña.getText();//En este caso es algo distinto. Aparece rayado porque es una funcion desactualizada pero sirve aún
        
        OlvaCourier.usuarioActual = OlvaCourier.personas.validar(user, password);

        if(OlvaCourier.usuarioActual != null){
            JOptionPane.showMessageDialog(null, "Bienvenido");
            int tUsuario = OlvaCourier.usuarioActual.getTipoFuncion(); //La funcion como se estableció tUsuario 1=cliente 2=administrador
            
            switch (tUsuario) {
                case 1:
                    
                    //Cliente
                    OlvaCourier.clienteActual = (Cliente) OlvaCourier.personas.getPersona(OlvaCourier.usuarioActual); //Convierte la persona conseguida en el cliente actual
                    FrmCliente form = new FrmCliente(); //Ingresamos al formulario del cliente
                    this.dispose();
                    break;
                    
                case 2:
                    //Administrador
                    
                    OlvaCourier.administradorActual = (Administrador) OlvaCourier.personas.getPersona(OlvaCourier.usuarioActual);
                    FrmAdministrador fa = new FrmAdministrador();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
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

        CampoUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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

        etiquetaUsuario.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        etiquetaUsuario.setForeground(new java.awt.Color(56, 56, 55));
        etiquetaUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaUsuario.setText("Usuario");

        etiquetaContraseña.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        etiquetaContraseña.setForeground(new java.awt.Color(56, 56, 55));
        etiquetaContraseña.setText("Contraseña");

        CampoContraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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

        botonIngresar.setBackground(new java.awt.Color(64, 170, 173));
        botonIngresar.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        botonIngresar.setForeground(new java.awt.Color(56, 56, 55));
        botonIngresar.setText("Ingresar");
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(56, 56, 55));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/candado.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/persona.png"))); // NOI18N

        javax.swing.GroupLayout IngresoDatosLayout = new javax.swing.GroupLayout(IngresoDatos);
        IngresoDatos.setLayout(IngresoDatosLayout);
        IngresoDatosLayout.setHorizontalGroup(
            IngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngresoDatosLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(IngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngresoDatosLayout.createSequentialGroup()
                        .addGroup(IngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(IngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(IngresoDatosLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(etiquetaContraseña))
                            .addGroup(IngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CampoUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                .addComponent(etiquetaUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CampoContraseña, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngresoDatosLayout.createSequentialGroup()
                        .addComponent(botonIngresar)
                        .addGap(148, 148, 148))))
        );
        IngresoDatosLayout.setVerticalGroup(
            IngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngresoDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CampoUsuario))
                .addGap(28, 28, 28)
                .addComponent(etiquetaContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CampoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(botonIngresar)
                .addGap(60, 60, 60))
        );

        Fondo.add(IngresoDatos, java.awt.BorderLayout.CENTER);

        FondoMarca.setBackground(new java.awt.Color(64, 170, 173));
        FondoMarca.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/olva_logo.png"))); // NOI18N
        jLabel1.setLabelFor(jLabel1);
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel1.setMaximumSize(new java.awt.Dimension(300, 300));
        jLabel1.setMinimumSize(new java.awt.Dimension(219, 82));
        jLabel1.setPreferredSize(new java.awt.Dimension(230, 93));

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(87, 86, 86));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("\" El courier más grande del Perú\"    ");
        jLabel2.setToolTipText("");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout FondoMarcaLayout = new javax.swing.GroupLayout(FondoMarca);
        FondoMarca.setLayout(FondoMarcaLayout);
        FondoMarcaLayout.setHorizontalGroup(
            FondoMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FondoMarcaLayout.setVerticalGroup(
            FondoMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoMarcaLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
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
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
