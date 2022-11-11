package criando_nomeando_e_chamando_metodos;

public class Principal {
    public static void main(String[] args) {
        Carro meucarro = new Carro();
        meucarro.fabricante = "Honda";
        meucarro.modelo = "Civic";
        meucarro.cor = "preto";
        meucarro.anodeFabricacao = 2021;

        Carro seucarro = new Carro();
        seucarro.fabricante = "Toyota";

        seucarro.cor = "Branco";
        meucarro.anodeFabricacao = 2020;



        seucarro.ligar();
        meucarro.ligar();

    }
    }
