package aula02;

import javax.swing.*;

//Faça uma classe que solicite login e senha, simulando o acesso a um sistema.
// Considere que os conteúdos de login e senha originais são iguais a “java8”.
// O usuário deverá fornecer login e senha e você irá compará-los com os conteúdos originais.
// O usuário tem três chances para digitar corretamente os dados de login e senha.
// Para cada tentativa incorreta deve aparecer uma mensagem alertando o erro e
// apresentando a quantidade de tentativas que ainda restam.
public class Aula02_07 {
    public static void main(String[] args) {
        String login = "java8";
        String senha = "java8";
        String l1;
        String s1;
        String dado;
        int j=3;


        for(int i=0;i<=3;i++){
            dado=JOptionPane.showInputDialog(null,"Digite seu login ");
            l1 = dado;

            dado=JOptionPane.showInputDialog(null,"Digite sua senha " );
            s1 = dado;

            if(login.equals(l1) && senha.equals(s1)){
                JOptionPane.showMessageDialog(null,"Obrigado por usar INTELLIJ");
                break;
            }else if(l1 != login && s1 != senha){
                JOptionPane.showMessageDialog(null,"Senha errada \n mais " + j+ "restantes");
                j--;
            }
        }
    }
}
