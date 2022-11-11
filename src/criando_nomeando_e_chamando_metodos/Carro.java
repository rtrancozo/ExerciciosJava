package criando_nomeando_e_chamando_metodos;

public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anodeFabricacao;
    Proprietario dono;

    void ligar(){
        if (modelo!= null){
            System.out.println("Ligando o carro "+modelo);
        }

    }



}
