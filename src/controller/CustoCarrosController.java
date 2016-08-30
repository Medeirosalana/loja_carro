package controller;

import dao.CarrosDAO;
import dao.CartaDeCreditoDAO;
import dao.CustoCarrosDAO;
import java.util.List;
import model.Carros;
import model.CartasDeCreditos;
import model.CustosCarros;

public class CustoCarrosController {

    private CustoCarrosDAO dao;

    public CustoCarrosController() {
        dao = new CustoCarrosDAO();
    }
     public boolean adicionar(String nome, float valor){
        
        CustosCarros custo = new CustosCarros();
        custo.setNome(nome.toUpperCase());
        custo.setValor(valor);  
         System.out.println(custo.toString());
        return dao.inset(custo);
    }
     public boolean remover(String nome){
        CustosCarros custo = new CustosCarros();
        custo.setNome(nome);
        return dao.excluir(custo);
    }
      public List<CustosCarros> listar(String filter){
        if(filter == null){
        return dao.selectAll();
        }else{
            return dao.selectFilter(filter);
        }        
    }
       public boolean atualizar(int id, String nome, float valor){
        CustosCarros custo = new CustosCarros();  
       
        custo.setId(id);
        custo.setNome(nome.toUpperCase());
        custo.setValor(valor);        
        return dao.editar(custo);
    }
}
