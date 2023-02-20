package metodos;

import java.util.Scanner;

public class Calculadora {

    public void menu() {

        boolean loop = true;
        while (loop) {
            System.out.println("\nDigite a operação desejada: ");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Encerrar");
            Scanner scan = new Scanner(System.in);
            int opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Adição");
                    adicao(numero1(), numero2());
                    break;
                case 2:
                    System.out.println("Subtração ");
                    subtracao(numero1(), numero2());
                    break;
                case 3:
                    System.out.println("Multiplicação");
                    multiplicacao(numero1(), numero2());
                    break;
                case 4:
                    System.out.println("Divisão");
                    divisao(numero1(), numero2());
                    break;
                case 5:
                    loop = false;
                    System.out.println("Encerrando....");
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    public double numero1() {
        System.out.println("Digite o primeiro número: ");
        Scanner scan = new Scanner(System.in);
        double numero1 = scan.nextDouble();
        return numero1;
    }

    public double numero2() {
        System.out.println("Digite o segundo número: ");
        Scanner scan = new Scanner(System.in);
        double numero2 = scan.nextDouble();
        return numero2;
    }

    public void adicao(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        System.out.printf("A soma de %.1f + %.1f é %.1f", numero1, numero2, resultado);
    }

    public void subtracao(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        System.out.printf("A subtração de %.1f - %.1f é %.1f", numero1, numero2, resultado);
    }

    public void divisao(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        System.out.printf("A divisão de %.1f / %.1f é %.1f", numero1, numero2, resultado);
    }

    public void multiplicacao(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        System.out.printf("A multiplicação de %.1f * %.1f é %.1f", numero1, numero2, resultado);
    }

}
