/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author logra
 */
public class PrincipalFrame extends JFrame {

    /**
     * @param args the command line arguments
     */
    private BotonesPanel pnlBotones;
    private ConversorPanel pnlConversor;
    
    
    public PrincipalFrame(){
        super("Conversor");
        super.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        super.setSize(400, 150);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);
        
        pnlConversor = new ConversorPanel();
        pnlConversor.setListener(new ConversorListener() {
            @Override
            public void cmbConversorAction(Integer indice) {
                try {
                    pnlConversor.setCantidad(indice);
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(PrincipalFrame.this, e.getMessage(),
                            "Error de conversion", JOptionPane.ERROR_MESSAGE); 
                }
            }
        });

        pnlBotones = new BotonesPanel();
        pnlBotones.setListener(new AccionesBotones() {
            @Override
            public void accionLimpiar() {
                pnlConversor.clear();
            }

            @Override
            public void accionSalir() {
                dispose();
            }
        }); 
        
        super.add(pnlConversor);
        super.add(pnlBotones, BorderLayout.SOUTH);
        super.setVisible(true);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        new PrincipalFrame();
    }
    
}
