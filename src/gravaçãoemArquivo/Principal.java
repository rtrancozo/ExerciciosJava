package gravaçãoemArquivo;

import java.io.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);
        String jogador = "";
        //------------------------------CRIAÇÃO DO ARQUIVO .TXT----------------------------
        FileWriter jogadores = new FileWriter("C:\\ArquivosJava\\bd01");
        int cont = 0;
        int maisum = 1;

        do {

            cont += 1;
            System.out.println("DIGITE O NOME DO JOGADOR 0" + cont);
            jogador = cont + " " + entrada.nextLine();


            try {

//-----------------------------------ESCRITA-------------------------------------------------------------
                PrintWriter nomeJogadore = new PrintWriter(jogadores);
                nomeJogadore.println(jogador);
                System.out.println("NOME GRAVADO COM SUCESSO!");


            } catch (Exception io) {
                System.out.println("Arquivo não pode ser gravado!");
            }

            jogadores.flush();

            System.out.println("GOSTARIA DE INCLUIR MAIS ALGUM JOGADOR? DIGITE 1 PARA SIM E 0 PARA NÃO!");
            maisum = entrada.nextInt();
            entrada.nextLine();

        } while (maisum == 1);
        jogadores.close();

        //--------------------------------LEITURA--------------------------------------------------

        String linha = "";

        FileReader jogadores1 = new FileReader("C:\\ArquivosJava\\bd01");
        BufferedReader lerjogadores1 = new BufferedReader(jogadores1);




        while (linha != null) {
            System.out.println("\n" + linha);
            linha = lerjogadores1.readLine();
        }


            jogadores1.close();


        }
    }

