package com.mycompany.conversor;

import javax.swing.JOptionPane;

public class Continuar {

    public void cont(){

        // Preguntar al usuario si desea salir
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?", "Salir", JOptionPane.YES_NO_OPTION);

        // Verificar la respuesta del usuario
        if (respuesta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Decidiste finalizar la operación", "Regresa", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } else {
            new MenuInterfaz();
        }
    }
    /* public static void main(String[] args) {
        Continuar continuar = new Continuar();
        continuar.cont();
    } */
}
