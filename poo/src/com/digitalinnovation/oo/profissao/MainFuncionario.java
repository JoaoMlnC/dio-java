package com.digitalinnovation.oo.profissao;

public class MainFuncionario {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        // Upcasting

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Gerente();

        // DownCast
        // Gerente gerente_ = (Gerente) new Funcionario();

    }
}
