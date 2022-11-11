package exercicio_folha_de_pagamentto;

import java.util.Scanner;

public class Remuneracao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Empregado empregado = new Empregado();
        System.out.println("Digite o nome do funcionário: ");
        empregado.nome = entrada.nextLine();
        System.out.println("Escolha o cargo:\n1 Gerente\n2 Secretária\n3 Operador ");
        empregado.cargo = entrada.nextInt();
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        empregado.horasTrabalhadas = entrada.nextInt();
        Integer horasNormais = 80;
        Integer quantidade_de_horas_extras = empregado.horasTrabalhadas-horasNormais;
        Double salarioGerente = 5900.00;
        Double salarioSecretaria = 2400.00;
        Double salarioOperador = 3500.00;

        switch (empregado.cargo){
            case 1:
               Double valordehorasextras = cargoSalarios.horasExtrasGerente(salarioGerente,horasNormais, empregado.horasTrabalhadas);
                System.out.println("O empregado "+empregado.nome + " fez "+quantidade_de_horas_extras+" horas extras e irá receber o valor de R$" +
                        valordehorasextras+" Reais de horas extras");

                break;
            case 2:
                valordehorasextras = cargoSalarios.horasExtrassecretaria(salarioSecretaria,horasNormais, empregado.horasTrabalhadas);
                System.out.println("O empregado "+empregado.nome + " fez "+quantidade_de_horas_extras+" horas extras e irá receber o valor de R$" +
                        valordehorasextras+" Reais de horas extras");

                break;
            case 3:
                valordehorasextras = cargoSalarios.horasExtrasoperador(salarioOperador,horasNormais, empregado.horasTrabalhadas);
                System.out.println("O empregado "+empregado.nome + " fez "+quantidade_de_horas_extras+" horas extras e irá receber o valor de R$" +
                        valordehorasextras+" Reais de horas extras");

                break;
        }




    }
}
