package controller;

import dao.AprovacaoDAO;
import dao.ClienteDAO;
import dao.CustoCarrosDAO;
import java.util.List;
import model.Aprovacao;
import model.Clientes;
import model.CustosCarros;

public class ClienteController {

     private ClienteDAO dao;

    public ClienteController() {
        dao = new ClienteDAO();
    }
     public boolean adicionar(String nome, String cpf, String agencia, String conta, String aprovacao){
        AprovacaoDAO apr = new AprovacaoDAO();
        Aprovacao ap = new Aprovacao();
        Clientes cli = new Clientes();
        cli.setNome(nome.toUpperCase());
        cli.setCpf(cpf);
        cli.setAgencia(agencia);
        cli.setConta(conta);
        cli.setAprovacao(ap);
        return dao.inset(cli);
    }
     public boolean remover(int id){
        Clientes cli = new Clientes();
        cli.setId(id);
        return dao.delete(cli);
    }
      public List<Clientes> listar(String filter){
        if(filter == null){
        return dao.selectALL();
        }else{
            return dao.selectFilter(filter);
        }        
    }
       public boolean atualizar(int id, String nome, String agencia, String conta, String aprovacao){
        Clientes cli = new Clientes();
        AprovacaoDAO daos = new AprovacaoDAO();
        Aprovacao apr = new Aprovacao();
        cli.setId(id);
        cli.setNome(nome.toUpperCase());
        cli.setAgencia(agencia);
        cli.setConta(conta);
        cli.setAprovacao(apr);
        return dao.update(cli);
    }
}
