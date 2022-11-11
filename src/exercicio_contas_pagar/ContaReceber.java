package exercicio_contas_pagar;

public class ContaReceber extends Conta{




    public ContaReceber() {

    }




    @Override
    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void Conta() {

    }

    public ContaReceber(Cliente cliente, String compras_do_mês, double v, String s) {
        setDescricao(compras_do_mês);
        setCliente(cliente);
        setValor(v);
        setDataVencimento(s);

    }




    public void receber(){
        System.out.println("Conta "+getDescricao()+" recebida.");
    }

    public void cancelar(){
        super.cancelar();

        }

    @Override
    public void exibirDetalhes() {

    }
}



