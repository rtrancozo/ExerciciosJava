package correção_exercicio_carro_ligar;

public class Carro_corrigido_professor {

    String fabricante;
    String modelo;
    String cor;
    int anoDefabricacao;
    Boolean biCombustpivel;

    Proprietario dono;

    void ligar(){
        if(modelo != null){
            System.out.println("Ligando o carro: "+modelo);
        }

    }

}
