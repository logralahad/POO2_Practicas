/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imagenes;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author logra
 */
public class PrincipalFrame extends JFrame{

    /**
     * @param args the command line arguments
     */
    private BotonesPanel pnlBotones;
    private OpcionesPanel pnlOpciones;
    private JLabel imgGeek;
    
    public PrincipalFrame(){
        
        super("Geek");
        super.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        super.setSize(300, 200);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);
        
        imgGeek = new JLabel(new ImageIcon("resources/geek/geek-----.gif"));
        
        pnlOpciones = new OpcionesPanel();
        pnlOpciones.setListener(new ImagenBoton() {
            @Override
            public void chkButtonClick() {
                imgGeek.setIcon(new ImageIcon(String.format("resources/geek/%s", 
                        pnlOpciones.calcularNombre())));
            }
        });
        
        pnlBotones = new BotonesPanel();
        pnlBotones.setListener(new AccionesBotones() {
            @Override
            public void accionReestablecer() {
                pnlOpciones.clear();
                imgGeek.setIcon(new ImageIcon("resources/geek/geek-----.gif"));
            }

            @Override
            public void accionSalir() {
                dispose();
            }
        }); 
        
        super.add(imgGeek);
        super.add(pnlOpciones, BorderLayout.WEST);
        super.add(pnlBotones, BorderLayout.SOUTH);
        super.setVisible(true);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new PrincipalFrame();
    }
    
}
