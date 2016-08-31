package controller;

import dao.CustosDAO;
import java.util.List;
import model.Carros;

import model.Custos;



public class CustosController {

    private CustosDAO dao;

    public CustosController() {
        dao = new CustosDAO();
    }
    public boolean adicionar(String descricao, float valor){
        
        Custos custo = new Custos();
        custo.setDescrissao(descricao);
        custo.setValor(valor);
        return dao.inset(custo);
    }
    public boolean atualizar(int id, String descricao, float valor){
        Custos custo = new Custos();
        custo.setId(id);
        custo.setDescrissao(descricao);
        custo.setValor(valor);
        return dao.update(custo);
    }
    public boolean remover(int id){
        Custos custo = new Custos();
        custo.setId(id);
        return dao.excluir(custo);
    }
    public List<Custos> listar(int filter){
        
        
            return dao.selectFilter(filter);
        
        
    }
}
