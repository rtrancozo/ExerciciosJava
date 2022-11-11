package sistemaBancario;

public class ContaCorrente extends Conta {

    double limite;

    public ContaCorrente(double saldo, double limite){

        ContaCorrente.this.saldo = saldo;
        this.limite = limite;
    }
    public void saldo(){
        System.out.println("O saldo da conta corrente é de: R$"+saldo+"\n O limite da conta corrente é de: R$"+limite);
    }
}
