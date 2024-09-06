package br.com.rpires.service;

import br.com.rpires.ClienteDao;
import br.com.rpires.dao.IClienteDao;

public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao){
        this.clienteDao = clienteDao;
    }
    public String salvar(){
        clienteDao.salvar();
        return "Sucesso";
    }
}
