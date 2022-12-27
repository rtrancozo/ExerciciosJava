package notaFiscal;

public class Cliente {
    int codigo;
    String nome;
    String email;
    String endereco;


    public Cliente(int codigo, String nome, String email, String endereco){
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
