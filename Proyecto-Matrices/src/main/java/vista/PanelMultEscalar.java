/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Pamela
 */
public class PanelMultEscalar extends javax.swing.JPanel {
    
    Controlador miControlador; 
    /**
     * Creates new form PanelMultEscalar
     */
    public PanelMultEscalar() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        matrizA11 = new javax.swing.JTextField();
        matrizA12 = new javax.swing.JTextField();
        matrizA13 = new javax.swing.JTextField();
        matrizA14 = new javax.swing.JTextField();
        matrizA15 = new javax.swing.JTextField();
        matrizA21 = new javax.swing.JTextField();
        matrizA22 = new javax.swing.JTextField();
        matrizA23 = new javax.swing.JTextField();
        matrizA24 = new javax.swing.JTextField();
        matrizA25 = new javax.swing.JTextField();
        matrizA31 = new javax.swing.JTextField();
        matrizA32 = new javax.swing.JTextField();
        matrizA33 = new javax.swing.JTextField();
        matrizA34 = new javax.swing.JTextField();
        matrizA35 = new javax.swing.JTextField();
        matrizA41 = new javax.swing.JTextField();
        matrizA42 = new javax.swing.JTextField();
        matrizA43 = new javax.swing.JTextField();
        matrizA44 = new javax.swing.JTextField();
        matrizA45 = new javax.swing.JTextField();
        matrizA51 = new javax.swing.JTextField();
        matrizA52 = new javax.swing.JTextField();
        matrizA53 = new javax.swing.JTextField();
        matrizA54 = new javax.swing.JTextField();
        matrizA55 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        escalar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnMultiplicarEscalar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrarResultado = new javax.swing.JTextArea();

        setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Matriz A");

        matrizA11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matrizA11ActionPerformed(evt);
            }
        });

        matrizA23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matrizA23ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("(");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText(")");

        btnMultiplicarEscalar.setText("Multiplicar por escalar");

        mostrarResultado.setColumns(20);
        mostrarResultado.setRows(5);
        jScrollPane1.setViewportView(mostrarResultado);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMultiplicarEscalar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(matrizA51, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(matrizA52))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(matrizA41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(matrizA42))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(matrizA31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(matrizA32))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(matrizA21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(matrizA22))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(matrizA11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(matrizA12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(matrizA13)
                                    .addComponent(matrizA23)
                                    .addComponent(matrizA33)
                                    .addComponent(matrizA43)
                                    .addComponent(matrizA53, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(matrizA14)
                                    .addComponent(matrizA24)
                                    .addComponent(matrizA34)
                                    .addComponent(matrizA44)
                                    .addComponent(matrizA54, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(matrizA15)
                                    .addComponent(matrizA25)
                                    .addComponent(matrizA35)
                                    .addComponent(matrizA45)
                                    .addComponent(matrizA55, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(escalar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addContainerGap(92, Short.MAX_VALUE))))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matrizA11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matrizA12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matrizA13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matrizA14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matrizA15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matrizA21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matrizA22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matrizA23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matrizA24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matrizA25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matrizA31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matrizA32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matrizA33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matrizA34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matrizA35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(escalar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matrizA41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matrizA42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matrizA43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matrizA44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matrizA45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matrizA51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matrizA52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matrizA53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matrizA54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matrizA55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnMultiplicarEscalar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel1);

        add(jScrollPane2);
    }// </editor-fold>//GEN-END:initComponents

    private void matrizA23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matrizA23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matrizA23ActionPerformed

    private void matrizA11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matrizA11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matrizA11ActionPerformed
    
    public String getMatrizA11(){
        return matrizA11.getText();
    }
    
    public String getMatrizA12(){
        return matrizA12.getText();
    }
    
    public String getMatrizA13(){
        return matrizA13.getText();
    }
    
    public String getMatrizA14(){
        return matrizA14.getText();
    }
    
    public String getMatrizA15(){
        return matrizA15.getText();
    }
    
    public String getMatrizA21(){
        return matrizA21.getText();
    }
    
    public String getMatrizA22(){
        return matrizA22.getText();
    }
    
    public String getMatrizA23(){
        return matrizA23.getText();
    }
    
    public String getMatrizA24(){
        return matrizA24.getText();
    }
    
    public String getMatrizA25(){
        return matrizA25.getText();
    }
    
    public String getMatrizA31(){
        return matrizA31.getText();
    }
    
    public String getMatrizA32(){
        return matrizA32.getText();
    }
    
    public String getMatrizA33(){
        return matrizA33.getText();
    }
    
    public String getMatrizA34(){
        return matrizA34.getText();
    }
    
    public String getMatrizA35(){
        return matrizA35.getText();
    }
    
    public String getMatrizA41(){
        return matrizA41.getText();
    }
    
    public String getMatrizA42(){
        return matrizA42.getText();
    }
    
    public String getMatrizA43(){
        return matrizA43.getText();
    }
    
    public String getMatrizA44(){
        return matrizA44.getText();
    }
    
    public String getMatrizA45(){
        return matrizA45.getText();
    }
    
    public String getMatrizA51(){
        return matrizA51.getText();
    }
    
    public String getMatrizA52(){
        return matrizA52.getText();
    }
    
    public String getMatrizA53(){
        return matrizA53.getText();
    }
    
    public String getMatrizA54(){
        return matrizA54.getText();
    }
    
    public String getMatrizA55(){
        return matrizA55.getText();
    }
    
    public String getEscalar(){
        return escalar.getText();
    }
    
    public void setCalcSolucion(double[][] solucion){
        mostrarResultado.setText(String.valueOf(solucion));
    }
    
    public void addCalculadoraListener(ActionListener listenforBtnSumar){
        btnMultiplicarEscalar.addActionListener(listenforBtnSumar);
    }
    
    public void displayErrorMessage(String mensajeError){
        JOptionPane.showMessageDialog(this, mensajeError); 
    }
    
    public void setControlador(Controlador controlador){
        miControlador = controlador; 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMultiplicarEscalar;
    private javax.swing.JTextField escalar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField matrizA11;
    private javax.swing.JTextField matrizA12;
    private javax.swing.JTextField matrizA13;
    private javax.swing.JTextField matrizA14;
    private javax.swing.JTextField matrizA15;
    private javax.swing.JTextField matrizA21;
    private javax.swing.JTextField matrizA22;
    private javax.swing.JTextField matrizA23;
    private javax.swing.JTextField matrizA24;
    private javax.swing.JTextField matrizA25;
    private javax.swing.JTextField matrizA31;
    private javax.swing.JTextField matrizA32;
    private javax.swing.JTextField matrizA33;
    private javax.swing.JTextField matrizA34;
    private javax.swing.JTextField matrizA35;
    private javax.swing.JTextField matrizA41;
    private javax.swing.JTextField matrizA42;
    private javax.swing.JTextField matrizA43;
    private javax.swing.JTextField matrizA44;
    private javax.swing.JTextField matrizA45;
    private javax.swing.JTextField matrizA51;
    private javax.swing.JTextField matrizA52;
    private javax.swing.JTextField matrizA53;
    private javax.swing.JTextField matrizA54;
    private javax.swing.JTextField matrizA55;
    private javax.swing.JTextArea mostrarResultado;
    // End of variables declaration//GEN-END:variables
}
