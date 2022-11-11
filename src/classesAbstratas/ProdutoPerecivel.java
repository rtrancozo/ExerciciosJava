package classesAbstratas;

public class ProdutoPerecivel extends Produto{


    String dataValidade;

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public void imprimirDescricao() {

    }
}
