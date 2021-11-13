package Aula03;

import java.util.Scanner;

/*
5 - Elabore uma classe que receba uma frase e verique que
se essa frase possui palavras impróprias.
 As palavras impróprias são: sexo e sexual.
  Caso encontre uma dessas palavras, emita em tela a mensagem
   “conteúdo impróprio”,
  caso contrário “conteúdo liberado”,
*/
public class Aula03_05 {

    public static void main(String[] args) {
       String conteudo2= "sexo";
       String conteudo1= "sexual";
       String frase;

        Scanner tc = new Scanner(System.in);

        System.out.println("digite uma frase");
        frase = tc.nextLine();


        for (int i=0;i<6;i++){
            if (frase.charAt(i) == "sexo" || frase.charAt(i) == "sexual"){
                System.out.println("Conteudo improprio");
                break;
            } else{
                System.out.println("conteudo liberado");

            }
        }

    }
}
