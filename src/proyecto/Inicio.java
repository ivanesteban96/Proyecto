
package proyecto;

import usuarios.Usuario;
import usuarios.ListaUsuarios;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Inicio extends java.awt.Dialog {

    private String usuario;
    private String contraseña;
    private String usuarioActual="ivan";
    private static int idUsuario;
    boolean sesionActiva=false;

    Menu menu;
    
    public Inicio(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        menu= (Menu)parent;  
        
        initComponents(); 
    }

  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 60));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Usuario");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        jLabel2.setText("Contraseña");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 70, -1));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 70, -1));

        jButton1.setText("Iniciar sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 400, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        usuario=jTextField1.getText();
        contraseña=jTextField2.getText();
        boolean existe=false;

        ListaUsuarios listaUsuarios=new ListaUsuarios();    
        Usuario user=new Usuario();
        
        if(listaUsuarios.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "no hay usuarios registrados", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {  
          for(int c=0; c<listaUsuarios.size(); c++)
          {
             user=(Usuario)listaUsuarios.get(c);
            
             if(usuario.equals(user.getNombre()) && contraseña.equals(user.getContraseña()))
             {         
               usuarioActual=usuario;
               
               JOptionPane.showMessageDialog(this, "bienvenido "+usuarioActual, "Error", JOptionPane.INFORMATION_MESSAGE);
                 
               existe=true;
               
               if(c==0)
                   idUsuario=1;   //IDENTIFICAMOS QUE USUARIO ESTA ACTIVO 
               if(c==1)
                   idUsuario=2;
               
               break;
             }           
          }
            
          if(existe==true)
          {
           String nombre=usuario; 
           
           menu.establecerNombre(nombre);
           
           this.setVisible(false);
           
           sesionActiva=true;
           
           menu.setVisible(true);
          }
          else
          {
            JOptionPane.showMessageDialog(this, "usuario o contraseña incorrecto", "Error", JOptionPane.INFORMATION_MESSAGE);
          }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public String getUsuarioActual(){
        return usuarioActual; 
    }
    
    public int getIdUsuario(){
        return idUsuario;
    }
    
    public boolean getSesionActiva(){
        return sesionActiva;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Inicio dialog = new Inicio(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
