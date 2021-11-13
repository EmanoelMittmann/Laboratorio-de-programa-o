package Aula03;

import java.util.Scanner;

//4 - Construa uma classe que receba uma frase
// qualquer e mostre essa frase de trás para a
// frente e sem espaços em branco,
public class Aula03_04 {

    public static void main(String[] args) {
        String Frase;
        Scanner tc = new Scanner(System.in);

        System.out.println("Digite uma Frase ");
        Frase=tc.nextLine();
        StringBuilder reverter = new StringBuilder(Frase);

        Frase = reverter.reverse().toString().replace("","");
        System.out.println(Frase);
    }
}
