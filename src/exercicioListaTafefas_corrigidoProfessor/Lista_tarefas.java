package exercicioListaTafefas_corrigidoProfessor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Lista_tarefas {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String>linhas = new ArrayList<>();
        String tarefa;
        int cont = 0;
        while (true){
            System.out.println("Tarefa " +cont+": ");
            tarefa = entrada.nextLine();
            if (("x".equals(tarefa))){
                break;
            }
            cont++;
        }

        escrevernoarquivo("C:\\ArquivosJava\\Lista de Tarefas\\Tarefas", linhas);
        entrada.close();
        System.out.println("Fim..");

       /*Path arquivo = Paths.get("C:\\ArquivosJava\\Lista de Tarefas\\Tarefas");
        linhas = (ArrayList<String>) Files.readAllLines(arquivo);

        for (int i = 0; i < linhas.size();i++){
            tarefa = linhas.get(i);
            System.out.println("Tarefa "+i+":"+tarefa);

        }*/

        FileReader listaTarefas = new FileReader("C:\\ArquivosJava\\Lista de Tarefas\\Tarefas");
        BufferedReader lerTarefas = new BufferedReader(listaTarefas);
        String linha = "";




        while (linha != null) {
            System.out.println("\n" + linha);
            linha = lerTarefas.readLine();
        }







    }

    private static void escrevernoarquivo(String arquivo, ArrayList<String> linhas) throws IOException {
        Path path = Paths.get(arquivo);
        Files.write(path, linhas);


    }
}
