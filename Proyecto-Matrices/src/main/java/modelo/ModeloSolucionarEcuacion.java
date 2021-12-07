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
public class ModeloSolucionarEcuacion {
    /**
     * 
     * @param matriz 
     */
    public static void solucionarEcuacion(double[][] matriz){
        int piv = 0; 
        int variable = matriz[0].length - 1;
        for(int i = 0; i < variable; i++){
            pivote(matriz, piv, variable); 
            hacerCeros(matriz, piv, variable);
            piv++;
        }
        imprimir(variable, matriz);
    }    

    /**
     * 
     * @param matriz
     * @param piv
     * @param variable 
     */
    public static void pivote (double[][] matriz, int piv, int variable){
        double aux = 0;
        aux = matriz[piv][piv];
        for (int i = 0; i < (variable + 1); i++){
            matriz[piv][i]= matriz[piv][i] / aux;
        }
    }
    
    /**
     * 
     * @param matriz
     * @param piv
     * @param variable 
     */
    public static void hacerCeros(double[][] matriz, int piv, int variable){
        for(int i = 0; i < variable; i++){
            if(i != piv){
                double c = matriz[i][piv];
                for ( int j = 0; j < (variable + 1); j++){
                    matriz[i][j] = ((-1 * c) * matriz[piv][j]) + matriz[i][j];
                }
            }
        }
    }
    
    /**
     * 
     * @param variable
     * @param matriz 
     */
    public static void imprimir(int variable, double[][] matriz){
        for (int i= 0; i < variable; i++){
            System.out.println("La variable X" + (i + 1) + " es: " + matriz[i][variable]);
        }
    }
}
