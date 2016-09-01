package controller;

import dao.AprovacaoDAO;
import dao.ClienteDAO;

import java.util.List;
import model.Aprovacao;
import model.Clientes;


public class ClienteController {

     private ClienteDAO dao;

    public ClienteController() {
        dao = new ClienteDAO();
    }
     public boolean adicionar(String nome, String cpf, String agencia, String conta, Aprovacao aprovacao){
        AprovacaoDAO apr = new AprovacaoDAO();
        Aprovacao ap = new Aprovacao();
        Clientes cli = new Clientes();
        cli.setNome(nome.toUpperCase());
        cli.setCpf(cpf);
        cli.setAgencia(agencia);
        cli.setConta(conta);
        cli.setAprovacao(aprovacao);
         System.out.println(cli.toString());
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
       public boolean atualizar(int id, String nome, String agencia, String conta, Aprovacao aprovacao){
        Clientes cli = new Clientes();
        AprovacaoDAO daos = new AprovacaoDAO();
        Aprovacao apr = new Aprovacao();
        cli.setId(id);
        cli.setNome(nome.toUpperCase());
        cli.setAgencia(agencia);
        cli.setConta(conta);
        cli.setAprovacao(aprovacao);
           System.out.println(cli.toString());
        return dao.update(cli);
    }
}
