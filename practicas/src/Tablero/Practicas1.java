/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablero;

import Sumadora.*;
import Conversor.*;
import Colores.*;
import Dialogos.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 *
 * @author logra
 */
public class Practicas1 extends JPanel{
    
    private IconoBoton btnP1;
    private IconoBoton btnP2;
    private IconoBoton btnP3;
    private IconoBoton btnP4;
    private IconoBoton btnP5;
    private IconoBoton btnP6;
    private IconoBoton btnP7;
    private IconoBoton btnP8;
    private JPanel pnlP14;
    private JPanel pnlP58;
    
    public Practicas1(){
        
        super.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        
        btnP1 = new IconoBoton("Sumadora", "resources/tablero_iconos/p1.png");
        btnP1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new Sumadora.PrincipalFrame();
            }
        });
        
        btnP2 = new IconoBoton("Conversor", "resources/tablero_iconos/p2.png");
        btnP2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new Conversor.PrincipalFrame();
            }
        });
        
        btnP3 = new IconoBoton("Colores", "resources/tablero_iconos/p3.png");
        btnP3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new Colores.PrincipalFrame();
            }
        });
        
        btnP4 = new IconoBoton("Dialogos", "resources/tablero_iconos/p4.png");
        btnP4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new Dialogos.PrincipalFrame();
            }
        });
        
        super.add(btnP1);
        super.add(btnP2);
        super.add(btnP3);
        super.add(btnP4);

        
    }
    
}
