package aula_04;

public class Aula04_01 {
    public static void main(String[] args) {
        int[] numero;
        numero = new int[100];

        double [] numeroDouble = new double[10];
        String [] strings = new String[10];

        // array bidimensional
        int[][] meusNumeros = new int[4][5];

        String[] frutas = {"Maça","Pera","Abacaxi"};
        numero[0]=3;
        numero[1]=4;
        for(int i = 0;i<10;i++){
            numero[i]=(i+2)*5;
        }
        System.out.println(numero.length);
    }
}
