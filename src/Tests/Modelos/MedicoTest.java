package Tests.Modelos;

import Main.Modelos.Medico;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MedicoTest {


    @Test
    public void testExibirMedico() {
        Medico medico = new Medico("Dr. João", "Cardiologia");

        // Redirecione a saída padrão para capturar a impressão
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        medico.Exibir();

        String output = outputStream.toString();
        Assert.assertTrue(output.contains("Id:")); // Verifique se o ID é exibido
        Assert.assertTrue(output.contains("Nome: Dr. João"));
        Assert.assertTrue(output.contains("Especialidade: Cardiologia"));
    }

    @Test
    public void testIdUnico() {
        Medico medico1 = new Medico("Dr. Ana", "Dermatologia");
        Medico medico2 = new Medico("Dr. Pedro", "Ortopedia");

        Assert.assertNotEquals(medico1.getId(), medico2.getId());
    }

    @Test
    public void testAlterarNome() {
        Medico medico = new Medico("Dr. Maria", "Pediatria");
        medico.setNome("Dra. Maria Silva");

        Assert.assertEquals("Dra. Maria Silva", medico.getNome());
    }

    @Test
    public void testAlterarEspecialidade() {
        Medico medico = new Medico("Dr. Carlos", "Neurologia");
        medico.setEspecialidade("Psiquiatria");

        Assert.assertEquals("Psiquiatria", medico.getEspecialidade());
    }



}
