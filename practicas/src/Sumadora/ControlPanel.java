/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sumadora;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author logra
 */
public class ControlPanel extends JPanel{
    
    private final Integer[] opciones = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 
        13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};
    
    private JLabel lblOpciones;
    private JButton btnAgregar;
    private ControlListener listener;
    private JComboBox cmbOpciones;

    public ControlPanel() {
        super.setBackground(Color.BLUE);
        
        this.lblOpciones = new JLabel("No. de componentes");
        lblOpciones.setForeground(Color.WHITE);
        
        this.cmbOpciones = new JComboBox(opciones);
        cmbOpciones.addActionListener(cmbOpciones);
        
        this.btnAgregar = new JButton("Agregar");
        this.btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.agregarButtonClick((Integer)cmbOpciones.getSelectedIndex() + 1);
            }
        }); 
        
        super.add(lblOpciones);
        super.add(cmbOpciones);
        super.add(btnAgregar);
    }

    public void setListener(ControlListener listener) {
        this.listener = listener;
    }
    
}
