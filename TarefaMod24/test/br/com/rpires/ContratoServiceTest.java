package br.com.rpires;

import br.com.rpires.dao.ContratoDao;
import br.com.rpires.dao.IContratoDao;
import br.com.rpires.mocks.ContratoDaoMock;
import br.com.rpires.service.ContratoService;
import br.com.rpires.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErronosalvarcomBancodeDados() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        service.salvar();
    }

    @Test
    public void excluirTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        service.excluir();
        // No exception means success for this mock test
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNaExcluirComBancoDeDados() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        service.excluir();
    }

    @Test
    public void atualizarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        service.atualizar();
        // No exception means success for this mock test
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNaAtualizarComBancoDeDados() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        service.atualizar();
    }

    @Test
    public void buscarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Mock", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarComBancoDeDados() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        service.buscar();
    }
}
