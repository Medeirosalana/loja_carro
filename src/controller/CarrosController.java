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
       Carros carro = new Carros();
        
        carro.setRenavam(renavam);
        carro.setChassi(chassi);
        carro.setAno_fabricacao(ano_fabricacao);
        carro.setAno_modelo(ano_modelo);
        carro.setModelo(modelo);
        carro.setMotorizacao(motorizacao);
        carro.setPlaca(placa.toUpperCase());
        carro.setObeservacoes(observacao);       
        carro.setCor(cor);
        
        return dao.inset(carro);
        
    }
     public boolean remover(String placa){
        Carros carro = new Carros();
        carro.setPlaca(placa);
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
    
        carro.setId(id);
        carro.setRenavam(renavam);
        carro.setAno_fabricacao(ano_fabricacao);
        carro.setAno_modelo(ano_modelo);
        carro.setChassi(chassi);
        carro.setMotorizacao(motorizacao);
        carro.setObeservacoes(observacao);
        carro.setModelo(modelo);        
//         System.out.println(carro.toString());       
        return dao.update(carro);
         
    }

   
     
    
}
