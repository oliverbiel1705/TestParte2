package br.com.rpires.mocks;

import br.com.rpires.dao.IContratoDao;

public class ContratoDaoMock implements IContratoDao
{
    @Override
    public void salvar() {

    }

    @Override
    public void excluir() {
        // Mock implementation does nothing
    }

    @Override
    public void atualizar() {
        // Mock implementation does nothing
    }

    @Override
    public String buscar() {
        return "Mock";
    }
}
