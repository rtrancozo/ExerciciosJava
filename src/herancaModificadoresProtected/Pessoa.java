package herancaModificadoresProtected;

public class Pessoa {
    String nome;
    protected int idade;
    public  void seApresentar(){
        System.out.println("Olá, eu sou "+nome+", e tenho "+idade+" anos.");
    }
}
