package Aula03;
/*
3 - Crie uma classe que gera um número aleatoriamente
(entre 5 e 10) por Math.random. Em seguida,
 faça com que apareça em tela uma senha numérica contendo
  a mesma quantidade de dígitos correspondentes ao valor
  aleatório gerado. Apresente em tela o número sorteado e a senha.
*/
public class Aula03_03 {
    public static void main(String[] args) {
        final int MAIOR=6;
        int sorteio;
        String senha="";
        sorteio = (int)(Math.random()*MAIOR+5);
        System.out.println(sorteio);
            for (int i = 0; i < sorteio;i++){
                senha = Integer.toString((int)(Math.random()*10));
            }
            System.out.println(senha);
    }
}
