package exercicio_de_contrutores_com_encapsulamento_e_modificadores_de_acesso;

public class ArCondicionado {

    private int temperatura;

    public void trocarTemperatura(int temperatura){ // Esse método acessa a variável temperatura e estabelece os parâmentros para que
        //somente seja mudada a temperatura se, e somente se, satisfizer a condição do método publico.
        if(temperatura>=17 && temperatura<=25){
            this.temperatura = temperatura;
        }
    }


    public int obterTemperatura(){
        return temperatura;
    }
}

