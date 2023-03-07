/*Escreva um programa que leia uma temperatura em graus Farenheit e a imprima em graus Centígrados.
A conversão de graus Farenheit para Centígrados é obtida por C=(5/9)(F-32)*/
package atividade2;

import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        double farenheit;
        double centigrados;

        System.out.println("Digite os graus em farenheit");

        farenheit = sc.nextInt();

        centigrados = (farenheit-32.0)* (5.0/9.0);

        System.out.println(centigrados);



    }
}
