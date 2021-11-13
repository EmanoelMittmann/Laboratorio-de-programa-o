package aula_04;

import java.util.Random;

//Faça uma classe contendo dois arrays do tipo inteiro,
// um chamado par e outro chamado ímpar. Cada array deve conter 10 elementos.
// A seguir, faça um laço de repetição com 10 iterações e que contenha internamente a geração randômica de números entre 1 e 20.
// Se o valor gerado for par, armazene no array chamado par, caso contrário, no array chamado impar.
// Ao  final, apresente o conteúdo de cada um dos arrays.
public class Aula04_10 {
    public static void main(String[] args) {
        int[]par = new int [10];
        int[]impar = new int[10];
        Random random = new Random();

        for (int x=0;x<10;x++){
          int nummer = random.nextInt(19)+1;

          if(nummer%2==0){
              par[x] = nummer;
          }else{
              impar[x] = nummer;
          }
        }
        for(int x=0;x<10;x++) {
            System.out.println("Par "+par[x] + ",");
        }
        System.out.println();
        for(int x=0;x<10;x++) {
            System.out.println("Impar "+impar[x] + ",");
        }
    }
}
