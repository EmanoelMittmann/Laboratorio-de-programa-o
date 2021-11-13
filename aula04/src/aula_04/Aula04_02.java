package aula_04;

import java.util.Scanner;

public class Aula04_02 {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
       // hello(tc.next());
        somarDoisNumeros(9,1);
        System.out.println("Digite c");
        int c = tc.nextInt();
        System.out.println("Digite d");
        int d = tc.nextInt();
        mostrarsoma(c,d);
    }
    public static void  mostrarsoma(int c, int d){
        System.out.println(somarDoisNumeros(c,d));
    }
    public static int somarDoisNumeros(int a,int b){
        int e= a+b;
        System.out.println(e);
        return e;
    }
    public static void hello(String nome){
        System.out.println("hello world "+nome);
    }
}
