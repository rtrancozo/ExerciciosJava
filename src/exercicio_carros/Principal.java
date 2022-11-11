package exercicio_carros;

public class Principal {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        carro01.nome = "Civic";
        carro01.modelo = null;
        carro01.anoFabricacao = 2021;

        Carro carro02 = new Carro();
        carro02.nome = "Versa";
        carro02.modelo = "SV";
        carro02.anoFabricacao = 2018;

        String [] carros = new String[2];

        carros [0]=carro01.getNome();
        carros [1]=carro02.getNome();

        System.out.println(carro01.anoFabricacao);


            if (carro01.modelo!=null){
                System.out.println("Ligar "+carro01.nome +" "+carro01.modelo);
            }else {
                System.out.println("Falta configurar o modelo do carro.");
            }
            if(carro02.modelo!=null){
                System.out.println("Ligar "+carro02.nome +" " +carro02.modelo);
            }else {
        System.out.println("Falta configurar o modelo do carro.");
    }

    }
}
