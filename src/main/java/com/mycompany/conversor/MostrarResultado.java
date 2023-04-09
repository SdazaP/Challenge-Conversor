package com.mycompany.conversor;

import javax.swing.JOptionPane;

public class MostrarResultado {
    private double valor; //Recibe el valor ejecutado por cualquier conversion
    private String unidad; //Recibe unidad de medida
    public void resultado(){
        JOptionPane.showMessageDialog(null, "El resultado es: " + valor + " " + unidad);
        Continuar continuar = new Continuar();
        continuar.cont();
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    
    /* public static void main(String[] args) {
        MostrarResultado ventanaResultado = new MostrarResultado();
        ventanaResultado.resultado();
    } */
    
}
