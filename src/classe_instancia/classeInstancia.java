package classe_instancia;

public class classeInstancia {
    public static void main(String[] args) {
        System.out.println("Quantidade mímina em estoque: "+Produto.quantidadeMininaemEstoque);

        Produto produto = new Produto();
        produto.nome = "Caneca";

        Produto produto2 = new Produto();
        produto2.nome = "Carteira";

        System.out.println("Quantidade mímina em estoque: "+Produto.quantidadeMininaemEstoque);

        Impressao.informacao("Produto 01 "+produto.nome);
        Impressao.informacao("Produto 02 "+produto2.nome);

    }
}
