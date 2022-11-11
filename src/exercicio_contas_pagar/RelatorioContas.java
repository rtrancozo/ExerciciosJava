package exercicio_contas_pagar;

public class RelatorioContas {

    ContaPagar cp = new ContaPagar();
    ContaReceber cr = new ContaReceber();



    public void exibirListagem(Conta [] contas){
        int i = 0;

        for(i=0;i<contas.length;i++){
            System.out.println(contas[i]);
        }




    }
}
