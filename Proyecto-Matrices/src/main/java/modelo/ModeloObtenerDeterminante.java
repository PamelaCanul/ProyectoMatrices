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
public class ModeloObtenerDeterminante {
    
    /**
     * 
     * @param matriz
     * @return determinante de la matriz
     */
    public static double obtenerDeterminante(double[][] matriz){
        double determinante = 0.0;

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

    public static double cofactor(double[][] matriz, int fila,int columna){
        double submatriz[][];  
        double aux = matriz.length-1;

        submatriz = new double [(int) aux][(int) aux]; 
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
        double determinanteSubmatriz = obtenerDeterminante(submatriz);
        double cofactor = (int)Math.pow(exponente,fila + columna) * determinanteSubmatriz;

        return cofactor; 
    }
    
}
