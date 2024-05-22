package Tests.Modelos;

import Main.Modelos.Cadastro;
import Main.Modelos.Login;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class LoginTest {

    @Test
    public void testLoginValido() {
        ArrayList<Cadastro> cadastros = new ArrayList<>();

        cadastros.add(new Cadastro("ana", "ana@email.com", "senha123", 20, "4445544452"));

        Login login = new Login(cadastros);

        Cadastro usuarioLogado = login.validarLogin("ana@email.com", "senha123");

        Assert.assertNotNull(usuarioLogado);
    }

    @Test
    public void testLoginInvalido() {
        ArrayList<Cadastro> cadastros = new ArrayList<>();

        Login login = new Login(cadastros);
        Cadastro usuarioLogado = login.validarLogin("email_invalido", "senha_incorreta");

        Assert.assertNull(usuarioLogado);
    }


}
