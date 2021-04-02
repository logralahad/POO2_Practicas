/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colores;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 *
 * @author logra
 */
public class ColorPanel extends JPanel{
    
    private CuadroPanel pnlColor;
    private JPanel pnlObjetos;
    private SlideSpinCombo sldRojo;
    private SlideSpinCombo sldVerde;
    private SlideSpinCombo sldAzul;
    
    public ColorPanel(){
        super.setBackground(Color.BLUE);
        super.setLayout(new BorderLayout());
        
        pnlColor = new CuadroPanel();
        pnlObjetos = new JPanel();
        pnlObjetos.setLayout(new BoxLayout(pnlObjetos, BoxLayout.PAGE_AXIS));
        
        sldRojo = new SlideSpinCombo("Rojo");
        sldRojo.setEvtPanel(new EventoSliderSpinner() {
            @Override
            public void eventoSlider() {
                sldRojo.setSpnSpinnerValue(sldRojo.getSldDeslizadorValue());
                pnlColor.cambiarColor(crearColor());
            }

            @Override
            public void eventoSpinner() {
                sldRojo.setSldDeslizadorValue(sldRojo.getSpnSpinnerValue());
            }
        });
        
        sldVerde = new SlideSpinCombo("Verde");
        sldVerde.setEvtPanel(new EventoSliderSpinner() {
            @Override
            public void eventoSlider() {
                sldVerde.setSpnSpinnerValue(sldVerde.getSldDeslizadorValue());
                pnlColor.cambiarColor(crearColor());
            }

            @Override
            public void eventoSpinner() {
                sldVerde.setSldDeslizadorValue(sldVerde.getSpnSpinnerValue());
            }
        });
        
        sldAzul = new SlideSpinCombo("Azul");
        sldAzul.setEvtPanel(new EventoSliderSpinner() {
            @Override
            public void eventoSlider() {
                sldAzul.setSpnSpinnerValue(sldAzul.getSldDeslizadorValue());
                pnlColor.cambiarColor(crearColor());
            }

            @Override
            public void eventoSpinner() {
                sldAzul.setSldDeslizadorValue(sldAzul.getSpnSpinnerValue());
            }
        });
        
        
        pnlObjetos.add(sldRojo);
        pnlObjetos.add(sldVerde);
        pnlObjetos.add(sldAzul);
        
        super.add(pnlColor);
        super.add(pnlObjetos, BorderLayout.EAST);
    }
    
    private Color crearColor(){
        return new Color(sldRojo.getSldDeslizadorValue(), sldVerde.getSldDeslizadorValue(), 
                sldAzul.getSldDeslizadorValue());
    }
    
    public void resetParametros(){
        sldRojo.setSpnSpinnerValue(255);
        sldVerde.setSpnSpinnerValue(255);
        sldAzul.setSpnSpinnerValue(255);
        pnlColor.cambiarColor(new Color(255, 255, 255));
    }
    
}
