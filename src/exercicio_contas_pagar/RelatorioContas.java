package exercicio_contas_pagar;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class RelatorioContas {

    ContaPagar cp = new ContaPagar();
    ContaReceber cr = new ContaReceber();



    public void exibirListagem(Conta [] contas){

        System.out.println("=========================");
        System.out.println("RELATÓRIO DE CONTAS A PAGAR E A RECEBER");
        System.out.println("==========================================");


        int i = 0;

        for(i=0;i<contas.length;i++){
            contas[i].exibirDetalhes();
        }

        System.out.println("=====================================================");




    }
}
