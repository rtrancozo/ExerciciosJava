package codigo_roger;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int x = 1;

        do{

            Scanner entrada = new Scanner(System.in);
            Produto produto01 = new Produto();
            Trabalhador trabalhador01 = new Trabalhador();
            System.out.println("Informe o nome do produto: ");
            produto01.setNome(entrada.nextLine());
            System.out.println("Informe a quantidade vendida: ");
            produto01.setQuantidade(entrada.nextInt());
            System.out.println("Informe o preço de custo do produto:");
            produto01.setPrecodeCusto(entrada.nextDouble());
            System.out.println("Informe o valor de venda final: ");
            produto01.setPrecoDeVenda(entrada.nextDouble());
            System.out.println("Informe a quantidade de trabalhadores que irão dividir o lucro: ");
            trabalhador01.setQtd(entrada.nextInt());

            double lucroporUnidade = Produto.lucroporUnidade(produto01.getPrecodeCusto(), produto01.getPrecoDeVenda());
            double faturamento = Produto.faturamento(produto01.getQuantidade(), produto01.getPrecoDeVenda());
            double custototal = Produto.custoTotal(produto01.getQuantidade(), produto01.getPrecodeCusto());
            double lucroliquido = Produto.lucroliquido(faturamento, custototal);
            double lucroporsocio = Produto.lucroporsocio(lucroliquido, trabalhador01.getQtd());

            System.out.println("O faturamento total foi de " + faturamento + ",\ndesse total, deve ser pago pelo custo total dos" +
                    " produtos vendidos o valor de R$" + custototal + "\nFicando um lucro líquido de R$" + lucroliquido + "\n" +
                    "A parte que cabe a cada um dos " + trabalhador01.getQtd() + " sócios é de R$" + lucroporsocio);

            System.out.println("Deseja fazer mais algum cálculo? 1 para SIM e 0 para NÃO");
            x = entrada.nextInt();

        }while(x==1);












    }
}
