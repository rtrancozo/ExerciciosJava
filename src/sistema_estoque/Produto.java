package sistema_estoque;

public class Produto {


    String nome;
    Integer quantidade;


    void descrever(){
        System.out.println("O produto é: "+nome +" e a quantidade é: "+ quantidade);
    }



    public String getNome() {


        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
