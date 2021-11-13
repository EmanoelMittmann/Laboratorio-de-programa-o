package aula02;

import java.util.Scanner;

public class Aula02 {

    public static void main(String[] args) {
        //codigo e variaveis
        Scanner teclado = new Scanner(System.in);
        double preco;
        double porcentagem;
        double desconto;
        double precoComDesconto;

        System.out.println("Digite o valor do produto ");
        preco = teclado.nextFloat();
        System.out.println("Digite a porcentagem do desconto ");
        porcentagem= teclado.nextFloat();
        desconto=preco*porcentagem/100;
        precoComDesconto=preco-desconto;

        System.out.println("Valor do Produto: " + preco);
        System.out.println("Valor do desconto: "+ desconto );
        System.out.println("Valor do preço com desconto "+ precoComDesconto);
    }
}
