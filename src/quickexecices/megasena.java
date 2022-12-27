package quickexecices;

import java.util.ArrayList;

public class megasena {
    public static void main(String[] args) {
         double [] jogo1 = new double[6];
         double [] jogo2 = new double[6];
         double [] jogo3 = new double[6];
         double [] jogo4 = new double[6];
         double [] jogo5 = new double[6];
         double [] jogo6 = new double[6];
         double [] verificadores = new double[36];
         int cont = 0;



        for (int i = 0; i<jogo1.length;i++){
            double numero = Math.random()*100;
            numero = Math.ceil(numero);
            double verificador = numero;
            for (int j = 0; j<verificadores.length; j++){
                if (verificador==verificadores[j]){
                    //return;
                }else {
                    jogo1[i]=numero;
                }

            }
            verificadores[cont]=verificador;
            cont++;
        }
        for (int i = 0; i<jogo2.length;i++){
            double numero = Math.random()*100;
            numero = Math.ceil(numero);
            double verificador = numero;
            for (int j = 0; j<verificadores.length; j++){
                if (verificador==verificadores[j]){
                    //return;
                }else {
                    jogo1[i]=numero;
                }

            }
            verificadores[cont]=verificador;
            cont++;
        }
        for (int i = 0; i<jogo3.length;i++){
            double numero = Math.random()*100;
            numero = Math.ceil(numero);
            double verificador = numero;
            for (int j = 0; j<verificadores.length; j++){
                if (verificador==verificadores[j]){
                    //return;
                }else {
                    jogo1[i]=numero;
                }

            }
            verificadores[cont]=verificador;
            cont++;
        }
        for (int i = 0; i<jogo4.length;i++){
            double numero = Math.random()*100;
            numero = Math.ceil(numero);
            double verificador = numero;
            for (int j = 0; j<verificadores.length; j++){
                if (verificador==verificadores[j]){
                    //return;
                }else {
                    jogo1[i]=numero;
                }

            }
            verificadores[cont]=verificador;
            cont++;
        }
        for (int i = 0; i<jogo5.length;i++){
            double numero = Math.random()*100;
            numero = Math.ceil(numero);
            double verificador = numero;
            for (int j = 0; j<verificadores.length; j++){
                if (verificador==verificadores[j]){
                    //return;
                }else {
                    jogo1[i]=numero;
                }

            }
            verificadores[cont]=verificador;
            cont++;
        }
        for (int i = 0; i<jogo6.length;i++){
            double numero = Math.random()*100;
            numero = Math.ceil(numero);
            double verificador = numero;
            for (int j = 0; j<verificadores.length; j++){
                if (verificador==verificadores[j]){
                    //return;
                }else {
                    jogo1[i]=numero;
                }

            }
            verificadores[cont]=verificador;
            cont++;
        }

        for (int i = 0; i<=5;i++){
            System.out.println(jogo1[i]+","+jogo1[i+1]+","+jogo1[i+2]+","+jogo1[i+3]+","+jogo1[i+4]+","+jogo1[i+5]+","+jogo1[i+6]+".");
            System.out.println(jogo2[i]+","+jogo2[i+1]+","+jogo2[i+2]+","+jogo2[i+3]+","+jogo2[i+4]+","+jogo2[i+5]+","+jogo2[i+6]+".");
            System.out.println(jogo3[i]+","+jogo3[i+1]+","+jogo3[i+2]+","+jogo3[i+3]+","+jogo3[i+4]+","+jogo3[i+5]+","+jogo3[i+6]+".");
            System.out.println(jogo4[i]+","+jogo4[i+1]+","+jogo4[i+2]+","+jogo4[i+3]+","+jogo4[i+4]+","+jogo4[i+5]+","+jogo4[i+6]+".");
            System.out.println(jogo5[i]+","+jogo5[i+1]+","+jogo5[i+2]+","+jogo5[i+3]+","+jogo5[i+4]+","+jogo5[i+5]+","+jogo5[i+6]+".");
            System.out.println(jogo6[i]+","+jogo6[i+1]+","+jogo6[i+2]+","+jogo6[i+3]+","+jogo6[i+4]+","+jogo6[i+5]+","+jogo6[i+6]+".");
        }








    }
}
