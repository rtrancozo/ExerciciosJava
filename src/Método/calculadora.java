package Método;

import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String operacoes[] = new String[]{"soma","subtração", "multiplicação","divisão"};

        System.out.println("Digite o primeiro valor: ");
        Double valor1 = entrada.nextDouble();
        System.out.println("Digite o segundo valor: ");
        Double valor2 = entrada.nextDouble();
        System.out.println("Digite a operação que deseja realizar:");
        for(int i = 0; i< operacoes.length;i++) {
            System.out.println("[" + i + "]" + operacoes[i]);
        }
        Integer escolha = entrada.nextInt();

        regraEscolha(valor1, valor2, escolha);


    }

    private static void regraEscolha(Double valor1, Double valor2, Integer escolha) {
        if(escolha == 0) {
            soma(valor1, valor2);
        } else if (escolha ==1) {
            subtracao(valor1, valor2);
        } else if (escolha ==2) {
            multiplicacao(valor1, valor2);
        }else if (escolha ==3){
            divisao(valor1, valor2);
        }else{
            System.out.println("Opção inválida!");
        }
    }

    private static void divisao(Double valor1, Double valor2) {
        Double divisao = valor1 / valor2;
        System.out.println("O resultado é: " + divisao);
    }

    private static void multiplicacao(Double valor1, Double valor2) {
        Double multiplicacao = valor1 * valor2;
        System.out.println("O resultado é: "+ multiplicacao);
    }

    private static void subtracao(Double valor1, Double valor2) {
        Double subtração = valor1 - valor2;
        System.out.println("O resultado é: " +subtração);
    }

    private static void soma(Double valor1, Double valor2) {
        Double soma = valor1 + valor2;
        System.out.println("O resultado é: " +soma);
    }
}
