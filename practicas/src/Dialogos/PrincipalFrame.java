/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dialogos;

import java.awt.BorderLayout;
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
    private RadioBotonesPanel pnlRadioBotones;
    private BotonesPanel pnlBotones;
    private CuadrosPanel pnlCuadros;
    
    public PrincipalFrame(){
        super("Dialogos");
        super.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        super.setSize(450, 180);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);
        
        pnlRadioBotones = new RadioBotonesPanel();
        pnlCuadros = new CuadrosPanel();
        
        pnlBotones = new BotonesPanel();
        pnlBotones.setListener(new AccionesBotones() {
            @Override
            public void accionGenerar() {
                try {
                    pnlRadioBotones.mostrarDialogo(pnlCuadros.obtenerTitulo(), pnlCuadros.obtenerMensaje());
                }
                catch (EntradaVaciaException e) {
                    JOptionPane.showMessageDialog(PrincipalFrame.this, e.getMessage(),
                        "Error al mostrar el dialogo", JOptionPane.ERROR_MESSAGE); 
                } 
            }

            @Override
            public void accionLimpiar() {
                pnlCuadros.clear();
                pnlRadioBotones.limpiarSeleccion();
            }
  
            @Override
            public void accionSalir() {
                dispose();
            }
        });
        
        super.add(pnlCuadros);
        super.add(pnlRadioBotones, BorderLayout.WEST);
        super.add(pnlBotones, BorderLayout.SOUTH);        
        super.setVisible(true);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new PrincipalFrame();
    }
    
}
