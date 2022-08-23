/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.extraclases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hjcar
 */
public class abrelista2 extends javax.swing.JInternalFrame {
    
    DefaultTableModel modeloTabla;
    JFileChooser archivo = new JFileChooser(System.getProperty("user.dir"));
    private void cargar(){
        
        try{
            String texto = "";
            Object cabeceras[]={"Carnet","Nombre y apellidos","Correo","Telefono","Nickname","Tipo estudiante","Nota promedio (examenes)","Nota promedio (quices)","Nota promedio (tareas)","Nota Proyecto #1","Nota Proyecto #2","Nota Proyecto #3"};
            modeloTabla = new DefaultTableModel(cabeceras, 0);
            archivo.showOpenDialog(this);
            File abrir = archivo.getSelectedFile();
            Object[] elemento = new Object[12];
            
            if(abrir!=null){
                FileReader fichero = new FileReader(abrir);
                BufferedReader leer = new BufferedReader(fichero);
                
                while((texto = leer.readLine()) != null){
                    String registro[] = texto.split(",");
                    elemento[0] = registro[0];
                    elemento[1] = registro[1];
                    elemento[2] = registro[2];
                    elemento[3] = registro[3];
                    elemento[4] = registro[4];
                    elemento[5] = registro[5];
                    elemento[6] = registro[6];
                    elemento[7] = registro[7];
                    elemento[8] = registro[8];
                    elemento[9] = registro[9];
                    elemento[10] = registro[10];
                    elemento[11] = registro[11];
                    elemento[12] = registro[12];
                    modeloTabla.addRow(elemento);
                    
                }
                lista.setModel(modeloTabla);
                
            }
            
        }catch(IOException ex){
        
            System.out.println("error: "+ex);
        }
        
    }
    
    /**
     * Creates new form abrelista2
     */
    public abrelista2() {
        initComponents();
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
        lista = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Tabla del archivo");

        lista.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(lista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable lista;
    // End of variables declaration//GEN-END:variables
}