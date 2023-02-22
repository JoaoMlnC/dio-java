package com.digitalinnovation.oo.treinointerface;

public class Calculadora implements OperacaoMatematica {

    @Override
    public void soma(double oparando1, double operando2) {
        System.out.println("Soma " + oparando1 + operando2);
    }

    @Override
    public void subtracao(double operando1, double operando2) {
        System.out.println("Subtração " + (operando1 - operando2));
    }

    @Override
    public void multiplicacao(double operando1, double operando2) {
        System.out.println("Multiplicação " + operando1 * operando2);
    }

}
