package br.com.rpires.service;

import br.com.rpires.dao.IContratoDao;

public class ContratoService implements IContratoService{

    private IContratoDao contratoDao;



    public ContratoService(IContratoDao dao) {
        this.contratoDao= dao
                ;

    }

    @Override
    public String salvar(){
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public void excluir() {
        contratoDao.excluir();
    }

    @Override
    public void atualizar() {
        contratoDao.atualizar();
    }

    @Override
    public String buscar() {
        return contratoDao.buscar();
    }
}
