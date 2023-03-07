/* Escreva um programa que pergunte os seguintes dados referentes ao pneu de um automóvel:

P = pressão
V = volume
T = temperatura

e calcule a massa de ar desse pneu segundo a fórmula (M = massa de ar):
*/

package atividade2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        double p,v,t, massaAr;


        System.out.println("Digite a pressão do pneu");
        p = sc.nextDouble();

        System.out.println("Digite o volume do pneu");
        v = sc.nextDouble();

        System.out.println("Digite a temperatura do pneu");
        t = sc.nextDouble();

        massaAr = p * v / 0.37 * (t+460);

        System.out.println("A massa de ar é " + massaAr);
    }
}
