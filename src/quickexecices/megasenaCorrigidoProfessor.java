package quickexecices;

import java.awt.font.FontRenderContext;

public class megasenaCorrigidoProfessor {
    public static final int NUMERO_MAXIMO = 60;
    public static final int QUANTIDADE_NUMEROS = 6;

    private int[] numerosSorteados;

    public void sortear(){
        numerosSorteados = new int[QUANTIDADE_NUMEROS];

        for (int i=1;i<=QUANTIDADE_NUMEROS;i++){
            //gera munero aleatório, arredonda e converte pra inteiro.
            int numerosorteado = (int) Math.round(Math.random()*NUMERO_MAXIMO);

            if (!jafoisorteado(numerosorteado)&&numerosorteado!=0){
                //Adiciona o numero sorteado no array de numeros sorteados.
                numerosSorteados[i-1]=numerosorteado;
            }else{
                //decrementea i para refazer o sorteio na mesma posição
                i--;
            }
        }
    }

    public void exibirNumeros(){
        for (int numeroSorteado : numerosSorteados){
            System.out.println(numeroSorteado+"");
        }
        //Quebra de Linha
        System.out.println();

    }

    private boolean jafoisorteado(int numero){
        boolean resultado = false;
        for (int i = 0; i<this.numerosSorteados.length;i++){
            if (this.numerosSorteados[i]==numero){
                resultado = true;
                break;
            }
        }
        return resultado;
    }


}
