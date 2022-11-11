package codigo_roger;

public class Produto {
    String nome;
    Integer quantidade;
    Double precodeCusto;
    Double precoDeVenda;
    Double lucroporUnidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPrecodeCusto() {
        return precodeCusto;
    }

    public void setPrecodeCusto(Double precodeCusto) {
        this.precodeCusto = precodeCusto;
    }

    public Double getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(Double precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public Double getLucroporUnidade() {
        return lucroporUnidade;
    }

    public void setLucroporUnidade(Double lucroporUnidade) {
        this.lucroporUnidade = lucroporUnidade;
    }

    public static Double lucroporUnidade(double precodeCusto, double precodeVenda){
        double lucroporUnidade = precodeVenda - precodeCusto;
        return lucroporUnidade;
    }

    public static Double faturamento(int quantidade, double precoDeVenda){
        double faturamento = quantidade*precoDeVenda;
        return faturamento;
    }
    public static Double custoTotal(int quantidade, double precodeCusto){
        double custoTotal = quantidade*precodeCusto;
        return custoTotal;
    }
    public static Double lucroliquido (double faturamento, double custoTotal){
        double lucroLiquido = faturamento-custoTotal;
        return lucroLiquido;
    }
    public static Double lucroporsocio(double lucroliquido, int qtdtrabalha){
        double lucroporsocio = lucroliquido/qtdtrabalha;
        return lucroporsocio;
    }

}
