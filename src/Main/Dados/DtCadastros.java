package Main.Dados;
import Main.Modelos.Cadastro;
import java.util.ArrayList;

public class DtCadastros {


    public DtCadastros(){
        Cadastros = new ArrayList<>();

        Cadastros.add(new Cadastro("Pedro Henrique Silva Santos", "pedrohsilva@gmail.com", "987654", 28, "000005432"));
        Cadastros.add(new Cadastro("Maria Fernanda Costa Lima", "maria.lima@email.com", "senha123", 35, "000008765"));
        Cadastros.add(new Cadastro("Lucas Oliveira Souza", "lucas.souza@hotmail.com", "456abc", 24, "000012345"));
        Cadastros.add(new Cadastro("Carolina Santos Pereira", "carolina_sp@gmail.com", "789senha", 29, "000015678"));
        Cadastros.add(new Cadastro("Rafaela Almeida Rodrigues", "rafaela.arodrigues@email.com", "rafa123", 22, "000018901"));
        Cadastros.add(new Cadastro("Gustavo Oliveira Lima", "gustavo.lima@gmail.com", "lima456", 27, "000022234"));
        Cadastros.add(new Cadastro("Juliana Pereira Silva", "juliana.ps@gmail.com", "789jps", 31, "000025567"));
        Cadastros.add(new Cadastro("Fernando Costa Alves", "fernando.alves@email.com", "alves789", 30, "000028890"));
        Cadastros.add(new Cadastro("Camila Rodrigues Santos", "camila.rsantos@gmail.com", "senha321", 26, "000032123"));
    }


    public void AdicionarCadastro(Cadastro cadastro){
        Cadastros.add(cadastro);
    }

    public ArrayList<Cadastro> getCadastros(){
        return Cadastros;
    }
    private ArrayList<Cadastro> Cadastros;



}
