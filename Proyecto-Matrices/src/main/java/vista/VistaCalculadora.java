/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Pamela
 */
public class VistaCalculadora extends javax.swing.JFrame implements ActionListener{

    PanelSumar panelSumar = new PanelSumar();
    PanelMultEscalar panelMultEscalar = new PanelMultEscalar(); 
    PanelMultiplicar panelMultiplicar = new PanelMultiplicar(); 
    PanelObtenerInv panelObtenerInv = new PanelObtenerInv();
    PanelSolucionarEcuacion panelSolucionarEcuacion = new PanelSolucionarEcuacion();
    PanelDeterminante panelDeterminante = new PanelDeterminante(); 
    PanelCramer panelCramer = new PanelCramer();
    Controlador miControlador;
    /**
     * Creates new form VistaPrincipal
     */
    public VistaCalculadora() {
        initComponents();
        
        //contenedor.add(panelSumar);
        panelSumar.setVisible(false);
        panelMultEscalar.setVisible(false);
        panelMultiplicar.setVisible(false);
        panelObtenerInv.setVisible(false);
        panelSolucionarEcuacion.setVisible(false);
        panelDeterminante.setVisible(false);
        panelCramer.setVisible(false);
        
        deshabilitarBotones();
        
        btnSumarMatrices.addActionListener(this);
        btnMultiplicarEscalar.addActionListener(this);
        btnMultiplicarMatrices.addActionListener(this);
        btnObtenerInversa.addActionListener(this);
        btnSolucionarSistemaDeEcuaciones.addActionListener(this);
        btnObtenerDeterminante.addActionListener(this);
        btnSolucionarSistemaPorCramer.addActionListener(this);
    }
    
