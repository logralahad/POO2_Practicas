/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colores;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 *
 * @author logra
 */
public class CuadroPanel extends JPanel{
    
    private JPanel pnlColor;
    private TitledBorder ttlBorde;
    private Border brdPanel;  
    
    public CuadroPanel(){
        super.setLayout(new BorderLayout());
        
        brdPanel = BorderFactory.createLineBorder(Color.BLACK, 2);
        ttlBorde = BorderFactory.createTitledBorder(brdPanel, "Color", TitledBorder.CENTER, 
                TitledBorder.ABOVE_TOP, new Font("LucilaGrande", Font.BOLD, 18));

        pnlColor = new JPanel();
        pnlColor.setBorder(ttlBorde);
        
        super.add(pnlColor);
    }
    
    public void cambiarColor(Color color){
        pnlColor.setBackground(color);
    }
    
}
