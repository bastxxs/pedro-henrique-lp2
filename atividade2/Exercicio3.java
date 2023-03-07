/*Faça um programa que leia o primeiro termo de uma Progressão Aritmética (PA),
sua razão, um número N e, a seguir, calcule e mostre o N-ésimo*/
package atividade2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int primeiro, razao, n, an;

        System.out.println("Digite o primeiro numero");
        primeiro = sc.nextInt();

        System.out.println("Digite a razão");
        razao = sc.nextInt();

        System.out.println("Digite o numero n");
        n = sc.nextInt();

        an = primeiro + ( n - 1 ) * razao;

        System.out.println(an);

    }
}
