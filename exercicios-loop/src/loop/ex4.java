package loop;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        int quantidade;
        int contador = 0;
        int par = 0;
        int impar = 0;
        int numero;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidae de números que deseja testar: ");
        quantidade = scan.nextInt();
        do {
            System.out.println("Digite o número: ");
            numero = scan.nextInt();
            contador++;
            if (numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }

        } while (contador < quantidade);
        System.out.println("A quantidade de número pares é " + par);
        System.out.println("A quantidade de números ìmpares é: " + impar);

    }

}
