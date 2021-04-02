/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dialogos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author logra
 */
public class RadioBotonesPanel extends JPanel{
    
    private JRadioButton rdbInfo;
    private JRadioButton rdbPregunta;
    private JRadioButton rdbWarning;
    private JRadioButton rdbError;
    private ButtonGroup grpBotones;
    
    public RadioBotonesPanel(){
        super.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        grpBotones = new ButtonGroup();
        
        rdbInfo = new JRadioButton("Informacion");
        rdbInfo.setFont(new Font("Lucila Grande", Font.BOLD, 12));
        
        rdbPregunta = new JRadioButton("Pregunta");
        rdbPregunta.setFont(new Font("Lucila Grande", Font.BOLD, 12));
        
        rdbWarning = new JRadioButton("Precaucion");
        rdbWarning.setFont(new Font("Lucila Grande", Font.BOLD, 12));
        
        rdbError = new JRadioButton("Error");
        rdbError.setFont(new Font("Lucila Grande", Font.BOLD, 12));
        
        grpBotones.add(rdbInfo);
        grpBotones.add(rdbPregunta);
        grpBotones.add(rdbWarning);
        grpBotones.add(rdbError);

        
        super.add(rdbInfo);
        super.add(rdbPregunta);
        super.add(rdbWarning);
        super.add(rdbError);
    }
    
    public void limpiarSeleccion(){
        grpBotones.clearSelection();
    }
    
    public void mostrarDialogo(String mensaje, String titulo){
        if(rdbInfo.isSelected()){
            JOptionPane.showMessageDialog(this, titulo, mensaje, JOptionPane.INFORMATION_MESSAGE);
        }
        else if(rdbPregunta.isSelected()){
            JOptionPane.showMessageDialog(this, titulo, mensaje, JOptionPane.QUESTION_MESSAGE);
        }
        else if(rdbWarning.isSelected()){
            JOptionPane.showMessageDialog(this, titulo, mensaje, JOptionPane.WARNING_MESSAGE);
        }
        else if(rdbError.isSelected()){
            JOptionPane.showMessageDialog(this, titulo, mensaje, JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar una opcion.","Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
