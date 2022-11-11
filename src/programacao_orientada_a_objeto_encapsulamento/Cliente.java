package programacao_orientada_a_objeto_encapsulamento;

public class Cliente {
    String nome;

    public String getNome() {
        return fistName+" "+lastName;
    }

    public void setNome(String nome) {
        String[] nomeCompleto = nome.split(" ");
        fistName = nomeCompleto[0];
        lastName = nomeCompleto[1];
        this.nome = nome;
    }

    String fistName;
    String lastName;
    String tell;

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }
}
