/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dialogos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BoxLayout;
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
        super.setLayout(new BorderLayout());
        
        lblNombre = new JLabel(texto);
        lblNombre.setFont(new Font("Lucila Grande", Font.BOLD, 18));
        
        edtNombre = new JTextField(longitud);
        
        super.add(lblNombre, BorderLayout.NORTH);
        super.add(edtNombre, BorderLayout.SOUTH);
    }

    public void clear(){
        this.edtNombre.setText("");
    }
    
    public String getMensaje() throws EntradaVaciaException{
        if(this.edtNombre.getText().equals("")){
            edtNombre.requestFocus();
            throw new EntradaVaciaException("No puede dejar el campo vacio.");
        }
        else{
            return this.edtNombre.getText();
        }
    }
}
