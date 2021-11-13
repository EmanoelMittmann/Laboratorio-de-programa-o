package aula_04;
//Já que todos os strings são objetos de tipo String,
// mostre como chamar os métodos length( ) e charAt( ) neste literal de string: “I like Java”.
public class Aula04_04 {
    public static void main(String[] args) {
        String java="I like Java";
        System.out.println("Normal String :"+java);
        System.out.println("lenght : "+ java.length());
        for (int i=0;i<java.length();i++) {
            System.out.println("chatAt : " + java.charAt(i));
        }
    }
}
