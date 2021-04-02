/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colores;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author logra
 */
public class SlideSpinCombo extends JPanel{
    
    private SpinnerNumberModel modelo;
    private JSpinner spnSpinner;
    private JSlider sldDeslizador;
    private JLabel lblColor;
    private EventoSliderSpinner evtPanel;
    
    public SlideSpinCombo(String color){
        super.setLayout(new BorderLayout());
        
        lblColor = new JLabel(color);
        lblColor.setFont(new Font("Lucila Grande", Font.BOLD, 14));
        
        this.modelo = new SpinnerNumberModel(0, 0, 255, 1);
        this.spnSpinner = new JSpinner(modelo);
        spnSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent ce) {
                evtPanel.eventoSpinner();
            }
        }); 
        
        this.sldDeslizador = new JSlider(0, 255, 0);
        sldDeslizador.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent ce) {
                evtPanel.eventoSlider();
            }
        });
        
        super.add(lblColor, BorderLayout.NORTH);
        super.add(spnSpinner, BorderLayout.EAST);
        super.add(sldDeslizador);
    }

    public Integer getSpnSpinnerValue() {
        return (Integer)spnSpinner.getValue();
    }
    
    public void setSpnSpinnerValue(Integer valor){
        spnSpinner.setValue(valor);
    }
    
    public Integer getSldDeslizadorValue() {
        return (Integer)sldDeslizador.getValue();
    }
    
    public void setSldDeslizadorValue(Integer valor){
        sldDeslizador.setValue(valor);
    }

    public void setEvtPanel(EventoSliderSpinner evtPanel) {
        this.evtPanel = evtPanel;
    }
    
}
