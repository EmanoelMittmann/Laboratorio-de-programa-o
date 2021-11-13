package aula_06;

import javax.swing.*;
import java.util.Scanner;

public class Aula06_02 {
    Scanner input = new Scanner(System.in);
    //Um método que mostre uma mensagem padrão para leitura
    // de um tipo de dado(ex: "Digite um inteiro") e retorna
    // o dado lido;
    public  void mensagem(String dataTypeName){
        System.out.println("Digite um inteiro" + dataTypeName);
    };
    public int escreva(){
        mensagem("string");
        int value = input.nextInt();

        return value;
    };
    //Um método que mostra uma mensagem passada
    // por parâmetro(Nesse caso a mensagem que será
    // exibida deve ser um parâmetro passado) e retorna o dado lido;

    public void novamsg(String string){
        System.out.println(string);
    }
    //Um método para Ler uma string formatada como e-mail,
    // o método deve retornar o email quando válido ou null
    // se for inválido;

    public  String Email(){
        novamsg("email a ser validado");

        String email = input.next();

        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9_+&*-]+\\.)+[a-z"+"A-Z]{2,7}$";
        boolean validacao = email.matches(regex);

        if (validacao == true){
            return email;
        }else{
            return null;
        }
    }
    //Um método para Ler uma string formatada como telefone
    // (DDD-XXXXXXXXX), o método deve retornar o telefone quando
    // válido ou null se for inválido;
    public String validacaodeNumero(){
        novamsg("phone number(DDD-xxxxxxxxx)");
        String telefone = input.next();
        final int telefonelenght = 13;

        if (telefone.charAt(3) == '-' && telefone.length() == telefonelenght){
            return telefone;
        }else{
            return null;
        }

    }
    //Um método para ler uma string formatada como uma
    // data(dd/mm/aaaa)o método deve retornar a data quando
    // válido ou null se for inválido;
    public String validacaoDeData(){
      mensagem("date(dd/mm/yyyy)");
      String date = input.next();
      final int datelenght = 10;

      if (date.length() == datelenght && date.charAt(2) == '/' && date.charAt(5) == '/'){
          return date;
      }else{
          return null;
      }
    };





}
