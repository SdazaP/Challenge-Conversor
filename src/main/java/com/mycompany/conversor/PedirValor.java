package com.mycompany.conversor;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PedirValor extends JFrame{
    private double num;
    public PedirValor(){
        
        String valor = JOptionPane.showInputDialog("Ingresa valor a convertir:");
        if (valor == null) { // si se presiona cancelar o cerrar
            dispose(); // cierra la ventana
        } else {
            try {
                num = Double.parseDouble(valor);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Ha ingresado un caracter incorrecto, por favor ingresa numeros", "NumerFormatException", JOptionPane.INFORMATION_MESSAGE);
                new PedirValor();
            }
        }

    }

    public double getNum() {
        return num;
    }
}
