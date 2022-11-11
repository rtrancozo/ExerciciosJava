package exercicio_notas_aluno;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[4];
        int[][] notas = new int[4][1];

        int i = 0;
        String lixo = "";

        int c =0;




        for (i = 0; i < 4; i++) {

            System.out.print("DIGITE O " + (i + 1) + " NOME:");
            nomes[i] = entrada.nextLine();


            for (c = 0; c < 1; c++) {



                System.out.println("DIGITE A NOTA");
                notas[i][c] = entrada.nextInt();
                lixo = entrada.nextLine();

            }
            }


        System.out.println(nomes[0]);
        System.out.println(notas[0][0]);



        for(i=0;i<4;i++){
            System.out.println(nomes[i]);

            for(c=0;c<1;c++){

                System.out.println(notas[i][c]);
            }



        }

        System.out.println(nomes.length);

    }
}
