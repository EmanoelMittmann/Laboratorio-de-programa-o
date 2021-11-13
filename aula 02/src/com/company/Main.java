package com.company;

import java.util.Scanner;

//Um show organizado, com pessoas verificando ingressos,
// e os seguranças olhando os participantes foi feito com o público de p pessoas (suponha que pode ser, por exemplo, 2.749).
// Para as pessoas entrarem, a média de tempo entre entregar o ingresso e poder acessar a área dos shows é de s segundos
// (suponha, por exemplo, 50).
//
//Para agilizar a entrada, a produção do evento disponibilizou n portões de entrada (suponha 8).
// Qual o tempo mínimo, em minutos, para que todos os participantes entrem completamente na área dos shows?
public class Main {

    public static void main(String[] args) {
	    double p= 2.749;
        double segundo = 50;
        double portoes = 8;
        double min = 60 ;

        System.out.println((p*segundo)/(min*portoes) + "Minutos");



    }
}
