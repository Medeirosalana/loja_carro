package controller;

import dao.CartaDeCreditoDAO;
import dao.CustoDAO;
import java.util.List;
import model.CartasDeCreditos;
import model.Custos;

public class CustoController {

    private CustoDAO dao;

    public CustoController() {
        dao = new CustoDAO();
    }
     public boolean adicionar(String nome, int valor){
        
        Custos custo = new Custos();
        custo.setNome(nome.toUpperCase());
        custo.setValor(valor);        
        return dao.inset(custo);
    }
     public boolean remover(int id){
        Custos custo = new Custos();
        custo.setId(id);
        return dao.excluir(custo);
    }
      public List<Custos> listar(String filter){
        if(filter == null){
        return dao.selectAll();
        }else{
            return dao.selectFilter(filter);
        }        
    }
       public boolean atualizar(int id, String nome, int valor){
        Custos custo = new Custos();    
        custo.setId(id);
        custo.setNome(nome.toUpperCase());
        custo.setValor(valor);        
        return dao.editar(custo);
    }
}
