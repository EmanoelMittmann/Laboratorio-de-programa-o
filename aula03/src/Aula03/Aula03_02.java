package Aula03;

import java.util.Scanner;

/*2 - Uma farmácia precisa ajustar
os preços de seus produtos em 12%.
Elabore uma classe que receba o valor do produto e
aplique o percentual de acréscimo.
 O novo valor a ser calculado deve ser arredondado
  para mais ou para menos usando o método round.
 A classe deve também conter um laço de repetição
 que encerre o programa quando o usuário fornecer
  o valor zero(0) para o valor do produto.
Dessa forma, o usuário digita o valor do produto,
a classe calcula e
 mostra o valor com acréscimo, a seguir solicita
 um novo valor. Esse processo continua enquanto
 o valor do produto for diferente de zero;
 caso contrário o programa será encerrado
*/
public class Aula03_02 {
    public static void main(String[] args) {

        String nomeProduto;
        double valorProduto;
        int op=0;
        final double percentual=1.12;

        Scanner tc = new Scanner(System.in);

    do {
        System.out.println("Valor do Produto");
        valorProduto=tc.nextDouble();
        if(valorProduto>0){
            System.out.println("Nome do Produto");
            nomeProduto=tc.next();
            valorProduto= valorProduto*percentual;
            System.out.println("O produto: "+nomeProduto);
            System.out.println("Novo Preço: "+valorProduto);
        }else{
            System.out.println("bye bye");
        }
    }while(valorProduto != 0);


    }
}
