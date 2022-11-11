package calculo_imc;

public class imc {



    public static Double calculoIMC(Double peso, Double altura){
        Double valorimc = peso/altura;
        return valorimc;
    }

    public static void abaixoPeso(Paciente paciente){

        System.out.println("O imc de "+ " é de "+paciente.valorimc+" e esta abaixo do peso ideal");
    }
    public static void pesoNormal(Paciente paciente){

        System.out.println("O imc de "+ paciente.nome+" é de "+paciente.valorimc + " e esta no peso ideal");
    }
    public static void sobrepeso(Paciente paciente){

        System.out.println("O imc de "+ paciente.nome+" é de "+paciente.valorimc+" e esta com sobrepeso");
    }
    public static void obesidadeGrau1(Paciente paciente){

        System.out.println("O imc de "+ paciente.nome+" é de "+paciente.valorimc+" e esta com obesidade grau 1");
    }
    public static void obesidadeGrau2(Paciente paciente){

        System.out.println("O imc de "+ paciente.nome+" é de "+paciente.valorimc+" e esta com obesidade grau 2");
    }
    public static void obesidadeGrau3(Paciente paciente){

        System.out.println("O imc de "+ paciente.nome+" é de "+paciente.valorimc+" e esta com obesidade grau 3");
    }


}
