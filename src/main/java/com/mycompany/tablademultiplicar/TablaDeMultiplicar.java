package com.mycompany.tablademultiplicar;

import javax.swing.JOptionPane;

/**
 *
 * @author Laura Monsalve
 */
public class TablaDeMultiplicar {

    public static void main(String[] args) {
        int number;
        
        number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número para ver la tabla de multiplicar: "));
        JOptionPane.showMessageDialog(null, "La tabla del Multiplicar de " + number + "es: ");
        for (int i=1; i<=10; i++){
            JOptionPane.showMessageDialog(null, number + "*" + i + "=" + number*i);
        }
    }
}
