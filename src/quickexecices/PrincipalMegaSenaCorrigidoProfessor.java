package quickexecices;

import java.util.Scanner;

public class PrincipalMegaSenaCorrigidoProfessor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos jogos?");
        int quantidadeJogos = entrada.nextInt();

        System.out.println("______________________________________");


        for (int i= 1; i <=quantidadeJogos; i++){
            megasenaCorrigidoProfessor mega = new megasenaCorrigidoProfessor();
            mega.sortear();
            mega.exibirNumeros();
            System.out.println("-----------------------------------------------------------");
        }
        System.out.println("Boa sorte!!***");

    }
}
