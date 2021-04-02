/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
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
    private BotonCuadroPanel pnlCuadroBoton;
    private JFileChooser dlgFile;
    private JColorChooser dlgColor;
    
    public PrincipalFrame(){
        
        super("Archivos");
        super.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        super.setSize(650, 350);                
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);
        
        dlgFile = new JFileChooser();
        dlgColor = new JColorChooser();
        
        pnlCuadroBoton = new BotonCuadroPanel();
        pnlCuadroBoton.setListener(new AccionesIconosBotones() {
            @Override
            public void abrirButtonClick() {
                int resultado = dlgFile.showOpenDialog(PrincipalFrame.this);
                if( resultado == JFileChooser.APPROVE_OPTION){
                    pnlCuadroBoton.setDireccionAbrir(dlgFile.getSelectedFile().toString());
                }
            }

            @Override
            public void guardarButtonClick() {
                int resultado = dlgFile.showSaveDialog(PrincipalFrame.this);
                if( resultado == JFileChooser.APPROVE_OPTION){
                    pnlCuadroBoton.setDireccionGuardar(dlgFile.getSelectedFile().toString());
                }
            }

            @Override
            public void cambiarColorButtonClick() {
                Color color = dlgColor.showDialog(PrincipalFrame.this, "Selecciona un color", Color.WHITE);
                pnlCuadroBoton.cambiarColor(color);
                
            }
        });
        
        pnlBotones = new BotonesPanel();
        pnlBotones.setListener(new AccionesBotones() {
            @Override
            public void accionLimpiar() {
                pnlCuadroBoton.clear();
            }

            @Override
            public void accionSalir() {
                dispose();
            }
        }); 
        
        super.add(pnlCuadroBoton);
        super.add(pnlBotones, BorderLayout.SOUTH);
        super.setVisible(true);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new PrincipalFrame();
    }
    
}
