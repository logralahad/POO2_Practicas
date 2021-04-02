/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import Dialogos.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author logra
 */
public class TextoPanel extends JPanel{
    
    private JLabel lblNombre;
    private JTextField edtNombre;

    public TextoPanel(String texto) {
        super.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        lblNombre = new JLabel(texto);
        lblNombre.setFont(new Font("Lucila Grande", Font.BOLD, 18));
        
        edtNombre = new JTextField(30);    
        
        super.add(lblNombre);
        super.add(edtNombre);
    }

    public void clear(){
        this.edtNombre.setText("");
    }
    
    public void setMensaje(String mensaje) {
        this.edtNombre.setText(mensaje);
    }
}
