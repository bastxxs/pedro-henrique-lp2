package atividade1;

import java.util.Scanner;

/* 3 -  Escreva um programa para simular uma pequena conversa do computador com o usuário. O programa deve seguir os passos:

a) inicialmente escreve "Olá eu sou o Nº 1, como é seu nome?";

b) em seguida espera que o usuário digite seu nome;

c) por fim escreve: "Bem-vindo ao clube (nome)". */

public class Exercicio3 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String nome;

        System.out.println("Olá eu sou o Nº 1, como é seu nome?");

        nome = sc.nextLine();
        
        System.out.println("Bem-vindo ao clube (nome)");
        
    }
}
