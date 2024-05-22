package Tests.Modelos;

import Main.Modelos.Cadastro;
import org.junit.Assert;
import org.junit.Test;

public class CadastroTest {

    private Cadastro cadastro;

    public CadastroTest() {

    }

    @Test
    public void VerificaSeEstaCadastrandoCorretamente(){

        this.cadastro =  new Cadastro("ana", "anaT@gmail.com", "2121", 21, "00056789");

        Assert.assertEquals("ana", this.cadastro.getNome());

    }

    @Test
    public void VerificaSeEmailEhValido() {
        this.cadastro = new Cadastro("Maria", "maria@email.com", "senha123", 30, "12345678901");
        Assert.assertEquals("maria@email.com", this.cadastro.getEmail());
    }


    @Test
    public void VerificaIdadeMinima() {
        this.cadastro = new Cadastro("Pedro", "pedro@email.com", "outraSenha123", 17, "76543210987");
        Assert.assertFalse(this.cadastro.verificarMaioridade());
    }


    @Test
    public void VerificaSeNumeroDoSeguroEhValido() {
        this.cadastro = new Cadastro("Ana", "ana@email.com", "senha456", 28, "12345678909");
        Assert.assertEquals("12345678909", this.cadastro.getNumeroDoSeguro());
    }

}
