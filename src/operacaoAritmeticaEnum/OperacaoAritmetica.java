package operacaoAritmeticaEnum;

public enum OperacaoAritmetica {
    ADICAO {
        public double operacao(double x, double y){
            return x+y;
        }
    },
    SUBSTRACAO{

        public double operacao(double x, double y){
            return x-y;
        }
    };
    public abstract double operacao(double x, double y);



}
