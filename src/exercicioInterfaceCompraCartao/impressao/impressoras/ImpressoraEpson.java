package exercicioInterfaceCompraCartao.impressao.impressoras;

import exercicioInterfaceCompraCartao.impressao.Impressora;
import exercicioInterfaceCompraCartao.impressao.Imprimivel;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ImpressoraEpson implements Impressora {
    @Override
    public void imprimir(Imprimivel imprimivel) {
        System.out.println("*********************************************");
        System.out.println(imprimivel.getCabecalhoPagina());
        System.out.println("*********************************************");
        System.out.println(imprimivel.getCorpoPagina());
        System.out.println();
        System.out.println("______________________________________________ ");
        System.out.println("==               EPSON                  ==");
        System.out.println("_______________________________________________");
    }
}
