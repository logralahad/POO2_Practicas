/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author logra
 */
public class BotonesPanel extends JPanel{
    
    private IconoBoton btnSalir;
    private IconoBoton btnMenu;
    private AccionesBotones listener;
    
    public BotonesPanel(){
        super.setLayout(new FlowLayout());
        
        btnSalir = new IconoBoton("Salir", "resources/iconos_archivos/salir.png");
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.salirButtonClick();;
            }
        });
        
        btnMenu = new IconoBoton("Menu de archivos","resources/iconos_archivos/menu.png");
        btnMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.menuArchivoButtonClick();;
            }
        });
        
        super.add(btnMenu);
        super.add(btnSalir);
    }
    
    public void setListener(AccionesBotones listener) {
        this.listener = listener;
    }
    
}
