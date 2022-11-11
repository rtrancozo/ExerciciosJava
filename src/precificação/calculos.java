package precificação;

public class calculos {

public static Double aliquotaImposto(double aliquota){
    aliquota = aliquota/100;

    return aliquota;
}

public static Double lucroDesejado(double lucro){
    lucro = lucro/100;
    double margem =  1-lucro;

    return margem;
}

public static Double custobruto(double aliquota, double custo){

    double custoBruto = (custo*aliquota)+custo;
    return custoBruto;
}

public static Double precoFinal(double custoBruto, double margem){
    double precoFinal = custoBruto/margem;
    return precoFinal;
}



}
