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
public class MultiplicarPorEscalar {
    /**
     * 
     * @param matriz
     * @param escalar
     * @return matriz resultante de la multiplicacion
     */
    public static int[][] multiplicarPorEscalar (int[][] matriz, int escalar){
        int[][] matrizResultante = new int[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matrizResultante[i][j] = matriz[i][j] * escalar;                
            }
        }
        return matrizResultante;
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
