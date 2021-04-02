/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sumadora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author logra
 */
public class BotonesPanel extends JPanel{
    
    private JButton btnCalcular;
    private JButton btnLimpiar;
    private JButton btnSalir;
    private AccionesBotones listener;
    private JPanel panel1;
    private JPanel panel2;
    
    public BotonesPanel(){
        super.setBackground(Color.GREEN);
        super.setLayout(new BorderLayout());
        
        panel1 = new JPanel();
        panel1.setBackground(Color.PINK);
        
        panel2 = new JPanel();
        panel1.setBackground(Color.YELLOW);
        
        btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.accionCalcular();;
            }
        });
                
        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.accionLimpiar();;
            }
        });
        
        panel1.add(btnCalcular);
        panel1.add(btnLimpiar);
        
        btnSalir = new JButton("Salir");
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.accionSalir();;
            }
        });
        panel2.add(btnSalir);
        
        super.add(panel1, BorderLayout.EAST);
        super.add(panel2, BorderLayout.WEST);
        
    }

    public void setListener(AccionesBotones listener) {
        this.listener = listener;
    }
    
}
