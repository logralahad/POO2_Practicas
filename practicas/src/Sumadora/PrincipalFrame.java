/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sumadora;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author logra
 */
public class PrincipalFrame extends JFrame{

    /**
     * @param args the command line arguments
     */
    private BotonesPanel pnlBotones;
    private NumerosPanel pnlNumeros;
    private ControlPanel pnlControl;
    
    
    public PrincipalFrame(){
        
        super("Sumatoria");
        super.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        super.setSize(400, 600);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);
        
        pnlNumeros = new NumerosPanel();
        
        pnlControl = new ControlPanel();
        pnlControl.setListener(new ControlListener() {
            @Override
            public void agregarButtonClick(Integer noControles) {
                pnlNumeros.addControllers(noControles);
                PrincipalFrame.this.pack();
            }
        });
        
        pnlBotones = new BotonesPanel();
        pnlBotones.setListener(new AccionesBotones() {
            @Override
            public void accionCalcular() {
                try {
                    Integer res = pnlNumeros.getResultado(); 
                    JOptionPane.showMessageDialog(PrincipalFrame.this, String.format("El resultado es :%d", 
                            res), "Resultado", JOptionPane.INFORMATION_MESSAGE); 
                }
                catch (NumeroIncorrectoException e) {
                    JOptionPane.showMessageDialog(PrincipalFrame.this, e.getMessage(),
                            "Error de conversion", JOptionPane.ERROR_MESSAGE); 
                } 
            }

            @Override
            public void accionLimpiar() {
                pnlNumeros.limpiarControles();
            }
  
            @Override
            public void accionSalir() {
                dispose();
            }
        });
        
        super.add(pnlControl, BorderLayout.NORTH);
        super.add(pnlBotones, BorderLayout.SOUTH); 
        super.add(pnlNumeros, BorderLayout.CENTER);
        super.setVisible(true);        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new PrincipalFrame();
    }
    
}
