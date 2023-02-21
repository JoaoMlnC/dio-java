package com.digitalinnovation.oo;

import com.digitalinnovation.oo.automovel.Carro;

public class Main {
    public static void main(String[] args) {
        Carro ferrari = new Carro();
        ferrari.setCapacidadeTanque(50);
        ferrari.setCor("Vermelho");
        ferrari.setModelo("F40");
        System.out.printf("Modelo do carro: %s - Cor do carro: %s", ferrari.getModelo(), ferrari.getCor());
        System.out.println("\nValor para encher o tanque: " + ferrari.calculaPreco(4.50));
    }
}
