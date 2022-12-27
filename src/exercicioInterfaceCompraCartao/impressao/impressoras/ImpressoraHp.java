package exercicioInterfaceCompraCartao.impressao.impressoras;

import exercicioInterfaceCompraCartao.impressao.Impressora;
import exercicioInterfaceCompraCartao.impressao.Imprimivel;

public class ImpressoraHp implements Impressora {
    @Override
    public void imprimir(Imprimivel imprimivel) {

        System.out.println(imprimivel.getCabecalhoPagina());
        System.out.println("________________________________________");
        System.out.println(imprimivel.getCorpoPagina());
        System.out.println();
        System.out.println("============================================= ");
        System.out.println("...................HP.........................");
        System.out.println("=============================================");
    }
}
