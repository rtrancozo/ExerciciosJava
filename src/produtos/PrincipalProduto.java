package produtos;

public class PrincipalProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Pneus");
        PrincipalProduto.imprimirproduto(produto);

       ProdutoPerecivel pp = new ProdutoPerecivel();
        pp.setNome("Leite");
        pp.setDataValidade("31/12/2022");
        PrincipalProduto.imprimirproduto(pp);




          }
          private static void imprimirproduto(Produto produto){
              System.out.println("O nome do produto é:"+produto.getNome());
              if(produto instanceof ProdutoPerecivel){
                  ProdutoPerecivel pp = (ProdutoPerecivel) produto;
                  System.out.println("A data de validade desse produto é:"+pp.getDataValidade());
              }

          }



}
