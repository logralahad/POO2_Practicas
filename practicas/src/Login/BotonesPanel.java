/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

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
    
    private JButton btnIngresar;
    private JButton btnLimpiar;
    private JButton btnCancelar;
    private JPanel pnlIngresar;
    private JPanel pnlLimpiar;
    private JPanel pnlSalir;
    private AccionesBotones listener;
    
    public BotonesPanel(){
        super.setLayout(new BorderLayout());
        
        pnlIngresar = new JPanel();
        pnlLimpiar = new JPanel();
        pnlSalir = new JPanel();
        
        btnIngresar = new JButton("Ingresar");
        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.ingresarButtonClick();;
            }
        });
        pnlIngresar.add(btnIngresar);
                
        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.limpiarButtonClick();;
            }
        });
        pnlLimpiar.add(btnLimpiar);
        
        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.cancelarButtonClick();;
            }
        });
        pnlSalir.add(btnCancelar);
        
        super.add(pnlIngresar, BorderLayout.CENTER);
        super.add(pnlLimpiar, BorderLayout.EAST);
        super.add(pnlSalir, BorderLayout.WEST);   
    }

    public void setListener(AccionesBotones listener) {
        this.listener = listener;
    }
    
}
