/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imagenes;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author logra
 */
public class BotonesPanel extends JPanel{
    
    private JButton btnLimpiar;
    private JButton btnSalir;
    private AccionesBotones listener;
    private JPanel pnlLimpieza;
    private JPanel pnlSalir;
    
    public BotonesPanel(){
        super.setLayout(new BorderLayout());
        
        pnlLimpieza = new JPanel();
        pnlSalir = new JPanel();
                
        btnLimpiar = new JButton("Reestablecer");
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.accionReestablecer();;
            }
        });
        pnlLimpieza.add(btnLimpiar);
        
        btnSalir = new JButton("Salir");
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.accionSalir();;
            }
        });
        pnlSalir.add(btnSalir);
        
        super.add(pnlLimpieza, BorderLayout.EAST);
        super.add(pnlSalir, BorderLayout.WEST);
        
    }

    public void setListener(AccionesBotones listener) {
        this.listener = listener;
    }
    
}
