package com.joao.operadores;

public class Ternario {
    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 6;

        /*
         * String resultado = "";
         * 
         * if (a == b) {
         * resultado = "Verdadeiro";
         * } else {
         * resultado = "Falso";
         * }
         */

        String resultado = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado);
    }
}
