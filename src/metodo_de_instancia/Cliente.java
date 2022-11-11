package metodo_de_instancia;

public class Cliente {
    String firstName;
    String lastName;
    String Telphone;
    String email;

    public static String obterNomeCompleto(Cliente cliente) {
        String nomeCompleto = cliente.firstName+" "+cliente.lastName;


        return nomeCompleto;
    }

    public String obterNomecompleto() {
        String nomeCompleto = firstName+" "+lastName;
        return nomeCompleto;

    }

    public String obterDDD() {
        String ddd = Telphone.substring(0, 2);
        return ddd;
    }
}
