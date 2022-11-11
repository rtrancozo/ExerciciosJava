package exercicio_encapsulamento;

import java.util.Scanner;

public class PedidoDeCompra {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Compra pedido = new Compra();
        System.out.println("Digite o código do pedido:");
       pedido.setCodigo(entrada.nextLine());
        System.out.println("Digite o valor do pedido:");
        pedido.setSubtotal(entrada.nextDouble());
        System.out.println("Digite a porcentagem do desconto:");
        pedido.setDesconto(entrada.nextDouble());
        pedido.setTotal(pedido.getDesconto());


        System.out.println(" O código do pedido é: "+ pedido.getCodigo());
        System.out.println(" O subtotal do pedido é: "+pedido.getSubtotal());
        System.out.println(" O desconto sobre o valor do pedido é de : "+pedido.getDesconto()*100+"%");
        System.out.println(" O total  a ser pago pelo do pedido é: "+pedido.getTotal());

        entrada.close();

    }
}
