package exercicioInterfaceCompraCartao.pagamento.operadoras;

import exercicioInterfaceCompraCartao.pagamento.Autorizavel;
import exercicioInterfaceCompraCartao.pagamento.Cartao;
import exercicioInterfaceCompraCartao.pagamento.Operadora;

public class Redecard implements Operadora {


    @Override
    public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
        return cartao.getNumeroCartao().startsWith("456")&&autorizavel.getValorTotal()<200;
    }
}
