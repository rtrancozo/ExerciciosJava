package precificação;

public class Produto {
    String nome;
    Double custoCompra;
    Double aliquotaImposto;
    Double lucroDesejado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getCustoCompra() {
        return custoCompra;
    }

    public void setCustoCompra(Double custoCompra) {
        this.custoCompra = custoCompra;
    }

    public Double getAliquotaImposto() {
        return aliquotaImposto;
    }

    public void setAliquotaImposto(Double aliquotaImposto) {
        this.aliquotaImposto = aliquotaImposto;
    }

    public Double getLucroDesejado() {
        return lucroDesejado;
    }

    public void setLucroDesejado(Double lucroDesejado) {
        this.lucroDesejado = lucroDesejado;
    }
}
