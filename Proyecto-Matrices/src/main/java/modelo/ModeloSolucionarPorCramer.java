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
public class ModeloSolucionarPorCramer {
    private double[] resultado;

    public double[] cramer(double[][] ecuacion, double[] vectorSoluciones){
        resultado = new double[vectorSoluciones.length];
        double determinante = obtenerDeterminante(ecuacion);
        double determinanteTemp; 
        double aux [][] = new double[ecuacion.length][ecuacion.length];

        for(int i = 0; i < ecuacion.length; i++){
            aux=sustituye(ecuacion,vectorSoluciones,i);
            determinanteTemp = obtenerDeterminante(aux); 
            resultado[i]=determinanteTemp/determinante;
        }

        return resultado;

    }

    public double[][] sustituye(double[][] ecuacion, double[] vectorSoluciones, int posicion){
        double[][] aux = new double[ecuacion.length][ecuacion.length];

        for(int i=0; i<ecuacion.length; i++){
            for(int j=0; j<ecuacion.length; j++){
                if(j == posicion){
                    aux[i][j]=vectorSoluciones[i];
                }else{
                    aux[i][j]=ecuacion[i][j];
                }
            }
        }

        return aux;
    }

    public static double obtenerDeterminante(double[][] matriz){
        double determinante = 0;

        if(matriz.length == 1){
            return matriz[0][0];
        } else {
            for (int i = 0; i < matriz.length; i++){
                determinante = determinante + matriz[0][i] * cofactor(matriz,0,i);
            }
        }

        return determinante;
    }

    public static double cofactor(double[][] matriz, int fila,int columna){
        double submatriz[][]; 
        int aux = matriz.length-1;

        submatriz = new double [aux][aux]; 
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
