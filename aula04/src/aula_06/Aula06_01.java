package aula_06;

import java.util.Scanner;

public class Aula06_01 {
    String tipo;
    int nivel;
    double peso;
    String nome;
    String descrição;
    int vida;
    int hit;

    public void atacar(){
        System.out.println("Atacar!!!");
        hit++;
    }
    public void defender(){
        System.out.println("Defender!!!");
    }
    public static void capturar(){
        System.out.println("capturar");
    }

    public class Main{
        public static void main(String[] args) {
            Aula06_01.capturar();

            Aula06_01 snorlax = new Aula06_01();

            Scanner tc = new Scanner(System.in);

            snorlax.nome="Snorlax";
            snorlax.peso=460;
            snorlax.tipo="normal";
            snorlax.nivel=10;
            snorlax.hit=10;
            snorlax.vida=500;
            System.out.println(snorlax);
            snorlax.atacar();
            snorlax.defender();
            System.out.println(snorlax);

        }
    }

}
