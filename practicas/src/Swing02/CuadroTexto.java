/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing02;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author logra
 */
public class CuadroTexto {
    
    private JLabel lblNombre;
    private JTextField edtNombre;

    public CuadroTexto(String texto, Integer longitud) {
        lblNombre = new JLabel(texto);
        edtNombre = new JTextField(longitud);
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JTextField getEdtNombre() {
        return edtNombre;
    }

    public void setEdtNombre(JTextField edtNombre) {
        this.edtNombre = edtNombre;
    }
    
    
}
