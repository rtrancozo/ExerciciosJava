package programacao_orientada_a_objeto_encapsulamento;

public class encapsulamento {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Rodrigo Rosa");
        cliente.setTell("27123456789");


        System.out.println("Nome do cliente: "+cliente.getNome());
        System.out.println("Primeiro Nome: "+cliente.getFistName());
        System.out.println("Ultimo nome do cliente: "+cliente.getLastName());


    }
}
