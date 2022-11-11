package exercicio_construtor_pessoa;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.inserirNome("Rodrigo");
        p1.inserirIdade(46);

        System.out.println("O nome da pessoa é :"+p1.obterNome()+" e sua idade é de "+ p1.obterIdade()+" anos");
    }
}
