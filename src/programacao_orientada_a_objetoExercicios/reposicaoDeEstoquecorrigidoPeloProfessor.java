package programacao_orientada_a_objetoExercicios;

public class reposicaoDeEstoquecorrigidoPeloProfessor {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Notebook XZ10";
        produto.quantidadeEstoque = 8;
        System.out.println("Necessário repor estoque no produto" + produto.nome+" ? "+eNecessarioReporEstoque(produto));
    }

    private static Boolean eNecessarioReporEstoque(Produto produto) {
        return produto.quantidadeEstoque < Produto.QUANTIDADE_MINIMA_ESTOQUE;

    }
}
