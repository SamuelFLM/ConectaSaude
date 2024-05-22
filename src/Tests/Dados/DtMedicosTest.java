package Tests.Dados;

import Main.Dados.DtMedicos;
import Main.Modelos.Medico;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DtMedicosTest {

    @Test
    public void testCarregarDadosMedicos() {
        DtMedicos dtMedicos = new DtMedicos();
        ArrayList<Medico> medicos = dtMedicos.CarregarDadosMedicos();

        Assert.assertFalse(medicos.isEmpty());
    }

    @Test
    public void testNomesMedicos() {
        DtMedicos dtMedicos = new DtMedicos();
        ArrayList<Medico> medicos = dtMedicos.CarregarDadosMedicos();

        List<String> nomesEsperados = Arrays.asList(
                "José", "Ana", "Carlos", "Mariana", "Rafael",
                "Isabel", "Pedro", "Lúcia", "Fernando", "Camila"
        );

        for (int i = 0; i < medicos.size(); i++) {
            Assert.assertEquals(nomesEsperados.get(i), medicos.get(i).getNome());
        }
    }

    @Test
    public void testEspecialidadesMedicos() {
        DtMedicos dtMedicos = new DtMedicos();
        ArrayList<Medico> medicos = dtMedicos.CarregarDadosMedicos();

        List<String> especialidadesEsperadas = Arrays.asList(
                "Urologista", "Cardiologista", "Dermatologista",
                "Ginecologista", "Ortopedista", "Neurologista",
                "Oftalmologista", "Psiquiatra", "Endocrinologista", "Pneumologista"
        );

        for (int i = 0; i < medicos.size(); i++) {
            Assert.assertEquals(especialidadesEsperadas.get(i), medicos.get(i).getEspecialidade());
        }
    }


}
