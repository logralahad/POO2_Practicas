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
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 *
 * @author logra
 */
public class AyudaMenu extends JMenu{
    
    private JMenuItem cbxAcercaDe;
    
    public AyudaMenu(){
        super("Ayuda");
        super.setFont(new Font("Lucila Grande", Font.BOLD, 18));
        
        cbxAcercaDe = new JMenuItem("Acerca de...");
        cbxAcercaDe.setFont(new Font("Lucila Grande", Font.BOLD, 14));
        cbxAcercaDe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Este es un mensaje de informacion",
                        "Acerca de...", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        cbxAcercaDe.setMnemonic(KeyEvent.VK_F1);
        cbxAcercaDe.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0)); 
        
        super.add(cbxAcercaDe);
    }
    
}
