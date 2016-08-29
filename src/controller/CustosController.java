package controller;

import dao.CustosDAO;
import model.Carros;
import model.Custos;
import model.CustosCarros;


public class CustosController {

    private CustosDAO dao;

    public CustosController() {
        dao = new CustosDAO();
    }
    public boolean adicionar(float valor_final, float lucro, float valor){
        
        Custos custo = new Custos();
        custo.setValor_final(valor_final);
        custo.setLucro(lucro);
        custo.setValor_total(valor);
        return dao.inset(custo);
    }
    public boolean atualizar(int id, float valor_final, float lucro, float valor){
        Custos custo = new Custos();
        custo.setValor_final(valor_final);
        custo.setLucro(lucro);
        custo.setValor_total(valor);     
        return dao.update(custo);
    }
    public boolean remover(int id){
        Custos custo = new Custos();
        custo.setId(id);
        return dao.excluir(custo);
    }
}
