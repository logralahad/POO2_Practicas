/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 *
 * @author logra
 */
public class ArchivoMenu extends JMenu{
    
    private JMenuItem cbxNuevo;
    private JMenuItem cbxAbrir;
    private JMenuItem cbxSalir;
    private AccionesMenuArchivo listener;
    
    public ArchivoMenu(){
        super("Archivo");
        super.setFont(new Font("Lucila Grande", Font.BOLD, 18));
        
        cbxNuevo = new JMenuItem("Nuevo");
        cbxNuevo.setFont(new Font("Lucila Grande", Font.BOLD, 14));
        cbxNuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.mmNuevo();
            }
        }); 
        cbxNuevo.setMnemonic(KeyEvent.VK_N);
        cbxNuevo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        
        cbxAbrir = new JMenuItem("Abrir");
        cbxAbrir.setFont(new Font("Lucila Grande", Font.BOLD, 14));
        cbxAbrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.mmAbrir();
            }
        }); 
        cbxAbrir.setMnemonic(KeyEvent.VK_O);
        cbxAbrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        
        cbxSalir = new JMenuItem("Salir");
        cbxSalir.setFont(new Font("Lucila Grande", Font.BOLD, 14));
        cbxSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.mmSalir();
            }
        }); 
        cbxSalir.setMnemonic(KeyEvent.VK_X);
        cbxSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        
        super.add(cbxNuevo);
        super.add(cbxAbrir);
        super.addSeparator();
        super.add(cbxSalir);
        
    }

    public void setListener(AccionesMenuArchivo listener) {
        this.listener = listener;
    }
    
}
