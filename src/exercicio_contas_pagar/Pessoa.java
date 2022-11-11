package exercicio_contas_pagar;

public abstract class  Pessoa {
    String nome;

    public abstract void pessoa();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void exibirDetalhes();



}
