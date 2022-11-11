package exercicio_folha_de_pagamentto;

public class cargoSalarios {





    public static Double horasExtrasGerente(double salarioGerente, int horasNormais, Integer horasTrabalhadas){
        Double valorhora = valorhora(salarioGerente, horasNormais);
        Integer quantidadedeHorasExtras = horasExtras(horasTrabalhadas, horasNormais);
        Double salarioHoraExtras=valorhora*quantidadedeHorasExtras;
        return salarioHoraExtras;

    }
    public static Double horasExtrassecretaria(double salarioSecretaria, int horasNormais, Integer horasTrabalhadas){
        Double valorhora = valorhora(salarioSecretaria, horasNormais);
        Integer quantidadedeHorasExtras = horasExtras(horasTrabalhadas, horasNormais);
        Double salarioHoraExtras=valorhora*quantidadedeHorasExtras;
        return salarioHoraExtras;

    }
    public static Double horasExtrasoperador(double salarioOperador, int horasNormais, Integer horasTrabalhadas){
        Double valorhora = valorhora(salarioOperador, horasNormais);
        Integer quantidadedeHorasExtras = horasExtras(horasTrabalhadas, horasNormais);
        Double salarioHoraExtras=valorhora*quantidadedeHorasExtras;
        return salarioHoraExtras;

    }

    private static double valorhora(double salarioGerente, int horasNormais) {
        double valorHora = salarioGerente/horasNormais;
        return valorHora;
    }

    private static Integer horasExtras(Integer horasTrabalhadas, int horasNormais) {
        Integer horasExtras = horasTrabalhadas - horasNormais;
        return horasExtras;
    }


}
