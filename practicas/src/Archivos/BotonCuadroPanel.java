/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 *
 * @author logra
 */
public class BotonCuadroPanel extends JPanel{
    
    private TextoPanel cdrAbrir;
    private TextoPanel cdrGuardar;
    private LienzoPanel pnlColor;
    private IconoBoton btnAbrir;
    private IconoBoton btnGuardar;
    private IconoBoton btnColor;
    private AccionesIconosBotones listener;
    private JPanel pnlAbrir;
    private JPanel pnlGuardar;
    private JPanel pnlCuadroColor;
    
    public BotonCuadroPanel(){
        
        super.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        
        pnlCuadroColor = new JPanel();
        pnlCuadroColor.setLayout(new FlowLayout());
        
        pnlAbrir = new JPanel();
        pnlAbrir.setLayout(new FlowLayout());
        
        pnlGuardar = new JPanel();
        pnlGuardar.setLayout(new FlowLayout());
        
        cdrAbrir = new TextoPanel("Adjuntar archivo: ");
        btnAbrir = new IconoBoton("resources/iconos_archivos/abrir.png");
        btnAbrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.abrirButtonClick();
            }
        });
        pnlAbrir.add(cdrAbrir);
        pnlAbrir.add(btnAbrir);
        
        cdrGuardar = new TextoPanel("Guardar archivo: ");
        btnGuardar = new IconoBoton("resources/iconos_archivos/cerrar.png");
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.guardarButtonClick();
            }
        });
        pnlGuardar.add(cdrGuardar);
        pnlGuardar.add(btnGuardar);
        
        pnlColor = new LienzoPanel();
        pnlColor.setPreferredSize(new Dimension(500, 150));
        btnColor = new IconoBoton("resources/iconos_archivos/cambiar_color.png");
        btnColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.cambiarColorButtonClick();
            }
        });
        pnlCuadroColor.add(pnlColor);
        pnlCuadroColor.add(btnColor);
        
        super.add(pnlAbrir);
        super.add(pnlGuardar);
        super.add(pnlCuadroColor);
    }
    
    public void clear(){
        cdrAbrir.clear();
        cdrGuardar.clear();
        pnlColor.cambiarColor(Color.WHITE);
    }
    
    public void setDireccionAbrir(String direccion){
        cdrAbrir.setMensaje(direccion);
    }
    
    public void setDireccionGuardar(String direccion){
        cdrGuardar.setMensaje(direccion);
    }
    
    public void cambiarColor(Color color){
        pnlColor.cambiarColor(color);
    }

    public void setListener(AccionesIconosBotones listener) {
        this.listener = listener;
    }
    
}
