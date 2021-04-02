/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author logra
 */
public class LienzoPanel extends JPanel{
    
    private JPanel pnlColor;
    private JLabel lblColor;
    private Border brdPanel; 
    
    public LienzoPanel(){
        super.setLayout(new BorderLayout());
        
        lblColor = new JLabel("Color: ");
        lblColor.setFont(new Font("LucilaGrande", Font.BOLD, 18));
        
        brdPanel = BorderFactory.createLineBorder(Color.BLACK, 2);
        
        pnlColor = new JPanel();
        pnlColor.setBorder(brdPanel);
        pnlColor.setBackground(Color.WHITE);
        
        super.add(lblColor, BorderLayout.WEST);
        super.add(pnlColor);
    }
    
    public void cambiarColor(Color color){
        pnlColor.setBackground(color);
    }
    
}
