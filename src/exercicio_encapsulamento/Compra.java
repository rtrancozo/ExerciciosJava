package exercicio_encapsulamento;

public class Compra {
    String codigo;
    Double subtotal;
    Double desconto;
    Double total;


    private static Double calculodaPorcentagem(Double desconto) {
        Double porcentagem = desconto/100;
        return porcentagem;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {

        this.codigo = codigo;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getDesconto() {

        return desconto;
    }

    public void setDesconto(Double desconto) {
        desconto = calculodaPorcentagem(desconto);


        this.desconto = desconto;
    }

    public Double getTotal() {



        return total;
    }

    public void setTotal(Double total) {
        total = subtotal - subtotal*desconto;

        this.total = total;
    }
}
