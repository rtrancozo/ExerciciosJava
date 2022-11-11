package calculo_imc;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Paciente paciente = new Paciente();

        System.out.println("Digite o nome do paciente: ");
        paciente.nome = entrada.nextLine();
        System.out.println("Digite 1 para Masculino ou 2 para Feminino: ");
        paciente.sexo = entrada.nextInt();
        System.out.println("Digite a idade do paciente: ");
        paciente.idade = entrada.nextDouble();
        System.out.println("Digite o peso do paciente: ");
        paciente.peso = entrada.nextDouble();
        System.out.println("Digite a altura do paciente: ");
        paciente.altura = entrada.nextDouble();
        paciente.valorimc = imc.calculoIMC(paciente.peso,paciente.altura);

        if(paciente.valorimc<18.5){
            imc.abaixoPeso(paciente);
        } else if (paciente.valorimc<24.9) {
            imc.pesoNormal(paciente);
        }else if (paciente.valorimc<29.9) {
            imc.sobrepeso(paciente);
        }else if (paciente.valorimc<34.9) {
            imc.obesidadeGrau1(paciente);
        }else if (paciente.valorimc<39.9) {
            imc.obesidadeGrau2(paciente);
        }else{
            imc.obesidadeGrau3(paciente);
        }




    }
}
