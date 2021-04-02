/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sumadora;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 *
 * @author logra
 */
public class NumerosPanel extends JPanel{
    
    private ArrayList<CuadroTexto> edits;

    public NumerosPanel() {
        super.setBackground(Color.GRAY);
        super.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        edits = new ArrayList<>();    
    }
    
    public void limpiarControles(){
        for (CuadroTexto edit : edits) {
            edit.clear();
        }
    }
    
    public Integer getResultado() throws NumeroIncorrectoException{
        Integer resultado = 0;
        for (CuadroTexto edit : edits) {
            resultado += edit.getValue();
        }
        return resultado;
    }
    
    public void addControllers(Integer cantidad){
        super.removeAll();
        edits = new ArrayList<>();   
        for (int i = 0; i < cantidad; i++) {
            CuadroTexto edit = new CuadroTexto(String.format("Numero %d: ", (i + 1)), 15);
            this.edits.add(edit);
            super.add(edit);
        }
    }
    
}
