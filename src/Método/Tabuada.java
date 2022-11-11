package Método;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero da tabuada: ");
        int multiplicando = entrada.nextInt();
        imprimirTabuada(multiplicando);





        }

        private static void imprimirTabuada(int entrada){
        imprimirTabuada(0, entrada);
    }
    private static void imprimirTabuada(int i, int entrada){
        System.out.println(i+ " x "+ entrada+" = "+i*entrada );
        if(++i<=10){
            imprimirTabuada(i,entrada);
        }

    }
}
