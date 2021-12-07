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
public class ModeloObtenerInversa {
    public static double[][] obtenerInversa (double[][] matriz){
        int aux = matriz.length;
        double[][] matrizResultante = new double[aux][aux];
        double[][] matrizAux = new double[aux][aux];
        int index[] = new int[aux];

        for (int i = 0; i < aux; i++){
            matrizAux[i][i] = 1;
        }

        gaussJordan(matriz, index); 

        for(int i = 0; i < aux - 1; i++){
            for(int j = i+1; j < aux; j++){
                for (int k = 0; k < aux; k++){
                    matrizAux[index[j]][k] -= matriz[index[j]][i] * matrizAux[index[i]][k];
                }
            }
        }
        for(int i = 0; i < aux; i++){
            matrizResultante[aux-1][i] = matrizAux[index[aux-1]][i] / matriz [index[aux-1]][aux-1];
            for(int j = aux -2; j >= 0; j--){
                matrizResultante[j][i] = matrizAux[index[j]][i];
                for(int k= j+1; k < aux; k++){
                    matrizResultante[j][i] -= matriz[index[j]][k] * matrizResultante[k][i];
                } 

                matrizResultante[j][i] /= matriz[index[j]][j];
            }
        }
        return matrizResultante;
    }

    public static void gaussJordan (double[][] aux, int[] index){
        int temp = index.length;
        double[] matrixTemp = new double[temp];

        for(int i = 0; i < temp; i++){
            index [i] = i;
        }

        for(int i = 0; i < temp; i++){
            double columna  = 0;
            for( int j = 0; j < temp; j++){
                double columnaAux = Math.abs(aux[i][j]);
                if (columnaAux > columna){
                    columna = columnaAux;
                }
            }
            matrixTemp[i] = columna;
        }
        
        int pivote = 0; 
        for (int i = 0; i < temp-1; i++){
            double pivoteAux = 0; //
            for(int j = i; j < temp; j++){
                double pivoteTemp = Math.abs(aux[index[j]][i]);
                pivoteTemp /= matrixTemp[index[j]];
                if(pivoteTemp > pivoteAux){
                    pivoteAux = pivoteTemp;
                    pivote = j;
                }
            }
            
            int item = index[i];
            index[i] = index[pivote];
            index[pivote] = item; //

            for(int j = i+1; i < temp; j++){
                double pivoteFila = aux[index[j]][i]/aux[index[i]][i];
                aux[index[j]][i] = pivoteFila;

                for(int k = i+1; k < temp; k++){
                    aux[index[j]][k] = pivoteFila * aux[index[i]][k];
                }
            }
        }
    }
    

    public static void imprimir (double[][] matrizResultante){
        for(int i = 0; i < matrizResultante.length; i++){
            for(int j = 0; j < matrizResultante[i].length; j++){
                System.out.print(matrizResultante[i][j]);
                System.out.print(" ");
            }
            System.out.println(" "); 
        }
    }
}
