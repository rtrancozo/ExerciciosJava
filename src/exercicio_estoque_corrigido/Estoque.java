package exercicio_estoque_corrigido;

public class Estoque {
    Produto[]produtos;

    void listar(){
        System.out.println("\nProdutos em estoque:");
        System.out.println("-------------------------------");

        for(int i=0;i< produtos.length;i++){
            produtos[i].descrever();
        }
    }

}
