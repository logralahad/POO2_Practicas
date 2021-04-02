/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 *
 * @author logra
 */
public class CuadroPassword extends JPanel{
    
    private final char[] correctPassword = { 'b', 'u', 'g', 'a', 'b', 'o', 'o' };
    
    private JLabel lblNombre;
    private JPasswordField edtNombre;
    private IconoToggleBoton btnVisible;

    public CuadroPassword(String texto) {
        super.setBackground(Color.ORANGE);
        
        lblNombre = new JLabel(texto);
        edtNombre = new JPasswordField(15);
        edtNombre.setEchoChar('*');
        
        btnVisible = new IconoToggleBoton("resources/iconos_archivos/visible.png");
        btnVisible.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(btnVisible.isSelected()){
                    edtNombre.setEchoChar((char)0);
                }else{
                    edtNombre.setEchoChar('*');
                }
            }
        });

        super.add(lblNombre);
        super.add(edtNombre);
        super.add(btnVisible);
    }

    public void clear(){
        this.edtNombre.setText("");
    }
    
    public Boolean comprobarPassword(char[] intento){
        if (intento.length != correctPassword.length) {
            return false;
        } else {
            return Arrays.equals(intento, correctPassword);
        }
    }
    
    public char[] obtenerPassword(){
        return edtNombre.getPassword();
    }
}
