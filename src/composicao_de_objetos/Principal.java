package composicao_de_objetos;

public class Principal {
    public static void main(String[] args) {
        Proprietario dono1 = new Proprietario();
        dono1.nome = "João da Silva";
        Carro meuCarro = new Carro();
        meuCarro.anoDeFabricacao = 2011;
        meuCarro.cor = "Prata";
        meuCarro.fabricante = "Fiat";
        meuCarro.modelo = "Palio";
        //meuCarro.dono = new Proprietario();
        //meuCarro.dono = dono1;
        Carro seuCarro = new Carro();
        seuCarro.anoDeFabricacao = 2012;
        meuCarro.dono = dono1;
        seuCarro.dono = dono1;


        System.out.println("Antes da mudança:");
        System.out.println(meuCarro.dono.nome);
        System.out.println(seuCarro.dono.nome);
        System.out.println(dono1.nome);

        System.out.println();

        meuCarro.dono.nome = "Sebastião";
        System.out.println("Depois da Mudança: ");
        System.out.println(meuCarro.dono.nome);
        System.out.println(seuCarro.dono.nome);
        System.out.println(dono1.nome);
    }
}
