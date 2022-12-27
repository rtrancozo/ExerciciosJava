package quickexecices;

import java.util.Scanner;
import java.lang.Math.*;




public class CalcVolume {

    static final Double VALOR_DE_PI = 3.14;
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o raio da circunferência ");
        double raio = entrada.nextDouble();
        double volume = VALOR_DE_PI*(raio*raio);
        System.out.println("O volume da circunferência é = "+volume);



    }


}
