package exercicio_contas_pagar;

public class ContaPagar extends Conta {



    public ContaPagar(Fornecedor mercado, String compras_do_mes, double v, String s) {
        setDescricao(compras_do_mes);
        setFornecedor(mercado);
        setValor(v);
        setDataVencimento(s);
    }

    @Override
    public void Conta() {

    }

    public ContaPagar() {

    }

    @Override
    public void exibirDetalhes() {
        System.out.println("\n Conta a Pagar");
        System.out.println("============================");
        System.out.println("Fornecedor"+this.getFornecedor().getNome());
        System.out.println("Descrição: "+this.getValor());
        System.out.println("Data de Vencimento:"+this.getDataVencimento());
        System.out.println("Situação: "+this.getStatus());
        System.out.println("==================================");


    }

}
