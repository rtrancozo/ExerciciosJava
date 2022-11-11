package exercicio_classe_instancia;

public class petshop {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();
        cachorro1.setNome("Elvis");
        cachorro1.setRaca("Yorkshire");
        cachorro1.setSexo("M");
        cachorro1.setIdade(5);

        Cachorro cachorro2 = new Cachorro();
        cachorro2.setNome("Simon");
        cachorro2.setRaca("Shitzu");
        cachorro2.setSexo("M");
        cachorro2.setIdade(1);


        System.out.println("Nome: "+cachorro1.getNome());
        System.out.println("Raça: "+cachorro1.getRaca());
        System.out.println("Sexo: "+cachorro1.getSexo());
        System.out.println("Idade: "+cachorro1.getIdade());
        System.out.println("\n");
        System.out.println("Nome: "+cachorro2.getNome());
        System.out.println("Raça: "+cachorro2.getRaca());
        System.out.println("Sexo: "+cachorro2.getSexo());
        System.out.println("Idade: "+cachorro2.getIdade());


    }
}
