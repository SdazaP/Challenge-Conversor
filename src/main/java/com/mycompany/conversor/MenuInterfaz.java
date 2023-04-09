package com.mycompany.conversor;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuInterfaz extends JFrame implements ActionListener {

    // Componentes de la interfaz gráfica
    private JComboBox<String> listaOpciones;//Muestra lista de conversores
    String[] opConversor;

    public MenuInterfaz() {
        
        JButton botonAceptar = new JButton("Aceptar");

        // Creamos la lista desplegable para seleccionar el tipo de conversor
        String[] opConversor = {"Conversor de Monedas", "Conversor de Temperatura", "Conversor de Medidas"};
        listaOpciones = new JComboBox<>(opConversor);

        // Agregamos los componentes a la ventana
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Aceptar")) {
            // Acción a realizar cuando se presiona el botón "Aceptar"
            int opcionSeleccionada = listaOpciones.getSelectedIndex();
            switch(opcionSeleccionada) {
                case 0:
                    dispose();
                    new ConversorMonedas();
                    break;
                case 1:
                    dispose();
                    new ConversorTemperatura();
                    break;
                case 2:
                    dispose();
                    new ConversorMedidas();
                    break;
            }
        }
    }
    
    public static void main(String[] args) {
        // Creamos la ventana principal
        new MenuInterfaz();

    }
}