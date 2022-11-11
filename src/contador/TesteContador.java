package contador;

public class TesteContador {
    public static void main(String[] args) {

        Contador c = new Contador();

            c.incrementar();
            System.out.println(Contador.count);
            Contador.count++;
            Contador.imprimirContador();

    }
}
