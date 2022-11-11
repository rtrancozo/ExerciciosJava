package contador;

public class Contador {
    public static int count = 0;
    public static final double PI =3.14;

    public void incrementar(){
        count++;
    }

    public static void imprimirContador(){
        System.out.println("O valor do contador agora é: "+Contador.count);
    }
}
