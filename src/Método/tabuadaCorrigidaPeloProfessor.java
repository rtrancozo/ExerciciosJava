package Método;

import java.util.Scanner;

public class tabuadaCorrigidaPeloProfessor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um número: ");
        Integer numero = entrada.nextInt();
        System.out.println("-------------------------------");
        imprimiTabuada(numero, 0);

    }

    private static void imprimiTabuada(Integer multiplicando, Integer multiplicador){
        System.out.println(multiplicando + " x "+multiplicador+" = "+(multiplicador*multiplicando));
        if(++multiplicador <= 10){
            imprimiTabuada(multiplicando,multiplicador);
        }
    }
}
