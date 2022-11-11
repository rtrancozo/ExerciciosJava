package programacao_orientada_a_objetos_exercicio03;

public class Exercicio03 {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setCodigo(1);
        pedido.setDesconto(5.0);
        pedido.setSubtotal(100.0);

        System.out.println("Código: "+ pedido.getCodigo()+"\n"+"Subtotal: "+pedido.getSubtotal()+"\n"+"Total: "+pedido.getTotal());

    }

}
