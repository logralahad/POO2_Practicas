/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

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
    private LoginPanel pnlLogin;
    private BotonesPanel pnlBotones;
    
    public PrincipalFrame(){
        
        super("Login");
        super.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        super.setSize(350, 330);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);
        
        pnlLogin = new LoginPanel();
        
        pnlBotones = new BotonesPanel();
        pnlBotones.setListener(new AccionesBotones() {
            @Override
            public void ingresarButtonClick() {
                if(pnlLogin.comprobarLogin()){
                    JOptionPane.showMessageDialog(PrincipalFrame.this, "Bienvenido " +
                    pnlLogin.obtenerUsuario(), "Acceso concedido", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(PrincipalFrame.this, "Password incorrecto", 
                        "Acceso denegado", JOptionPane.ERROR_MESSAGE);
                }
            }

            @Override
            public void limpiarButtonClick() {
                pnlLogin.clear();
            }

            @Override
            public void cancelarButtonClick() {
                dispose(); 
            }
        }); 
        
        super.add(pnlLogin);
        super.add(pnlBotones, BorderLayout.SOUTH);
        super.setVisible(true);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new PrincipalFrame();
    }
    
}
