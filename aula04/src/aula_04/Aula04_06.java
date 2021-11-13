package aula_04;

import java.util.Scanner;

//Escreva um programa que crie um String e use um laço for para verificar
// se ele é um palíndromo, ou seja, se você inverter a ordem dos caracteres do String,
// obterá o mesmo String. Por exemplo, “abcdcba” é um palíndromo.
public class Aula04_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva uma palavra");
        String text= input.next();

        String Inverseword="";
        for (int i=text.length()-1;i>=0;i--){
            Inverseword+=text.charAt(i);
        }
        if (text.equals(Inverseword)){
            System.out.println("Ele é palíndromo");
        }else{
            System.out.println("Ele não é palíndromo");
        }

    }
}
