/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModeloCalculadora;
import Vista.VistaCalculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Pamela
 */
public class ControladorCalculadora {
    private VistaCalculadora laVista; 
    private ModeloCalculadora elModelo; 
    
    public ControladorCalculadora(VistaCalculadora laVista, ModeloCalculadora elModelo){
        this.laVista = laVista; 
        this.elModelo = elModelo; 
        
        this.laVista.addCalculadoraListener(new CalculadoraListener()); 
    }
    
    class CalculadoraListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int 
        }
        
    }
}
