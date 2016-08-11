package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Clientes;

public class ClienteDAO {

     private final DataBase db;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;
    
    public ClienteDAO(){
    db = new DataBase();
    }
    public boolean inset(Clientes cliente){
        if(db.open()){
            sql = "INSERT INTO tb_clientes(cli_nome, cli_cpf, cli_agencia, cli_conta, cli_apr_id)VALUES(?,?,?,?,?)";
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setString(1, cliente.getNome());
                ps.setString(2, cliente.getCpf());
                ps.setString(3, cliente.getAgencia());
                ps.setString(4, cliente.getConta());
                ps.setInt(5, cliente.getAprovacao().getId());                
                if(ps.executeUpdate() == 1){
                    ps.close();
                    db.close();
                    return true;
                }
            }catch(SQLException error){
                System.out.println("ERROR: " + error.toString());
            }
        }       
        db.close();
        return false;
    }
    public boolean delete(Clientes cliente){
        if(db.open()){
        sql = "DELETE FROM tb_clientes WHERE cli_id = ?";
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setInt(1, cliente.getId());
                if(ps.executeUpdate() == 1){
                ps.close();
                db.close();
                return true;
                }
            }catch(SQLException error){
                System.out.println("ERROR: " + error.toString());
            }       
        }
        db.close();
        return false;        
    }
    public boolean update(Clientes cliente){
        if(db.open()){
        sql = "UPDATE tb_clientes SET cli_nome = ?, cli_agencia = ?,cli_conta = ?, cli_apr_id = ?  WHERE cli_id =?";
            try{
            ps = db.connerction.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getAgencia());
            ps.setString(3, cliente.getConta());
            ps.setInt(4, cliente.getAprovacao().getId());            
            if(ps.executeUpdate() == 1){
            ps.close();
            db.close();
            return true;
            }            
            }catch(SQLException error){
                System.out.println("ERROR: " + error.toString());
            }        
        }
        db.close();
        return false;
        
    }
    
}
