package exercicio_de_contrutores_com_encapsulamento_e_modificadores_de_acesso;

public class TesteEncapsulamento {

    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();// 17 ~ 25

        ar.trocarTemperatura(21);
        System.out.println("Temperatura do ar: "+ar.obterTemperatura()+"°");

        ar.trocarTemperatura(10);
        System.out.println("Temperatura do ar: "+ar.obterTemperatura()+"°");

    }

}
