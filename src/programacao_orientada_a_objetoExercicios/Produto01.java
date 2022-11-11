package programacao_orientada_a_objetoExercicios;

public class Produto01 {
    String nome;
    Double preco;
    Integer quantidadeEstoque;
    Integer estoqueMinimo;


    public String necessidadeDeReposicaoDeEstoque() {
        String reposicao;
        if(quantidadeEstoque<estoqueMinimo){
            reposicao = "Necessario repor estoque.";
        }else {
            reposicao = "Não é necessário repor estoque.";
        }
        return reposicao;

    }
}
