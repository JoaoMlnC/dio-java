package loop;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        int num;
        System.out.println("Digite o número para a tabuada: ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d", i, num, i * num).println();
        }

    }
}
