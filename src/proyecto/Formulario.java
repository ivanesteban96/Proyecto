package proyecto;

import usuarios.Usuario;
import usuarios.ListaUsuarios;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.netbeans.validation.api.builtin.stringvalidation.StringValidators;
import org.netbeans.validation.api.ui.ValidationGroup;




public class Formulario extends java.awt.Dialog {

    static int contadorUsuarios=0;
    static String usuarioActual=null;
    private Menu menu;
    private Inicio inicio;
    
    public Formulario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
       
        menu= (Menu)parent;          
        
        inicio=new Inicio(menu,true);
        
        initComponents();
        
        ValidationGroup group=validationPanel1.getValidationGroup();
        group.add(nombre, StringValidators.REQUIRE_NON_EMPTY_STRING);             
        group.add(telefono, StringValidators.REQUIRE_VALID_INTEGER);
        
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        nombre = new javax.swing.JTextField();
        contraseña = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        contraseña2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        condiciones = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        validationPanel1 = new org.netbeans.validation.api.ui.swing.ValidationPanel();

        jLabel2.setText("jLabel2");

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("APLICACION");
        jPanel1.add(jLabel11);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 50));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        jLabel3.setText("Contraseña");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        jButton1.setText("Crear usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 70, -1));
        jPanel2.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 70, -1));

        jLabel4.setText("Repite la contraseña");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 110, 50));
        jPanel2.add(contraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 70, -1));

        jLabel5.setText("Teléfono");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 100, -1));
        jPanel2.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 70, -1));

        jLabel6.setText("Sexo");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        jLabel7.setText("Objetivo principal");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 110, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Masculino");
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Femenino");
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        jLabel8.setText("Correo ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));
        jPanel2.add(condiciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 20, -1));

        jLabel10.setText("Acepta los términos y condiciones");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));
        jPanel2.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 70, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fuerza ", "Volumen", "Definición", "Resistencia" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 90, -1));
        jPanel2.add(validationPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 210, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 460, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            
          boolean valido=false;
          
          if(Validacion(valido))
          {
              if(contadorUsuarios<2)  //marca como limite el registro de hasta 2 usuarios
              {
                  ListaUsuarios.añadirUsuario(new Usuario(nombre.getText(),contraseña.getText()));
                  contadorUsuarios++;
                  JOptionPane.showMessageDialog(this, "hay "+contadorUsuarios+" usuarios", "Error", JOptionPane.INFORMATION_MESSAGE);     
              }
              else
                JOptionPane.showMessageDialog(this, "No se pueden añadir más usuarios", "Error", JOptionPane.INFORMATION_MESSAGE);  

              this.setVisible(false);
              menu.setVisible(true);

          }
          
    }//GEN-LAST:event_jButton1ActionPerformed

    public String getUsuarioActual(){
        
        return nombre.getText(); 
    }
    
    private boolean Validacion(boolean valido) {
       
        JTextField[] campos={nombre,contraseña,contraseña2,telefono,correo};
     
        for(int c=0; c<campos.length; c++)
        {
          if(!campos[c].getText().isEmpty())
          {
            valido=true;
          }
          else  //esta vacio
          {
            JOptionPane.showMessageDialog(this, "rellene todos los campos", "Error", JOptionPane.INFORMATION_MESSAGE);
            valido=false;
            break;
          }
          
        }
        
        if(valido==true)
        {
        
          if(!campos[1].getText().equals(campos[2].getText()))
          {
             valido=false;
             JOptionPane.showMessageDialog(this, "las contraseñas no coinciden", "Error", JOptionPane.INFORMATION_MESSAGE);
          }
        
          else if(campos[0].getText().length()>10 )
          {
             valido=false;
             JOptionPane.showMessageDialog(this, "el nombre debe ser como máximo de 10 caracteres", "Error", JOptionPane.INFORMATION_MESSAGE);
          }
          
          else if(campos[2].getText().contains("@"))
          {
             valido=false;
             JOptionPane.showMessageDialog(this, "la contraseña no puede contener caracteres especiales", "Error", JOptionPane.INFORMATION_MESSAGE); 
          }
        
        }
        
        return valido;
    }
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Formulario dialog = new Formulario(new java.awt.Frame(), true);
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox condiciones;
    private javax.swing.JTextField contraseña;
    private javax.swing.JTextField contraseña2;
    private javax.swing.JTextField correo;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField telefono;
    private org.netbeans.validation.api.ui.swing.ValidationPanel validationPanel1;
    // End of variables declaration//GEN-END:variables

    
}
