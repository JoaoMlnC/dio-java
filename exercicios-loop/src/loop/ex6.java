package loop;

import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero;
        int fatorial = 1;
        System.out.println("Informe o número: ");
        numero = scan.nextInt();

        for (int i = numero; i >= 1; i--) {
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);
    }

}
