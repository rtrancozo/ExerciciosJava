package sistemaBancario;

public class ContaPoupanca extends Conta {

    double rendimentos;

    public ContaPoupanca(double saldo, double rendimentos){

        ContaPoupanca.this.saldo = saldo;
        this.rendimentos= rendimentos;
    }



    public void saldo(){

        System.out.println("O saldo da conta poupança é de: R$"+saldo+"\n E os rendimentos dessa conta poupança são de R$"+rendimentos);

    }


}
