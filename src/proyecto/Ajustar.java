/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import ajustarRutina.Dia;
import ajustarRutina.ListaDias;
import ajustarRutina.ListaDias2;
import ajustarRutina.TablaSemanal;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Ajustar extends java.awt.Dialog {

    Menu menu;
    Inicio inicio;
    
    public Ajustar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        menu= (Menu)parent;      
 
        inicio=new Inicio(menu,true);
        
        initComponents();
        
        refrescarTabla();
        
      
    }
    
    private void refrescarTabla()
    {
        /*DefaultTableModel tablaNueva=new DefaultTableModel();                                          
        tablaNueva.setColumnIdentifiers(new String[]{"ejercicio","peso","series","repeticiones","fecha"});  
        */
        List<Dia>listaDi;
        
        if(inicio.getIdUsuario()==1)
        {
            listaDi=ListaDias.getListaDias();
        }
        else
        {
            listaDi=ListaDias2.getListaDias2();
        }
 
        TablaSemanal tablaNueva=new TablaSemanal(listaDi);
        
        jTable1.setModel(tablaNueva);  
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lunesEj1 = new javax.swing.JTextField();
        lunes2 = new javax.swing.JTextField();
        lunes3 = new javax.swing.JTextField();
        lunes4 = new javax.swing.JTextField();
        lunes5 = new javax.swing.JTextField();
        lunes6 = new javax.swing.JTextField();
        lunesSerie1 = new javax.swing.JTextField();
        lunesReps1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Actualizar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 40));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 30, 410, 90));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(org.openide.util.NbBundle.getMessage(Ajustar.class, "Ajustar.jLabel1.text")); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 10, 230, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText(org.openide.util.NbBundle.getMessage(Ajustar.class, "Ajustar.jLabel2.text")); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 5, -1, -1));

        jLabel3.setText(org.openide.util.NbBundle.getMessage(Ajustar.class, "Ajustar.jLabel3.text")); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel4.setText(org.openide.util.NbBundle.getMessage(Ajustar.class, "Ajustar.jLabel4.text")); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel5.setText(org.openide.util.NbBundle.getMessage(Ajustar.class, "Ajustar.jLabel5.text")); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel6.setText(org.openide.util.NbBundle.getMessage(Ajustar.class, "Ajustar.jLabel6.text")); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel7.setText(org.openide.util.NbBundle.getMessage(Ajustar.class, "Ajustar.jLabel7.text")); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel8.setText(org.openide.util.NbBundle.getMessage(Ajustar.class, "Ajustar.jLabel8.text")); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        lunesEj1.setText(org.openide.util.NbBundle.getMessage(Ajustar.class, "Ajustar.lunesEj1.text")); // NOI18N
        jPanel3.add(lunesEj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 70, -1));

        lunes2.setText(org.openide.util.NbBundle.getMessage(Ajustar.class, "Ajustar.lunes2.text")); // NOI18N
        jPanel3.add(lunes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 70, -1));

        lunes3.setText(org.openide.util.NbBundle.getMessage(Ajustar.class, "Ajustar.lunes3.text")); // NOI18N
        jPanel3.add(lunes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 70, -1));

        lunes4.setText(org.openide.util.NbBundle.getMessage(Ajustar.class, "Ajustar.lunes4.text")); // NOI18N
        jPanel3.add(lunes4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 70, -1));

        lunes5.setText(org.openide.util.NbBundle.getMessage(Ajustar.class, "Ajustar.lunes5.text")); // NOI18N
        jPanel3.add(lunes5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 70, -1));

        lunes6.setText(org.openide.util.NbBundle.getMessage(Ajustar.class, "Ajustar.lunes6.text")); // NOI18N
        jPanel3.add(lunes6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 70, -1));

        lunesSerie1.setText(org.openide.util.NbBundle.getMessage(Ajustar.class, "Ajustar.lunesSerie1.text")); // NOI18N
        jPanel3.add(lunesSerie1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 30, -1));

        lunesReps1.setText(org.openide.util.NbBundle.getMessage(Ajustar.class, "Ajustar.lunesReps1.text")); // NOI18N
        jPanel3.add(lunesReps1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 30, -1));

        jLabel10.setText(org.openide.util.NbBundle.getMessage(Ajustar.class, "Ajustar.jLabel10.text")); // NOI18N
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 20, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 240, 160));

        Actualizar.setText(org.openide.util.NbBundle.getMessage(Ajustar.class, "Ajustar.Actualizar.text")); // NOI18N
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));

        jLabel9.setText(org.openide.util.NbBundle.getMessage(Ajustar.class, "Ajustar.jLabel9.text")); // NOI18N
        jPanel4.add(jLabel9);

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 130, 150));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 530, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
       
        //REINICIAMOS LA LISTA PARA ACTUALIZAR LA TABLA DE ENTRENAMIENTO
        
        if(inicio.getIdUsuario()==1)
        {
            
        ListaDias.reiniciarLista(); 

        //AÑADIMOS A LA LISTA LOS OBJETOS DE TIPO DIA
        
        ListaDias.añadirDia(new Dia("lunes",lunesEj1.getText()+" "+lunesSerie1.getText()+"x"+lunesReps1.getText(),lunes2.getText(),lunes3.getText(),lunes4.getText(),lunes5.getText(),lunes6.getText()));
        ListaDias.añadirDia(new Dia("martes",null,null,null,null,null,null));
        ListaDias.añadirDia(new Dia("miercoles","press","remo","sentadilla","press","dom","Fondos"));
        ListaDias.añadirDia(new Dia("jueves","press","remo","sentadilla","press","dom","Fondos"));
        ListaDias.añadirDia(new Dia("viernes","press","remo","sentadilla","press","dom","Fondos"));
        ListaDias.añadirDia(new Dia("sabado","press","remo","sentadilla","press","dom","Fondos"));
        ListaDias.añadirDia(new Dia("domingo","press","remo","sentadilla","press","dom","Fondos"));  
        }
        else
        {
            
        ListaDias2.reiniciarLista2(); 

        //AÑADIMOS A LA LISTA LOS OBJETOS DE TIPO DIA
        
        ListaDias2.añadirDia2(new Dia("lunes",lunesEj1.getText()+" "+lunesSerie1.getText()+"x"+lunesReps1.getText(),lunes2.getText(),lunes3.getText(),lunes4.getText(),lunes5.getText(),lunes6.getText()));
        ListaDias2.añadirDia2(new Dia("martes",null,null,null,null,null,null));
        ListaDias2.añadirDia2(new Dia("miercoles","press","remo","sentadilla","press","dom","Fondos"));
        ListaDias2.añadirDia2(new Dia("jueves","press","remo","sentadilla","press","dom","Fondos"));
        ListaDias2.añadirDia2(new Dia("viernes","press","remo","sentadilla","press","dom","Fondos"));
        ListaDias2.añadirDia2(new Dia("sabado","press","remo","sentadilla","press","dom","Fondos"));
        ListaDias2.añadirDia2(new Dia("domingo","press","remo","sentadilla","press","dom","Fondos"));
        }
        
        
        
        
        this.setVisible(false);
    }//GEN-LAST:event_ActualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Ajustar dialog = new Ajustar(new java.awt.Frame(), true);
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
    private javax.swing.JButton Actualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lunes2;
    private javax.swing.JTextField lunes3;
    private javax.swing.JTextField lunes4;
    private javax.swing.JTextField lunes5;
    private javax.swing.JTextField lunes6;
    private javax.swing.JTextField lunesEj1;
    private javax.swing.JTextField lunesReps1;
    private javax.swing.JTextField lunesSerie1;
    // End of variables declaration//GEN-END:variables

   
}
