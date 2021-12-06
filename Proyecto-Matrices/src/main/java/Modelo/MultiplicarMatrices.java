/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Pamela
 */
public class MultiplicarMatrices {
    /**
     * 
     * @param matriz1
     * @param matriz2
     * @return matriz resultante de la multiplicacion de matrices
     */
    public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2){
        int filaMatriz1 = matriz1.length;
        int columnaMatriz1 = matriz1[0].length;
		
        int filaMatriz2 = matriz2.length;
        int columnaMatriz2 = matriz2[0].length;

        if(columnaMatriz1 != filaMatriz2){
            throw new RuntimeException("No se puede multiplicar las matrices"); 
        } else{
            int[][] matrizResultante = new int [filaMatriz1][columnaMatriz2];

            for(int i = 0; i < matrizResultante.length; i++){
                for(int j = 0; j < matrizResultante[i].length; j++){
                    for(int k = 0; k < matriz2.length; k++){
                        matrizResultante[i][j]= matrizResultante[i][j] + matriz1[i][k] * matriz2[k][j];
                    }
                }
            }
            return matrizResultante;
        }
    }
    
    /**
     * 
     * @param matrizResultante 
     */
    public static void imprimir (int[][] matrizResultante){
        for(int i = 0; i < matrizResultante.length; i++){
            for(int j = 0; j < matrizResultante[i].length; j++){
                System.out.print(matrizResultante[i][j]);
                System.out.print(" ");
            }
            System.out.println(" "); 
        }
    }
}
