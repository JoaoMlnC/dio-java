package metodos;

public class CalculaArea {

    public static void area(double lado) {
        System.out.println("Àrea do Quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("Àrea do retângulo: " + lado1 * lado2);
    }

    public static void area(double baseMenor, double baseMaior, double altura) {
        System.out.println("Àrea do Triângulo: " + ((baseMaior + baseMenor) * altura) / 2);
    }

}
