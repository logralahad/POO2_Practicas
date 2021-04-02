/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imagenes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

/**
 *
 * @author logra
 */
public class OpcionesPanel extends JPanel{
    
    private JCheckBox chkBarbilla;
    private JCheckBox chkLentes;
    private JCheckBox chkCabello;
    private JCheckBox chkDientes;
    private ImagenBoton listener;

    public OpcionesPanel(){
        super.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        
        chkBarbilla = new JCheckBox("Barbilla");
        chkBarbilla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.chkButtonClick();
            }
        }); 
        
        chkLentes = new JCheckBox("Lentes");
        chkLentes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.chkButtonClick();
            }
        });
        
        chkCabello = new JCheckBox("Cabello");
        chkCabello.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.chkButtonClick();
            }
        });
        
        chkDientes = new JCheckBox("Dientes");
        chkDientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.chkButtonClick();
            }
        });
        
        super.add(chkBarbilla);
        super.add(chkLentes);
        super.add(chkCabello);
        super.add(chkDientes);
    }
    
    public String calcularNombre(){
        String resultado = "geek-";
        
        resultado = resultado + (chkBarbilla.isSelected() ? "c" : "-");
        resultado = resultado + (chkLentes.isSelected() ? "g" : "-");
        resultado = resultado + (chkCabello.isSelected() ? "h" : "-");
        resultado = resultado + (chkDientes.isSelected() ? "t" : "-");
        
        return resultado + ".gif";
    }
    
    public void clear(){
        chkBarbilla.setSelected(false);
        chkLentes.setSelected(false);
        chkCabello.setSelected(false);
        chkDientes.setSelected(false);
        
    }

    public void setListener(ImagenBoton listener) {
        this.listener = listener;
    }
    
}
