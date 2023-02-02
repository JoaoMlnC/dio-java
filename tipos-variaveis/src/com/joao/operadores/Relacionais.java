package com.joao.operadores;

public class Relacionais {
    public static void main(String[] args) {

        String nomeUm = "João";
        String nomeDois = new String("João");

        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2) {
            System.out.println("a nossa condição é verdadeira");
        } else {
            System.out.println("A condição é falsa");
        }

        System.out.println("Numero1 é igual a numero2 ? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("Numero1 é igual a numero2 ? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("Numero1 é maior que numero2 ? " + simNao);

    }
}
