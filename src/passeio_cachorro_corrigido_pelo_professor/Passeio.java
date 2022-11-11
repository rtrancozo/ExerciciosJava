package passeio_cachorro_corrigido_pelo_professor;

import java.util.concurrent.Callable;

public class Passeio {
    public static void main(String[] args) {
        Dono p1 = new Dono();
        p1.nome = "João";
        p1.cachorro = new Cachorro();
        p1.cachorro.idade = 3;
        p1.cachorro.raca = "boxer";
        p1.cachorro.nome = "Bidu";
        Caminhada c = new Caminhada();
        c.andar(p1);


            }
        }
