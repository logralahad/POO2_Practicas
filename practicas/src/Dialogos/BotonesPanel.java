/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dialogos;

import Sumadora.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author logra
 */
public class BotonesPanel extends JPanel{
    
    private JButton btnGenerar;
    private JButton btnLimpiar;
    private JButton btnSalir;
    private AccionesBotones listener;
    private JPanel pnlAcciones;
    private JPanel pnlSalir;
    
    public BotonesPanel(){
        super.setBackground(Color.GREEN);
        super.setLayout(new BorderLayout());
        
        pnlAcciones = new JPanel();
        pnlAcciones.setBackground(Color.PINK);
        
        pnlSalir = new JPanel();
        pnlAcciones.setBackground(Color.YELLOW);
        
        btnGenerar = new JButton("Generar");
        btnGenerar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.accionGenerar();;
            }
        });
                
        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.accionLimpiar();;
            }
        });
        
        pnlAcciones.add(btnGenerar);
        pnlAcciones.add(btnLimpiar);
        
        btnSalir = new JButton("Salir");
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.accionSalir();;
            }
        });
        pnlSalir.add(btnSalir);
        
        super.add(pnlAcciones, BorderLayout.EAST);
        super.add(pnlSalir, BorderLayout.WEST);
        
    }

    public void setListener(AccionesBotones listener) {
        this.listener = listener;
    }
    
}
