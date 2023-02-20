package arrays;

import java.sql.Array;

public class ex1 {

    public static void main(String[] args) {

        int count = 0;
        int[] vetor = { -6, -5, 15, 50, 8, 4 };

        while (count < vetor.length) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.println(
                "\nVetor Inverso: ");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

    }

}
