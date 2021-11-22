package proyecto;

import actionListener.actionListener_1;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    boolean sesionActiva;
    
    public Menu() {
        
        initComponents();
    
        insertarImagenes();   
        
        JLabelUsuario.setText("inicia sesión");
        
        Formulario formulario=new Formulario(this,true);
        formulario.setVisible(true); 
        
        //this.setVisible(true);
        
    }
     
     private void insertarImagenes()
     {        
        ImageIcon icono0=new ImageIcon("src/imagenes/icono.jpg");
        Icono.setIcon(icono0); 
         
        ImageIcon icono1=new ImageIcon("src/imagenes/ejercicios.jpg");
        Ejercicios.setIcon(icono1);
        
        ImageIcon icono2=new ImageIcon("src/imagenes/rutina.jpg");
        Rutina.setIcon(icono2);
        
        ImageIcon icono3=new ImageIcon("src/imagenes/progresion.jpg");
        Progresion.setIcon(icono3);
        
        ImageIcon icono4=new ImageIcon("src/imagenes/ajuste.png");
        Ajustes.setIcon(icono4);
        
        setIconImage(icono0.getImage()); //AÑADIMOS UN ICONO A LA APP
        
     }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Icono = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        descripcion1 = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        Ejercicios = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Rutina = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Progresion = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        Ajustes = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        JLabelUsuario = new javax.swing.JLabel();
        CrearUsuario = new javax.swing.JButton();
        IniciarSesion = new javax.swing.JButton();
        CerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 51));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("APLICACION DE GIMNASIO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(Icono, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
            .addComponent(Icono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, 500, -1));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setVerifyInputWhenFocusTarget(false);

        descripcion1.setText("bla bla");
        descripcion1.setToolTipText("");
        descripcion1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("Ejercicios");
        titulo1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        Ejercicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EjerciciosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Ejercicios, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descripcion1, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(titulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(titulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Ejercicios, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(descripcion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 48, 180, 140));

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));

        Rutina.setToolTipText("");
        Rutina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RutinaActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Rutina, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Rutina, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 180, 140));

        jPanel4.setBackground(new java.awt.Color(0, 204, 255));

        Progresion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProgresionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(Progresion, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 67, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addComponent(Progresion, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 170, 140));

        jPanel5.setBackground(new java.awt.Color(204, 0, 204));

        Ajustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjustesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(Ajustes, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 57, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(Ajustes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 170, 140));

        JLabelUsuario.setBackground(new java.awt.Color(0, 0, 0));
        JLabelUsuario.setForeground(new java.awt.Color(0, 0, 0));

        CrearUsuario.setText("Crear usuario");
        CrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearUsuarioActionPerformed(evt);
            }
        });

        IniciarSesion.setText("Iniciar sesión");
        IniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IniciarSesionMouseEntered(evt);
            }
        });
        IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSesionActionPerformed(evt);
            }
        });

        CerrarSesion.setText("Cerrar sesión");
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CrearUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(JLabelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(JLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IniciarSesion)
                .addGap(17, 17, 17)
                .addComponent(CrearUsuario)
                .addGap(18, 18, 18)
                .addComponent(CerrarSesion)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 130, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RutinaActionPerformed
        
        if(sesionActiva==true)
        {
          this.setVisible(false);
          Rutina rutina=new Rutina(this, true);
          rutina.setVisible(true);
          this.setVisible(true); 
        }
        else
        { 
          JOptionPane.showMessageDialog(this, "Inicia sesión para usar la aplicación", "Error", JOptionPane.INFORMATION_MESSAGE); 
        }
    }//GEN-LAST:event_RutinaActionPerformed

    private void ProgresionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProgresionActionPerformed
       
        if(sesionActiva==true)
        {
          this.setVisible(false);
          Progresión progresion=new Progresión(this, true);
          progresion.setVisible(true);
          this.setVisible(true);
        }
        else
        {
           JOptionPane.showMessageDialog(this, "Inicia sesión para usar la aplicación", "Error", JOptionPane.INFORMATION_MESSAGE);      
        }
    }//GEN-LAST:event_ProgresionActionPerformed

    private void EjerciciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EjerciciosActionPerformed
        
        if(sesionActiva==true)
        {
          this.setVisible(false);
          Ejercicios ejercicios=new Ejercicios(this,true);
          ejercicios.setVisible(true);
          this.setVisible(true);
        }
        else
        {
           JOptionPane.showMessageDialog(this, "Inicia sesión para usar la aplicación", "Error", JOptionPane.INFORMATION_MESSAGE);      
        }
         
    }//GEN-LAST:event_EjerciciosActionPerformed

    private void IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSesionActionPerformed
        
        this.setVisible(false);
        Inicio inicio=new Inicio(this,true);
        inicio.setVisible(true); 
        
        sesionActiva=inicio.getSesionActiva();
        
        this.setVisible(true);
        
        
        
    }//GEN-LAST:event_IniciarSesionActionPerformed

    private void CrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearUsuarioActionPerformed
   
        this.setVisible(false);
        Formulario formulario=new Formulario(this, true);
        formulario.setVisible(true);
        this.setVisible(true);
    }//GEN-LAST:event_CrearUsuarioActionPerformed

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        
        int resultado= JOptionPane.showConfirmDialog(this, "¿Quiere salir de la aplicacion?", "Aviso", JOptionPane.YES_NO_OPTION);
        
        if(resultado==0)
        {
          this.setVisible(false);
          JLabelUsuario.setText("inicia sesión");
        
          sesionActiva=false;
        
          this.setVisible(true);
        }
    }//GEN-LAST:event_CerrarSesionActionPerformed

    private void IniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarSesionMouseEntered
        
        JLabelUsuario.setBackground(Color.red);
        System.out.print("hola");
    }//GEN-LAST:event_IniciarSesionMouseEntered

    private void AjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjustesActionPerformed

        if(sesionActiva==true)
        {
          this.setVisible(false);
          Ajustar ajustar=new Ajustar(this,true);
          ajustar.setVisible(true);
          this.setVisible(true);
        }
        else
        {
           JOptionPane.showMessageDialog(this, "Inicia sesión para usar la aplicación", "Error", JOptionPane.INFORMATION_MESSAGE);      
        }
        
    }//GEN-LAST:event_AjustesActionPerformed

    public void establecerNombre(String nombre){
        
        JLabelUsuario.setText("BIENVENIDO "+nombre);
    }
    
    
    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
                
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ajustes;
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JButton CrearUsuario;
    private javax.swing.JButton Ejercicios;
    private javax.swing.JLabel Icono;
    private javax.swing.JButton IniciarSesion;
    private javax.swing.JLabel JLabelUsuario;
    private javax.swing.JButton Progresion;
    private javax.swing.JButton Rutina;
    private javax.swing.JLabel descripcion1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel titulo1;
    // End of variables declaration//GEN-END:variables
}
