package correção_exercicio_carro_ligar;

public class TesteArray {
    public static void main(String[] args) {
        Carro_corrigido_professor[] carros = new Carro_corrigido_professor[4];
        carros[0] = new Carro_corrigido_professor();
        carros[0].anoDefabricacao=2011;

        System.out.println("Ano de fabricação "+carros[0].anoDefabricacao);

    }
}
