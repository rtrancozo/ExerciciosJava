package herancaModificadoresProtected;

public class Jogador extends Pessoa {

    protected boolean aindaJoga = false;
    public void dizeSeAindaJoga(){
        System.out.println("Ainda joga? "+aindaJoga);
    }

}
