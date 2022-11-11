package passeio_auau;

public class Caminhada {

    public static String sexodog (int sexo){

        String genero;
        if(sexo==1){
            genero = "o";
        }else{
            genero = "a";
        }
        return genero;
    }

    public static void caminhada(String nome, String genero, String dog){
        System.out.println(nome+" irá caminhar com "+ genero+" " + dog);
    }
}
