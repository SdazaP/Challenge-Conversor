package com.mycompany.conversor;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;


public class ConversorMonedas extends JFrame implements ActionListener{
    private JComboBox<String> listaOpciones;//Muestra lista de conversiones
    public ConversorMonedas(){
        // Creamos la lista desplegable para seleccionar a que moneda se convertira
        JButton botonAceptar = new JButton("Aceptar");
        String[] opConversor = {"De Pesos a Dólar","De pesos a Euro","De pesos a Libras","De pesos a Yen","De Pesos a Won Coreano", "De Dólar a Pesos", "De Euro a Pesos","De libras a Pesos"};
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
        new ConversorMonedas();
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
                    try {
                        operaciones.pesDolar();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    break;
                case 1:
                    dispose();
                    operaciones.transferirValor();
                    try {
                        operaciones.pesEuro();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    break;
                case 2:
                    dispose();
                    operaciones.transferirValor();
                    try {
                        operaciones.pesLib();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    break;
                case 3:
                    dispose();
                    operaciones.transferirValor();
                    try {
                        operaciones.pesYen();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    break;
                case 4:
                    dispose();
                    operaciones.transferirValor();
                    try {
                        operaciones.pesWon();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    break;
                case 5:
                    dispose();
                    operaciones.transferirValor();
                    try {
                        operaciones.dolPes();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    break;
                case 6:
                    dispose();
                    operaciones.transferirValor();
                    try {
                        operaciones.eurPes();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    break;
                case 7:
                    dispose();
                    operaciones.transferirValor();
                    try {
                        operaciones.libPes();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    break;

            }
        }
    }
    
}
