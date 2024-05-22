package Tests.Modelos;

import Main.Modelos.Consulta;
import Main.Modelos.Medico;
import org.junit.Assert;
import org.junit.Test;

public class ConsultaTest {


    @Test
    public void testGetAgendamento() {
        Medico medico = new Medico("Dr. Carlos", "Cardiologia");
        Consulta consulta = new Consulta("2024-06-01 10:00", medico);

        String agendamento = consulta.getAgendamento();
        Assert.assertEquals("2024-06-01 10:00", agendamento);
    }

    @Test
    public void testSetAgendamento() {
        Medico medico = new Medico("Dra. Ana", "Dermatologia");
        Consulta consulta = new Consulta("2024-06-01 14:30", medico);

        consulta.setAgendamento("2024-06-02 09:00");
        String novoAgendamento = consulta.getAgendamento();

        Assert.assertEquals("2024-06-02 09:00", novoAgendamento);
    }

    @Test
    public void testGetDataEHora() {
        Medico medico = new Medico("Dr. João", "Ortopedia");
        Consulta consulta = new Consulta("2024-06-03 15:00", medico);

        String data = consulta.getData();
        String hora = consulta.getHora();

        Assert.assertFalse("03/06/2024" == data);
        Assert.assertFalse("15:00:00" ==  hora);
    }

    @Test
    public void testGetMedico() {
        Medico medico = new Medico("Dra. Maria", "Ginecologia");
        Consulta consulta = new Consulta("2024-06-04 11:30", medico);

        Medico medicoAssociado = consulta.getMedico();
        Assert.assertEquals("Dra. Maria", medicoAssociado.getNome());
        Assert.assertEquals("Ginecologia", medicoAssociado.getEspecialidade());
    }


}
