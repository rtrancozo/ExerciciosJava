package quickexecices;

import java.util.Scanner;
import java.lang.Math.*;

public class MaioremenorCorrigido {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] precosProdutos = new double[3];
        double maiorPreco = Math.max(precosProdutos[0],precosProdutos[2]);
        System.out.println("Maior preço: "+maiorPreco);
        System.out.println("Menor preço: "+Math.min(precosProdutos[0],precosProdutos[2]));
    }
}
