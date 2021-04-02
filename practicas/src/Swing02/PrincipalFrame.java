/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing02;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author logra
 */
public class PrincipalFrame extends JFrame{

    /**
     * @param args the command line arguments
     */
    private JButton btnSaludar;
    private JButton btnSumar;
    
    
    public PrincipalFrame(){
        
        super("Edits");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(200, 400);
        super.setLayout(new FlowLayout(FlowLayout.LEFT));
        super.setLocationRelativeTo(null);
        
        CuadroTexto nombre = new CuadroTexto("Escribe tu nombre", 15);
        btnSaludar = new JButton("Saludar!");
        btnSaludar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, String.format("Hola %s, bienvenido!", 
                        nombre.getEdtNombre().getText()));
                nombre.getEdtNombre().setText("");
            }
        });
        
        CuadroTexto num1 = new CuadroTexto("Escribe un numero", 15);
        CuadroTexto num2 = new CuadroTexto("Escribe un numero", 15);
        
        btnSumar = new JButton("Sumar (+)");
        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Integer n1 = Integer.parseInt(num1.getEdtNombre().getText());
                Integer n2 = Integer.parseInt(num2.getEdtNombre().getText());
                
                JOptionPane.showMessageDialog(null, String.format("Resultado: %d", 
                        (n1 + n2)));
                num1.getEdtNombre().setText("");
                num2.getEdtNombre().setText("");
            }
        });
        
        super.add(nombre.getLblNombre());
        super.add(nombre.getEdtNombre());
        super.add(btnSaludar);
        
        super.add(num1.getLblNombre());
        super.add(num1.getEdtNombre());
        super.add(num2.getLblNombre());
        super.add(num2.getEdtNombre());
        super.add(btnSumar);
        super.setVisible(true);
        
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new PrincipalFrame();
    }
    
}
