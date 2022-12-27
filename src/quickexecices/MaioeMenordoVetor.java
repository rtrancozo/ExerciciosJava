package quickexecices;

import java.util.Scanner;


public class MaioeMenordoVetor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Integer[] numeros = new Integer[5];
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;

        for (int i =0; i<numeros.length;i++){
            System.out.println("Digite um numero:");
            numeros[i]= entrada.nextInt();

        }
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i]>maior){
                maior = numeros[i];
            }

        }

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i]<menor){
                menor = numeros[i];
            }
        }

        System.out.println("O maior numero é "+maior+"\nE o menor número é:"+menor);



    }
}
