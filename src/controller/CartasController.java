package controller;

import dao.CartaDeCreditoDAO;
import dao.CorDAO;
import java.util.List;
import model.Carros;
import model.CartasDeCreditos;
import model.Cores;

public class CartasController {

    private CartaDeCreditoDAO dao;

    public CartasController() {
        dao = new CartaDeCreditoDAO();
    }
     public boolean adicionar(String cota, String grupo, float proposta, int prazo, float parcela, float valor_inicial, float valor_final){
        
        CartasDeCreditos carta = new CartasDeCreditos();
        carta.setCota(cota);
        carta.setGrupo(grupo);
        carta.setProposta(proposta);
        carta.setPrazo(prazo);
        carta.setParcela(parcela);
        carta.setValor_inicial(valor_inicial);
        carta.setValor_final(valor_final);
        
        
        return dao.inset(carta);
    }
     public boolean remover(int id){
        CartasDeCreditos cartas = new CartasDeCreditos();
        cartas.setId(id);
        return dao.delete(cartas);
    }
     public List<CartasDeCreditos> listar(String filter){
        if(filter == null){
        return dao.selectALL();
        }else{
            return dao.selectFilter(filter);
        }
        
    }
     public boolean atualizar(int id, String cota, String grupo, float proposta, int prazo, float valor_final, float valor_inicial, float parcela){
    CartasDeCreditos carta = new CartasDeCreditos();    
        carta.setId(id);
        carta.setCota(cota);
        carta.setGrupo(grupo);
        carta.setProposta(proposta);
        carta.setPrazo(prazo);
        carta.setValor_final(valor_final);
        carta.setValor_inicial(valor_inicial);  
        carta.setParcela(parcela);
         System.out.println(carta.toString());
        return dao.update(carta);
    }
    
    
}
