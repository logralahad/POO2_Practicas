/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sumadora;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author logra
 */
public class CuadroTexto extends JPanel{
    
    private JLabel lblNombre;
    private JTextField edtNombre;

    public CuadroTexto(String texto, Integer longitud) {
        super.setBackground(Color.ORANGE);
        
        lblNombre = new JLabel(texto);
        edtNombre = new JTextField(longitud);
        
        super.add(lblNombre);
        super.add(edtNombre);
    }

    public void clear(){
        this.edtNombre.setText("");
    }
    
    public Integer getValue() throws NumeroIncorrectoException{
        try {
            return Integer.parseInt(this.edtNombre.getText());
        } catch (Exception e) {
            edtNombre.requestFocus();
            throw new NumeroIncorrectoException("Numero invalido, vuelva a escribir un numero.");
        }
    }
}
