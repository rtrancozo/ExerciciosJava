package metodo_de_instancia;

public class MetodoInstancia {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.firstName = "Alexandre";
        cliente.lastName = "Afonso";
        cliente.Telphone = "123456789";
        cliente.email = "alexandreafonso@gmail.com";

        Cliente cliente1 = new Cliente();
        cliente1.firstName = "João";
        cliente1.lastName = "Silva";
        cliente1.Telphone = "9887654321";
        cliente1.email = "joaosilva@gmail.com";

        System.out.println("Nome cliente: "+ Cliente.obterNomeCompleto(cliente));//Esse é um método estático.
        System.out.println("Nome cliente: "+ cliente.obterNomecompleto() + ", DDD: "+cliente.obterDDD());
        System.out.println("Nome cliente: "+ cliente1.obterNomecompleto() + ", DDD: "+cliente1.obterDDD());

    }
}
