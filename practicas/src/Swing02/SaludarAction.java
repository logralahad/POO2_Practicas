/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author logra
 */
public class SaludarAction implements ActionListener {
    
    private JTextField nombre;
    
    public SaludarAction(JTextField nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        JOptionPane.showMessageDialog(null, String.format("Hola %s, bienvenido!", nombre.getText()));
    }
    
}
