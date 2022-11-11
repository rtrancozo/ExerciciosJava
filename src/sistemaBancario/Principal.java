package sistemaBancario;

public class Principal {
    public static void main(String[] args) {
        Conta conta = new Conta(1000);
        ContaCorrente cc = new ContaCorrente(5000,2000);
        ContaPoupanca cp = new ContaPoupanca(1000, 250);
        conta.saldo();
        cc.saldo();
        cp.saldo();

    }
}
