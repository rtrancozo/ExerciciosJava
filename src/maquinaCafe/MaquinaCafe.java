package maquinaCafe;

public class MaquinaCafe {
    int aculcarDisponivel;

    public MaquinaCafe(int aculcarDisponivel) {
        this.aculcarDisponivel = aculcarDisponivel;
    }

    public void fazerCafe(int qtsdesejada) {
        if (qtsdesejada < aculcarDisponivel) {
            System.out.println("O café será feito em 30 segundos");
            aculcarDisponivel -= qtsdesejada;
        } else {
            System.out.println("Quantidade de acúlcar insuficiente");
        }
    }

    public void fazerCafe() {
        fazerCafe(10);
    }
}
