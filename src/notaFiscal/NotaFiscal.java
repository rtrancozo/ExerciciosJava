package notaFiscal;

public class NotaFiscal {

    int numero;

    String cliente;

    String endereço;

    String email;

    public void imprimirnf(int numero, String email){

        System.out.println("Vamos imprimir a Nota Fiscal de número: "+numero);
        System.out.println("Enviando a nota de número: "+numero+" para o email: "+email);

    }

    public NotaFiscal(int numero, String email){
        this.numero = numero;
        this.email = email;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
