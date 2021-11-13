package aula_04;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

//Crie uma classe que armazena os 12 meses do ano em um array.
// A seguir, gere um valor randômico entre 0 e 11 e apresente o mês correspondente ao valor sorteado.
// Considere que o valor 0 corresponde ao mês de janeiro e o valor 11, ao mês de dezembro.
public class Aula04_08 {
    public static void main(String[] args) {
        String[]meses = {"Januar","Februar","März","April","Mai","Juni",
                "Juli","August","September","Oktober","November","Dezember"};

        Random aleatorio = new Random();

        System.out.println("Mês gerado :");
        System.out.println(meses[aleatorio.nextInt(11)]);

    }
}