    public void deshabilitarBotones(){
        if(panelSumar.isVisible()){
            btnSumarMatrices.setEnabled(false);
            btnMultiplicarEscalar.setEnabled(true);
            btnMultiplicarMatrices.setEnabled(true);
            btnObtenerInversa.setEnabled(true);
            btnSolucionarSistemaDeEcuaciones.setEnabled(true);
            btnObtenerDeterminante.setEnabled(true);
            btnSolucionarSistemaPorCramer.setEnabled(true);
        }else if(panelMultEscalar.isVisible()){
            btnSumarMatrices.setEnabled(true);
            btnMultiplicarEscalar.setEnabled(false);
            btnMultiplicarMatrices.setEnabled(true);
            btnObtenerInversa.setEnabled(true);
            btnSolucionarSistemaDeEcuaciones.setEnabled(true);
            btnObtenerDeterminante.setEnabled(true);
            btnSolucionarSistemaPorCramer.setEnabled(true);
        } else if (panelMultiplicar.isVisible()){
            btnSumarMatrices.setEnabled(true);
            btnMultiplicarEscalar.setEnabled(true);
            btnMultiplicarMatrices.setEnabled(false);
            btnObtenerInversa.setEnabled(true);
            btnSolucionarSistemaDeEcuaciones.setEnabled(true);
            btnObtenerDeterminante.setEnabled(true);
            btnSolucionarSistemaPorCramer.setEnabled(true);
        }else if (panelObtenerInv.isVisible()){
            btnSumarMatrices.setEnabled(true);
            btnMultiplicarEscalar.setEnabled(true);
            btnMultiplicarMatrices.setEnabled(true);
            btnObtenerInversa.setEnabled(false);
            btnSolucionarSistemaDeEcuaciones.setEnabled(true);
            btnObtenerDeterminante.setEnabled(true);
            btnSolucionarSistemaPorCramer.setEnabled(true);
        } else if (panelSolucionarEcuacion.isVisible()){
            btnSumarMatrices.setEnabled(true);
            btnMultiplicarEscalar.setEnabled(true);
            btnMultiplicarMatrices.setEnabled(true);
            btnObtenerInversa.setEnabled(true);
            btnSolucionarSistemaDeEcuaciones.setEnabled(false);
            btnObtenerDeterminante.setEnabled(true);
            btnSolucionarSistemaPorCramer.setEnabled(true);
        } else if (panelDeterminante.isVisible()){
            btnSumarMatrices.setEnabled(true);
            btnMultiplicarEscalar.setEnabled(true);
            btnMultiplicarMatrices.setEnabled(true);
            btnObtenerInversa.setEnabled(true);
            btnSolucionarSistemaDeEcuaciones.setEnabled(true);
            btnObtenerDeterminante.setEnabled(false);
            btnSolucionarSistemaPorCramer.setEnabled(true);
        }else if (panelCramer.isVisible()){
            btnSumarMatrices.setEnabled(true);
            btnMultiplicarEscalar.setEnabled(true);
            btnMultiplicarMatrices.setEnabled(true);
            btnObtenerInversa.setEnabled(true);
            btnSolucionarSistemaDeEcuaciones.setEnabled(true);
            btnObtenerDeterminante.setEnabled(true);
            btnSolucionarSistemaPorCramer.setEnabled(false);
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

        contenedor = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnSumarMatrices = new javax.swing.JButton();
        btnMultiplicarEscalar = new javax.swing.JButton();
        btnMultiplicarMatrices = new javax.swing.JButton();
        btnObtenerInversa = new javax.swing.JButton();
        btnSolucionarSistemaDeEcuaciones = new javax.swing.JButton();
        btnObtenerDeterminante = new javax.swing.JButton();
        btnSolucionarSistemaPorCramer = new javax.swing.JButton();
        scrollPaneles = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedor.setLayout(new java.awt.BorderLayout());

        btnSumarMatrices.setText("Suma de matrices");

        btnMultiplicarEscalar.setText("Multiplicar por escalar");

        btnMultiplicarMatrices.setText("Multiplicar matrices");

        btnObtenerInversa.setText("Obtener inversa por Gauss-Jordan");

        btnSolucionarSistemaDeEcuaciones.setText("Solución de un sistema de ecuaciones por Gauss-Jordan");

        btnObtenerDeterminante.setText("Determinante de una matriz");

        btnSolucionarSistemaPorCramer.setText("Solucion de un sistema de ecuaciones por Cramer");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSumarMatrices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnMultiplicarEscalar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMultiplicarMatrices, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnObtenerDeterminante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSolucionarSistemaDeEcuaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnObtenerInversa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSolucionarSistemaPorCramer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btnSumarMatrices)
                .addGap(18, 18, 18)
                .addComponent(btnMultiplicarEscalar)
                .addGap(18, 18, 18)
                .addComponent(btnMultiplicarMatrices)
                .addGap(18, 18, 18)
                .addComponent(btnObtenerInversa)
                .addGap(18, 18, 18)
                .addComponent(btnSolucionarSistemaDeEcuaciones)
                .addGap(18, 18, 18)
                .addComponent(btnObtenerDeterminante)
                .addGap(18, 18, 18)
                .addComponent(btnSolucionarSistemaPorCramer)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        contenedor.add(jPanel1, java.awt.BorderLayout.LINE_START);
        contenedor.add(scrollPaneles, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VistaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMultiplicarEscalar;
    private javax.swing.JButton btnMultiplicarMatrices;
    private javax.swing.JButton btnObtenerDeterminante;
    private javax.swing.JButton btnObtenerInversa;
    private javax.swing.JButton btnSolucionarSistemaDeEcuaciones;
    private javax.swing.JButton btnSolucionarSistemaPorCramer;
    private javax.swing.JButton btnSumarMatrices;
    private javax.swing.JPanel contenedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scrollPaneles;
    // End of variables declaration//GEN-END:variables

    public void definirPanel (PanelSumar miPanelSumar){
        scrollPaneles.setViewportView(miPanelSumar);
    }
    
    public void definirPanel (PanelMultEscalar miPanelMultEscalar){
        scrollPaneles.setViewportView(miPanelMultEscalar);
    }
    
    public void definirPanel (PanelMultiplicar miPanelMultiplicar){
        scrollPaneles.setViewportView(miPanelMultiplicar);
    }
    
    public void definirPanel (PanelObtenerInv miPanelObtenerInv){
        scrollPaneles.setViewportView(miPanelObtenerInv);
    }
    
    public void definirPanel (PanelSolucionarEcuacion miPanelSolucionarEcuacion){
        scrollPaneles.setViewportView(miPanelSolucionarEcuacion);
    }
    
    public void definirPanel (PanelDeterminante miPanelDeterminante){
        scrollPaneles.setViewportView(miPanelDeterminante);
    }
    
    public void definirPanel (PanelCramer miPanelCramer){
        scrollPaneles.setViewportView(miPanelCramer);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object evt = e.getSource();
        
        if(evt.equals(btnSumarMatrices)){
            miControlador.cargarPanel(1);
            panelSumar.setVisible(true);
            panelMultEscalar.setVisible(false);
            panelMultiplicar.setVisible(false);
            panelObtenerInv.setVisible(false);
            panelSolucionarEcuacion.setVisible(false);
            panelDeterminante.setVisible(false);
            panelCramer.setVisible(false);
            
            //contenedor.add(panelSumar);
            
            //contenedor.validate();
            
            deshabilitarBotones();
            
        } else if(evt.equals(btnMultiplicarEscalar)){
            miControlador.cargarPanel(2);
            panelSumar.setVisible(false);
            panelMultEscalar.setVisible(true);
            panelMultiplicar.setVisible(false);
            panelObtenerInv.setVisible(false);
            panelSolucionarEcuacion.setVisible(false);
            panelDeterminante.setVisible(false);
            panelCramer.setVisible(false);
            
            contenedor.add(panelMultEscalar);
            
            contenedor.validate();
            
            deshabilitarBotones();
        } else if (evt.equals(btnMultiplicarMatrices)){
            miControlador.cargarPanel(3);
            panelSumar.setVisible(false);
            panelMultEscalar.setVisible(false);
            panelMultiplicar.setVisible(true);
            panelObtenerInv.setVisible(false);
            panelSolucionarEcuacion.setVisible(false);
            panelDeterminante.setVisible(false);
            panelCramer.setVisible(false);
            
            contenedor.add(panelMultiplicar);
            
            contenedor.validate();
            
            deshabilitarBotones();
        } else if (evt.equals(btnObtenerInversa)){
            miControlador.cargarPanel(4);
            panelSumar.setVisible(false);
            panelMultEscalar.setVisible(false);
            panelMultiplicar.setVisible(false);
            panelObtenerInv.setVisible(true);
            panelSolucionarEcuacion.setVisible(false);
            panelDeterminante.setVisible(false);
            panelCramer.setVisible(false);
            
            contenedor.add(panelObtenerInv);
            
            contenedor.validate();
            
            deshabilitarBotones();
        } else if (evt.equals(btnSolucionarSistemaDeEcuaciones)){
            miControlador.cargarPanel(5);
            panelSumar.setVisible(false);
            panelMultEscalar.setVisible(false);
            panelMultiplicar.setVisible(false);
            panelObtenerInv.setVisible(false);
            panelSolucionarEcuacion.setVisible(true);
            panelDeterminante.setVisible(false);
            panelCramer.setVisible(false);
            
            contenedor.add(panelSolucionarEcuacion);
            
            contenedor.validate();
            
            deshabilitarBotones();
        }else if (evt.equals(btnObtenerDeterminante)){
            miControlador.cargarPanel(6);
            panelSumar.setVisible(false);
            panelMultEscalar.setVisible(false);
            panelMultiplicar.setVisible(false);
            panelObtenerInv.setVisible(false);
            panelSolucionarEcuacion.setVisible(false);
            panelDeterminante.setVisible(true);
            panelCramer.setVisible(false);
            
            contenedor.add(panelDeterminante);
            
            contenedor.validate();
            
            deshabilitarBotones();
        } else if (evt.equals(btnSolucionarSistemaPorCramer)){
            miControlador.cargarPanel(7);
            panelSumar.setVisible(false);
            panelMultEscalar.setVisible(false);
            panelMultiplicar.setVisible(false);
            panelObtenerInv.setVisible(false);
            panelSolucionarEcuacion.setVisible(false);
            panelDeterminante.setVisible(false);
            panelCramer.setVisible(true);
            
            contenedor.add(panelCramer);
            
            contenedor.validate();
            
            deshabilitarBotones();
        }
    }
    
    public void setControlador(Controlador controlador){
        miControlador = controlador; 
    }
}
