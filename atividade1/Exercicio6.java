package atividade1;

import java.util.Scanner;

/* Faça um programa que calcule a quantidade necessária de latas de tinta para pintar uma parede.
O programa pergunta a medidas de largura e altura da parede em metros e imprime o resultado (em latas de tinta).
Considere que o consumo de tinta é de 300 ml por metro quadrado e a quantidade de tinta por lata é de 2 litros. */

public class Exercicio6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double largura;
        double altura;

        System.out.println("Digite a largura");

        largura = sc.nextDouble();

        System.out.println("Digite a altura");

        altura = sc.nextDouble();

        double calculo = largura*altura;

        double resultado = calculo *= 300;


        int tinta;
        
        tinta = (int) (resultado / 2);

        System.out.println("Quantidade de latas de tinta: " + tinta);
    }
}
