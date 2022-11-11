package wrappenrs_do_java_lang;

import static java.lang.Integer.valueOf;

public class Principal {
    public static void main(String[] args) {
        //byte, short, int, long, float, double e char
        //Byte, Short, Integer, Long, Float, Double, Character

        int x = 10;
        Integer i = new Integer(10);
        //Integer i = valueOf(x);
        // o Java na versão 18 sugere trocar a linha acima por Integer i = valueof(x)
        byte b = i.byteValue();
        // para colocar um valor de um atributo de um objeto em uma variável primitiva, usa-se o value()

        String valor = "15.5";
        Float v = new Float(valor);//Transformamos uma String para Float
        System.out.println(v+3);

        int idade = Integer.parseInt("27"); //Transforma uma string em um inteiro.
        System.out.println("Daqui a 5 anos você terá: "+(idade+5)+" anos");

        try {
            double custo = Double.parseDouble("Vinte e tres reais e cinquenta centavos");
            System.out.println("Custo total: " + custo);
        }catch (NumberFormatException e){
            System.out.println("Numero inválido para conversão");
        }

    }
}
