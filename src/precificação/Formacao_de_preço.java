package precificação;

import java.util.Scanner;

public class Formacao_de_preço {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Produto produto1 = new Produto();
        System.out.println("Informe o nome do produto: ");
        produto1.setNome(entrada.nextLine());
        System.out.println("Informe o preço de custo de "+produto1.getNome());
        produto1.setCustoCompra(entrada.nextDouble());
        System.out.println("Informe a alíquota de imposto sobre "+produto1.getNome());
        produto1.setAliquotaImposto(entrada.nextDouble());
        System.out.println("Informe o lucro desejado sobre as vendas de "+produto1.getNome());
        produto1.setLucroDesejado(entrada.nextDouble());

        Double aliquota = calculos.aliquotaImposto(produto1.getAliquotaImposto());
        Double lucro = calculos.lucroDesejado(produto1.getLucroDesejado());
        Double preçoBruto = calculos.custobruto(aliquota,produto1.getCustoCompra());
        Double precoFinal = calculos.precoFinal(preçoBruto, lucro);

        System.out.println("O preço final de "+produto1.getNome()+" é "+precoFinal);


    }
}
