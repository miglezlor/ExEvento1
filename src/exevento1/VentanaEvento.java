package exevento1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author mgonzalezlorenzo
 */
public class VentanaEvento implements ActionListener {
    
    JFrame marco;
    JPanel panel;
    JButton boton;
    JLabel etiqueta;
    
    public void crearVentana(){
        marco = new JFrame(" *** Balaidos *** ");
        panel = new JPanel();
        boton = new JButton("Pulsar para gol de Guidetti");
        boton.setBackground(Color.cyan);
        etiqueta = new JLabel();
        
        marco.setSize(500, 300);
        //monitorizamos o boton
        boton.addActionListener(this);
        
        panel.add(boton);
        panel.add(etiqueta);
        marco.add(panel);
        
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        etiqueta.setText(" ** Goool de SuperGuidetti ** ");
    }
}
