package Main.Modelos;

import java.util.UUID;

public class Cadastro {


    public Cadastro(String nome, String email, String senha, int idade, String numeroDoSeguro) {
        Id = UUID.randomUUID();
        Nome = nome;
        Email = email;
        Senha = senha;
        Idade = idade;
        NumeroDoSeguro = numeroDoSeguro;
    }

    public boolean verificarMaioridade(){
        if (Idade >= 18){
            return true;
        }
        else{
            return false;
        }
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
    public UUID getId(){
        return Id;
    }
    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public String getNumeroDoSeguro() {
        return NumeroDoSeguro;
    }

    public void setNumeroDoSeguro(String numeroDoSeguro) {
        NumeroDoSeguro = numeroDoSeguro;
    }

    private UUID Id;
    private String Nome;
    private String Email;
    private String Senha;
    private int Idade;
    private String NumeroDoSeguro;


}
