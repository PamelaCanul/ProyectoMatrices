/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Pamela
 */
public class ModeloMultiplicarPorEscalar {
    
    private double[][] matrizResultante; 
    
    /**
     * 
     * @param matriz
     * @param escalar
     * @return matriz resultante de la multiplicacion
     */
    public double[][] multiplicarPorEscalar (double[][] matriz, double escalar){
        matrizResultante = new double[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matrizResultante[i][j] = matriz[i][j] * escalar;                
            }
        }
        return matrizResultante;
    }
    
    public double[][] getResultado(){
        return matrizResultante;
    }

    /**
     * 
     * @param matrizResultante 
     */
    public void imprimir (int[][] matrizResultante){
        for(int i = 0; i < matrizResultante.length; i++){
            for(int j = 0; j < matrizResultante[i].length; j++){
                System.out.print(matrizResultante[i][j]);
                System.out.print(" ");
            }
            System.out.println(" "); 
        }
    }
}
