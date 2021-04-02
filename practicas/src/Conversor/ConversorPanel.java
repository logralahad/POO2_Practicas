/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author logra
 */
public class ConversorPanel extends JPanel{
    
    private final Double DOLAR_PESO = 20.72;
    private final Double DOLAR_EURO = 0.84;
    private final Double EURO_PESO = 24.77;
    
    private final String[] opciones = {"", "Peso a dolar","Dolar a peso", "Peso a euro", 
        "Euro a peso", "Dolar a euro", "Euro a dolar"};
    
    private CuadroTexto edtNumero;
    private JComboBox cmbOpciones;
    private JLabel lblCantidad;
    private ConversorListener listener;
    private JPanel pnlCantidad;
    private JPanel pnlCuadro;
    
    public ConversorPanel(){
        super.setLayout(new BorderLayout());
        
        pnlCantidad = new JPanel();
        pnlCantidad.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnlCantidad.setBackground(Color.GREEN);
        
        pnlCuadro = new JPanel();
        pnlCuadro.setLayout(new BorderLayout());
        
        edtNumero = new CuadroTexto("Cantidad", 15);
        
        lblCantidad = new JLabel("$ 0.00");
        lblCantidad.setFont(new Font("Lucida Grande", Font.BOLD, 40));
        
        cmbOpciones = new JComboBox(opciones);
        cmbOpciones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                listener.cmbConversorAction(cmbOpciones.getSelectedIndex());
            }
        });

        pnlCuadro.add(edtNumero, BorderLayout.NORTH);
        pnlCuadro.add(cmbOpciones);
        pnlCantidad.add(lblCantidad);
        
        super.add(pnlCuadro, BorderLayout.WEST);
        super.add(pnlCantidad);
        
    }
    
    public void clear(){
        edtNumero.clear();
        lblCantidad.setText("$ 0.00");
    }
    
    public void setCantidad(Integer index) throws CantidadInvalidaException{
        Double valor = edtNumero.getValue();
        String sentencia = "";
        
        switch (index) {
                case 1:
                    sentencia = String.format("$ %.2f", valor / DOLAR_PESO);
                    break;

                case 2:
                    sentencia = String.format("$ %.2f", valor * DOLAR_PESO);
                    break;

                case 3:
                    sentencia = String.format("€ %.2f", valor / EURO_PESO);
                    break;

                case 4:
                    sentencia = String.format("$ %.2f", valor * EURO_PESO);
                    break;

                case 5:
                    sentencia = String.format("€ %.2f", valor * DOLAR_EURO);
                    break;

                case 6:
                    sentencia = String.format("$ %.2f", valor / DOLAR_EURO);
                    break;

                default:
                    sentencia = String.format("$ %.2f", valor);
                    break;
            }

        lblCantidad.setText(sentencia);
        
    }
    
    public void setListener(ConversorListener listener) {
        this.listener = listener;
    }
    
}
