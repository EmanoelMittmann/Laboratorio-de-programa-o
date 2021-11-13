package aula02;

import javax.swing.*;

//Na área da eletrônica, em um circuito em série temos que a resistência equivalente (total)
// desse circuito é obtida mediante a soma de todas as resistências existentes (RE = r1 + r2 + ... + rn).
// Faça uma classe que receba o valor de quatro resistências ligadas em série,
// calcule e mostre a resistência equivalente, a maior e a menor resistência.
public class Aula02_06 {
    public static void main(String[] args) {
    double contador = 0,total;
    double[] resistencias = new double[5];
    String dado;
    int i=0,j=0,M=0;

    for(contador = 0; contador <= 4; contador++){
        dado = JOptionPane.showInputDialog("qual valor da resistencia "+contador);
        resistencias[i] = Double.parseDouble(dado);
        i++;
    }
    total = (resistencias[0]+resistencias[1]+resistencias[2]+resistencias[3]+resistencias[4]);

    for(i=0;i <= 4;i++){
        if(resistencias[i]>resistencias[j]) {
            j = i;
        }
    }
    for(i=0;i <= 4;i++){
        if(resistencias[i]<resistencias[M]) {
            M  = i;
        }
    }

    JOptionPane.showMessageDialog(null,"resistencia Maior " + resistencias[j]);

    JOptionPane.showMessageDialog(null,"resistencia Menor " + resistencias[M]);

    JOptionPane.showMessageDialog(null,"resistencia Equivalente " + total);
    }
}
