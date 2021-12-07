/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ModeloObtenerInversa;
import vista.PanelObtenerInv;

/**
 *
 * @author Pamela
 */
public class ControladorObtenerInversa {
    private final PanelObtenerInv laVista; 
    private final ModeloObtenerInversa elModelo; 
    
    public ControladorObtenerInversa(PanelObtenerInv laVista, ModeloObtenerInversa elModelo){
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
                        elModelo.obtenerInversa(matrizA);
                        double[][] resultado = elModelo.getResultado();
                        laVista.setCalcSolucion(resultado);
                    } else {
                                laVista.displayErrorMessage("Ingresa los valores correctamente");
                            }
                }else if(!comprobarA12.isEmpty() && comprobarA13.isEmpty() && comprobarA14.isEmpty() && comprobarA15.isEmpty()){
                   //La matriz A solo tiene 2 columnas 
                   //Comprobemos cuantas filas tiene la matriz
                    String comprobarA21 = laVista.getMatrizA21();
                    String comprobarA31 = laVista.getMatrizA31();
                    String comprobarA41 = laVista.getMatrizA41();
                    String comprobarA51 = laVista.getMatrizA51();
                    if (!comprobarA21.isEmpty() && comprobarA31.isEmpty() && comprobarA41.isEmpty() && comprobarA51.isEmpty()){            
                        //La matriz es de 2x2
                        //Comprobamos que la matriz tenga todos los valores
                        String comprobarA22 = laVista.getMatrizA22();
                        if(!comprobarA22.isEmpty()){
                            double matrizA11 = Double.parseDouble(comprobarA11);
                            double matrizA12 = Double.parseDouble(comprobarA12);
                            double matrizA21 = Double.parseDouble(comprobarA21);
                            double matrizA22 = Double.parseDouble(comprobarA22);
                            double[][] matrizA = {{matrizA11, matrizA12}, {matrizA21,matrizA22}};
                            elModelo.obtenerInversa(matrizA);
                        double[][] resultado = elModelo.getResultado();
                        laVista.setCalcSolucion(resultado);
                        }else {
                                laVista.displayErrorMessage("Ingresa los valores correctamente");
                            }
                    }
               }else if(!comprobarA12.isEmpty() && !comprobarA13.isEmpty() && comprobarA14.isEmpty() && comprobarA15.isEmpty()){
                   //La matriz tiene 3 columnas
                   //Comprobemos cuantas filas tiene la matriz
                    String comprobarA21 = laVista.getMatrizA21();
                    String comprobarA31 = laVista.getMatrizA31();
                    String comprobarA41 = laVista.getMatrizA41();
                    String comprobarA51 = laVista.getMatrizA51();
                    if (!comprobarA21.isEmpty() && !comprobarA31.isEmpty() && comprobarA41.isEmpty() && comprobarA51.isEmpty()){
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
                                elModelo.obtenerInversa(matrizA);
                        double[][] resultado = elModelo.getResultado();
                        laVista.setCalcSolucion(resultado);
                            }else {
                                laVista.displayErrorMessage("Ingresa los valores correctamente");
                            }
                        }
                    }else if (!comprobarA12.isEmpty() && !comprobarA13.isEmpty() && !comprobarA14.isEmpty() && comprobarA15.isEmpty()){
                        //La matriz tiene 4 columnas
                        //Comprobemos cuantas filas tiene la matriz
                        String comprobarA21 = laVista.getMatrizA21();
                        String comprobarA31 = laVista.getMatrizA31();
                        String comprobarA41 = laVista.getMatrizA41();
                        String comprobarA51 = laVista.getMatrizA51();
                        if (!comprobarA21.isEmpty() && !comprobarA31.isEmpty() && !comprobarA41.isEmpty() && comprobarA51.isEmpty()){
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
                            elModelo.obtenerInversa(matrizA);
                        double[][] resultado = elModelo.getResultado();
                        laVista.setCalcSolucion(resultado);
                        }else {
                                laVista.displayErrorMessage("Ingresa los valores correctamente");
                            }
                    }        
                }else if(!comprobarA12.isEmpty() && !comprobarA13.isEmpty() && !comprobarA14.isEmpty() && !comprobarA15.isEmpty()){
                   //la matriz tiene 5 columnas
                   //Comprobemos cuantas filas tiene la matriz
                    String comprobarA21 = laVista.getMatrizA21();
                    String comprobarA31 = laVista.getMatrizA31();
                    String comprobarA41 = laVista.getMatrizA41();
                    String comprobarA51 = laVista.getMatrizA51();
                    if (!comprobarA21.isEmpty() && !comprobarA31.isEmpty() && !comprobarA41.isEmpty() && !comprobarA51.isEmpty()){
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
                                    elModelo.obtenerInversa(matrizA);
                        double[][] resultado = elModelo.getResultado();
                        laVista.setCalcSolucion(resultado);
                                    }
                            else {
                                laVista.displayErrorMessage("Ingresa los valores correctamente");
                            }
                                }
                            }                      
            }else{
                laVista.displayErrorMessage("NO has ingresado valores, recuerda comenzar a ingresar valores en 1x1");
            }    
        }
    }
}
