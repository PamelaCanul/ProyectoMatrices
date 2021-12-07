/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controlador.Controlador;
import vista.PanelCramer;
import vista.PanelDeterminante;
import vista.PanelMultEscalar;
import vista.PanelMultiplicar;
import vista.PanelObtenerInv;
import vista.PanelSolucionarEcuacion;
import vista.PanelSumar;
import vista.VistaCalculadora;

/**
 *
 * @author Pamela
 */
public class Main {
    public static void main(String args[]){
        Controlador controlador = new Controlador();
        PanelSumar panelSumar = new PanelSumar(); 
        PanelMultEscalar panelMultEscalar = new PanelMultEscalar();
        PanelMultiplicar panelMultiplicar = new PanelMultiplicar();
        PanelObtenerInv panelObtenerInv = new PanelObtenerInv();
        PanelDeterminante panelDeterminante = new PanelDeterminante(); 
        PanelSolucionarEcuacion panelSolucionarEcuacion = new PanelSolucionarEcuacion(); 
        PanelCramer panelCramer= new PanelCramer(); 
        VistaCalculadora vistaCalculadora = new VistaCalculadora();
        
        panelSumar.setControlador(controlador);
        panelMultEscalar.setControlador(controlador);
        panelMultiplicar.setControlador(controlador);
        panelObtenerInv.setControlador(controlador);
        panelDeterminante.setControlador(controlador);
        panelSolucionarEcuacion.setControlador(controlador);
        panelCramer.setControlador(controlador);
        vistaCalculadora.setControlador(controlador); 
        
        controlador.setPanelSumar(panelSumar);
        controlador.setPanelMultEscalar(panelMultEscalar);
        controlador.setPanelMultiplicar(panelMultiplicar);
        controlador.setPanelObtenerInv(panelObtenerInv);
        controlador.setPanelDeterminante(panelDeterminante);
        controlador.setPanelSolucionarEcuacion(panelSolucionarEcuacion);
        controlador.setPanelCramer(panelCramer);
        controlador.setVistaCalculadora(vistaCalculadora);
        
        vistaCalculadora.setVisible(true); 
    }
}
