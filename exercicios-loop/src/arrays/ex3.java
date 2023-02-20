package arrays;

import java.util.Random;

public class ex3 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            int numero = random.nextInt(100);
            numeros[i] = numero;
        }

        System.out.println("Números Aleatórios: ");
        for (int numerosAleatorios : numeros) {
            System.out.print(numerosAleatorios + " ");
        }

        System.out.println("\nSucessores: ");
        for (int numerosAleatorios : numeros) {
            System.out.print((numerosAleatorios + 1) + " ");
        }

    }
}
