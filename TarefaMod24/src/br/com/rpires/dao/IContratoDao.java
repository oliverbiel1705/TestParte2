package br.com.rpires.dao;

public interface IContratoDao {
    void salvar();
    void excluir();
    void atualizar();
    String buscar();
}
