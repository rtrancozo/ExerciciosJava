package exercicio_construtor_pessoa;

public class Pessoa {

    private String nome;

    private int idade;

    public void inserirNome(String nome){
        this.nome = nome;
    }

    public void  inserirIdade(int idade){
        this.idade = idade;
    }

    public String obterNome(){
        return nome;
    }

    public int obterIdade(){
        return idade;
    }
}
