/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

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
    private MenuBar menuOpciones;
    
    public PrincipalFrame(){
        
        super("Menu");
        super.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        super.setSize(500, 280);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);
        
        menuOpciones = new MenuBar();
        
        pnlBotones = new BotonesPanel();
        pnlBotones.setListener(new AccionesBotones() {
            @Override
            public void menuArchivoButtonClick() {
                menuOpciones.popUpMenuArchivo();
            }

            @Override
            public void salirButtonClick() {
                dispose();
            }
        }); 
        
        super.setJMenuBar(menuOpciones);
        super.add(pnlBotones);
        super.setVisible(true);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new PrincipalFrame();
    }
    
}
