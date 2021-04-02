/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author logra
 */
public class ImageScaled extends JLabel{
    
    private Image imgUser;
    private ImageIcon imbLabel;
    
    public ImageScaled(String direccion) {
        ImageIcon temp = new ImageIcon(direccion);
        imgUser = temp.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        
        imbLabel = new ImageIcon(imgUser);
        super.setIcon(imbLabel);
        super.setHorizontalAlignment(SwingConstants.CENTER);
        super.setVerticalAlignment(SwingConstants.CENTER);
    }
    
}
