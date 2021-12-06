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
public class ObtenerDeterminante {
    
    /**
     * 
     * @param matriz
     * @return determinante de la matriz
     */
    public static int obtenerDeterminante(int[][] matriz){
        int determinante = 0;

        if(matriz.length == 1){
            return matriz[0][0];
        } else {
            for (int i = 0; i < matriz.length; i++){
                determinante = determinante + matriz[0][i] * cofactor(matriz,0,i);
            }
        }

        return determinante;
    }
    
    /**
     * 
     * @param matriz
     * @param fila
     * @param columna
     * @return cofactor para obtener el determinate
     */

    public static int cofactor(int[][] matriz, int fila,int columna){
        int submatriz[][]; 
        int aux = matriz.length-1;

        submatriz = new int [aux][aux]; 
        int x = 0; 
        int y = 0;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                if( i != fila && j != columna ){
                    submatriz[y][x] = matriz[i][j];
                    y++;
                    if (y >= aux){
                        x++;
                        y = 0; 
                    }
                }
            }
        }
        int exponente = -1;
        int determinanteSubmatriz = obtenerDeterminante(submatriz);
        int cofactor = (int)Math.pow(exponente,fila + columna) * determinanteSubmatriz;

        return cofactor; 
    }
    
}
