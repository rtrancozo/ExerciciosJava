package exercicioFibonacci;

public class MatematicaUtil {

    public static final double PI=3.14;



    public static double calcularAreaCirculo(double raio){
        double area = PI*(raio*raio);
        return area;
    }





    public static int calcularFibonacci(int posicao) {
        if (posicao < 2) {
            return posicao;
        }
        return calcularFibonacci(posicao - 1) + calcularFibonacci(posicao - 2);
    }


}
