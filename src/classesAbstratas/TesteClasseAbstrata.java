package classesAbstratas;

public class TesteClasseAbstrata {
    public static void main(String[] args) {
        Produto p = new ProdutoPerecivel();
        p.setDescricao("Caixa de Leite");
        ProdutoPerecivel pp = (ProdutoPerecivel) p;
        pp.setDataValidade("10/07/2022");
        p.imprimirDescricao();


    }
}
