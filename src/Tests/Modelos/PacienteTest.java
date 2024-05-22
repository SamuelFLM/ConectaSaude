package Tests.Modelos;

import Main.Modelos.Cadastro;
import Main.Modelos.Medico;
import Main.Modelos.Paciente;
import Main.Modelos.Consulta;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PacienteTest {

    @Test
    public void testExibirPaciente() {
        Cadastro usuario = new Cadastro("Ana", "ana@email.com", "senha123", 30, "12345678901");
        Paciente paciente = new Paciente(usuario);

        // Redirecione a saída padrão para capturar a impressão
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        paciente.Exibir();

        String output = outputStream.toString();
        Assert.assertTrue(output.contains("Nome: Ana"));
        Assert.assertTrue(output.contains("Número Seguro: 12345678901"));
    }

    @Test
    public void testAgendarConsulta() {
        Cadastro usuario = new Cadastro("João", "joao@email.com", "senha456", 25, "98765432109");
        Paciente paciente = new Paciente(usuario);

        Medico medico = new Medico("Rafael", "Oftamologista");
        Consulta consulta = new Consulta("01/02/2024", medico);
        paciente.AgendarConsulta(consulta);

        ArrayList<Consulta> consultas = paciente.getConsultas();
        Assert.assertTrue(consultas.contains(consulta));
    }


    @Test
    public void testEditarConsulta() {
        Cadastro usuario = new Cadastro("João", "joao@email.com", "senha456", 25, "98765432109");
        Paciente paciente = new Paciente(usuario);

        Medico medico = new Medico("Rafael", "Oftamologista");
        Consulta consulta = new Consulta("01/02/2024", medico);
        paciente.AgendarConsulta(consulta);

        int idConsulta = 0; // Índice da consulta a ser editada
        String novaDataAgendamento = "2024-06-01 10:00"; // Nova data de agendamento

        paciente.EditarConsulta(idConsulta, novaDataAgendamento);

        Consulta consultaEditada = paciente.getConsultas().get(idConsulta);
        Assert.assertEquals(novaDataAgendamento, consultaEditada.getAgendamento());
    }

    @Test
    public void testCancelarConsulta() {
        Cadastro usuario = new Cadastro("João", "joao@email.com", "senha456", 25, "98765432109");
        Paciente paciente = new Paciente(usuario);

        Medico medico = new Medico("Rafael", "Oftamologista");
        Consulta consulta = new Consulta("01/02/2024", medico);
        paciente.AgendarConsulta(consulta);

        int idConsulta = 0; // Índice da consulta a ser cancelada

        paciente.CancelarConsulta(idConsulta);

        ArrayList<Consulta> consultas = paciente.getConsultas();
        Assert.assertFalse(consultas.contains(idConsulta));
    }

}
