package exercicioInterfaceCompraCartao.caixa;

import exercicioInterfaceCompraCartao.impressao.Impressora;
import exercicioInterfaceCompraCartao.pagamento.Cartao;
import exercicioInterfaceCompraCartao.pagamento.Operadora;

public class CheckoutVendas {

    private Operadora operadora;
    private Impressora impressora;

    public CheckoutVendas(Operadora operadora, Impressora impressora) {
        this.operadora = operadora;
        this.impressora = impressora;
    }

    public void fecharCompra(Compra compra, Cartao cartao){
        Boolean autorizado = this.operadora.autorizar(compra, cartao);

        if (autorizado){
            this.impressora.imprimir(compra);
        }else{
            System.out.println("Transação Negada");

        }
    }


}
