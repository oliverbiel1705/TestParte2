package br.com.rpires;

import br.com.rpires.dao.IClienteDao;

public class ClienteDao implements IClienteDao {

    public String salvar(){
        throw new UnsupportedOperationException("Nao funciona sem config de banco");
    }
}
