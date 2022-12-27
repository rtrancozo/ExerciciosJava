package exercicioInterfaceCompraCartao.pagamento.operadoras;

import exercicioInterfaceCompraCartao.pagamento.Autorizavel;
import exercicioInterfaceCompraCartao.pagamento.Cartao;
import exercicioInterfaceCompraCartao.pagamento.Operadora;

public class Cielo implements Operadora {
    @Override
    public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
        return cartao.getNumeroCartao().startsWith("123") && autorizavel.getValorTotal()<100;
    }
}
