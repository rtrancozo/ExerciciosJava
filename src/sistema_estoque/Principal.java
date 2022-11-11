package sistema_estoque;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

       Estoque estoque = new Estoque();
        int tamanhoArrey;
        int lista;


        System.out.println("Informe quantos produtos quer cadastrar: ");
       estoque.descricao = new Produto[entrada.nextInt()];
       entrada.nextLine();

        int i;

        for (i = 0; i < estoque.descricao.length; i++) {
            estoque.descricao[i] = new Produto();

            System.out.println("Informe o nome do produto " + (i + 1) + ":");
            estoque.descricao[i].setNome(entrada.nextLine());


            System.out.println("Informe a quantidade do produto " + (i + 1));
           estoque.descricao[i].setQuantidade(entrada.nextInt());
           entrada.nextLine();

        }
        do {

            System.out.println("informe o código do produto que deseja conferir o estoque:");
            int cod = entrada.nextInt();
            estoque.descricao[cod - 1].descrever();

            System.out.println("Deseja uma lista completa do estoque? Digite 1 para SIM e 0 para NÃO");
            lista = entrada.nextInt();

            if (lista == 1) {


                for (i = 0; i < estoque.descricao.length; i++) {

                    System.out.println("Produto "+(i+1)+": "+ estoque.descricao[i].getNome());

                    System.out.println("quantidade: " + estoque.descricao[i].getQuantidade());

                    Estoque.traco();

                }

            }
        }while (lista==0);
    }
}











