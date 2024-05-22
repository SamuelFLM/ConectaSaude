package Tests.Dados;

import Main.Dados.DtCadastros;
import Main.Modelos.Cadastro;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class DtCadastrosTest {


    @Test
    public void testCarregarDadosCadastros() {
        DtCadastros dtCadastros = new DtCadastros();
        ArrayList<Cadastro> cadastros = dtCadastros.getCadastros();

        Assert.assertFalse(cadastros.isEmpty());
    }


    @Test
    public void testAdicionarCadastro() {
        DtCadastros dtCadastros = new DtCadastros();
        ArrayList<Cadastro> cadastros = dtCadastros.getCadastros();

        Cadastro novoCadastro = new Cadastro("João Silva", "joao@email.com", "senha456", 25, "000035678");
        dtCadastros.AdicionarCadastro(novoCadastro);

        Assert.assertTrue(cadastros.contains(novoCadastro));
    }


    @Test
    public void testDadosCadastros() {
        DtCadastros dtCadastros = new DtCadastros();
        ArrayList<Cadastro> cadastros = dtCadastros.getCadastros();

        Assert.assertEquals("Pedro Henrique Silva Santos", cadastros.get(0).getNome());
        Assert.assertEquals("maria.lima@email.com", cadastros.get(1).getEmail());
    }

}
