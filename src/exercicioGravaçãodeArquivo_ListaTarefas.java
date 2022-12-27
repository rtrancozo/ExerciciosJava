import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class exercicioGravaçãodeArquivo_ListaTarefas {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        String tarefa = "";
        int cont = 1;
        String linha = "";



        while (true) {


            if (tarefa.equals("x")){
                break;
            }


                System.out.println("Digite a tarefa nº" + cont);
                tarefa = entrada.nextLine();
                tarefas.add(tarefa);




                Path listaTarefas = Paths.get("C:\\ArquivosJava\\Lista de Tarefas\\Tarefas");

                Files.write(listaTarefas, tarefas);
                cont++;


            }

        System.out.println("Insira uma nova tarefa:");
        String novonome = entrada.nextLine();

        inserirdadonovo(novonome);

        FileReader listaTarefas = new FileReader("C:\\ArquivosJava\\Lista de Tarefas\\Tarefas");
        BufferedReader lerTarefas = new BufferedReader(listaTarefas);





        while (linha != null) {
            System.out.println("\n" + linha);
            linha = lerTarefas.readLine();
        }


        entrada.close();


    }

    private static void inserirdadonovo(String novonome) throws IOException {

        Path listaTarefas = Paths.get("C:\\ArquivosJava\\Lista de Tarefas\\Tarefas");
        Files.write(listaTarefas, novonome.getBytes());



    }
    }




