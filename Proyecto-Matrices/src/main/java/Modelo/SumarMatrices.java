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
public class SumarMatrices {
    /**
     * 
     * @param matriz1
     * @param matriz2
     * @return Resultado de la suma de matrices
     * @throws Exception 
     */
    public static int[][] sumarMatrices (int[][] matriz1, int[][]  matriz2)throws Exception{

        if((matriz1.length == matriz2.length) && (matriz1[0].length == matriz2[0].length)){
            int[][] matrizResultante = new int [matriz1.length][matriz1[0].length];

            for(int i = 0; i < matriz1.length; i++){
                for(int j = 0; j < matriz1[i].length; j++){
                    matrizResultante[i][j] = matriz1[i][j] + matriz2[i][j];
                }
            }

            return matrizResultante;

        }else{
            throw new Exception();
        }
    }
    
    /**
     * 
     * @param matrizResultante 
     */
    public static void imprimir (int[][] matrizResultante){
        for (int[] matrizResultante1 : matrizResultante) {
            for (int j = 0; j < matrizResultante1.length; j++) {
                System.out.print(matrizResultante1[j]);
                System.out.print(" ");
            }
            System.out.println(" "); 
        }
    }
}
