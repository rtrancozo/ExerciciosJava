package exercicioPolimorfismo;

public class Carro implements Seguravel{
    private double valorMercado;
    private double anoFabricacao;

    public Carro(double valorMercado, double anoFabricacao) {
        this.valorMercado = valorMercado;
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public double calcularValorApolice() {
      //calculos fictícios do valor de uma apólice de um carro
        double valorApolice = this.valorMercado*0.04;
        if (anoFabricacao<2000){
            valorApolice = valorApolice*0.90;
        }
        return valorApolice;
    }

    @Override
    public String obterDescricao() {
        return "Carro ano "+this.anoFabricacao+
                " com valor de mercado "+this.valorMercado;
    }
}
