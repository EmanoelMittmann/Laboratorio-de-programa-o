package aula02;

import javax.swing.*;

//Considere a seguinte informação a respeito do cálculo da aposentadoria. Para se aposentar por idade,
 // as mulheres precisam ter atingido 60 anos de idade e os homens, 65. Já na aposentadoria por tempo de contribuição,
 // o tempo mínimo exigido é de 30 anos para as mulheres e de 35 anos para os homens. Com base nessas informações,
 // elabore uma classe que receba a idade de uma pessoa, seu sexo e a quantidade de anos de contribuição. A seguir,
 // calcule a quantidade de anos que falta de contribuição para se aposentar, ou então emita a mensagem:
 // “você já tem o direito a aposentadoria”.
public class Aula02_04 {

      public static void main(String[] args) {
       String dado;
       double idade;
       double tempoDeContribuição;
       String sexo;
       dado = JOptionPane.showInputDialog("Qual a sua idade ?");
       idade = Double.parseDouble(dado);
       dado = JOptionPane.showInputDialog("Qual é o seu tempo de contribuição");
       tempoDeContribuição = Double.parseDouble(dado);
       sexo = JOptionPane.showInputDialog("Qual seu sexo ?");


       if(idade >= 65 && tempoDeContribuição >= 35 && sexo == "Masculino"){
           JOptionPane.showMessageDialog(null,"você já tem o direito a aposentadoria");
       }
       if(idade >= 60 && tempoDeContribuição >= 30 && sexo == "Feminino"){
           JOptionPane.showMessageDialog(null,"você tem direito a aposentadoria");
       }
       else {
           JOptionPane.showMessageDialog(null,"voce nao tem idade");
       }

  }
}
