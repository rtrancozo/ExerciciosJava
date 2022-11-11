package operacaoAritmeticaEnum;

import java.util.Scanner;

public class TesteOperacaoEnum {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        OperacaoAritmetica op01 = OperacaoAritmetica.ADICAO;
        System.out.println("Digite o primeiro numero: ");
        double n1 = entrada.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double n2 = entrada.nextDouble();
        double resultado01 = op01.operacao(n1, n2);
        System.out.println("O resultrado da soma é: "+resultado01);

        OperacaoAritmetica op2 = OperacaoAritmetica.SUBSTRACAO;
        System.out.println("Digite o primeiro numero: ");
        double n3 = entrada.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double n4 = entrada.nextDouble();
        double resultado02 = op2.operacao(n3,n4);
        System.out.println("O resultrado da subtração é: "+resultado02);


    }
}
