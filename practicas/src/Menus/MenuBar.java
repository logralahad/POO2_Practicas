/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import java.awt.Dimension;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

/**
 *
 * @author logra
 */
public class MenuBar extends JMenuBar{
    
    private ArchivoMenu menuArchivo;
    private AyudaMenu menuAyuda;
    private JFileChooser dlgFile;
    
    public MenuBar(){
        
        dlgFile = new JFileChooser();
        
        menuArchivo = new ArchivoMenu();
        menuArchivo.setListener(new AccionesMenuArchivo() {
            @Override
            public void mmNuevo() {
                JOptionPane.showMessageDialog(null, "Estas creando un archivo",
                        "Crear nuevo archivo", JOptionPane.INFORMATION_MESSAGE);
            } 

            @Override
            public void mmAbrir() {
                int resultado = dlgFile.showOpenDialog(dlgFile);
                if(resultado == JFileChooser.APPROVE_OPTION){
                    JOptionPane.showMessageDialog(null, "Elegiste " + dlgFile.getSelectedFile().toString(),
                        "Abriendo nuevo archivo", JOptionPane.INFORMATION_MESSAGE);
                }
            }

            @Override
            public void mmSalir() {
                System.exit(0);
            }
        }); 
        
        menuAyuda = new AyudaMenu();
        
        super.add(menuArchivo);
        super.add(menuAyuda);        
    }
    
    public void popUpMenuArchivo(){
        this.menuArchivo.doClick();
    }
}
