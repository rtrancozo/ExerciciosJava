package sistemaBancario;

public class Conta {
    double saldo;

    public Conta(double saldo){
        this.saldo = saldo;
    }

    public Conta() {

    }

    public void saldo(){
        System.out.println("O saldo da conta é: " + saldo);
    }
}
