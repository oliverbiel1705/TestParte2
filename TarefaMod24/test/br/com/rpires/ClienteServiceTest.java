package br.com.rpires;

import br.com.rpires.dao.ClienteDaoMock;
import br.com.rpires.dao.IClienteDao;
import br.com.rpires.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {

   @Test
   public void salvarTest(){
       IClienteDao mockDao = new ClienteDaoMock();
       ClienteService service = new ClienteService(mockDao);
       String retorno = service.salvar();
       Assert.assertEquals("Sucesso",retorno);
   }

   @Test
   public void esperadoErronoSalvarTest(){
       IClienteDao mockDao = new ClienteDaoMock();
       ClienteService service = new ClienteService(mockDao);
       String retorno = service.salvar();
       Assert.assertEquals("Sucesso",retorno);
   }
}
