package programacao_orientada_a_objetoExercicios;

import java.util.Scanner;

public class reposicaoEstoque {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
         Produto01 produto01 = new Produto01();

         produto01.nome = "Microondas";
         produto01.preco = 420.00;
        System.out.println("Digite o estoque atual: ");
         produto01.quantidadeEstoque = entrada.nextInt();
        System.out.println("Digite o estoque mínimo de "+produto01.nome);
         produto01.estoqueMinimo = entrada.nextInt();
         produto01.necessidadeDeReposicaoDeEstoque();
        System.out.println(produto01.necessidadeDeReposicaoDeEstoque());
         }


    }

