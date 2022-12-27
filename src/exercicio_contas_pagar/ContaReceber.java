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
        System.out.println("\n Cconta a Receber");
        System.out.println("===============================");
        System.out.println("Cliente: "+this.getCliente());
        System.out.println("Descrição: "+this.getDescricao());
        System.out.println("Valor: "+this.getValor());
        System.out.println("Data de vencimento: "+this.getDataVencimento());
        System.out.println("Situação: "+this.getStatus());
        System.out.println("======================================");

    }
}



