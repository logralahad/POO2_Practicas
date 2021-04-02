/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dialogos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author logra
 */
public class CuadrosPanel extends JPanel{
    
    private CuadroTexto cdtTitulo;
    private CuadroTexto cdtMensaje;
    
    public CuadrosPanel(){
        super.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        
        cdtTitulo = new CuadroTexto("Titulo", 15);
        cdtMensaje = new CuadroTexto("Mensaje", 15);
        
        super.add(cdtTitulo);
        super.add(cdtMensaje);        
    }
    
    public void clear(){
        cdtTitulo.clear();
        cdtMensaje.clear();
    }
    
    public String obtenerTitulo() throws EntradaVaciaException{
        return cdtTitulo.getMensaje();
    } 
    
    public String obtenerMensaje() throws EntradaVaciaException{
        return cdtMensaje.getMensaje();
    } 
    
    
}
