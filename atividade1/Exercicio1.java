
//Escreva um programa que leia três números e os imprima na ordem inversa da que foram digitados.

package atividade1;

import java.util.Random;

public class Exercicio1 {
    public static void main(String[] args) {

        int[] vet = new int[3];

        String saida = "";

        Random random = new Random();

        for (int i : vet) {

            vet[i] = random.nextInt(25);

            saida += vet[i] + "|";
        }

        System.out.println(saida);

        for (int i : vet) {

            saida += invert(vet) + "|";

        }

        System.out.println(saida);

    }

    public static int[] invert(int[] vet) {
        int[] vetInvertido = new int[vet.length];

        for (int i = vet.length - 1; i >= 0; i--) {
            for (int j = 0; j <= vetInvertido.length; j++) {
                vetInvertido[j] = vet[i];
            }
        }
        return vetInvertido;
    }
}