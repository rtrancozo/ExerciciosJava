package passeio_auau;

public class Passeio {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Daniel";
        pessoa.dog = "kate";
        pessoa.sexoDog = 2;

        String genero = Caminhada.sexodog(pessoa.sexoDog);
        Caminhada.caminhada(pessoa.nome, genero, pessoa.dog);
    }

}
