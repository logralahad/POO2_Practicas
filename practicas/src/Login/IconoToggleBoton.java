/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;



/**
 *
 * @author logra
 */
public class IconoToggleBoton extends JToggleButton{
    
    private Image imgBoton;
    private ImageIcon icnBoton;

    public IconoToggleBoton(String direccion) {
        ImageIcon temp = new ImageIcon(direccion);
        imgBoton = temp.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        
        icnBoton = new ImageIcon(imgBoton);
        super.setIcon(icnBoton);
    }
    
}
