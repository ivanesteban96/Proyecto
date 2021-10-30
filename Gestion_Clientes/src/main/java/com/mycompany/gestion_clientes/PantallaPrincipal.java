package com.mycompany.gestion_clientes;

import java.util.List;
import javax.swing.table.DefaultTableModel;

public class PantallaPrincipal extends javax.swing.JFrame {

    public PantallaPrincipal() 
    {
        initComponents();      //INICIALIZA LOS COMPONENTES DE LA PANTALLA
        
        refrescarTabla();      //ACTUALIZA LA TABLA
    }
    
    private void refrescarTabla()
    {
        DefaultTableModel tablaNueva=new DefaultTableModel();                                          //CREAMOS UNA TABLA NUEVA
        
        tablaNueva.setColumnIdentifiers(new String[]{"nombre","apellidos","fecha alta","provincia"});  //INSERTAMOS LAS COLUMNAS DE LA TABLA
        
        List<Cliente>listaClientes=LogicaNegocio.getListaClientes();                                   //OBTENEMOS LA LISTA DE CLIENTES
        
        for(Cliente cliente: listaClientes)                                                            //INSERTAMOS LA FILA CON LOS DATOS DEL CLIENTE
        {
            tablaNueva.addRow(cliente.añadirDatos());
        }
        
        System.out.print("hola mono");
        
        tabla.setModel(tablaNueva);                                                                    //TRANSFORMAMOS LA TABLA EXISTENTE EN LA NUEVA TABLA
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemAlta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabla);

        jMenu1.setText("Clientes");

        jMenuItemAlta.setText("Alta...");
        jMenuItemAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAltaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemAlta);

        jMenuBar.add(jMenu1);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAltaActionPerformed
        
        DialogoAlta_1 da = new  DialogoAlta_1(this, true);      //AL PULSAR EL BOTON SE CREA UN OBJETO DE TIPO DIALOGO
        
        da.setVisible(true);                                    //HACEMOS VISIBLE EL OBJETO DIALOGO
        
        refrescarTabla();                                       //ACTUALIZAMMOS LA TABLA
    }//GEN-LAST:event_jMenuItemAltaActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItemAlta;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
