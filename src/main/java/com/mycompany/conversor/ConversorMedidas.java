package com.mycompany.conversor;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ConversorMedidas extends JFrame implements ActionListener{
    private JComboBox<String> listaOpciones;//Muestra lista de conversiones
    public ConversorMedidas(){
        // Creamos la lista desplegable para seleccionar a que moneda se convertira
        JButton botonAceptar = new JButton("Aceptar");
        String[] opConversor = {"Centimetros a metros", "Metros a centimetros"};
        listaOpciones = new JComboBox<>(opConversor);
        //creación de interfaz
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Elije la opción de conversor"));
        panel1.add(listaOpciones);
        panel1.add(botonAceptar);

        JPanel panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.add(panel1);

        add(panelPrincipal);

        // Registramos el botón para recibir eventos de acción
        botonAceptar.addActionListener(this);

        setVisible(true);
        setTitle("Menu");
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    /* public static void main(String[] args) {
        // Creamos la ventana principal
        new ConversorMedidas();
    } */

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Aceptar")) {
            // Acción a realizar cuando se presiona el botón "Aceptar"
            int opcionSeleccionada = listaOpciones.getSelectedIndex();
            Operaciones operaciones = new Operaciones();
            switch(opcionSeleccionada) {
                case 0:
                    dispose();                        
                    operaciones.transferirValor();
                    operaciones.cenMet();
                    break;
                case 1:
                    dispose();
                    operaciones.transferirValor();
                    operaciones.metCen();
                    break;
            }
        }
    }
    
}
