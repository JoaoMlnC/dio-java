package arrays;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = 100;
        int pessoasNoCamarote = 0;

        for (int i = 1; i <= tamanhoDaFila; i++) {
            if (i % 2 != 0) {
                pessoasNoCamarote++;
            }
        }
        System.out.println(pessoasNoCamarote + " pessoas no camarote");
    }
}
