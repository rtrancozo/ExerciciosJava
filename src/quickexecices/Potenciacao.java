package quickexecices;
import java.lang.Math.*;
import java.util.Scanner;

public class Potenciacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero:");
        double num = entrada.nextDouble();
        System.out.println("Digite a potencia:");
        int pot = entrada.nextInt();

        double resultado = Math.pow(num,pot);


        System.out.println(resultado);


        System.out.println(Math.sqrt(9));

        double num2 = 5.4;
        System.out.println("Arredondando para cima: "+Math.ceil(num2));
        System.out.println("Arredondando para baixo: "+Math.floor(num2));
        System.out.println("Seno de 40º:"+Math.sin(40));
        System.out.println("Numero aleatório gerado: "+Math.random() *100);


    }
}
