/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 *
 * @author logra
 */
public class LoginPanel extends JPanel{
    
    private JPanel pnlColor;
    private ImageScaled imgUser;
    private TitledBorder ttlBorde;
    private Border brdPanel;
    private CuadroTexto cdrUser;
    private CuadroPassword cdrPassword;
    
    public LoginPanel(){
        super.setLayout(new BorderLayout());
        
        imgUser = new ImageScaled("resources/iconos_archivos/user.png");
        brdPanel = BorderFactory.createLineBorder(Color.BLACK, 2);
        ttlBorde = BorderFactory.createTitledBorder(brdPanel, "MI SUPER APP", TitledBorder.CENTER, 
                TitledBorder.ABOVE_TOP, new Font("LucilaGrande", Font.BOLD, 18));

        pnlColor = new JPanel();
        pnlColor.setBorder(ttlBorde);
        pnlColor.setLayout(new BoxLayout(pnlColor, BoxLayout.PAGE_AXIS));
        
        cdrUser = new CuadroTexto("Usuario: ");
        cdrPassword = new CuadroPassword("Password: ");

        pnlColor.add(cdrUser);
        pnlColor.add(cdrPassword);
        
        super.add(pnlColor);
        super.add(imgUser, BorderLayout.NORTH);
    }
    
    public Boolean comprobarLogin(){
        if(cdrPassword.comprobarPassword(cdrPassword.obtenerPassword())){
            return true;
        }
        else{
            return false;
        }
    }
    
    public String obtenerUsuario(){
        return cdrUser.obtenerTexto();
    }
    
    public void clear(){
        cdrUser.clear();
        cdrPassword.clear();
    }
    
}
