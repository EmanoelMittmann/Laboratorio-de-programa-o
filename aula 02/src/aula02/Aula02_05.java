package aula02;

import javax.swing.*;

//Elabore uma classe que receba o nome de um produto e o seu valor.
// O desconto deve ser calculado de acordo com o valor fornecido conforme a imagem.
// Utilizando a estrutura if-else, apresenta em tela o nome do produto,
// valor original do produto e o novo valor depois de ser realizado o desconto.
// Caso o valor digitado seja menor que zero, deve ser emitida uma mensagem de aviso.
public class Aula02_05 {
    public static void main(String[] args) {
        String produto,dado;
        String nomeDproduto;
        double valor,novoValor;
        double desconto;

        dado = JOptionPane.showInputDialog("Qual o nome do produto ?");
        produto = dado;
        dado = JOptionPane.showInputDialog("Qual o valor do Produto ?");
        valor = Double.parseDouble(dado);

        if(valor >= 50 && valor < 200){
            desconto = valor-(valor*5/100);
            JOptionPane.showMessageDialog(null,produto + " valor do produto " + valor + " valor com desconto " + desconto);
        }
        else if(valor >= 200 && valor < 500){
            desconto = valor-(valor*6/100);
            JOptionPane.showMessageDialog(null,"valor do produto " + valor + " valor com desconto " + desconto);
        }
        else if(valor >= 500 && valor < 1000){
            desconto = valor-(valor*7/100);
            JOptionPane.showMessageDialog(null,"valor do produto " + valor + " valor com desconto " + desconto);
        }
        else if(valor >= 1000){
            desconto = valor-(valor*8/100);
            JOptionPane.showMessageDialog(null,"valor do produto " + valor + " valor com desconto " + desconto);
        }




    }
}
