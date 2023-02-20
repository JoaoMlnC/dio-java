package loop;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maior = 0;
        int numero;
        int contador = 0;
        int media = 0;
        int mediaFinal;

        do {
            System.out.println("Número");
            numero = scan.nextInt();
            contador++;
            media = media + numero;
            mediaFinal = media / contador;
            if (maior < numero)
                maior = numero;
            System.out.println("O número maior é: " + maior);
            System.out.println("A média é: " + mediaFinal);

        } while (contador < 5);

        System.out.println("O número maior é: " + maior);

        System.out.println("A média é: " + mediaFinal);

    }
}
