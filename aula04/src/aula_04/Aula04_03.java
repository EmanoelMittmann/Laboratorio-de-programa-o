package aula_04;
//Escreva um programa que crie um array de inteiros data e use um laço for para criar um novo String que exiba
// o conteúdo do array data entre chaves e separado por vírgulas.
// Por exemplo, se o array data tiver tamanho 4
// e armazenar os valores 3, 4, 1, 5, o String “{3, 4, 1, 5}” deve ser criado e exibido.

import java.util.Scanner;

public class Aula04_03 {
    public static void main(String[] args) {
        Scanner atividade = new Scanner(System.in);

        int[] data = new int[4];
        String novo = "";

        for (int i=0;i< data.length;i++){
            System.out.println("digite um numero inteiro");
            data[i]= atividade.nextInt();
        }
        for (int i=0;i<data.length;i++){
            novo +=(Integer.toString(data[i])+",");
        }
        System.out.println(novo);



    }
}
