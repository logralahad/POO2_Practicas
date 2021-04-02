/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablero;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author logra
 */
public class PrincipalFrame extends JFrame{

    /**
     * @param args the command line arguments
     */
    private Practicas1 pnlP14;
    private Practicas2 pnlP58;
    private JButton btnSalir;
    
    public PrincipalFrame(){
        super("Archivos");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(750, 450);                
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);
        
        pnlP14 = new Practicas1();
        pnlP58 = new Practicas2();
        PrincipalFrame.this.repaint();
        
        btnSalir = new JButton("Salir");
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        
        super.add(pnlP14, BorderLayout.NORTH);
        super.add(pnlP58);
        super.add(btnSalir, BorderLayout.SOUTH);
        super.setVisible(true);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new PrincipalFrame();
    }
    
}
