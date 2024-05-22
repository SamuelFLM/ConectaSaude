package Main;

import Main.Dados.DtCadastros;
import Main.Dados.DtMedicos;
import Main.Modelos.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

       /*
        Carregar informações dos médicos registrados.
       */

        DtMedicos dados = new DtMedicos();
        ArrayList<Medico> medicos = dados.CarregarDadosMedicos();


        /*
        Cadastro e verificação de usuario na plataforma.
         */
        Cadastro usuario = getUsuario();

        if (usuario != null) {

            System.out.println("Bem vindo");
            System.out.println(usuario.getNome());

            /*
            Instanciar dados do paciente.
            */
            Paciente paciente = new Paciente(usuario);


            System.out.println("------------------------------------");
            /*
            Registrando médicos disponiveis.
             */
            Medico medico1 = medicos.get(0);
            Medico medico2 = medicos.get(3);
            Medico medico3 = medicos.get(4);

            /*
            Criando algumas consultas.
            */
            var consulta = new Consulta("01/08/2024", medico1);
            var consulta1 = new Consulta("02/10/2024", medico2);
            var consulta2 = new Consulta("02/10/2024", medico3);



            /*Anexando essas consultas ao paciente.*/

            paciente.AgendarConsulta(consulta);
            paciente.AgendarConsulta(consulta1);
            paciente.AgendarConsulta(consulta2);

            /*
            Exibindo as informações e exibindo o CRUD.
             */

            System.out.println("Todos os dados");
            paciente.Exibir();

            /*
            Para excluir basta passar o Id correspontende ao médico disponivel na lista.
             */
            System.out.println("\nCancelar Consulta Id ( 1 ) - Mariana");
            paciente.CancelarConsulta(1);
            System.out.println("Nova atualização: ");
            paciente.Exibir();

            System.out.println("\nEditar Data de Agendamento do José para 22/05/2024");

            /*
            Para editar basta passar o Id correspontende ao médico disponivel na lista e a nova data de agendamento.
             */
            paciente.EditarConsulta(0, "22/05/2024");
            paciente.Exibir();


        }
        else {
            System.out.println("Usuario não existe ou e-mail e senha incorretos.");
        }
    }


    private static Cadastro getUsuario() {

        /*
        Base de dados dos usuarios cadastrados.
         */
        DtCadastros dtCadastros = new DtCadastros();

        Cadastro cadastroPaciente = new Cadastro("Ana Clara De Jesus Oliveira","ana@gmail.com","123", 21, "000002256");

        dtCadastros.AdicionarCadastro(cadastroPaciente);

        /*
        Login no sistema.
         */
        Login login = new Login(dtCadastros.getCadastros());

        /*
        Pego o input do usuario e verifico se existe na "base de dados" e retorno a resposta.
         */

        return login.validarLogin("ana@gmail.com", "123");
    }
}