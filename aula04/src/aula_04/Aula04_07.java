package aula_04;
//Elabore uma classe que receba 5 notas de alunos por meio,
//armazene essas notas em um array de cinco elementos,
//apresente em tela as cinco notas em ordem decrescente (da maior para a menor)
//e a média aritmética das notas.

import java.util.Arrays;
import java.util.Scanner;

public class Aula04_07 {
    public static void main(String[] args) {
        double[]notas= new double[5];
        Scanner tc = new Scanner(System.in);
        double media = 0;

        for(int i=0; i< notas.length;i++){
            System.out.println("Aluno "+(i+1)+" Digite sua nota");
            notas[i] = tc.nextDouble();
            media += notas[i];
        }
        Arrays.sort(notas);

        for(int i=0;i< notas.length;i++){
            System.out.println(notas[i]+",");
        }
        System.out.println(" A media Aritmética é de " + media/notas.length);
    }
}
