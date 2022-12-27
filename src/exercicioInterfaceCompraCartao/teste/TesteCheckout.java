package exercicioInterfaceCompraCartao.teste;

import exercicioInterfaceCompraCartao.caixa.CheckoutVendas;
import exercicioInterfaceCompraCartao.caixa.Compra;
import exercicioInterfaceCompraCartao.impressao.Impressora;
import exercicioInterfaceCompraCartao.impressao.impressoras.ImpressoraEpson;
import exercicioInterfaceCompraCartao.impressao.impressoras.ImpressoraHp;
import exercicioInterfaceCompraCartao.pagamento.Cartao;
import exercicioInterfaceCompraCartao.pagamento.Operadora;
import exercicioInterfaceCompraCartao.pagamento.operadoras.Cielo;
import exercicioInterfaceCompraCartao.pagamento.operadoras.Redecard;

public class TesteCheckout {
    public static void main(String[] args) {
        Operadora operadora = new Cielo();
        Impressora impressora = new ImpressoraEpson();
        Cartao cartao = new Cartao();
        cartao.setNomeTitular("João M Couves");
        cartao.setNumeroCartao("123");

        Compra compra = new Compra();
        compra.setNomeCliente("João Mendonça Couves");
        compra.setProduto("Sabonete");
        compra.setValorTotal(70);

        CheckoutVendas checkout = new CheckoutVendas(operadora, impressora);
        checkout.fecharCompra(compra, cartao);


    }
}
