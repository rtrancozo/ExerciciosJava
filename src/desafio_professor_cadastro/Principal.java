package desafio_professor_cadastro;

public class Principal {
    public static void main(String[] args) {

        CadastroPessoa cadastro = new CadastroPessoa();
        Pessoa pessoa = new Pessoa("José",32);


        cadastro.cadastrar(pessoa);
        cadastro.cadastrar("Maria", 25);
        cadastro.cadastrar("João");



    }
}
