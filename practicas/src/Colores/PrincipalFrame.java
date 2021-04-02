/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colores;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author logra
 */
public class PrincipalFrame extends JFrame{

    /**
     * @param args the command line arguments
     */
    private BotonesPanel pnlBotones;
    private ColorPanel pnlSpinner;
    
    public PrincipalFrame(){
        
        super("Colores");
        super.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        super.setSize(500, 300);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);

        pnlSpinner = new ColorPanel();
        
        pnlBotones = new BotonesPanel();
        pnlBotones.setListener(new AccionesBotones() {
            @Override
            public void accionReestablecer() {
                pnlSpinner.resetParametros();
            }

            @Override
            public void accionSalir() {
                dispose();
            }
        });

        super.add(pnlSpinner);
        super.add(pnlBotones, BorderLayout.SOUTH);
        super.setVisible(true);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        new PrincipalFrame();
    }
    
}
