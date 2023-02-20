package metodos;

public class Main {
    public static void main(String[] args) {

        // Calculadora:
        // Calculadora calc = new Calculadora();
        // calc.menu();

        // Mensagem
        // Mensagem msg = new Mensagem();
        // msg.mensagem(18);

        CalculaArea.area(2);
        CalculaArea.area(2, 3);
        CalculaArea.area(2, 3, 4);

        // usando metodo com retorno e atribuindo a uma variável
        double areaQuadrado = Retorno.area(2);
        System.out.println("Area do quadrado: " + areaQuadrado);

    }
}
