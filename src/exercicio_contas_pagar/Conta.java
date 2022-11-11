package exercicio_contas_pagar;

public abstract class Conta {
    private String descricao;
    private Double valor;
    private String dataVencimento;

    public Fornecedor fornecedor;
    public Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public SituacaoConta getStatus() {
        return status;
    }

    public void setStatus(SituacaoConta status) {
        this.status = status;
    }

    public Conta(Fornecedor mercado, String compras_do_mês, double v, String s) {
        setDescricao(compras_do_mês);
        setFornecedor(mercado);
        setValor(v);
        setDataVencimento(s);
    }

    public abstract void Conta();


    SituacaoConta status = SituacaoConta.PENDENTE;

    public Conta() {

    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }


    public void pagar() {
        if (SituacaoConta.PENDENTE.equals(status)) {
            status = SituacaoConta.PAGA;
            System.out.println("Conta " + getDescricao() + "\n Valor:" + getValor() + "\nData de Vencimento" + getDataVencimento());
        }
        if (SituacaoConta.PAGA.equals(status)) {
            System.out.println("Essa conta já esta paga!");

        } else {
            System.out.println("A conta esta cancelada");
        }
    }

    public void cancelar() {
        if (status.equals(SituacaoConta.PENDENTE)  && getValor()<50000.00) {
            status = SituacaoConta.CANCELADA;
            System.out.println("Conta cancelada");
        }
        if (status.equals(SituacaoConta.CANCELADA)) {
            System.out.println("Essa conta já esta cancelada!");
        } else {
            System.out.println("Conta paga não pode ser cancelada");
        }


    }

    public abstract void exibirDetalhes();

}
