/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controlador.Controlador;
import controlador.ControladorMultiplicarMatrices;
import controlador.ControladorMultiplicarPorEscalar;
import controlador.ControladorObtenerDeterminante;
import controlador.ControladorObtenerInversa;
import controlador.ControladorSolucionarEcuacion;
import controlador.ControladorSolucionarPorCramer;
import controlador.ControladorSumarMatrices;
import modelo.ModeloMultiplicarMatrices;
import modelo.ModeloMultiplicarPorEscalar;
import modelo.ModeloObtenerDeterminante;
import modelo.ModeloObtenerInversa;
import modelo.ModeloSolucionarEcuacion;
import modelo.ModeloSolucionarPorCramer;
import modelo.ModeloSumarMatrices;
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
        
        ModeloSumarMatrices modeloSumarMatrices = new ModeloSumarMatrices(); 
        ModeloMultiplicarPorEscalar modeloMultEscalar = new ModeloMultiplicarPorEscalar();
        ModeloMultiplicarMatrices modeloMultiplicarMatrices = new ModeloMultiplicarMatrices(); 
        ModeloObtenerInversa modeloObtenerInversa = new ModeloObtenerInversa(); 
        ModeloObtenerDeterminante modeloObtenerDeterminante = new ModeloObtenerDeterminante();
        ModeloSolucionarEcuacion modeloSolucionarEcuacion = new ModeloSolucionarEcuacion();
        ModeloSolucionarPorCramer modeloSolucionarPorCramer = new ModeloSolucionarPorCramer(); 
        
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
        
        ControladorSumarMatrices controladorSumarMatrices = new ControladorSumarMatrices(panelSumar, modeloSumarMatrices); 
        ControladorMultiplicarPorEscalar controladorMultiplicarPorEscalar = new ControladorMultiplicarPorEscalar (panelMultEscalar, modeloMultEscalar);
        ControladorMultiplicarMatrices controladorMultiplicarMatrices = new ControladorMultiplicarMatrices (panelMultiplicar, modeloMultiplicarMatrices); 
        ControladorObtenerInversa controladorObtenerInversa = new ControladorObtenerInversa(panelObtenerInv, modeloObtenerInversa);
        ControladorObtenerDeterminante controladorObtenerDeterminante = new ControladorObtenerDeterminante (panelDeterminante, modeloObtenerDeterminante);  
        //ControladorSolucionarEcuacion controladorSolucionarEcuacion = new ControladorSolucionarEcuacion (panelSolucionarEcuacion, modeloSolucionarEcuacion); 
        //ControladorSolucionarPorCramer controladorSolucionarPorCrammer = new ControladorSolucionarPorCramer (panelCramer, modeloSolucionarPorCramer); 
        
        vistaCalculadora.setVisible(true); 
    }
}
