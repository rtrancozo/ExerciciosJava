package Método;

import java.util.Scanner;

public class calculadora_corrigido_professor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double numeroEsquerda = informeNumero(entrada);
        imprimirTraco();
        Integer operacao = escolhaAOperacao(entrada);
        imprimirTraco();
        Double numeroDireita = informeNumero(entrada);
        imprimirTraco();
        Double resultado = realizarCalculo(operacao, numeroEsquerda, numeroDireita);
        System.out.println("O resultado é: "+resultado);
        entrada.close();



    }

    private static Double realizarCalculo(Integer operacao, Double numeroEsquerda, Double numeroDireita) {
        Double resultado = null;
        switch (operacao){
            case 0:
                resultado = subtracao(numeroDireita, numeroEsquerda);
                break;

            case 1:
                resultado = adicao(numeroDireita, numeroEsquerda);
                break;

            default:
                System.out.println("Escolha uma opção válida.");
                System.exit(0);


        }

        return resultado;
    }

    private static Double adicao(Double numeroDireita, Double numeroEsquerda) {
        return numeroDireita+numeroEsquerda;
    }

    private static  Double subtracao(Double numeroEsquerda, Double numeroDireita){
        return numeroDireita-numeroEsquerda;
    }

    private static Integer escolhaAOperacao(Scanner entrada) {
        System.out.println("Informe a operação: ");
        String [] operacoes = new String[]{"Subtração","Adição"};
        for(int i = 0; i<operacoes.length;i++) {
            System.out.println("[" + i + "]" + operacoes[i]);

        }
        System.out.println("Digite a operação: ");
        return entrada.nextInt();
    }

    private static void imprimirTraco() {
        System.out.println("________________________________________");
    }

    private static Double informeNumero(Scanner entrada) {
        System.out.println("informe o número:");
        return entrada.nextDouble();
    }
}
