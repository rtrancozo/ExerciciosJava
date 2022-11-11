package classesAbstratas;

public abstract class Produto {
    String descricao;

    public abstract void imprimirDescricao();

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
