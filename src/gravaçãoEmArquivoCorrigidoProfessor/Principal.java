package gravaçãoEmArquivoCorrigidoProfessor;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> linhas = new ArrayList<>();

        for (int i = 0; i<5;i++){
            System.out.println("Jogador "+i+": ");
            String nome = entrada.nextLine();
            linhas.add(nome);

        }
        Path arquivo = Paths.get("C:\\ArquivosJava\\Implementação do Professor\\arquivo.txt");

        Files.write(arquivo,linhas);

        entrada.close();
        System.out.println("Fim...");
//__________________________________LEITURA__________________________________________

        arquivo = Paths.get("C:\\ArquivosJava\\Implementação do Professor\\arquivo.txt");


        linhas = (ArrayList<String>) Files.readAllLines(arquivo);

        for (int i = 0; i < linhas.size(); i++){
            String nome = linhas.get(i);
            System.out.println("Jogador "+ i+": "+ nome);
        }


    }
}
