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
public class ModeloTranspustaDeUnaMatriz {
    public double[][] ModeloTranspuestaDeUnaMatriz(double[][] matriz){
        double[][] matrizResultante = new double[matriz[0].length][matriz.length];

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                matrizResultante[j][i] = matriz[i][j];
            }
        }
        return matrizResultante; 
    }
}
