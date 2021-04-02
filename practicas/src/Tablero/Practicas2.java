/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablero;

import Login.*;
import Archivos.*;
import Imagenes.*;
import Menus.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 *
 * @author logra
 */
public class Practicas2 extends JPanel{

    private IconoBoton btnP5;
    private IconoBoton btnP6;
    private IconoBoton btnP7;
    private IconoBoton btnP8;
    
    public Practicas2(){
        
        super.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        
        btnP5 = new IconoBoton("Login", "resources/tablero_iconos/p5.png");
        btnP5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new Login.PrincipalFrame();
            }
        });
        
        btnP6 = new IconoBoton("Archivos", "resources/tablero_iconos/p6.png");
        btnP6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new Archivos.PrincipalFrame();
            }
        });
        
        btnP7 = new IconoBoton("Imagenes", "resources/tablero_iconos/p7.png");
        btnP7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new Imagenes.PrincipalFrame();
            }
        });
        
        btnP8 = new IconoBoton("Menu", "resources/tablero_iconos/p8.png");
        btnP8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new Menus.PrincipalFrame();
            }
        });
        
        super.add(btnP5);
        super.add(btnP6);
        super.add(btnP7);
        super.add(btnP8);
        
    }
    
}
