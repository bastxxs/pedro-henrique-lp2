package atividade1;

import java.util.Scanner;

//Escreva um programa que pergunte qual o raio de um círculo e imprima a sua área.

public class Exercicio5 {
    public static void main(String[] args) {

        double raio;
        double area;
        final double PI = 3.1416;

        Scanner sc = new Scanner(System.in);
    
       System.out.println("Escreva o valor do raio");

       raio = sc.nextFloat();
       area = sc.nextFloat();
    
    
       area  = PI* (raio*raio);
    
       System.out.print("O valor da area é " + area);     
    }
    
}
