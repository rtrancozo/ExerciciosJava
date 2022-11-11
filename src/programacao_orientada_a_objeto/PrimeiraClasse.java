package programacao_orientada_a_objeto;

public class PrimeiraClasse {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Smartphone";
        produto.precoUnitario = 500.0;
        produto.quantidade = 15;

        exibirQuantidadeemEstoque(produto);

    }

    private static void exibirQuantidadeemEstoque(Produto produto){
        System.out.println("Quantidade em estoque do produto "+produto.nome+" é de "+produto.quantidade+" unidade(s).");
    }
}
