/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package proyecto;

import ajustarRutina.Dia;
import ajustarRutina.ListaDias;
import ajustarRutina.ListaDias2;
import ajustarRutina.TablaSemanal;
import ejercicios.ListaEjercicios;
import ejercicios.Ejercicio;
import ejercicios.ListaEjercicios2;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import usuarios.ListaUsuarios;

public class Rutina extends javax.swing.JDialog {

    Menu menu;
    Progresión progresion;
    Inicio inicio;
    
    public Rutina(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        menu= (Menu)parent;      
        
        progresion=new Progresión(menu,true);
        
        inicio=new Inicio(menu,true);
        
        initComponents();
        
        refrescarTabla();
    }
    
    private void refrescarTabla()
    {
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

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ej1 = new javax.swing.JTextField();
        ej2 = new javax.swing.JTextField();
        ej3 = new javax.swing.JTextField();
        ej4 = new javax.swing.JTextField();
        ej5 = new javax.swing.JTextField();
        ej6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Ser1 = new javax.swing.JTextField();
        Ser2 = new javax.swing.JTextField();
        Ser3 = new javax.swing.JTextField();
        Ser4 = new javax.swing.JTextField();
        Ser5 = new javax.swing.JTextField();
        Ser6 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        reps1 = new javax.swing.JTextField();
        reps2 = new javax.swing.JTextField();
        reps3 = new javax.swing.JTextField();
        reps4 = new javax.swing.JTextField();
        reps5 = new javax.swing.JTextField();
        reps6 = new javax.swing.JTextField();
        Actualizar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        peso1 = new javax.swing.JTextField();
        peso2 = new javax.swing.JTextField();
        peso3 = new javax.swing.JTextField();
        peso4 = new javax.swing.JTextField();
        peso5 = new javax.swing.JTextField();
        peso6 = new javax.swing.JTextField();
        date = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        datosLunes = new javax.swing.JButton();
        datosMartes = new javax.swing.JButton();
        datosMiercoles = new javax.swing.JButton();
        datosJueves = new javax.swing.JButton();
        datosViernes = new javax.swing.JButton();
        datosSabado = new javax.swing.JButton();
        datosDomingo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Rutina de hoy ");

        jLabel2.setText("Ejercicio1");

        jLabel3.setText("Ejercicio2");

        jLabel4.setText("Ejercicio3");

        jLabel5.setText("Ejercicio4");

        jLabel6.setText("Ejercicio5");

        jLabel7.setText("Ejercicio6");

        jLabel8.setText("Series");

        jLabel9.setText("Series");

        jLabel10.setText("Series");

        jLabel11.setText("Series");

        jLabel12.setText("Series");

        jLabel13.setText("Series");

        jLabel14.setText("Reps");

        jLabel15.setText("Reps");

        jLabel16.setText("Reps");

        jLabel17.setText("Reps");

        jLabel18.setText("Reps");

        jLabel19.setText("Reps");

        Actualizar.setText("Registrar entrenamiento");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        jLabel20.setText("Peso");

        jLabel21.setText("Peso");

        jLabel22.setText("Peso");

        jLabel23.setText("Peso");

        jLabel24.setText("Peso");

        jLabel25.setText("Peso");

        peso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peso1ActionPerformed(evt);
            }
        });

        date.setModel(new javax.swing.SpinnerDateModel());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ej4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(peso4, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ej5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel24))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ej6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel25)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(peso6)
                                    .addComponent(peso5)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ej3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel22))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ej2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel21)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(peso2)
                                    .addComponent(peso3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ej1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(peso1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(reps6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(reps5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Ser3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Ser6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Ser5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Ser4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Ser2, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                                            .addComponent(Ser1))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(reps2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(reps3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(reps1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(reps4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Actualizar)
                        .addGap(113, 113, 113)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ej1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(Ser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(reps1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(peso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(ej2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(Ser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21)
                        .addComponent(peso2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(reps2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ej3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(Ser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(reps3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(peso3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(Ser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)
                        .addComponent(reps4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(ej4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23)
                        .addComponent(peso4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(Ser5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18)
                        .addComponent(reps5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(ej5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24)
                        .addComponent(peso5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ej6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(Ser6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(reps6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(peso6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Actualizar)
                .addGap(6, 6, 6))
        );

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

        datosLunes.setText("lunes");
        datosLunes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosLunesActionPerformed(evt);
            }
        });

        datosMartes.setText("jButton1");
        datosMartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosMartesActionPerformed(evt);
            }
        });

        datosMiercoles.setText("jButton2");
        datosMiercoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosMiercolesActionPerformed(evt);
            }
        });

        datosJueves.setText("jButton3");
        datosJueves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosJuevesActionPerformed(evt);
            }
        });

        datosViernes.setText("jButton4");
        datosViernes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosViernesActionPerformed(evt);
            }
        });

        datosSabado.setText("jButton5");
        datosSabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosSabadoActionPerformed(evt);
            }
        });

        datosDomingo.setText("jButton1");
        datosDomingo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosDomingoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(datosMartes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(datosMiercoles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(datosJueves, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(datosViernes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(datosLunes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(datosSabado)
                    .addComponent(datosDomingo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(datosLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(datosMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datosMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datosJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datosViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datosSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datosDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed

        String ejercicio1=ej1.getText();
        String ejercicio2=ej2.getText();
        String ejercicio3=ej3.getText();
        String ejercicio4=ej4.getText();
        String ejercicio5=ej5.getText();
        String ejercicio6=ej6.getText();
              
        String peso_1=peso1.getText();
        String peso_2=peso2.getText();
        String peso_3=peso3.getText();
        String peso_4=peso4.getText();
        String peso_5=peso5.getText();
        String peso_6=peso6.getText();
        
        String series1=Ser1.getText();
        String series2=Ser2.getText();
        String series3=Ser3.getText();
        String series4=Ser4.getText();
        String series5=Ser5.getText();
        String series6=Ser6.getText();
        
        String repes1=reps1.getText();
        String repes2=reps2.getText();
        String repes3=reps3.getText();
        String repes4=reps4.getText();
        String repes5=reps5.getText();
        String repes6=reps6.getText();
        
        Date fecha=(Date) date.getValue();
        
        Ejercicio ejer1=new Ejercicio(ejercicio1,peso_1,series1,repes1,fecha);
        Ejercicio ejer2=new Ejercicio(ejercicio2,peso_2,series2,repes2,fecha);
        Ejercicio ejer3=new Ejercicio(ejercicio3,peso_3,series3,repes3,fecha);
        Ejercicio ejer4=new Ejercicio(ejercicio4,peso_4,series4,repes4,fecha);
        Ejercicio ejer5=new Ejercicio(ejercicio5,peso_5,series5,repes5,fecha);
        Ejercicio ejer6=new Ejercicio(ejercicio6,peso_6,series6,repes6,fecha);
        
         JOptionPane.showMessageDialog(this, "el usuario es "+inicio.getIdUsuario(), "Error", JOptionPane.INFORMATION_MESSAGE);
        
        if(inicio.getIdUsuario()==1)
        {
            ListaEjercicios.añadirCliente(ejer1);
            ListaEjercicios.añadirCliente(ejer2);
            ListaEjercicios.añadirCliente(ejer3);
            ListaEjercicios.añadirCliente(ejer4);
            ListaEjercicios.añadirCliente(ejer5);
            ListaEjercicios.añadirCliente(ejer6);
        }
        else if(inicio.getIdUsuario()==2)
        {
            ListaEjercicios2.añadirEjercicio2(ejer1);
            ListaEjercicios2.añadirEjercicio2(ejer2);
            ListaEjercicios2.añadirEjercicio2(ejer3);
            ListaEjercicios2.añadirEjercicio2(ejer4);
            ListaEjercicios2.añadirEjercicio2(ejer5);
            ListaEjercicios2.añadirEjercicio2(ejer6);
        }
        else
        {
            
        }
       
        
         
        this.setVisible(false);
    }//GEN-LAST:event_ActualizarActionPerformed

    private void peso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peso1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_peso1ActionPerformed

    private void datosLunesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosLunesActionPerformed
        
        //COGEMOS LOS VALORES DE CADA UNO DE LOS EJERCICIOS DEL LUNES
        
        String ejercicio1= ListaDias.getDia(0).getEjercicio1();
        String ejercicio2= ListaDias.getDia(0).getEjercicio2();
        String ejercicio3= ListaDias.getDia(0).getEjercicio3();
        String ejercicio4= ListaDias.getDia(0).getEjercicio4();
        String ejercicio5= ListaDias.getDia(0).getEjercicio5();
        String ejercicio6= ListaDias.getDia(0).getEjercicio6();
        
        //ASIGNAMOS LOS VALORES A LOS CAMPOS DE EJERCICIO DE LA RUTINA
        
        ej1.setText(ejercicio1);
        ej2.setText(ejercicio2);
        ej3.setText(ejercicio3);
        ej4.setText(ejercicio4);
        ej5.setText(ejercicio5);
        ej6.setText(ejercicio6);
    }//GEN-LAST:event_datosLunesActionPerformed

    private void datosMartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosMartesActionPerformed
        
        String ejercicio1= ListaDias.getDia(1).getEjercicio1();
        String ejercicio2= ListaDias.getDia(1).getEjercicio2();
        String ejercicio3= ListaDias.getDia(1).getEjercicio3();
        String ejercicio4= ListaDias.getDia(1).getEjercicio4();
        String ejercicio5= ListaDias.getDia(1).getEjercicio5();
        String ejercicio6= ListaDias.getDia(1).getEjercicio6();

        ej1.setText(ejercicio1);
        ej2.setText(ejercicio2);
        ej3.setText(ejercicio3);
        ej4.setText(ejercicio4);
        ej5.setText(ejercicio5);
        ej6.setText(ejercicio6);
    }//GEN-LAST:event_datosMartesActionPerformed

    private void datosMiercolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosMiercolesActionPerformed
        
        String ejercicio1= ListaDias.getDia(2).getEjercicio1();
        String ejercicio2= ListaDias.getDia(2).getEjercicio2();
        String ejercicio3= ListaDias.getDia(2).getEjercicio3();
        String ejercicio4= ListaDias.getDia(2).getEjercicio4();
        String ejercicio5= ListaDias.getDia(2).getEjercicio5();
        String ejercicio6= ListaDias.getDia(2).getEjercicio6();

        ej1.setText(ejercicio1);
        ej2.setText(ejercicio2);
        ej3.setText(ejercicio3);
        ej4.setText(ejercicio4);
        ej5.setText(ejercicio5);
        ej6.setText(ejercicio6);
    }//GEN-LAST:event_datosMiercolesActionPerformed

    private void datosJuevesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosJuevesActionPerformed
        String ejercicio1= ListaDias.getDia(3).getEjercicio1();
        String ejercicio2= ListaDias.getDia(3).getEjercicio2();
        String ejercicio3= ListaDias.getDia(3).getEjercicio3();
        String ejercicio4= ListaDias.getDia(3).getEjercicio4();
        String ejercicio5= ListaDias.getDia(3).getEjercicio5();
        String ejercicio6= ListaDias.getDia(3).getEjercicio6();

        ej1.setText(ejercicio1);
        ej2.setText(ejercicio2);
        ej3.setText(ejercicio3);
        ej4.setText(ejercicio4);
        ej5.setText(ejercicio5);
        ej6.setText(ejercicio6);
    }//GEN-LAST:event_datosJuevesActionPerformed

    private void datosViernesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosViernesActionPerformed
        String ejercicio1= ListaDias.getDia(4).getEjercicio1();
        String ejercicio2= ListaDias.getDia(4).getEjercicio2();
        String ejercicio3= ListaDias.getDia(4).getEjercicio3();
        String ejercicio4= ListaDias.getDia(4).getEjercicio4();
        String ejercicio5= ListaDias.getDia(4).getEjercicio5();
        String ejercicio6= ListaDias.getDia(4).getEjercicio6();

        ej1.setText(ejercicio1);
        ej2.setText(ejercicio2);
        ej3.setText(ejercicio3);
        ej4.setText(ejercicio4);
        ej5.setText(ejercicio5);
        ej6.setText(ejercicio6);
    }//GEN-LAST:event_datosViernesActionPerformed

    private void datosSabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosSabadoActionPerformed
        String ejercicio1= ListaDias.getDia(5).getEjercicio1();
        String ejercicio2= ListaDias.getDia(5).getEjercicio2();
        String ejercicio3= ListaDias.getDia(5).getEjercicio3();
        String ejercicio4= ListaDias.getDia(5).getEjercicio4();
        String ejercicio5= ListaDias.getDia(5).getEjercicio5();
        String ejercicio6= ListaDias.getDia(5).getEjercicio6();

        ej1.setText(ejercicio1);
        ej2.setText(ejercicio2);
        ej3.setText(ejercicio3);
        ej4.setText(ejercicio4);
        ej5.setText(ejercicio5);
        ej6.setText(ejercicio6);
    }//GEN-LAST:event_datosSabadoActionPerformed

    private void datosDomingoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosDomingoActionPerformed
        String ejercicio1= ListaDias.getDia(6).getEjercicio1();
        String ejercicio2= ListaDias.getDia(6).getEjercicio2();
        String ejercicio3= ListaDias.getDia(6).getEjercicio3();
        String ejercicio4= ListaDias.getDia(6).getEjercicio4();
        String ejercicio5= ListaDias.getDia(6).getEjercicio5();
        String ejercicio6= ListaDias.getDia(6).getEjercicio6();

        ej1.setText(ejercicio1);
        ej2.setText(ejercicio2);
        ej3.setText(ejercicio3);
        ej4.setText(ejercicio4);
        ej5.setText(ejercicio5);
        ej6.setText(ejercicio6);
    }//GEN-LAST:event_datosDomingoActionPerformed

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
            java.util.logging.Logger.getLogger(Rutina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rutina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rutina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rutina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Rutina dialog = new Rutina(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
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
    private javax.swing.JTextField Ser1;
    private javax.swing.JTextField Ser2;
    private javax.swing.JTextField Ser3;
    private javax.swing.JTextField Ser4;
    private javax.swing.JTextField Ser5;
    private javax.swing.JTextField Ser6;
    private javax.swing.JSpinner date;
    private javax.swing.JButton datosDomingo;
    private javax.swing.JButton datosJueves;
    private javax.swing.JButton datosLunes;
    private javax.swing.JButton datosMartes;
    private javax.swing.JButton datosMiercoles;
    private javax.swing.JButton datosSabado;
    private javax.swing.JButton datosViernes;
    private javax.swing.JTextField ej1;
    private javax.swing.JTextField ej2;
    private javax.swing.JTextField ej3;
    private javax.swing.JTextField ej4;
    private javax.swing.JTextField ej5;
    private javax.swing.JTextField ej6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField peso1;
    private javax.swing.JTextField peso2;
    private javax.swing.JTextField peso3;
    private javax.swing.JTextField peso4;
    private javax.swing.JTextField peso5;
    private javax.swing.JTextField peso6;
    private javax.swing.JTextField reps1;
    private javax.swing.JTextField reps2;
    private javax.swing.JTextField reps3;
    private javax.swing.JTextField reps4;
    private javax.swing.JTextField reps5;
    private javax.swing.JTextField reps6;
    // End of variables declaration//GEN-END:variables
}
