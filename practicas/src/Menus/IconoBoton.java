/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import java.awt.Font;
import java.awt.Image;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;



/**
 *
 * @author logra
 */
public class IconoBoton extends JButton{
    
    private Image imgBoton;
    private ImageIcon icnBoton;

    public IconoBoton(String tipo, String direccion) {
        super(tipo);
        super.setVerticalTextPosition(AbstractButton.BOTTOM);
        super.setHorizontalTextPosition(AbstractButton.CENTER);
        super.setFont(new Font("Lucila Grande", Font.BOLD, 18));
        
        ImageIcon temp = new ImageIcon(direccion);
        imgBoton = temp.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        
        icnBoton = new ImageIcon(imgBoton);
        super.setIcon(icnBoton);
    }
    
}
