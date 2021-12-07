/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

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
public class Controlador {
    private PanelSumar miPanelSumar; 
    private PanelMultEscalar miPanelMultEscalar;
    private PanelMultiplicar miPanelMultiplicar;
    private PanelObtenerInv miPanelObtenerInv;
    private PanelDeterminante miPanelDeterminante;
    private PanelSolucionarEcuacion miPanelSolucionarEcuacion; 
    private PanelCramer miPanelCramer; 
    
    private VistaCalculadora miVistaCalculadora;
    
    public void setPanelSumar (PanelSumar panelSumar){
        miPanelSumar = panelSumar; 
    }
    public void setPanelMultEscalar (PanelMultEscalar panelMultEscalar){
        miPanelMultEscalar = panelMultEscalar; 
    }
    
    public void setPanelMultiplicar (PanelMultiplicar panelMultiplicar){
        miPanelMultiplicar = panelMultiplicar; 
    }
    public void setPanelObtenerInv (PanelObtenerInv panelObtenerInv){
        miPanelObtenerInv = panelObtenerInv; 
    }
    public void setPanelDeterminante (PanelDeterminante panelDeterminante){
        miPanelDeterminante = panelDeterminante; 
    }
    public void setPanelSolucionarEcuacion (PanelSolucionarEcuacion panelSolucionarEcuacion){
        miPanelSolucionarEcuacion = panelSolucionarEcuacion; 
    }
    
    public void setPanelCramer (PanelCramer panelCramer){
        miPanelCramer = panelCramer; 
    }
    public void setVistaCalculadora (VistaCalculadora vistaCalculadora){
        miVistaCalculadora = vistaCalculadora; 
    }
    
    public void cargarPanel(int panel){
        switch(panel){
            case 1: miVistaCalculadora.definirPanel(miPanelSumar); 
                    break;
            case 2: miVistaCalculadora.definirPanel(miPanelMultEscalar); 
                    break;
            case 3: miVistaCalculadora.definirPanel(miPanelMultiplicar); 
                    break;
            case 4: miVistaCalculadora.definirPanel(miPanelObtenerInv); 
                    break;
            case 5: miVistaCalculadora.definirPanel(miPanelSolucionarEcuacion); 
                    break;
            case 6: miVistaCalculadora.definirPanel(miPanelDeterminante); 
                    break;
            case 7: miVistaCalculadora.definirPanel(miPanelCramer); 
                    break;
        }
    }
}
