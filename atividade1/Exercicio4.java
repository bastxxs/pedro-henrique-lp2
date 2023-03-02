package atividade1;

import java.util.Scanner;
import java.time.*;
//4 - Escreva um programa que pergunte o nome e a idade de um indivíduo e imprima (aproximadamente) quantos dias de vida ele possui.

public class Exercicio4{

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        
        String nome;

        int idade;

        System.out.println("Como é seu nome?");

        nome = sc.nextLine();
        
        System.out.println("Qual sua idade?");

        idade = sc.nextInt();


        int ano = 365 * idade;

        System.out.println("Voce tem " + ano + "Dias de vida");

    }
}