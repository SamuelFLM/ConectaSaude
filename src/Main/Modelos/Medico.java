package Main.Modelos;
import java.util.UUID;

public class Medico {


    public Medico(String nome, String especialidade) {
        Id = UUID.randomUUID();
        Nome = nome;
        Especialidade = especialidade;
    }

    public void Exibir(){
        System.out.println("Id: " + Id);
        System.out.println("Nome: " + Nome);
        System.out.println("Especialidade: " + Especialidade);
    }

    public UUID getId() {
        return Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEspecialidade() {
        return Especialidade;
    }

    public void setEspecialidade(String especialidade) {
        Especialidade = especialidade;
    }

    private UUID Id;
    private String Nome;
    private String Especialidade;
}
