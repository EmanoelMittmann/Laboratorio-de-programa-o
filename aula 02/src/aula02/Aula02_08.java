package aula02;

import javax.swing.*;

//Faça uma classe que apresente em tela a tabuada de qualquer número.
// O usuário fornece o número desejado e a classe apresenta a relação de todos os cálculos de 1 a 10.
public class Aula02_08 {
    public static void main(String[] args) {
        int[] tabuada = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String dad;
        double dado;

        dad= JOptionPane.showInputDialog(null,"digite um numero para ver sua tabuada");
        dado= Double.parseDouble(dad);

        for(int i=0;i<=9;i++){
            JOptionPane.showConfirmDialog(null,dado+ "x" +tabuada[i]+ "=" +(dado*tabuada[i]));
        }
    }
}
