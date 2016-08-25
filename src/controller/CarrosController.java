package controller;

import dao.CarrosDAO;
import dao.CartaDeCreditoDAO;
import dao.CorDAO;
import java.util.List;
import model.Carros;
import model.CartasDeCreditos;
import model.Cores;

public class CarrosController {

    private CarrosDAO dao;

    public CarrosController() {
        dao = new CarrosDAO();
    }
    public boolean adicionar(String renavam, String chassi, int ano_fabricacao, int ano_modelo, String modelo, String motorizacao, String placa, Cores cor, String observacao){
        Cores c = new Cores();
        CorDAO cdao = new CorDAO();
        Carros carro = new Carros();
        carro.setRenavam(renavam.toUpperCase());
        carro.setChassi(chassi.toUpperCase());
        carro.setAno_fabricacao(ano_fabricacao);
        carro.setAno_modelo(ano_modelo);
        carro.setModelo(modelo.toUpperCase());
        carro.setMotorizacao(motorizacao);
        carro.setPlaca(placa.toUpperCase());
        carro.setObeservacoes(observacao);
        carro.setCor(c);
        System.out.println(carro.toString());
        return dao.inset(carro);
    }
     public boolean remover(int id){
        Carros carro = new Carros();
        carro.setId(id);
        return dao.delete(carro);
    }
     public List<Carros> listar(String filter){
        if(filter == null){
        return dao.selectALL();
        }else{
            return dao.selectFilter(filter);
        }
        
    }
     public boolean atualizar(int id, String renavam, int ano_fabricacao, int ano_modelo, String chassi, String motorizacao, String observacao, String modelo ){
    Carros carro = new Carros();
    CartasDeCreditos cartas  = new CartasDeCreditos();
    CartaDeCreditoDAO cdao = new CartaDeCreditoDAO();
        carro.setId(id);
        carro.setRenavam(renavam.toUpperCase());
        carro.setAno_fabricacao(ano_fabricacao);
        carro.setAno_modelo(ano_modelo);
        carro.setChassi(chassi.toUpperCase());
        carro.setMotorizacao(motorizacao);
        carro.setObeservacoes(observacao);
        carro.setModelo(modelo.toUpperCase());
                
        return dao.update(carro);
    }

   
     
    
}
