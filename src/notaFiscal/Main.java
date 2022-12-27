package notaFiscal;

public class Main {
    public static void main(String[] args) {
        NotaFiscal nf = new NotaFiscal(1234, "filipe@gmail.com");
        nf.imprimirnf(nf.getNumero(), nf.getEmail());
    }
}
