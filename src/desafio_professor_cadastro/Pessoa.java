package desafio_professor_cadastro;

public class Pessoa {
    String nome;
    Integer idade;

    public Pessoa (String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
