/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.ControladorCalculadora;
import Vista.VistaCalculadora;

/**
 *
 * @author Pamela
 */
public class Main {
    public static void main(String args[]){
        VistaCalculadora laVista = new VistaCalculadora();
        /*
        *Hacer el modelo*/
        ControladorCalculadora elControlador = new ControladorCalculadora(laVista, elModelo);
        
        laVista.setVisible(true); 
    }
}
