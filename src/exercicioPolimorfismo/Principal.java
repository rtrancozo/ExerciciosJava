package exercicioPolimorfismo;

public class Principal {
    public static void main(String[] args) {
        CorretoraSeguros corretora = new CorretoraSeguros();
        Carro meucarro = new Carro(45000, 2012);
        Imovel minhaCasa = new Imovel(920000,320);
        corretora.fazerPropostaSeguro(meucarro);
        corretora.fazerPropostaSeguro(minhaCasa);
    }

}
