package inteface_notaFiscal;

public class TesteIntereface {
    public static void main(String[] args) {
        Imprimivel i = new NotaFiscal(1234);
        i.imprimir();
        EnviavelPorEmail e =  (EnviavelPorEmail)i;
        e.enviar("filipe@gmail.com");
        NotaFiscal n = (NotaFiscal) e;
        n.adicionarPedido("Caixa de Leite");
    }
}
