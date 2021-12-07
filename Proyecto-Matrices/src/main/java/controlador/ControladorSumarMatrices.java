/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.ModeloSumarMatrices;
import vista.PanelSumar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pamela
 */
public class ControladorSumarMatrices  {
    private final PanelSumar laVista; 
    private final ModeloSumarMatrices elModelo; 
    
    public ControladorSumarMatrices(PanelSumar laVista, ModeloSumarMatrices elModelo){
        this.laVista = laVista; 
        this.elModelo = elModelo; 
        
        this.laVista.addCalculadoraListener(new CalculadoraListener()); 
        //initView();
    }
    
    class CalculadoraListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
          //Verificamos el tamaño de las matrices y les asignamos los valores
          //Comprobamos el tamaño de la matriz A
           String comprobarA11 = laVista.getMatrizA11(); 
           if(!comprobarA11.isEmpty()){
               //Sabemos que la matriz tiene un valor inicial en 1x1, es decir que no esta vacia
               //Verifiquemos cuantas columnas tiene la matriz
               String comprobarA12 = laVista.getMatrizA12();
               String comprobarA13 = laVista.getMatrizA13();
               String comprobarA14 = laVista.getMatrizA14();
               String comprobarA15 = laVista.getMatrizA15();
               if(comprobarA12.isEmpty() && comprobarA13.isEmpty() && comprobarA14.isEmpty() && comprobarA15.isEmpty()){
                   //La matriz A solo tiene 1 columna
                   //Comprobemos cuantas filas tiene la matriz
                    String comprobarA21 = laVista.getMatrizA21();
                    String comprobarA31 = laVista.getMatrizA31();
                    String comprobarA41 = laVista.getMatrizA41();
                    String comprobarA51 = laVista.getMatrizA51();
                    if(comprobarA21.isEmpty() && comprobarA31.isEmpty() && comprobarA41.isEmpty() && comprobarA51.isEmpty()){
                        //La matriz es de 1x1
                        double matrizA11 = Double.parseDouble(comprobarA11);
                        double[][] matrizA = {{matrizA11}};
                        //Comprobamos que la matriz B tenga la misma dimension
                        String comprobarB11 = laVista.getMatrizB11(); 
                        if(!comprobarB11.isEmpty()){
                            //Sabemos que la matriz tiene un valor inicial en 1x1, es decir que no esta vacia
                            //Verifiquemos cuantas columnas tiene la matriz
                            String comprobarB12 = laVista.getMatrizB12();
                            String comprobarB13 = laVista.getMatrizB13();
                            String comprobarB14 = laVista.getMatrizB14();
                            String comprobarB15 = laVista.getMatrizB15();
                            if(comprobarB12.isEmpty() && comprobarB13.isEmpty() && comprobarB14.isEmpty() && comprobarB15.isEmpty()){
                                //La matriz B solo tiene 1 columna
                                //Comprobemos cuantas filas tiene la matriz
                                String comprobarB21 = laVista.getMatrizB21();
                                String comprobarB31 = laVista.getMatrizB31();
                                String comprobarB41 = laVista.getMatrizB41();
                                String comprobarB51 = laVista.getMatrizB51();
                                if(comprobarB21.isEmpty() && comprobarB31.isEmpty() && comprobarB41.isEmpty() && comprobarB51.isEmpty()){
                                    //La matriz es de 1x1
                                    double matrizB11 = Double.parseDouble(comprobarB11);
                                    double[][] matrizB = {{matrizB11}}; 
                                    try {
                                        elModelo.sumarMatrices(matrizA,matrizB);
                                    } catch (Exception ex) {
                                        Logger.getLogger(ControladorSumarMatrices.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    laVista.setCalcSolucion(elModelo.getResultado());
                                }else {
                                    laVista.displayErrorMessage("La matriz A y B no tienen las mismas dimensiones");
                                }
                            }
                        }
                    } else if (!comprobarA21.isEmpty() && comprobarA31.isEmpty() && comprobarA41.isEmpty() && comprobarA51.isEmpty()){
                        //La matriz es de 2x1
                        double matrizA11 = Double.parseDouble(comprobarA11);
                        double matrizA21 = Double.parseDouble(comprobarA21);
                        double[][] matrizA = {{matrizA11},{matrizA21}};
                        //Verificamos que la matriz B tenga las mismas dimensiones
                        String comprobarB11 = laVista.getMatrizB11(); 
                        if(!comprobarB11.isEmpty()){
                            //Sabemos que la matriz tiene un valor inicial en 1x1, es decir que no esta vacia
                            //Verifiquemos cuantas columnas tiene la matriz
                            String comprobarB12 = laVista.getMatrizB12();
                            String comprobarB13 = laVista.getMatrizB13();
                            String comprobarB14 = laVista.getMatrizB14();
                            String comprobarB15 = laVista.getMatrizB15();
                            if(comprobarB12.isEmpty() && comprobarB13.isEmpty() && comprobarB14.isEmpty() && comprobarB15.isEmpty()){
                                //La matriz B solo tiene 1 columna
                                //Comprobemos cuantas filas tiene la matriz
                                String comprobarB21 = laVista.getMatrizB21();
                                String comprobarB31 = laVista.getMatrizB31();
                                String comprobarB41 = laVista.getMatrizB41();
                                String comprobarB51 = laVista.getMatrizB51();
                                if(!comprobarB21.isEmpty() && comprobarB31.isEmpty() && comprobarB41.isEmpty() && comprobarB51.isEmpty()){
                                    //La matriz es de 2x1
                                    double matrizB11 = Double.parseDouble(comprobarB11);
                                    double matrizB21 = Double.parseDouble(comprobarB21);
                                    double[][] matrizB = {{matrizB11},{matrizB21}};
                                    try {
                                            elModelo.sumarMatrices(matrizA,matrizB);
                                        } catch (Exception ex) {
                                            Logger.getLogger(ControladorSumarMatrices.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                } else {
                                    laVista.displayErrorMessage("La matriz A y B no tienen las mismas dimensiones");
                                }
                            }
                        }
                    } else if (!comprobarA21.isEmpty() && !comprobarA31.isEmpty() && comprobarA41.isEmpty() && comprobarA51.isEmpty()){
                        //La matriz es de 3x1
                        double matrizA11 = Double.parseDouble(comprobarA11);
                        double matrizA21 = Double.parseDouble(comprobarA21);
                        double matrizA31 = Double.parseDouble(comprobarA31);
                        double[][] matrizA = {{matrizA11},{matrizA21}, {matrizA31}};
                        //Verificamos que la matriz B tenga las mismas dimensiones
                        String comprobarB11 = laVista.getMatrizB11(); 
                        if(!comprobarB11.isEmpty()){
                            //Sabemos que la matriz tiene un valor inicial en 1x1, es decir que no esta vacia
                            //Verifiquemos cuantas columnas tiene la matriz
                            String comprobarB12 = laVista.getMatrizB12();
                            String comprobarB13 = laVista.getMatrizB13();
                            String comprobarB14 = laVista.getMatrizB14();
                            String comprobarB15 = laVista.getMatrizB15();
                            if(comprobarB12.isEmpty() && comprobarB13.isEmpty() && comprobarB14.isEmpty() && comprobarB15.isEmpty()){
                                //La matriz A solo tiene 1 columna
                                //Comprobemos cuantas filas tiene la matriz
                                String comprobarB21 = laVista.getMatrizB21();
                                String comprobarB31 = laVista.getMatrizB31();
                                String comprobarB41 = laVista.getMatrizB41();
                                String comprobarB51 = laVista.getMatrizB51();
                                if (!comprobarB21.isEmpty() && !comprobarB31.isEmpty() && comprobarB41.isEmpty() && comprobarB51.isEmpty()){
                                    //La matriz es de 3x1
                                    double matrizB11 = Double.parseDouble(comprobarB11);
                                    double matrizB21 = Double.parseDouble(comprobarB21);
                                    double matrizB31 = Double.parseDouble(comprobarB31);
                                    double[][] matrizB = {{matrizB11},{matrizB21}, {matrizB31}};
                                try {
                                            elModelo.sumarMatrices(matrizA,matrizB);
                                        } catch (Exception ex) {
                                            Logger.getLogger(ControladorSumarMatrices.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                } else {
                                    laVista.displayErrorMessage("La matriz A y B no tienen las mismas dimensiones");
                                }
                            }
                        }
                    } else if (!comprobarA21.isEmpty() && !comprobarA31.isEmpty() && !comprobarA41.isEmpty() && comprobarA51.isEmpty()){
                        //La matriz es de 4x1
                        double matrizA11 = Double.parseDouble(comprobarA11);
                        double matrizA21 = Double.parseDouble(comprobarA21);
                        double matrizA31 = Double.parseDouble(comprobarA31);
                        double matrizA41 = Double.parseDouble(comprobarA41);
                        double[][] matrizA = {{matrizA11},{matrizA21}, {matrizA31}, {matrizA41}};
                        //Verificamos que la matriz B tenga las mismas dimensiones
                        String comprobarB11 = laVista.getMatrizB11(); 
                        if(!comprobarB11.isEmpty()){
                            //Sabemos que la matriz tiene un valor inicial en 1x1, es decir que no esta vacia
                            //Verifiquemos cuantas columnas tiene la matriz
                            String comprobarB12 = laVista.getMatrizB12();
                            String comprobarB13 = laVista.getMatrizB13();
                            String comprobarB14 = laVista.getMatrizB14();
                            String comprobarB15 = laVista.getMatrizB15();
                            if(comprobarB12.isEmpty() && comprobarB13.isEmpty() && comprobarB14.isEmpty() && comprobarB15.isEmpty()){
                                //La matriz A solo tiene 1 columna
                                //Comprobemos cuantas filas tiene la matriz
                                String comprobarB21 = laVista.getMatrizB21();
                                String comprobarB31 = laVista.getMatrizB31();
                                String comprobarB41 = laVista.getMatrizB41();
                                String comprobarB51 = laVista.getMatrizB51();
                                if (!comprobarB21.isEmpty() && !comprobarB31.isEmpty() && !comprobarB41.isEmpty() && comprobarB51.isEmpty()){
                                    //La matriz esde 4x1
                                    double matrizB11 = Double.parseDouble(comprobarB11);
                                    double matrizB21 = Double.parseDouble(comprobarB21);
                                    double matrizB31 = Double.parseDouble(comprobarB31);
                                    double matrizB41 = Double.parseDouble(comprobarB41);
                                    double[][] matrizB = {{matrizB11},{matrizB21}, {matrizB31}, {matrizB41}};
                                    try {
                                            elModelo.sumarMatrices(matrizA,matrizB);
                                        } catch (Exception ex) {
                                            Logger.getLogger(ControladorSumarMatrices.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                } else {
                                    laVista.displayErrorMessage("La matriz A y B no tienen las mismas dimensiones");
                                }
                            }
                        }
                    } else if (!comprobarA21.isEmpty() && !comprobarA31.isEmpty() && !comprobarA41.isEmpty() && !comprobarA51.isEmpty()){
                        //La matriz es de 5x1
                        double matrizA11 = Double.parseDouble(comprobarA11);
                        double matrizA21 = Double.parseDouble(comprobarA21);
                        double matrizA31 = Double.parseDouble(comprobarA31);
                        double matrizA41 = Double.parseDouble(comprobarA41);
                        double matrizA51 = Double.parseDouble(comprobarA51);
                        double[][] matrizA = {{matrizA11},{matrizA21}, {matrizA31}, {matrizA41}, {matrizA51}};
                        //Comprobemos que la matriz B tiene las mismas dimensiones
                        String comprobarB11 = laVista.getMatrizB11(); 
                        if(!comprobarB11.isEmpty()){
                            //Sabemos que la matriz tiene un valor inicial en 1x1, es decir que no esta vacia
                            //Verifiquemos cuantas columnas tiene la matriz
                            String comprobarB12 = laVista.getMatrizB12();
                            String comprobarB13 = laVista.getMatrizB13();
                            String comprobarB14 = laVista.getMatrizB14();
                            String comprobarB15 = laVista.getMatrizB15();
                            if(comprobarB12.isEmpty() && comprobarB13.isEmpty() && comprobarB14.isEmpty() && comprobarB15.isEmpty()){
                                //La matriz B solo tiene 1 columna
                                //Comprobemos cuantas filas tiene la matriz
                                String comprobarB21 = laVista.getMatrizB21();
                                String comprobarB31 = laVista.getMatrizB31();
                                String comprobarB41 = laVista.getMatrizB41();
                                String comprobarB51 = laVista.getMatrizB51();
                                if (!comprobarB21.isEmpty() && !comprobarB31.isEmpty() && !comprobarB41.isEmpty() && !comprobarB51.isEmpty()){
                                    //La matriz es de 5x1
                                    double matrizB11 = Double.parseDouble(comprobarB11);
                                    double matrizB21 = Double.parseDouble(comprobarB21);
                                    double matrizB31 = Double.parseDouble(comprobarB31);
                                    double matrizB41 = Double.parseDouble(comprobarB41);
                                    double matrizB51 = Double.parseDouble(comprobarB51);
                                    double[][] matrizB = {{matrizB11},{matrizB21}, {matrizB31}, {matrizB41}, {matrizB51}};
                                try {
                                            elModelo.sumarMatrices(matrizA,matrizB);
                                        } catch (Exception ex) {
                                            Logger.getLogger(ControladorSumarMatrices.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                } else {
                                    laVista.displayErrorMessage("La matriz A y B no tienen las mismas dimensiones");
                                }
                            }
                        }
                    }
                }else if(!comprobarA12.isEmpty() && comprobarA13.isEmpty() && comprobarA14.isEmpty() && comprobarA15.isEmpty()){
                   //La matriz A solo tiene 2 columnas 
                   //Comprobemos cuantas filas tiene la matriz
                    String comprobarA21 = laVista.getMatrizA21();
                    String comprobarA31 = laVista.getMatrizA31();
                    String comprobarA41 = laVista.getMatrizA41();
                    String comprobarA51 = laVista.getMatrizA51();
                    if(comprobarA21.isEmpty() && comprobarA31.isEmpty() && comprobarA41.isEmpty() && comprobarA51.isEmpty()){
                        //La matriz es de 1x2
                        double matrizA11 = Double.parseDouble(comprobarA11);
                        double matrizA12 = Double.parseDouble(comprobarA12);
                        double[][] matrizA = {{matrizA11, matrizA12}};
                        //Comprobemos que ambas matrices tienen las mismas dimensiones
                        String comprobarB12 = laVista.getMatrizB12();
                        String comprobarB13 = laVista.getMatrizB13();
                        String comprobarB14 = laVista.getMatrizB14();
                        String comprobarB15 = laVista.getMatrizB15();
                        String comprobarB11 = laVista.getMatrizB11();
                        if(!comprobarB12.isEmpty() && comprobarB13.isEmpty() && comprobarB14.isEmpty() && comprobarB15.isEmpty()){
                            //La matriz A solo tiene 2 columnas 
                            //Comprobemos cuantas filas tiene la matriz
                            String comprobarB21 = laVista.getMatrizB21();
                            String comprobarB31 = laVista.getMatrizB31();
                            String comprobarB41 = laVista.getMatrizB41();
                            String comprobarB51 = laVista.getMatrizB51();
                            if(comprobarB21.isEmpty() && comprobarB31.isEmpty() && comprobarB41.isEmpty() && comprobarB51.isEmpty()){
                                //La matriz es de 1x2
                                double matrizB11 = Double.parseDouble(comprobarB11);
                                double matrizB12 = Double.parseDouble(comprobarB12);
                                double[][] matrizB = {{matrizB11, matrizB12}};
                                try {
                                    elModelo.sumarMatrices(matrizA,matrizB);
                                    } catch (Exception ex) {
                                        Logger.getLogger(ControladorSumarMatrices.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                            } else {
                                laVista.displayErrorMessage("La matriz A y B no tienen las mismas dimensiones");
                            }
                        }
                    } else if (!comprobarA21.isEmpty() && comprobarA31.isEmpty() && comprobarA41.isEmpty() && comprobarA51.isEmpty()){            
                        //La matriz es de 2x2
                        //Comprobamos que la matriz tenga todos los valores
                        String comprobarA22 = laVista.getMatrizA22();
                        if(!comprobarA22.isEmpty()){
                            double matrizA11 = Double.parseDouble(comprobarA11);
                            double matrizA12 = Double.parseDouble(comprobarA12);
                            double matrizA21 = Double.parseDouble(comprobarA21);
                            double matrizA22 = Double.parseDouble(comprobarA22);
                            double[][] matrizA = {{matrizA11, matrizA12}, {matrizA21,matrizA22}};
                            //Comprobamos que las dos matrices tengan las mismas dimensiones
                            String comprobarB12 = laVista.getMatrizB12();
                            String comprobarB13 = laVista.getMatrizB13();
                            String comprobarB14 = laVista.getMatrizB14();
                            String comprobarB15 = laVista.getMatrizB15();
                            String comprobarB11 = laVista.getMatrizB11();
                            if(!comprobarB12.isEmpty() && comprobarB13.isEmpty() && comprobarB14.isEmpty() && comprobarB15.isEmpty()){
                                //La matriz B solo tiene 2 columnas 
                                //Comprobemos cuantas filas tiene la matriz
                                String comprobarB21 = laVista.getMatrizB21();
                                String comprobarB31 = laVista.getMatrizB31();
                                String comprobarB41 = laVista.getMatrizB41();
                                String comprobarB51 = laVista.getMatrizB51();
                                if (!comprobarB21.isEmpty() && comprobarB31.isEmpty() && comprobarB41.isEmpty() && comprobarB51.isEmpty()){
                                    //La matriz es de 2x2
                                    //Comprobamos que la matriz tenga todos los valores
                                    String comprobarB22 = laVista.getMatrizB22();
                                    if(!comprobarB22.isEmpty()){
                                        double matrizB11 = Double.parseDouble(comprobarB11);
                                        double matrizB12 = Double.parseDouble(comprobarB12);
                                        double matrizB21 = Double.parseDouble(comprobarB21);
                                        double matrizB22 = Double.parseDouble(comprobarB22);
                                        double[][] matrizB = {{matrizB11, matrizB12}, {matrizB21,matrizB22}};
                                        try {
                                            elModelo.sumarMatrices(matrizA,matrizB);
                                        } catch (Exception ex) {
                                            Logger.getLogger(ControladorSumarMatrices.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    } else {
                                        laVista.displayErrorMessage("La matriz A y B no tienen las mismas dimensiones");
                                    }
                                }
                            }
                        }
                    } else if (!comprobarA21.isEmpty() && !comprobarA31.isEmpty() && comprobarA41.isEmpty() && comprobarA51.isEmpty()){
                        //La matriz es de 3x2
                        //Comprobamos que la matriz tenga todos los valores
                        String comprobarA22 = laVista.getMatrizA22();
                        String comprobarA32 = laVista.getMatrizA32();
                        if(!comprobarA32.isEmpty()){
                            double matrizA11 = Double.parseDouble(comprobarA11);
                            double matrizA12 = Double.parseDouble(comprobarA12);
                            double matrizA21 = Double.parseDouble(comprobarA21);
                            double matrizA22 = Double.parseDouble(comprobarA22);
                            double matrizA31 = Double.parseDouble(comprobarA31);
                            double matrizA32 = Double.parseDouble(comprobarA32);
                            double[][] matrizA = {{matrizA11, matrizA12}, {matrizA21,matrizA22},{matrizA31,matrizA32}};
                            //Verifiquemos que ambas matrices tienen las mismas dimensiones
                            String comprobarB12 = laVista.getMatrizB12();
                            String comprobarB13 = laVista.getMatrizB13();
                            String comprobarB14 = laVista.getMatrizB14();
                            String comprobarB15 = laVista.getMatrizB15();
                            String comprobarB11 = laVista.getMatrizB11();
                            if(!comprobarB12.isEmpty() && comprobarB13.isEmpty() && comprobarB14.isEmpty() && comprobarB15.isEmpty()){
                                //La matriz B solo tiene 2 columnas 
                                //Comprobemos cuantas filas tiene la matriz
                                String comprobarB21 = laVista.getMatrizB21();
                                String comprobarB31 = laVista.getMatrizB31();
                                String comprobarB41 = laVista.getMatrizB41();
                                String comprobarB51 = laVista.getMatrizB51();
                                if (!comprobarB21.isEmpty() && !comprobarB31.isEmpty() && comprobarB41.isEmpty() && comprobarB51.isEmpty()){
                                //La matriz es de 3x2
                                //Comprobamos que la matriz tenga todos los valores
                                String comprobarB22 = laVista.getMatrizB22();
                                String comprobarB32 = laVista.getMatrizB32();
                                if(!comprobarB32.isEmpty()){
                                    double matrizB11 = Double.parseDouble(comprobarB11);
                                    double matrizB12 = Double.parseDouble(comprobarB12);
                                    double matrizB21 = Double.parseDouble(comprobarB21);
                                    double matrizB22 = Double.parseDouble(comprobarB22);
                                    double matrizB31 = Double.parseDouble(comprobarB31);
                                    double matrizB32 = Double.parseDouble(comprobarB32);
                                    double[][] matrizB = {{matrizB11, matrizB12}, {matrizB21,matrizB22},{matrizB31,matrizB32}};
                                    try {
                                            elModelo.sumarMatrices(matrizA,matrizB);
                                        } catch (Exception ex) {
                                            Logger.getLogger(ControladorSumarMatrices.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    } else {
                                        laVista.displayErrorMessage("La matriz A y B no tienen las mismas dimensiones");
                                    }
                                }
                            }
                        }
                    } else if (!comprobarA21.isEmpty() && !comprobarA31.isEmpty() && !comprobarA41.isEmpty() && comprobarA51.isEmpty()){
                        //La matriz es de 4x2
                        //Comprobamos que la matriz tenga todos los valores
                        String comprobarA22 = laVista.getMatrizA22();
                        String comprobarA32 = laVista.getMatrizA32();
                        String comprobarA42 = laVista.getMatrizA42();
                        if(!comprobarA42.isEmpty()){
                            double matrizA11 = Double.parseDouble(comprobarA11);
                            double matrizA12 = Double.parseDouble(comprobarA12);
                            double matrizA21 = Double.parseDouble(comprobarA21);
                            double matrizA22 = Double.parseDouble(comprobarA22);
                            double matrizA31 = Double.parseDouble(comprobarA31);
                            double matrizA32 = Double.parseDouble(comprobarA32);
                            double matrizA41 = Double.parseDouble(comprobarA41);
                            double matrizA42 = Double.parseDouble(comprobarA42);
                            double[][] matrizA = {{matrizA11, matrizA12}, {matrizA21,matrizA22},{matrizA31,matrizA32}, {matrizA41,matrizA42}};
                        //Verifiquemos que ambas matrices tienen las mismas dimensiones
                            String comprobarB12 = laVista.getMatrizB12();
                            String comprobarB13 = laVista.getMatrizB13();
                            String comprobarB14 = laVista.getMatrizB14();
                            String comprobarB15 = laVista.getMatrizB15();
                            String comprobarB11 = laVista.getMatrizB11();
                            if(!comprobarB12.isEmpty() && comprobarB13.isEmpty() && comprobarB14.isEmpty() && comprobarB15.isEmpty()){
                                //La matriz B solo tiene 2 columnas 
                                //Comprobemos cuantas filas tiene la matriz
                                String comprobarB21 = laVista.getMatrizB21();
                                String comprobarB31 = laVista.getMatrizB31();
                                String comprobarB41 = laVista.getMatrizB41();
                                String comprobarB51 = laVista.getMatrizB51();
                                if (!comprobarB21.isEmpty() && !comprobarB31.isEmpty() && !comprobarB41.isEmpty() && comprobarB51.isEmpty()){
                                    //La matriz es de 4x2
                                    //Comprobamos que la matriz tenga todos los valores
                                    String comprobarB22 = laVista.getMatrizB22();
                                    String comprobarB32 = laVista.getMatrizB32();
                                    String comprobarB42 = laVista.getMatrizB42();
                                    if(!comprobarB42.isEmpty()){
                                        double matrizB11 = Double.parseDouble(comprobarB11);
                                        double matrizB12 = Double.parseDouble(comprobarB12);
                                        double matrizB21 = Double.parseDouble(comprobarB21);
                                        double matrizB22 = Double.parseDouble(comprobarB22);
                                        double matrizB31 = Double.parseDouble(comprobarB31);
                                        double matrizB32 = Double.parseDouble(comprobarB32);
                                        double matrizB41 = Double.parseDouble(comprobarB41);
                                        double matrizB42 = Double.parseDouble(comprobarB42);
                                        double[][] matrizB = {{matrizB11, matrizB12}, {matrizB21,matrizB22},{matrizB31,matrizB32}, {matrizB41,matrizB42}};
                                        try {
                                            elModelo.sumarMatrices(matrizA,matrizB);
                                        } catch (Exception ex) {
                                            Logger.getLogger(ControladorSumarMatrices.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    } else {
                                        laVista.displayErrorMessage("La matriz A y B no tienen las mismas dimensiones");
                                    }
                                }
                            }
                        }
                    } else if (!comprobarA21.isEmpty() && !comprobarA31.isEmpty() && !comprobarA41.isEmpty() && !comprobarA51.isEmpty()){
                        //La matriz es de 5x2
                        //Comprobamos que la matriz tenga todos los valores
                        String comprobarA22 = laVista.getMatrizA22();
                        String comprobarA32 = laVista.getMatrizA32();
                        String comprobarA42 = laVista.getMatrizA42();
                        String comprobarA52 = laVista.getMatrizA52();
                        if(!comprobarA52.isEmpty()){
                            double matrizA11 = Double.parseDouble(comprobarA11);
                            double matrizA12 = Double.parseDouble(comprobarA12);
                            double matrizA21 = Double.parseDouble(comprobarA21);
                            double matrizA22 = Double.parseDouble(comprobarA22);
                            double matrizA31 = Double.parseDouble(comprobarA31);
                            double matrizA32 = Double.parseDouble(comprobarA32);
                            double matrizA41 = Double.parseDouble(comprobarA41);
                            double matrizA42 = Double.parseDouble(comprobarA42);
                            double matrizA51 = Double.parseDouble(comprobarA51);
                            double matrizA52 = Double.parseDouble(comprobarA52);
                            double[][] matrizA = {{matrizA11, matrizA12}, {matrizA21,matrizA22},{matrizA31,matrizA32}, {matrizA41,matrizA42}, {matrizA51,matrizA52}};
                            //Verifiquemos que ambas matrices tienen las mismas dimensiones
                            String comprobarB12 = laVista.getMatrizB12();
                            String comprobarB13 = laVista.getMatrizB13();
                            String comprobarB14 = laVista.getMatrizB14();
                            String comprobarB15 = laVista.getMatrizB15();
                            String comprobarB11 = laVista.getMatrizB11();
                            if(!comprobarB12.isEmpty() && comprobarB13.isEmpty() && comprobarB14.isEmpty() && comprobarB15.isEmpty()){
                                //La matriz B solo tiene 2 columnas 
                                //Comprobemos cuantas filas tiene la matriz
                                String comprobarB21 = laVista.getMatrizB21();
                                String comprobarB31 = laVista.getMatrizB31();
                                String comprobarB41 = laVista.getMatrizB41();
                                String comprobarB51 = laVista.getMatrizB51();
                                if (!comprobarB21.isEmpty() && !comprobarB31.isEmpty() && !comprobarB41.isEmpty() && !comprobarB51.isEmpty()){
                                    //La matriz es de 5x2
                                    //Comprobamos que la matriz tenga todos los valores
                                    String comprobarB22 = laVista.getMatrizB22();
                                    String comprobarB32 = laVista.getMatrizB32();
                                    String comprobarB42 = laVista.getMatrizB42();
                                    String comprobarB52 = laVista.getMatrizB52();
                                    if(!comprobarB52.isEmpty()){
                                        double matrizB11 = Double.parseDouble(comprobarB11);
                                        double matrizB12 = Double.parseDouble(comprobarB12);
                                        double matrizB21 = Double.parseDouble(comprobarB21);
                                        double matrizB22 = Double.parseDouble(comprobarB22);
                                        double matrizB31 = Double.parseDouble(comprobarB31);
                                        double matrizB32 = Double.parseDouble(comprobarB32);
                                        double matrizB41 = Double.parseDouble(comprobarB41);
                                        double matrizB42 = Double.parseDouble(comprobarB42);
                                        double matrizB51 = Double.parseDouble(comprobarB51);
                                        double matrizB52 = Double.parseDouble(comprobarB52);
                                        double[][] matrizB = {{matrizB11, matrizB12}, {matrizB21,matrizB22},{matrizB31,matrizB32}, {matrizB41,matrizB42}, {matrizB51,matrizB52}};
                                        try {
                                            elModelo.sumarMatrices(matrizA,matrizB);
                                        } catch (Exception ex) {
                                            Logger.getLogger(ControladorSumarMatrices.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    } else {
                                        laVista.displayErrorMessage("La matriz A y B no tienen las mismas dimensiones");
                                    }
                                }
                            }
                        }
                    }
               }else if(!comprobarA12.isEmpty() && !comprobarA13.isEmpty() && comprobarA14.isEmpty() && comprobarA15.isEmpty()){
                   //La matriz tiene 3 columnas
                   //Comprobemos cuantas filas tiene la matriz
                    String comprobarA21 = laVista.getMatrizA21();
                    String comprobarA31 = laVista.getMatrizA31();
                    String comprobarA41 = laVista.getMatrizA41();
                    String comprobarA51 = laVista.getMatrizA51();
                    if(comprobarA21.isEmpty() && comprobarA31.isEmpty() && comprobarA41.isEmpty() && comprobarA51.isEmpty()){
                        //La matriz es de 1x3
                        double matrizA11 = Double.parseDouble(comprobarA11);
                        double matrizA12 = Double.parseDouble(comprobarA12);
                        double matrizA13 = Double.parseDouble(comprobarA13);
                        double[][] matrizA = {{matrizA11, matrizA12, matrizA13}};
                        //Verifiquemos que ambas matrices tienen las mismas dimensiones
                            String comprobarB12 = laVista.getMatrizB12();
                            String comprobarB13 = laVista.getMatrizB13();
                            String comprobarB14 = laVista.getMatrizB14();
                            String comprobarB15 = laVista.getMatrizB15();
                            String comprobarB11 = laVista.getMatrizB11();
                            if(!comprobarB12.isEmpty() && !comprobarB13.isEmpty() && comprobarB14.isEmpty() && comprobarB15.isEmpty()){
                                //La matriz tiene 3 columnas
                                //Comprobemos cuantas filas tiene la matriz
                                String comprobarB21 = laVista.getMatrizB21();
                                String comprobarB31 = laVista.getMatrizB31();
                                String comprobarB41 = laVista.getMatrizB41();
                                String comprobarB51 = laVista.getMatrizB51();
                                if(comprobarB21.isEmpty() && comprobarB31.isEmpty() && comprobarB41.isEmpty() && comprobarB51.isEmpty()){
                                    //La matriz es de 1x3
                                    double matrizB11 = Double.parseDouble(comprobarB11);
                                    double matrizB12 = Double.parseDouble(comprobarB12);
                                    double matrizB13 = Double.parseDouble(comprobarB13);
                                    double[][] matrizB = {{matrizB11, matrizB12, matrizB13}};
                                    
                                    try {
                                        elModelo.sumarMatrices(matrizA,matrizB);
                                    } catch (Exception ex) {
                                        Logger.getLogger(ControladorSumarMatrices.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                } else {
                                    laVista.displayErrorMessage("La matriz A y B no tienen las mismas dimensiones");
                                }
                            }
                        } else if (!comprobarA21.isEmpty() && comprobarA31.isEmpty() && comprobarA41.isEmpty() && comprobarA51.isEmpty()){
                            //La matriz es de 2x3
                            //Comprobamos que la matriz tenga todos los valores
                            String comprobarA22 = laVista.getMatrizA22();
                            String comprobarA23 = laVista.getMatrizA23();
                            if(!comprobarA22.isEmpty() && !comprobarA23.isEmpty()){
                                double matrizA11 = Double.parseDouble(comprobarA11);
                                double matrizA12 = Double.parseDouble(comprobarA12);
                                double matrizA13 = Double.parseDouble(comprobarA13);
                                double matrizA21 = Double.parseDouble(comprobarA21);
                                double matrizA22 = Double.parseDouble(comprobarA22);
                                double matrizA23 = Double.parseDouble(comprobarA23);
                                double[][] matrizA = {{matrizA11, matrizA12, matrizA13}, {matrizA21,matrizA22,matrizA23}};
                                //Verifiquemos que ambas matrices tienen las mismas dimensiones
                                String comprobarB12 = laVista.getMatrizB12();
                                String comprobarB13 = laVista.getMatrizB13();
                                String comprobarB14 = laVista.getMatrizB14();
                                String comprobarB15 = laVista.getMatrizB15();
                                String comprobarB11 = laVista.getMatrizB11();
                                if(!comprobarB12.isEmpty() && !comprobarB13.isEmpty() && comprobarB14.isEmpty() && comprobarB15.isEmpty()){
                                    //La matriz tiene 3 columnas
                                    //Comprobemos cuantas filas tiene la matriz
                                    String comprobarB21 = laVista.getMatrizB21();
                                    String comprobarB31 = laVista.getMatrizB31();
                                    String comprobarB41 = laVista.getMatrizB41();
                                    String comprobarB51 = laVista.getMatrizB51();
                                    if (!comprobarB21.isEmpty() && comprobarB31.isEmpty() && comprobarB41.isEmpty() && comprobarB51.isEmpty()){
                                        //La matriz es de 2x3
                                        //Comprobamos que la matriz tenga todos los valores
                                        String comprobarB22 = laVista.getMatrizB22();
                                        String comprobarB23 = laVista.getMatrizB23();
                                        if(!comprobarB22.isEmpty() && !comprobarB23.isEmpty()){
                                            double matrizB11 = Double.parseDouble(comprobarB11);
                                            double matrizB12 = Double.parseDouble(comprobarB12);
                                            double matrizB13 = Double.parseDouble(comprobarB13);
                                            double matrizB21 = Double.parseDouble(comprobarB21);
                                            double matrizB22 = Double.parseDouble(comprobarB22);
                                            double matrizB23 = Double.parseDouble(comprobarB23);
                                            double[][] matrizB = {{matrizB11, matrizB12, matrizB13}, {matrizB21,matrizB22,matrizB23}};
                                            try {
                                                elModelo.sumarMatrices(matrizA,matrizB);
                                            } catch (Exception ex) {
                                                Logger.getLogger(ControladorSumarMatrices.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                        } else {
                                            laVista.displayErrorMessage("La matriz A y B no tienen las mismas dimensiones");
                                        }
                                    }
                                }
                            }
                        } else if (!comprobarA21.isEmpty() && !comprobarA31.isEmpty() && comprobarA41.isEmpty() && comprobarA51.isEmpty()){
                            //La matriz es de 3x3
                            //Comprobamos que la matriz tenga todos los valores
                            String comprobarA22 = laVista.getMatrizA22();
                            String comprobarA23 = laVista.getMatrizA23();
                            String comprobarA32 = laVista.getMatrizA32();
                            String comprobarA33 = laVista.getMatrizA33();
                            if(!comprobarA22.isEmpty() && !comprobarA23.isEmpty() && !comprobarA32.isEmpty() && !comprobarA33.isEmpty()){
                                double matrizA11 = Double.parseDouble(comprobarA11);
                                double matrizA12 = Double.parseDouble(comprobarA12);
                                double matrizA13 = Double.parseDouble(comprobarA13);
                                double matrizA21 = Double.parseDouble(comprobarA21);
                                double matrizA22 = Double.parseDouble(comprobarA22);
                                double matrizA23 = Double.parseDouble(comprobarA23);
                                double matrizA31 = Double.parseDouble(comprobarA31);
                                double matrizA32 = Double.parseDouble(comprobarA32);
                                double matrizA33 = Double.parseDouble(comprobarA33);
                                double[][] matrizA = {{matrizA11, matrizA12, matrizA13}, {matrizA21,matrizA22,matrizA23}, {matrizA31,matrizA32,matrizA33}};
                                //Verifiquemos que ambas matrices tienen las mismas dimensiones
                                String comprobarB12 = laVista.getMatrizB12();
                                String comprobarB13 = laVista.getMatrizB13();
                                String comprobarB14 = laVista.getMatrizB14();
                                String comprobarB15 = laVista.getMatrizB15();
                                String comprobarB11 = laVista.getMatrizB11();
                                if(!comprobarB12.isEmpty() && !comprobarB13.isEmpty() && comprobarB14.isEmpty() && comprobarB15.isEmpty()){
                                    //La matriz tiene 3 columnas
                                    //Comprobemos cuantas filas tiene la matriz
                                    String comprobarB21 = laVista.getMatrizB21();
                                    String comprobarB31 = laVista.getMatrizB31();
                                    String comprobarB41 = laVista.getMatrizB41();
                                    String comprobarB51 = laVista.getMatrizB51();
                                    if (!comprobarB21.isEmpty() && !comprobarB31.isEmpty() && comprobarB41.isEmpty() && comprobarB51.isEmpty()){
                                        //La matriz es de 3x3
                                        //Comprobamos que la matriz tenga todos los valores
                                        String comprobarB22 = laVista.getMatrizB22();
                                        String comprobarB23 = laVista.getMatrizB23();
                                        String comprobarB32 = laVista.getMatrizB32();
                                        String comprobarB33 = laVista.getMatrizB33();
                                        if(!comprobarB22.isEmpty() && !comprobarB23.isEmpty() && !comprobarB32.isEmpty() && !comprobarB33.isEmpty()){
                                            double matrizB11 = Double.parseDouble(comprobarB11);
                                            double matrizB12 = Double.parseDouble(comprobarB12);
                                            double matrizB13 = Double.parseDouble(comprobarB13);
                                            double matrizB21 = Double.parseDouble(comprobarB21);
                                            double matrizB22 = Double.parseDouble(comprobarB22);
                                            double matrizB23 = Double.parseDouble(comprobarB23);
                                            double matrizB31 = Double.parseDouble(comprobarB31);
                                            double matrizB32 = Double.parseDouble(comprobarB32);
                                            double matrizB33 = Double.parseDouble(comprobarB33);
                                            double[][] matrizB = {{matrizB11, matrizB12, matrizB13}, {matrizB21,matrizB22,matrizB23}, {matrizB31,matrizB32,matrizB33}};
                                            try {
                                                elModelo.sumarMatrices(matrizA,matrizB);
                                            } catch (Exception ex) {
                                                Logger.getLogger(ControladorSumarMatrices.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                        } else {
                                            laVista.displayErrorMessage("La matriz A y B no tienen las mismas dimensiones");
                                        }
                                    }
                                }
                            }
                        } else if (!comprobarA21.isEmpty() && !comprobarA31.isEmpty() && !comprobarA41.isEmpty() && comprobarA51.isEmpty()){
                        //La matriz es de 4x3
                        //Comprobamos que la matriz tenga todos los valores
                        String comprobarA22 = laVista.getMatrizA22();
                        String comprobarA23 = laVista.getMatrizA23();
                        String comprobarA32 = laVista.getMatrizA32();
                        String comprobarA33 = laVista.getMatrizA33();
                        String comprobarA42 = laVista.getMatrizA42();
                        String comprobarA43 = laVista.getMatrizA43();
                        if(!comprobarA22.isEmpty() && !comprobarA23.isEmpty() && !comprobarA32.isEmpty() && !comprobarA33.isEmpty() && !comprobarA42.isEmpty() && !comprobarA43.isEmpty()){
                            double matrizA11 = Double.parseDouble(comprobarA11);
                            double matrizA12 = Double.parseDouble(comprobarA12);
                            double matrizA13 = Double.parseDouble(comprobarA13);
                            double matrizA21 = Double.parseDouble(comprobarA21);
                            double matrizA22 = Double.parseDouble(comprobarA22);
                            double matrizA23 = Double.parseDouble(comprobarA23);
                            double matrizA31 = Double.parseDouble(comprobarA31);
                            double matrizA32 = Double.parseDouble(comprobarA32);
                            double matrizA33 = Double.parseDouble(comprobarA33);
                            double matrizA41 = Double.parseDouble(comprobarA41);
                            double matrizA42 = Double.parseDouble(comprobarA42);
                            double matrizA43 = Double.parseDouble(comprobarA43);
                            double[][] matrizA = {{matrizA11, matrizA12, matrizA13}, {matrizA21,matrizA22,matrizA23}, {matrizA31,matrizA32,matrizA33}, {matrizA41,matrizA42,matrizA43}};
                            //Verifiquemos que ambas matrices tienen las mismas dimensiones
                                String comprobarB12 = laVista.getMatrizB12();
                                String comprobarB13 = laVista.getMatrizB13();
                                String comprobarB14 = laVista.getMatrizB14();
                                String comprobarB15 = laVista.getMatrizB15();
                                String comprobarB11 = laVista.getMatrizB11();
                                if(!comprobarB12.isEmpty() && !comprobarB13.isEmpty() && comprobarB14.isEmpty() && comprobarB15.isEmpty()){
                                    //La matriz tiene 3 columnas
                                    //Comprobemos cuantas filas tiene la matriz
                                    String comprobarB21 = laVista.getMatrizB21();
                                    String comprobarB31 = laVista.getMatrizB31();
                                    String comprobarB41 = laVista.getMatrizB41();
                                    String comprobarB51 = laVista.getMatrizB51();
                                    if (!comprobarB21.isEmpty() && !comprobarB31.isEmpty() && !comprobarB41.isEmpty() && comprobarB51.isEmpty()){
                                        //La matriz es de 4x3
                                        //Comprobamos que la matriz tenga todos los valores
                                        String comprobarB22 = laVista.getMatrizB22();
                                        String comprobarB23 = laVista.getMatrizB23();
                                        String comprobarB32 = laVista.getMatrizB32();
                                        String comprobarB33 = laVista.getMatrizB33();
                                        String comprobarB42 = laVista.getMatrizB42();
                                        String comprobarB43 = laVista.getMatrizB43();
                                        if(!comprobarB22.isEmpty() && !comprobarB23.isEmpty() && !comprobarB32.isEmpty() && !comprobarB33.isEmpty() && !comprobarB42.isEmpty() && !comprobarB43.isEmpty()){
                                            double matrizB11 = Double.parseDouble(comprobarB11);
                                            double matrizB12 = Double.parseDouble(comprobarB12);
                                            double matrizB13 = Double.parseDouble(comprobarB13);
                                            double matrizB21 = Double.parseDouble(comprobarB21);
                                            double matrizB22 = Double.parseDouble(comprobarB22);
                                            double matrizB23 = Double.parseDouble(comprobarB23);
                                            double matrizB31 = Double.parseDouble(comprobarB31);
                                            double matrizB32 = Double.parseDouble(comprobarB32);
                                            double matrizB33 = Double.parseDouble(comprobarB33);
                                            double matrizB41 = Double.parseDouble(comprobarB41);
                                            double matrizB42 = Double.parseDouble(comprobarB42);
                                            double matrizB43 = Double.parseDouble(comprobarB43);
                                            double[][] matrizB = {{matrizB11, matrizB12, matrizB13}, {matrizB21,matrizB22,matrizB23}, {matrizB31,matrizB32,matrizB33}, {matrizB41,matrizB42,matrizB43}};
                                            try {
                                                elModelo.sumarMatrices(matrizA,matrizB);
                                            } catch (Exception ex) {
                                                Logger.getLogger(ControladorSumarMatrices.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                        } else {
                                            laVista.displayErrorMessage("La matriz A y B no tienen las mismas dimensiones");
                                        }
                                    }
                                }
                            }
                        } else if (!comprobarA21.isEmpty() && !comprobarA31.isEmpty() && !comprobarA41.isEmpty() && !comprobarA51.isEmpty()){
                            //La matriz es de 5x3
                            //Comprobamos que la matriz tenga todos los valores
                            String comprobarA22 = laVista.getMatrizA22();
                            String comprobarA23 = laVista.getMatrizA23();
                            String comprobarA32 = laVista.getMatrizA32();
                            String comprobarA33 = laVista.getMatrizA33();
                            String comprobarA42 = laVista.getMatrizA42();
                            String comprobarA43 = laVista.getMatrizA43();
                            String comprobarA52 = laVista.getMatrizA52();
                            String comprobarA53 = laVista.getMatrizA53();
                            if(!comprobarA22.isEmpty() && !comprobarA23.isEmpty() && !comprobarA32.isEmpty() && !comprobarA33.isEmpty() && !comprobarA42.isEmpty() && !comprobarA43.isEmpty() && !comprobarA52.isEmpty() && !comprobarA53.isEmpty()){
                                double matrizA11 = Double.parseDouble(comprobarA11);
                                double matrizA12 = Double.parseDouble(comprobarA12);
                                double matrizA13 = Double.parseDouble(comprobarA13);
                                double matrizA21 = Double.parseDouble(comprobarA21);
                                double matrizA22 = Double.parseDouble(comprobarA22);
                                double matrizA23 = Double.parseDouble(comprobarA23);
                                double matrizA31 = Double.parseDouble(comprobarA31);
                                double matrizA32 = Double.parseDouble(comprobarA32);
                                double matrizA33 = Double.parseDouble(comprobarA33);
                                double matrizA41 = Double.parseDouble(comprobarA41);
                                double matrizA42 = Double.parseDouble(comprobarA42);
                                double matrizA43 = Double.parseDouble(comprobarA43);
                                double matrizA51 = Double.parseDouble(comprobarA51);
                                double matrizA52 = Double.parseDouble(comprobarA52);
                                double matrizA53 = Double.parseDouble(comprobarA53);
                                double[][] matrizA = {{matrizA11, matrizA12, matrizA13}, {matrizA21,matrizA22,matrizA23}, {matrizA31,matrizA32,matrizA33}, {matrizA41,matrizA42,matrizA43}, {matrizA51,matrizA52,matrizA53}};
                                //Verifiquemos que ambas matrices tienen las mismas dimensiones
                                String comprobarB12 = laVista.getMatrizB12();
                                String comprobarB13 = laVista.getMatrizB13();
                                String comprobarB14 = laVista.getMatrizB14();
                                String comprobarB15 = laVista.getMatrizB15();
                                String comprobarB11 = laVista.getMatrizB11();
                                if(!comprobarB12.isEmpty() && !comprobarB13.isEmpty() && comprobarB14.isEmpty() && comprobarB15.isEmpty()){
                                    //La matriz tiene 3 columnas
                                    //Comprobemos cuantas filas tiene la matriz
                                    String comprobarB21 = laVista.getMatrizB21();
                                    String comprobarB31 = laVista.getMatrizB31();
                                    String comprobarB41 = laVista.getMatrizB41();
                                    String comprobarB51 = laVista.getMatrizB51();
                                    if (!comprobarB21.isEmpty() && !comprobarB31.isEmpty() && !comprobarB41.isEmpty() && !comprobarB51.isEmpty()){
                                        //La matriz es de 5x3
                                        //Comprobamos que la matriz tenga todos los valores
                                        String comprobarB22 = laVista.getMatrizB22();
                                        String comprobarB23 = laVista.getMatrizB23();
                                        String comprobarB32 = laVista.getMatrizB32();
                                        String comprobarB33 = laVista.getMatrizB33();
                                        String comprobarB42 = laVista.getMatrizB42();
                                        String comprobarB43 = laVista.getMatrizB43();
                                        String comprobarB52 = laVista.getMatrizB52();
                                        String comprobarB53 = laVista.getMatrizB53();
                                        if(!comprobarB22.isEmpty() && !comprobarB23.isEmpty() && !comprobarB32.isEmpty() && !comprobarB33.isEmpty() && !comprobarB42.isEmpty() && !comprobarB43.isEmpty() && !comprobarB52.isEmpty() && !comprobarB53.isEmpty()){
                                            double matrizB11 = Double.parseDouble(comprobarB11);
                                            double matrizB12 = Double.parseDouble(comprobarB12);
                                            double matrizB13 = Double.parseDouble(comprobarB13);
                                            double matrizB21 = Double.parseDouble(comprobarB21);
                                            double matrizB22 = Double.parseDouble(comprobarB22);
                                            double matrizB23 = Double.parseDouble(comprobarB23);
                                            double matrizB31 = Double.parseDouble(comprobarB31);
                                            double matrizB32 = Double.parseDouble(comprobarB32);
                                            double matrizB33 = Double.parseDouble(comprobarB33);
                                            double matrizB41 = Double.parseDouble(comprobarB41);
                                            double matrizB42 = Double.parseDouble(comprobarB42);
                                            double matrizB43 = Double.parseDouble(comprobarB43);
                                            double matrizB51 = Double.parseDouble(comprobarB51);
                                            double matrizB52 = Double.parseDouble(comprobarB52);
                                            double matrizB53 = Double.parseDouble(comprobarB53);
                                            double[][] matrizB = {{matrizB11, matrizB12, matrizB13}, {matrizB21,matrizB22,matrizB23}, {matrizB31,matrizB32,matrizB33}, {matrizB41,matrizB42,matrizB43}, {matrizB51,matrizB52,matrizB53}};
                                            try {
                                                elModelo.sumarMatrices(matrizA,matrizB);
                                            } catch (Exception ex) {
                                                Logger.getLogger(ControladorSumarMatrices.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                        } else {
                                            laVista.displayErrorMessage("La matriz A y B no tienen las mismas dimensiones");
                                        }
                                    }
                                }
                            }
                        }
                    }else if (!comprobarA12.isEmpty() && !comprobarA13.isEmpty() && !comprobarA14.isEmpty() && comprobarA15.isEmpty()){
                        //La matriz tiene 4 columnas
                        //Comprobemos cuantas filas tiene la matriz
                        String comprobarA21 = laVista.getMatrizA21();
                        String comprobarA31 = laVista.getMatrizA31();
                        String comprobarA41 = laVista.getMatrizA41();
                        String comprobarA51 = laVista.getMatrizA51();
                        if(comprobarA21.isEmpty() && comprobarA31.isEmpty() && comprobarA41.isEmpty() && comprobarA51.isEmpty()){
                            //La matriz es de 1x4
                            double matrizA11 = Double.parseDouble(comprobarA11);
                            double matrizA12 = Double.parseDouble(comprobarA12);
                            double matrizA13 = Double.parseDouble(comprobarA13);
                            double matrizA14 = Double.parseDouble(comprobarA14); 
                            double[][] matrizA = {{matrizA11, matrizA12, matrizA13, matrizA14}};
                            //Verifiquemos que ambas matrices tienen las mismas dimensiones
                            String comprobarB12 = laVista.getMatrizB12();
                            String comprobarB13 = laVista.getMatrizB13();
                            String comprobarB14 = laVista.getMatrizB14();
                            String comprobarB15 = laVista.getMatrizB15();
                            String comprobarB11 = laVista.getMatrizB11();
                            if (!comprobarB12.isEmpty() && !comprobarB13.isEmpty() && !comprobarB14.isEmpty() && comprobarB15.isEmpty()){
                                //La matriz tiene 4 columnas
                                //Comprobemos cuantas filas tiene la matriz
                                String comprobarB21 = laVista.getMatrizB21();
                                String comprobarB31 = laVista.getMatrizB31();
                                String comprobarB41 = laVista.getMatrizB41();
                                String comprobarB51 = laVista.getMatrizB51();
                                if(comprobarB21.isEmpty() && comprobarB31.isEmpty() && comprobarB41.isEmpty() && comprobarB51.isEmpty()){
                                    //La matriz es de 1x4
                                    double matrizB11 = Double.parseDouble(comprobarB11);
                                    double matrizB12 = Double.parseDouble(comprobarB12);
                                    double matrizB13 = Double.parseDouble(comprobarB13);
                                    double matrizB14 = Double.parseDouble(comprobarB14); 
                                    double[][] matrizB = {{matrizB11, matrizB12, matrizB13, matrizB14}};
                                    try {
                                        elModelo.sumarMatrices(matrizA,matrizB);
                                    } catch (Exception ex) {
                                        Logger.getLogger(ControladorSumarMatrices.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                } else {
                                    laVista.displayErrorMessage("La matriz A y B no tienen las mismas dimensiones");
                                }
                            }                                
                        } else if (!comprobarA21.isEmpty() && comprobarA31.isEmpty() && comprobarA41.isEmpty() && comprobarA51.isEmpty()){
                        //La matriz es de 2x4
                        String comprobarA22 = laVista.getMatrizA22();
                        String comprobarA23 = laVista.getMatrizA23();
                        String comprobarA24 = laVista.getMatrizA24();
                        if(!comprobarA22.isEmpty() && !comprobarA23.isEmpty() && !comprobarA24.isEmpty()){
                            double matrizA11 = Double.parseDouble(comprobarA11);
                            double matrizA12 = Double.parseDouble(comprobarA12);
                            double matrizA13 = Double.parseDouble(comprobarA13);
                            double matrizA14 = Double.parseDouble(comprobarA14);
                            double matrizA21 = Double.parseDouble(comprobarA21);
                            double matrizA22 = Double.parseDouble(comprobarA22);
                            double matrizA23 = Double.parseDouble(comprobarA23);
                            double matrizA24 = Double.parseDouble(comprobarA24);
                            double[][] matrizA = {{matrizA11, matrizA12, matrizA13,matrizA14}, {matrizA21,matrizA22,matrizA23, matrizA24}};
                            //Verifiquemos que ambas matrices tienen las mismas dimensiones
                            String comprobarB12 = laVista.getMatrizB12();
                            String comprobarB13 = laVista.getMatrizB13();
                            String comprobarB14 = laVista.getMatrizB14();
                            String comprobarB15 = laVista.getMatrizB15();
                            String comprobarB11 = laVista.getMatrizB11();
                            if (!comprobarB12.isEmpty() && !comprobarB13.isEmpty() && !comprobarB14.isEmpty() && comprobarB15.isEmpty()){
                                //La matriz tiene 4 columnas
                                //Comprobemos cuantas filas tiene la matriz
                                String comprobarB21 = laVista.getMatrizB21();
                                String comprobarB31 = laVista.getMatrizB31();
                                String comprobarB41 = laVista.getMatrizB41();
                                String comprobarB51 = laVista.getMatrizB51();
                                if (!comprobarB21.isEmpty() && comprobarB31.isEmpty() && comprobarB41.isEmpty() && comprobarB51.isEmpty()){
                                    //La matriz es de 2x4
                                    String comprobarB22 = laVista.getMatrizB22();
                                    String comprobarB23 = laVista.getMatrizB23();
                                    String comprobarB24 = laVista.getMatrizB24();
                                    if(!comprobarB22.isEmpty() && !comprobarB23.isEmpty() && !comprobarB24.isEmpty()){
                                        double matrizB11 = Double.parseDouble(comprobarB11);
                                        double matrizB12 = Double.parseDouble(comprobarB12);
                                        double matrizB13 = Double.parseDouble(comprobarB13);
                                        double matrizB14 = Double.parseDouble(comprobarB14);
                                        double matrizB21 = Double.parseDouble(comprobarB21);
                                        double matrizB22 = Double.parseDouble(comprobarB22);
                                        double matrizB23 = Double.parseDouble(comprobarB23);
                                        double matrizB24 = Double.parseDouble(comprobarB24);
                                        double[][] matrizB = {{matrizB11, matrizB12, matrizB13,matrizB14}, {matrizB21,matrizB22,matrizB23, matrizB24}};
                                        try {
                                        elModelo.sumarMatrices(matrizA,matrizB);
                                        } catch (Exception ex) {
                                            Logger.getLogger(ControladorSumarMatrices.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    } else {
                                        laVista.displayErrorMessage("La matriz A y B no tienen las mismas dimensiones");
                                    }
                                }
                            }
                        }
                    } else if (!comprobarA21.isEmpty() && !comprobarA31.isEmpty() && comprobarA41.isEmpty() && comprobarA51.isEmpty()){
                        //La matriz es de 3x4
                        //Comprobamos que la matriz tenga todos los valores
                        String comprobarA22 = laVista.getMatrizA22();
                        String comprobarA23 = laVista.getMatrizA23();
                        String comprobarA24 = laVista.getMatrizA24();
                        String comprobarA32 = laVista.getMatrizA32();
                        String comprobarA33 = laVista.getMatrizA33();
                        String comprobarA34 = laVista.getMatrizA34(); 
                        if(!comprobarA22.isEmpty() && !comprobarA23.isEmpty() && !comprobarA24.isEmpty() && !comprobarA32.isEmpty() && !comprobarA33.isEmpty() && !comprobarA34.isEmpty()){
                            double matrizA11 = Double.parseDouble(comprobarA11);
                            double matrizA12 = Double.parseDouble(comprobarA12);
                            double matrizA13 = Double.parseDouble(comprobarA13);
                            double matrizA14 = Double.parseDouble(comprobarA14);
                            double matrizA21 = Double.parseDouble(comprobarA21);
                            double matrizA22 = Double.parseDouble(comprobarA22);
                            double matrizA23 = Double.parseDouble(comprobarA23);
                            double matrizA24 = Double.parseDouble(comprobarA24);
                            double matrizA31 = Double.parseDouble(comprobarA31);
                            double matrizA32 = Double.parseDouble(comprobarA32);
                            double matrizA33 = Double.parseDouble(comprobarA33);
                            double matrizA34 = Double.parseDouble(comprobarA34);
                            double[][] matrizA = {{matrizA11, matrizA12, matrizA13,matrizA14}, {matrizA21,matrizA22,matrizA23, matrizA24}, {matrizA31,matrizA32,matrizA33,matrizA34}};
                            //Verifiquemos que ambas matrices tienen las mismas dimensiones
                            String comprobarB12 = laVista.getMatrizB12();
                            String comprobarB13 = laVista.getMatrizB13();
                            String comprobarB14 = laVista.getMatrizB14();
                            String comprobarB15 = laVista.getMatrizB15();
                            String comprobarB11 = laVista.getMatrizB11();
                            if (!comprobarB12.isEmpty() && !comprobarB13.isEmpty() && !comprobarB14.isEmpty() && comprobarB15.isEmpty()){
                                //La matriz tiene 4 columnas
                                //Comprobemos cuantas filas tiene la matriz
                                String comprobarB21 = laVista.getMatrizB21();
                                String comprobarB31 = laVista.getMatrizB31();
                                String comprobarB41 = laVista.getMatrizB41();
                                String comprobarB51 = laVista.getMatrizB51();
                                if (!comprobarB21.isEmpty() && !comprobarB31.isEmpty() && comprobarB41.isEmpty() && comprobarB51.isEmpty()){
                                    //La matriz es de 3x4
                                    //Comprobamos que la matriz tenga todos los valores
                                    String comprobarB22 = laVista.getMatrizB22();
                                    String comprobarB23 = laVista.getMatrizB23();
                                    String comprobarB24 = laVista.getMatrizB24();
                                    String comprobarB32 = laVista.getMatrizB32();
                                    String comprobarB33 = laVista.getMatrizB33();
                                    String comprobarB34 = laVista.getMatrizB34(); 
                                    if(!comprobarB22.isEmpty() && !comprobarB23.isEmpty() && !comprobarB24.isEmpty() && !comprobarB32.isEmpty() && !comprobarB33.isEmpty() && !comprobarB34.isEmpty()){
                                        double matrizB11 = Double.parseDouble(comprobarB11);
                                        double matrizB12 = Double.parseDouble(comprobarB12);
                                        double matrizB13 = Double.parseDouble(comprobarB13);
                                        double matrizB14 = Double.parseDouble(comprobarB14);
                                        double matrizB21 = Double.parseDouble(comprobarB21);
                                        double matrizB22 = Double.parseDouble(comprobarB22);
                                        double matrizB23 = Double.parseDouble(comprobarB23);
                                        double matrizB24 = Double.parseDouble(comprobarB24);
                                        double matrizB31 = Double.parseDouble(comprobarB31);
                                        double matrizB32 = Double.parseDouble(comprobarB32);
                                        double matrizB33 = Double.parseDouble(comprobarB33);
                                        double matrizB34 = Double.parseDouble(comprobarB34);
                                        double[][] matrizB = {{matrizB11, matrizB12, matrizB13,matrizB14}, {matrizB21,matrizB22,matrizB23, matrizB24}, {matrizB31,matrizB32,matrizB33,matrizB34}};
                                        try {
                                        elModelo.sumarMatrices(matrizA,matrizB);
                                        } catch (Exception ex) {
                                            Logger.getLogger(ControladorSumarMatrices.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    } else {
                                        laVista.displayErrorMessage("La matriz A y B no tienen las mismas dimensiones");
                                    }
                                }
                            }
                        }
                    } else if (!comprobarA21.isEmpty() && !comprobarA31.isEmpty() && !comprobarA41.isEmpty() && comprobarA51.isEmpty()){
                        //La matriz es de 4x4
                        //Comprobamos que la matriz tenga todos los valores
                        String comprobarA22 = laVista.getMatrizA22();
                        String comprobarA23 = laVista.getMatrizA23();
                        String comprobarA24 = laVista.getMatrizA24();
                        String comprobarA32 = laVista.getMatrizA32();
                        String comprobarA33 = laVista.getMatrizA33();
                        String comprobarA34 = laVista.getMatrizA34();
                        String comprobarA42 = laVista.getMatrizA42();
                        String comprobarA43 = laVista.getMatrizA43();
                        String comprobarA44 = laVista.getMatrizA44();
                        if(!comprobarA22.isEmpty() && !comprobarA23.isEmpty() && !comprobarA24.isEmpty() && !comprobarA32.isEmpty() && !comprobarA33.isEmpty() && !comprobarA34.isEmpty() && !comprobarA42.isEmpty() && !comprobarA43.isEmpty() && !comprobarA44.isEmpty()){
                            double matrizA11 = Double.parseDouble(comprobarA11);
                            double matrizA12 = Double.parseDouble(comprobarA12);
                            double matrizA13 = Double.parseDouble(comprobarA13);
                            double matrizA14 = Double.parseDouble(comprobarA14);
                            double matrizA21 = Double.parseDouble(comprobarA21);
                            double matrizA22 = Double.parseDouble(comprobarA22);
                            double matrizA23 = Double.parseDouble(comprobarA23);
                            double matrizA24 = Double.parseDouble(comprobarA24);
                            double matrizA31 = Double.parseDouble(comprobarA31);
                            double matrizA32 = Double.parseDouble(comprobarA32);
                            double matrizA33 = Double.parseDouble(comprobarA33);
                            double matrizA34 = Double.parseDouble(comprobarA34);
                            double matrizA41 = Double.parseDouble(comprobarA41);
                            double matrizA42 = Double.parseDouble(comprobarA42);
                            double matrizA43 = Double.parseDouble(comprobarA43);
                            double matrizA44 = Double.parseDouble(comprobarA44);
                            double[][] matrizA = {{matrizA11, matrizA12, matrizA13,matrizA14}, {matrizA21,matrizA22,matrizA23, matrizA24}, {matrizA31,matrizA32,matrizA33,matrizA34}, {matrizA41,matrizA42,matrizA43,matrizA44}};
                            //Verifiquemos que ambas matrices tienen las mismas dimensiones
                            String comprobarB12 = laVista.getMatrizB12();
                            String comprobarB13 = laVista.getMatrizB13();
                            String comprobarB14 = laVista.getMatrizB14();
                            String comprobarB15 = laVista.getMatrizB15();
                            String comprobarB11 = laVista.getMatrizB11();
                            if (!comprobarB12.isEmpty() && !comprobarB13.isEmpty() && !comprobarB14.isEmpty() && comprobarB15.isEmpty()){
                                //La matriz tiene 4 columnas
                                //Comprobemos cuantas filas tiene la matriz
                                String comprobarB21 = laVista.getMatrizB21();
                                String comprobarB31 = laVista.getMatrizB31();
                                String comprobarB41 = laVista.getMatrizB41();
                                String comprobarB51 = laVista.getMatrizB51();
                                if (!comprobarB21.isEmpty() && !comprobarB31.isEmpty() && !comprobarB41.isEmpty() && comprobarB51.isEmpty()){
                                    //La matriz es de 4x4
                                    //Comprobamos que la matriz tenga todos los valores
                                    String comprobarB22 = laVista.getMatrizB22();
                                    String comprobarB23 = laVista.getMatrizB23();
                                    String comprobarB24 = laVista.getMatrizB24();
                                    String comprobarB32 = laVista.getMatrizB32();
                                    String comprobarB33 = laVista.getMatrizB33();
                                    String comprobarB34 = laVista.getMatrizB34();
                                    String comprobarB42 = laVista.getMatrizB42();
                                    String comprobarB43 = laVista.getMatrizB43();
                                    String comprobarB44 = laVista.getMatrizB44();
                                    if(!comprobarB22.isEmpty() && !comprobarB23.isEmpty() && !comprobarB24.isEmpty() && !comprobarB32.isEmpty() && !comprobarB33.isEmpty() && !comprobarB34.isEmpty() && !comprobarB42.isEmpty() && !comprobarB43.isEmpty() && !comprobarB44.isEmpty()){
                                        double matrizB11 = Double.parseDouble(comprobarB11);
                                        double matrizB12 = Double.parseDouble(comprobarB12);
                                        double matrizB13 = Double.parseDouble(comprobarB13);
                                        double matrizB14 = Double.parseDouble(comprobarB14);
                                        double matrizB21 = Double.parseDouble(comprobarB21);
                                        double matrizB22 = Double.parseDouble(comprobarB22);
                                        double matrizB23 = Double.parseDouble(comprobarB23);
                                        double matrizB24 = Double.parseDouble(comprobarB24);
                                        double matrizB31 = Double.parseDouble(comprobarB31);
                                        double matrizB32 = Double.parseDouble(comprobarB32);
                                        double matrizB33 = Double.parseDouble(comprobarB33);
                                        double matrizB34 = Double.parseDouble(comprobarB34);
                                        double matrizB41 = Double.parseDouble(comprobarB41);
                                        double matrizB42 = Double.parseDouble(comprobarB42);
                                        double matrizB43 = Double.parseDouble(comprobarB43);
                                        double matrizB44 = Double.parseDouble(comprobarB44);
                                        double[][] matrizB = {{matrizB11, matrizB12, matrizB13,matrizB14}, {matrizB21,matrizB22,matrizB23, matrizB24}, {matrizB31,matrizB32,matrizB33,matrizB34}, {matrizB41,matrizB42,matrizB43,matrizB44}};
                                        try {
                                        elModelo.sumarMatrices(matrizA,matrizB);
                                        } catch (Exception ex) {
                                            Logger.getLogger(ControladorSumarMatrices.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    } else {
                                        laVista.displayErrorMessage("La matriz A y B no tienen las mismas dimensiones");
                                    }
                                }
                            }
                        }
                    } else if (!comprobarA21.isEmpty() && !comprobarA31.isEmpty() && !comprobarA41.isEmpty() && !comprobarA51.isEmpty()){
                        //La matriz es de 5x4
                        //Comprobamos que la matriz tenga todos los valores
                        String comprobarA22 = laVista.getMatrizA22();
                        String comprobarA23 = laVista.getMatrizA23();
                        String comprobarA24 = laVista.getMatrizA24();
                        String comprobarA32 = laVista.getMatrizA32();
                        String comprobarA33 = laVista.getMatrizA33();
                        String comprobarA34 = laVista.getMatrizA34();
                        String comprobarA42 = laVista.getMatrizA42();
                        String comprobarA43 = laVista.getMatrizA43();
                        String comprobarA44 = laVista.getMatrizA44();
                        String comprobarA52 = laVista.getMatrizA52();
                        String comprobarA53 = laVista.getMatrizA53();
                        String comprobarA54 = laVista.getMatrizA54();
                        if(!comprobarA22.isEmpty() && !comprobarA23.isEmpty() && !comprobarA24.isEmpty() && !comprobarA32.isEmpty() && !comprobarA33.isEmpty() && !comprobarA34.isEmpty() && !comprobarA42.isEmpty() && !comprobarA43.isEmpty() && !comprobarA44.isEmpty() && !comprobarA52.isEmpty() && !comprobarA53.isEmpty() && !comprobarA54.isEmpty()){
                            double matrizA11 = Double.parseDouble(comprobarA11);
                            double matrizA12 = Double.parseDouble(comprobarA12);
                            double matrizA13 = Double.parseDouble(comprobarA13);
                            double matrizA14 = Double.parseDouble(comprobarA14);
                            double matrizA21 = Double.parseDouble(comprobarA21);
                            double matrizA22 = Double.parseDouble(comprobarA22);
                            double matrizA23 = Double.parseDouble(comprobarA23);
                            double matrizA24 = Double.parseDouble(comprobarA24);
                            double matrizA31 = Double.parseDouble(comprobarA31);
                            double matrizA32 = Double.parseDouble(comprobarA32);
                            double matrizA33 = Double.parseDouble(comprobarA33);
                            double matrizA34 = Double.parseDouble(comprobarA34);
                            double matrizA41 = Double.parseDouble(comprobarA41);
                            double matrizA42 = Double.parseDouble(comprobarA42);
                            double matrizA43 = Double.parseDouble(comprobarA43);
                            double matrizA44 = Double.parseDouble(comprobarA44);
                            double matrizA51 = Double.parseDouble(comprobarA51);
                            double matrizA52 = Double.parseDouble(comprobarA52);
                            double matrizA53 = Double.parseDouble(comprobarA53);
                            double matrizA54 = Double.parseDouble(comprobarA54);
                            double[][] matrizA = {{matrizA11, matrizA12, matrizA13,matrizA14}, {matrizA21,matrizA22,matrizA23, matrizA24}, {matrizA31,matrizA32,matrizA33,matrizA34}, {matrizA41,matrizA42,matrizA43,matrizA44}, {matrizA51,matrizA52,matrizA53,matrizA54}};
                            //Verifiquemos que ambas matrices tienen las mismas dimensiones
                            String comprobarB12 = laVista.getMatrizB12();
                            String comprobarB13 = laVista.getMatrizB13();
                            String comprobarB14 = laVista.getMatrizB14();
                            String comprobarB15 = laVista.getMatrizB15();
                            String comprobarB11 = laVista.getMatrizB11();
                            if (!comprobarB12.isEmpty() && !comprobarB13.isEmpty() && !comprobarB14.isEmpty() && comprobarB15.isEmpty()){
                                //La matriz tiene 4 columnas
                                //Comprobemos cuantas filas tiene la matriz
                                String comprobarB21 = laVista.getMatrizB21();
                                String comprobarB31 = laVista.getMatrizB31();
                                String comprobarB41 = laVista.getMatrizB41();
                                String comprobarB51 = laVista.getMatrizB51();
                                if (!comprobarB21.isEmpty() && !comprobarB31.isEmpty() && !comprobarB41.isEmpty() && !comprobarB51.isEmpty()){
                                    //La matriz es de 5x4
                                    //Comprobamos que la matriz tenga todos los valores
                                    String comprobarB22 = laVista.getMatrizB22();
                                    String comprobarB23 = laVista.getMatrizB23();
                                    String comprobarB24 = laVista.getMatrizB24();
                                    String comprobarB32 = laVista.getMatrizB32();
                                    String comprobarB33 = laVista.getMatrizB33();
                                    String comprobarB34 = laVista.getMatrizB34();
                                    String comprobarB42 = laVista.getMatrizB42();
                                    String comprobarB43 = laVista.getMatrizB43();
                                    String comprobarB44 = laVista.getMatrizB44();
                                    String comprobarB52 = laVista.getMatrizB52();
                                    String comprobarB53 = laVista.getMatrizB53();
                                    String comprobarB54 = laVista.getMatrizB54();
                                    if(!comprobarB22.isEmpty() && !comprobarB23.isEmpty() && !comprobarB24.isEmpty() && !comprobarB32.isEmpty() && !comprobarB33.isEmpty() && !comprobarB34.isEmpty() && !comprobarB42.isEmpty() && !comprobarB43.isEmpty() && !comprobarB44.isEmpty() && !comprobarB52.isEmpty() && !comprobarB53.isEmpty() && !comprobarB54.isEmpty()){
                                        double matrizB11 = Double.parseDouble(comprobarB11);
                                        double matrizB12 = Double.parseDouble(comprobarB12);
                                        double matrizB13 = Double.parseDouble(comprobarB13);
                                        double matrizB14 = Double.parseDouble(comprobarB14);
                                        double matrizB21 = Double.parseDouble(comprobarB21);
                                        double matrizB22 = Double.parseDouble(comprobarB22);
                                        double matrizB23 = Double.parseDouble(comprobarB23);
                                        double matrizB24 = Double.parseDouble(comprobarB24);
                                        double matrizB31 = Double.parseDouble(comprobarB31);
                                        double matrizB32 = Double.parseDouble(comprobarB32);
                                        double matrizB33 = Double.parseDouble(comprobarB33);
                                        double matrizB34 = Double.parseDouble(comprobarB34);
                                        double matrizB41 = Double.parseDouble(comprobarB41);
                                        double matrizB42 = Double.parseDouble(comprobarB42);
                                        double matrizB43 = Double.parseDouble(comprobarB43);
                                        double matrizB44 = Double.parseDouble(comprobarB44);
                                        double matrizB51 = Double.parseDouble(comprobarB51);
                                        double matrizB52 = Double.parseDouble(comprobarB52);
                                        double matrizB53 = Double.parseDouble(comprobarB53);
                                        double matrizB54 = Double.parseDouble(comprobarB54);
                                        double[][] matrizB = {{matrizB11, matrizB12, matrizB13,matrizB14}, {matrizB21,matrizB22,matrizB23, matrizB24}, {matrizB31,matrizB32,matrizB33,matrizB34}, {matrizB41,matrizB42,matrizB43,matrizB44}, {matrizB51,matrizB52,matrizB53,matrizB54}};
                                        try {
                                            elModelo.sumarMatrices(matrizA,matrizB);
                                        } catch (Exception ex) {
                                            Logger.getLogger(ControladorSumarMatrices.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    } else {
                                        laVista.displayErrorMessage("La matriz A y B no tienen las mismas dimensiones");
                                    }
                                }
                            }
                        }
                    }
                }else if(!comprobarA12.isEmpty() && !comprobarA13.isEmpty() && !comprobarA14.isEmpty() && !comprobarA15.isEmpty()){
                   //la matriz tiene 5 columnas
                   //Comprobemos cuantas filas tiene la matriz
                    String comprobarA21 = laVista.getMatrizA21();
                    String comprobarA31 = laVista.getMatrizA31();
                    String comprobarA41 = laVista.getMatrizA41();
                    String comprobarA51 = laVista.getMatrizA51();
                    if(comprobarA21.isEmpty() && comprobarA31.isEmpty() && comprobarA41.isEmpty() && comprobarA51.isEmpty()){
                        //La matriz es de 1x5
                        double matrizA11 = Double.parseDouble(comprobarA11);
                        double matrizA12 = Double.parseDouble(comprobarA12);
                        double matrizA13 = Double.parseDouble(comprobarA13);
                        double matrizA14 = Double.parseDouble(comprobarA14); 
                        double matrizA15 = Double.parseDouble(comprobarA15);
                        double[][] matrizA = {{matrizA11, matrizA12, matrizA13, matrizA14, matrizA15}};
                        //Verifiquemos que ambas matrices tienen las mismas dimensiones
                        String comprobarB12 = laVista.getMatrizB12();
                        String comprobarB13 = laVista.getMatrizB13();
                        String comprobarB14 = laVista.getMatrizB14();
                        String comprobarB15 = laVista.getMatrizB15();
                        String comprobarB11 = laVista.getMatrizB11();
                        if(!comprobarB12.isEmpty() && !comprobarB13.isEmpty() && !comprobarB14.isEmpty() && !comprobarB15.isEmpty()){
                            //la matriz tiene 5 columnas
                            //Comprobemos cuantas filas tiene la matriz
                            String comprobarB21 = laVista.getMatrizB21();
                            String comprobarB31 = laVista.getMatrizB31();
                            String comprobarB41 = laVista.getMatrizB41();
                            String comprobarB51 = laVista.getMatrizB51();
                            if(comprobarB21.isEmpty() && comprobarB31.isEmpty() && comprobarB41.isEmpty() && comprobarB51.isEmpty()){
                                //La matriz es de 1x5
                               double matrizB11 = Double.parseDouble(comprobarB11);
                                double matrizB12 = Double.parseDouble(comprobarB12);
                                double matrizB13 = Double.parseDouble(comprobarB13);
                                double matrizB14 = Double.parseDouble(comprobarB14); 
                                double matrizB15 = Double.parseDouble(comprobarB15);
                                double[][] matrizB = {{matrizB11, matrizB12, matrizB13, matrizB14, matrizB15}};
                                try {
                                    elModelo.sumarMatrices(matrizA,matrizB);
                                } catch (Exception ex) {
                                    Logger.getLogger(ControladorSumarMatrices.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            } else {
                                laVista.displayErrorMessage("La matriz A y B no tienen las mismas dimensiones");
                            }
                        }
                    } else if (!comprobarA21.isEmpty() && comprobarA31.isEmpty() && comprobarA41.isEmpty() && comprobarA51.isEmpty()){
                        //La matriz es de 2x5
                        //Comprobamos que la matriz tenga todos los valores
                        String comprobarA22 = laVista.getMatrizA22();
                        String comprobarA23 = laVista.getMatrizA23();
                        String comprobarA24 = laVista.getMatrizA24();
                        String comprobarA25 = laVista.getMatrizA25();
                        if(!comprobarA22.isEmpty() && !comprobarA23.isEmpty() && !comprobarA24.isEmpty() && !comprobarA25.isEmpty()){
                            double matrizA11 = Double.parseDouble(comprobarA11);
                            double matrizA12 = Double.parseDouble(comprobarA12);
                            double matrizA13 = Double.parseDouble(comprobarA13);
                            double matrizA14 = Double.parseDouble(comprobarA14); 
                            double matrizA15 = Double.parseDouble(comprobarA15);
                            double matrizA21 = Double.parseDouble(comprobarA21);
                            double matrizA22 = Double.parseDouble(comprobarA22);
                            double matrizA23 = Double.parseDouble(comprobarA23);
                            double matrizA24 = Double.parseDouble(comprobarA24);
                            double matrizA25 = Double.parseDouble(comprobarA25);
                            double[][] matrizA = {{matrizA11, matrizA12, matrizA13, matrizA14, matrizA15}, {matrizA21,matrizA22,matrizA23, matrizA24, matrizA25}};
                            //Verifiquemos que ambas matrices tienen las mismas dimensiones
                            String comprobarB12 = laVista.getMatrizB12();
                            String comprobarB13 = laVista.getMatrizB13();
                            String comprobarB14 = laVista.getMatrizB14();
                            String comprobarB15 = laVista.getMatrizB15();
                            String comprobarB11 = laVista.getMatrizB11();
                            if(!comprobarB12.isEmpty() && !comprobarB13.isEmpty() && !comprobarB14.isEmpty() && !comprobarB15.isEmpty()){
                                //la matriz tiene 5 columnas
                                //Comprobemos cuantas filas tiene la matriz
                                String comprobarB21 = laVista.getMatrizB21();
                                String comprobarB31 = laVista.getMatrizB31();
                                String comprobarB41 = laVista.getMatrizB41();
                                String comprobarB51 = laVista.getMatrizB51();
                                if (!comprobarB21.isEmpty() && comprobarB31.isEmpty() && comprobarB41.isEmpty() && comprobarB51.isEmpty()){
                                    //La matriz es de 2x5
                                    //Comprobamos que la matriz tenga todos los valores
                                    String comprobarB22 = laVista.getMatrizB22();
                                    String comprobarB23 = laVista.getMatrizB23();
                                    String comprobarB24 = laVista.getMatrizB24();
                                    String comprobarB25 = laVista.getMatrizB25();
                                    if(!comprobarB22.isEmpty() && !comprobarB23.isEmpty() && !comprobarB24.isEmpty() && !comprobarB25.isEmpty()){
                                        double matrizB11 = Double.parseDouble(comprobarB11);
                                        double matrizB12 = Double.parseDouble(comprobarB12);
                                        double matrizB13 = Double.parseDouble(comprobarB13);
                                        double matrizB14 = Double.parseDouble(comprobarB14); 
                                        double matrizB15 = Double.parseDouble(comprobarB15);
                                        double matrizB21 = Double.parseDouble(comprobarB21);
                                        double matrizB22 = Double.parseDouble(comprobarB22);
                                        double matrizB23 = Double.parseDouble(comprobarB23);
                                        double matrizB24 = Double.parseDouble(comprobarB24);
                                        double matrizB25 = Double.parseDouble(comprobarB25);
                                        double[][] matrizB = {{matrizB11, matrizB12, matrizB13, matrizB14, matrizB15}, {matrizB21,matrizB22,matrizB23, matrizB24, matrizB25}};
                                        try {
                                            elModelo.sumarMatrices(matrizA,matrizB);
                                        } catch (Exception ex) {
                                            Logger.getLogger(ControladorSumarMatrices.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    } else {
                                        laVista.displayErrorMessage("La matriz A y B no tienen las mismas dimensiones");
                                    }
                                }
                            }
                        }
                    } else if (!comprobarA21.isEmpty() && !comprobarA31.isEmpty() && comprobarA41.isEmpty() && comprobarA51.isEmpty()){
                        //La matriz es de 3x5
                        //Comprobamos que la matriz tenga todos los valores
                        String comprobarA22 = laVista.getMatrizA22();
                        String comprobarA23 = laVista.getMatrizA23();
                        String comprobarA24 = laVista.getMatrizA24();
                        String comprobarA25 = laVista.getMatrizA25();
                        String comprobarA32 = laVista.getMatrizA32();
                        String comprobarA33 = laVista.getMatrizA33();
                        String comprobarA34 = laVista.getMatrizA34();
                        String comprobarA35 = laVista.getMatrizA35();
                        if(!comprobarA22.isEmpty() && !comprobarA23.isEmpty() && !comprobarA24.isEmpty() && !comprobarA25.isEmpty() && !comprobarA32.isEmpty() && !comprobarA33.isEmpty() && !comprobarA34.isEmpty() && !comprobarA35.isEmpty()){
                            double matrizA11 = Double.parseDouble(comprobarA11);
                            double matrizA12 = Double.parseDouble(comprobarA12);
                            double matrizA13 = Double.parseDouble(comprobarA13);
                            double matrizA14 = Double.parseDouble(comprobarA14); 
                            double matrizA15 = Double.parseDouble(comprobarA15);
                            double matrizA21 = Double.parseDouble(comprobarA21);
                            double matrizA22 = Double.parseDouble(comprobarA22);
                            double matrizA23 = Double.parseDouble(comprobarA23);
                            double matrizA24 = Double.parseDouble(comprobarA24);
                            double matrizA25 = Double.parseDouble(comprobarA25);
                            double matrizA31 = Double.parseDouble(comprobarA31);
                            double matrizA32 = Double.parseDouble(comprobarA32);
                            double matrizA33 = Double.parseDouble(comprobarA33);
                            double matrizA34 = Double.parseDouble(comprobarA34);
                            double matrizA35 = Double.parseDouble(comprobarA35);
                            double[][] matrizA = {{matrizA11, matrizA12, matrizA13, matrizA14, matrizA15}, {matrizA21,matrizA22,matrizA23, matrizA24, matrizA25}, {matrizA31,matrizA32,matrizA33,matrizA34,matrizA35}};
                        //Verifiquemos que ambas matrices tienen las mismas dimensiones
                            String comprobarB12 = laVista.getMatrizB12();
                            String comprobarB13 = laVista.getMatrizB13();
                            String comprobarB14 = laVista.getMatrizB14();
                            String comprobarB15 = laVista.getMatrizB15();
                            String comprobarB11 = laVista.getMatrizB11();
                            if(!comprobarB12.isEmpty() && !comprobarB13.isEmpty() && !comprobarB14.isEmpty() && !comprobarB15.isEmpty()){
                                //la matriz tiene 5 columnas
                                //Comprobemos cuantas filas tiene la matriz
                                String comprobarB21 = laVista.getMatrizB21();
                                String comprobarB31 = laVista.getMatrizB31();
                                String comprobarB41 = laVista.getMatrizB41();
                                String comprobarB51 = laVista.getMatrizB51();
                                if (!comprobarB21.isEmpty() && !comprobarB31.isEmpty() && comprobarB41.isEmpty() && comprobarB51.isEmpty()){
                                    //La matriz es de 3x5
                                    //Comprobamos que la matriz tenga todos los valores
                                    String comprobarB22 = laVista.getMatrizB22();
                                    String comprobarB23 = laVista.getMatrizB23();
                                    String comprobarB24 = laVista.getMatrizB24();
                                    String comprobarB25 = laVista.getMatrizB25();
                                    String comprobarB32 = laVista.getMatrizB32();
                                    String comprobarB33 = laVista.getMatrizB33();
                                    String comprobarB34 = laVista.getMatrizB34();
                                    String comprobarB35 = laVista.getMatrizB35();
                                    if(!comprobarB22.isEmpty() && !comprobarB23.isEmpty() && !comprobarB24.isEmpty() && !comprobarB25.isEmpty() && !comprobarB32.isEmpty() && !comprobarB33.isEmpty() && !comprobarB34.isEmpty() && !comprobarB35.isEmpty()){
                                        double matrizB11 = Double.parseDouble(comprobarB11);
                                        double matrizB12 = Double.parseDouble(comprobarB12);
                                        double matrizB13 = Double.parseDouble(comprobarB13);
                                        double matrizB14 = Double.parseDouble(comprobarB14); 
                                        double matrizB15 = Double.parseDouble(comprobarB15);
                                        double matrizB21 = Double.parseDouble(comprobarB21);
                                        double matrizB22 = Double.parseDouble(comprobarB22);
                                        double matrizB23 = Double.parseDouble(comprobarB23);
                                        double matrizB24 = Double.parseDouble(comprobarB24);
                                        double matrizB25 = Double.parseDouble(comprobarB25);
                                        double matrizB31 = Double.parseDouble(comprobarB31);
                                        double matrizB32 = Double.parseDouble(comprobarB32);
                                        double matrizB33 = Double.parseDouble(comprobarB33);
                                        double matrizB34 = Double.parseDouble(comprobarB34);
                                        double matrizB35 = Double.parseDouble(comprobarB35);
                                        double[][] matrizB = {{matrizB11, matrizB12, matrizB13, matrizB14, matrizB15}, {matrizB21,matrizB22,matrizB23, matrizB24, matrizB25}, {matrizB31,matrizB32,matrizB33,matrizB34,matrizB35}};
                                        try {
                                            elModelo.sumarMatrices(matrizA,matrizB);
                                        } catch (Exception ex) {
                                            Logger.getLogger(ControladorSumarMatrices.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    } else {
                                        laVista.displayErrorMessage("La matriz A y B no tienen las mismas dimensiones");
                                    }
                                }
                            }
                        }
                    } else if (!comprobarA21.isEmpty() && !comprobarA31.isEmpty() && !comprobarA41.isEmpty() && comprobarA51.isEmpty()){
                        //La matriz es de 4x5
                        //Comprobamos que la matriz tenga todos los valores
                        String comprobarA22 = laVista.getMatrizA22();
                        String comprobarA23 = laVista.getMatrizA23();
                        String comprobarA24 = laVista.getMatrizA24();
                         String comprobarA25 = laVista.getMatrizA25();
                            String comprobarA32 = laVista.getMatrizA32();
                            String comprobarA33 = laVista.getMatrizA33();
                            String comprobarA34 = laVista.getMatrizA34();
                            String comprobarA35 = laVista.getMatrizA35();
                            String comprobarA42 = laVista.getMatrizA42();
                            String comprobarA43 = laVista.getMatrizA43();
                            String comprobarA44 = laVista.getMatrizA44();
                            String comprobarA45 = laVista.getMatrizA45();
                            if(!comprobarA22.isEmpty() && !comprobarA23.isEmpty() && !comprobarA24.isEmpty() && !comprobarA25.isEmpty() && !comprobarA32.isEmpty() && !comprobarA33.isEmpty() && !comprobarA34.isEmpty() && !comprobarA35.isEmpty() && !comprobarA42.isEmpty() && !comprobarA43.isEmpty() && !comprobarA44.isEmpty() && !comprobarA45.isEmpty()){
                                double matrizA11 = Double.parseDouble(comprobarA11);
                                double matrizA12 = Double.parseDouble(comprobarA12);
                                double matrizA13 = Double.parseDouble(comprobarA13);
                                double matrizA14 = Double.parseDouble(comprobarA14); 
                                double matrizA15 = Double.parseDouble(comprobarA15);
                                double matrizA21 = Double.parseDouble(comprobarA21);
                                double matrizA22 = Double.parseDouble(comprobarA22);
                                double matrizA23 = Double.parseDouble(comprobarA23);
                                double matrizA24 = Double.parseDouble(comprobarA24);
                                double matrizA25 = Double.parseDouble(comprobarA25);
                                double matrizA31 = Double.parseDouble(comprobarA31);
                                double matrizA32 = Double.parseDouble(comprobarA32);
                                double matrizA33 = Double.parseDouble(comprobarA33);
                                double matrizA34 = Double.parseDouble(comprobarA34);
                                double matrizA35 = Double.parseDouble(comprobarA35);
                                double matrizA41 = Double.parseDouble(comprobarA41);
                                double matrizA42 = Double.parseDouble(comprobarA42);
                                double matrizA43 = Double.parseDouble(comprobarA43);
                                double matrizA44 = Double.parseDouble(comprobarA44);
                                double matrizA45 = Double.parseDouble(comprobarA45);
                                double[][] matrizA = {{matrizA11, matrizA12, matrizA13, matrizA14, matrizA15}, {matrizA21,matrizA22,matrizA23, matrizA24, matrizA25}, {matrizA31,matrizA32,matrizA33,matrizA34,matrizA35}, {matrizA41,matrizA42,matrizA43,matrizA44,matrizA45}};
                                //Verifiquemos que ambas matrices tienen las mismas dimensiones
                                String comprobarB12 = laVista.getMatrizB12();
                                String comprobarB13 = laVista.getMatrizB13();
                                String comprobarB14 = laVista.getMatrizB14();
                                String comprobarB15 = laVista.getMatrizB15();
                                String comprobarB11 = laVista.getMatrizB11();
                                if(!comprobarB12.isEmpty() && !comprobarB13.isEmpty() && !comprobarB14.isEmpty() && !comprobarB15.isEmpty()){
                                    //la matriz tiene 5 columnas
                                    //Comprobemos cuantas filas tiene la matriz
                                    String comprobarB21 = laVista.getMatrizB21();
                                    String comprobarB31 = laVista.getMatrizB31();
                                    String comprobarB41 = laVista.getMatrizB41();
                                    String comprobarB51 = laVista.getMatrizB51();
                                    if (!comprobarB21.isEmpty() && !comprobarB31.isEmpty() && !comprobarB41.isEmpty() && comprobarB51.isEmpty()){
                                        //La matriz es de 4x5
                                        //Comprobamos que la matriz tenga todos los valores
                                        String comprobarB22 = laVista.getMatrizB22();
                                        String comprobarB23 = laVista.getMatrizB23();
                                        String comprobarB24 = laVista.getMatrizB24();
                                        String comprobarB25 = laVista.getMatrizB25();
                                        String comprobarB32 = laVista.getMatrizB32();
                                        String comprobarB33 = laVista.getMatrizB33();
                                        String comprobarB34 = laVista.getMatrizB34();
                                        String comprobarB35 = laVista.getMatrizB35();
                                        String comprobarB42 = laVista.getMatrizB42();
                                        String comprobarB43 = laVista.getMatrizB43();
                                        String comprobarB44 = laVista.getMatrizB44();
                                        String comprobarB45 = laVista.getMatrizB45();
                                        if(!comprobarB22.isEmpty() && !comprobarB23.isEmpty() && !comprobarB24.isEmpty() && !comprobarB25.isEmpty() && !comprobarB32.isEmpty() && !comprobarB33.isEmpty() && !comprobarB34.isEmpty() && !comprobarB35.isEmpty() && !comprobarB42.isEmpty() && !comprobarB43.isEmpty() && !comprobarB44.isEmpty() && !comprobarB45.isEmpty()){
                                            double matrizB11 = Double.parseDouble(comprobarB11);
                                            double matrizB12 = Double.parseDouble(comprobarB12);
                                            double matrizB13 = Double.parseDouble(comprobarB13);
                                            double matrizB14 = Double.parseDouble(comprobarB14); 
                                            double matrizB15 = Double.parseDouble(comprobarB15);
                                            double matrizB21 = Double.parseDouble(comprobarB21);
                                            double matrizB22 = Double.parseDouble(comprobarB22);
                                            double matrizB23 = Double.parseDouble(comprobarB23);
                                            double matrizB24 = Double.parseDouble(comprobarB24);
                                            double matrizB25 = Double.parseDouble(comprobarB25);
                                            double matrizB31 = Double.parseDouble(comprobarB31);
                                            double matrizB32 = Double.parseDouble(comprobarB32);
                                            double matrizB33 = Double.parseDouble(comprobarB33);
                                            double matrizB34 = Double.parseDouble(comprobarB34);
                                            double matrizB35 = Double.parseDouble(comprobarB35);
                                            double matrizB41 = Double.parseDouble(comprobarB41);
                                            double matrizB42 = Double.parseDouble(comprobarB42);
                                            double matrizB43 = Double.parseDouble(comprobarB43);
                                            double matrizB44 = Double.parseDouble(comprobarB44);
                                            double matrizB45 = Double.parseDouble(comprobarB45);
                                            double[][] matrizB = {{matrizB11, matrizB12, matrizB13, matrizB14, matrizB15}, {matrizB21,matrizB22,matrizB23, matrizB24, matrizB25}, {matrizB31,matrizB32,matrizB33,matrizB34,matrizB35}, {matrizB41,matrizB42,matrizB43,matrizB44,matrizB45}};
                                            try {
                                                elModelo.sumarMatrices(matrizA,matrizB);
                                            } catch (Exception ex) {
                                                Logger.getLogger(ControladorSumarMatrices.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                        } else {
                                            laVista.displayErrorMessage("La matriz A y B no tienen las mismas dimensiones");
                                        }
                                    }
                                }
                            }
                        } else if (!comprobarA21.isEmpty() && !comprobarA31.isEmpty() && !comprobarA41.isEmpty() && !comprobarA51.isEmpty()){
                            //La matriz es de 5x5
                            //Comprobamos que la matriz tenga todos los valores
                            String comprobarA22 = laVista.getMatrizA22();
                            String comprobarA23 = laVista.getMatrizA23();
                            String comprobarA24 = laVista.getMatrizA24();
                            String comprobarA25 = laVista.getMatrizA25();
                            String comprobarA32 = laVista.getMatrizA32();
                            String comprobarA33 = laVista.getMatrizA33();
                            String comprobarA34 = laVista.getMatrizA34();
                            String comprobarA35 = laVista.getMatrizA35();
                            String comprobarA42 = laVista.getMatrizA42();
                            String comprobarA43 = laVista.getMatrizA43();
                            String comprobarA44 = laVista.getMatrizA44();
                            String comprobarA45 = laVista.getMatrizA45();
                            String comprobarA52 = laVista.getMatrizA52();
                            String comprobarA53 = laVista.getMatrizA53();
                            String comprobarA54 = laVista.getMatrizA54();
                            String comprobarA55 = laVista.getMatrizA55();
                            if(!comprobarA22.isEmpty() && !comprobarA23.isEmpty() && !comprobarA24.isEmpty() && !comprobarA25.isEmpty() && !comprobarA32.isEmpty() && !comprobarA33.isEmpty() && !comprobarA34.isEmpty() && !comprobarA35.isEmpty() && !comprobarA42.isEmpty() && !comprobarA43.isEmpty() && !comprobarA44.isEmpty() && !comprobarA45.isEmpty() && !comprobarA52.isEmpty() && !comprobarA53.isEmpty() && !comprobarA54.isEmpty() && !comprobarA55.isEmpty()){
                                double matrizA11 = Double.parseDouble(comprobarA11);
                                double matrizA12 = Double.parseDouble(comprobarA12);
                                double matrizA13 = Double.parseDouble(comprobarA13);
                                double matrizA14 = Double.parseDouble(comprobarA14); 
                                double matrizA15 = Double.parseDouble(comprobarA15);
                                double matrizA21 = Double.parseDouble(comprobarA21);
                                double matrizA22 = Double.parseDouble(comprobarA22);
                                double matrizA23 = Double.parseDouble(comprobarA23);
                                double matrizA24 = Double.parseDouble(comprobarA24);
                                double matrizA25 = Double.parseDouble(comprobarA25);
                                double matrizA31 = Double.parseDouble(comprobarA31);
                                double matrizA32 = Double.parseDouble(comprobarA32);
                                double matrizA33 = Double.parseDouble(comprobarA33);
                                double matrizA34 = Double.parseDouble(comprobarA34);
                                double matrizA35 = Double.parseDouble(comprobarA35);
                                double matrizA41 = Double.parseDouble(comprobarA41);
                                double matrizA42 = Double.parseDouble(comprobarA42);
                                double matrizA43 = Double.parseDouble(comprobarA43);
                                double matrizA44 = Double.parseDouble(comprobarA44);
                                double matrizA45 = Double.parseDouble(comprobarA45);
                                double matrizA51 = Double.parseDouble(comprobarA51);
                                double matrizA52 = Double.parseDouble(comprobarA52);
                                double matrizA53 = Double.parseDouble(comprobarA53);
                                double matrizA54 = Double.parseDouble(comprobarA54);
                                double matrizA55 = Double.parseDouble(comprobarA55);
                                double[][] matrizA = {{matrizA11, matrizA12, matrizA13, matrizA14, matrizA15}, {matrizA21,matrizA22,matrizA23, matrizA24, matrizA25}, {matrizA31,matrizA32,matrizA33,matrizA34,matrizA35}, {matrizA41,matrizA42,matrizA43,matrizA44,matrizA45}, {matrizA51,matrizA52,matrizA53,matrizA54,matrizA55}};
                            //Verifiquemos que ambas matrices tienen las mismas dimensiones
                                String comprobarB12 = laVista.getMatrizB12();
                                String comprobarB13 = laVista.getMatrizB13();
                                String comprobarB14 = laVista.getMatrizB14();
                                String comprobarB15 = laVista.getMatrizB15();
                                String comprobarB11 = laVista.getMatrizB11();
                                if(!comprobarB12.isEmpty() && !comprobarB13.isEmpty() && !comprobarB14.isEmpty() && !comprobarB15.isEmpty()){
                                    //la matriz tiene 5 columnas
                                    //Comprobemos cuantas filas tiene la matriz
                                    String comprobarB21 = laVista.getMatrizB21();
                                    String comprobarB31 = laVista.getMatrizB31();
                                    String comprobarB41 = laVista.getMatrizB41();
                                    String comprobarB51 = laVista.getMatrizB51();
                                    if (!comprobarB21.isEmpty() && !comprobarB31.isEmpty() && !comprobarB41.isEmpty() && !comprobarB51.isEmpty()){
                                        //La matriz es de 5x5
                                        //Comprobamos que la matriz tenga todos los valores
                                        String comprobarB22 = laVista.getMatrizB22();
                                        String comprobarB23 = laVista.getMatrizB23();
                                        String comprobarB24 = laVista.getMatrizB24();
                                        String comprobarB25 = laVista.getMatrizB25();
                                        String comprobarB32 = laVista.getMatrizB32();
                                        String comprobarB33 = laVista.getMatrizB33();
                                        String comprobarB34 = laVista.getMatrizB34();
                                        String comprobarB35 = laVista.getMatrizB35();
                                        String comprobarB42 = laVista.getMatrizB42();
                                        String comprobarB43 = laVista.getMatrizB43();
                                        String comprobarB44 = laVista.getMatrizB44();
                                        String comprobarB45 = laVista.getMatrizB45();
                                        String comprobarB52 = laVista.getMatrizB52();
                                        String comprobarB53 = laVista.getMatrizB53();
                                        String comprobarB54 = laVista.getMatrizB54();
                                        String comprobarB55 = laVista.getMatrizB55();
                                        if(!comprobarB22.isEmpty() && !comprobarB23.isEmpty() && !comprobarB24.isEmpty() && !comprobarB25.isEmpty() && !comprobarB32.isEmpty() && !comprobarB33.isEmpty() && !comprobarB34.isEmpty() && !comprobarB35.isEmpty() && !comprobarB42.isEmpty() && !comprobarB43.isEmpty() && !comprobarB44.isEmpty() && !comprobarB45.isEmpty() && !comprobarB52.isEmpty() && !comprobarB53.isEmpty() && !comprobarB54.isEmpty() && !comprobarB55.isEmpty()){
                                            double matrizB11 = Double.parseDouble(comprobarB11);
                                            double matrizB12 = Double.parseDouble(comprobarB12);
                                            double matrizB13 = Double.parseDouble(comprobarB13);
                                            double matrizB14 = Double.parseDouble(comprobarB14); 
                                            double matrizB15 = Double.parseDouble(comprobarB15);
                                            double matrizB21 = Double.parseDouble(comprobarB21);
                                            double matrizB22 = Double.parseDouble(comprobarB22);
                                            double matrizB23 = Double.parseDouble(comprobarB23);
                                            double matrizB24 = Double.parseDouble(comprobarB24);
                                            double matrizB25 = Double.parseDouble(comprobarB25);
                                            double matrizB31 = Double.parseDouble(comprobarB31);
                                            double matrizB32 = Double.parseDouble(comprobarB32);
                                            double matrizB33 = Double.parseDouble(comprobarB33);
                                            double matrizB34 = Double.parseDouble(comprobarB34);
                                            double matrizB35 = Double.parseDouble(comprobarB35);
                                            double matrizB41 = Double.parseDouble(comprobarB41);
                                            double matrizB42 = Double.parseDouble(comprobarB42);
                                            double matrizB43 = Double.parseDouble(comprobarB43);
                                            double matrizB44 = Double.parseDouble(comprobarB44);
                                            double matrizB45 = Double.parseDouble(comprobarB45);
                                            double matrizB51 = Double.parseDouble(comprobarB51);
                                            double matrizB52 = Double.parseDouble(comprobarB52);
                                            double matrizB53 = Double.parseDouble(comprobarB53);
                                            double matrizB54 = Double.parseDouble(comprobarB54);
                                            double matrizB55 = Double.parseDouble(comprobarB55);
                                            double[][] matrizB = {{matrizB11, matrizB12, matrizB13, matrizB14, matrizB15}, {matrizB21,matrizB22,matrizB23, matrizB24, matrizB25}, {matrizB31,matrizB32,matrizB33,matrizB34,matrizB35}, {matrizB41,matrizB42,matrizB43,matrizB44,matrizB45}, {matrizB51,matrizB52,matrizB53,matrizB54,matrizB55}};
                                            try {
                                                elModelo.sumarMatrices(matrizA,matrizB);
                                            } catch (Exception ex) {
                                                Logger.getLogger(ControladorSumarMatrices.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                        } else {
                                            laVista.displayErrorMessage("La matriz A y B no tienen las mismas dimensiones");
                                        }
                                    }
                                }
                            }
                        }
                }
            }else{
                laVista.displayErrorMessage("NO has ingresado valores, recuerda comenzar a ingresar valores en 1x1");
            }    
        }
    }
}