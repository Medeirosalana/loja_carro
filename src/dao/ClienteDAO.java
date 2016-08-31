package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Aprovacao;
import model.Carros;
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
            ps.setInt(5, cliente.getId());
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
    public Clientes select(int id){
        if(db.open()){
            Clientes cli = new Clientes();
            sql ="SELECT * FROM tb_clientes WHERE cli_id = ?";
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setInt(1, id);
                rs = ps.executeQuery();
                if(rs.next()){
                AprovacaoDAO dao = new AprovacaoDAO();
                cli.setId(rs.getInt(1));
                cli.setNome(rs.getString(2));
                cli.setAgencia(rs.getString(4));
                cli.setConta(rs.getString(5));
                cli.setAprovacao(dao.select(rs.getInt(6)));
                cli.setCpf(rs.getString(3));
                rs.close();
                ps.close();
                db.close();
                return cli;
                }
            }catch(SQLException error){
             System.out.println("ERROR: " + error.toString());
            }
        }
        db.close();
        return null;
    }
    public List<Clientes> selectFilter(String filter){
     if(db.open()){            
            List<Clientes> clientes = new ArrayList();
            String filtro = "%" + filter + "%";
            sql ="SELECT * FROM tb_clientes WHERE cli_nome LIKE ? OR cli_aprovacao LIKE ?";            
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setString(1, filtro);
                ps.setString(2, filtro);
                rs = ps.executeQuery();
                while(rs.next()){
                Clientes cli = new Clientes();
                 AprovacaoDAO daos = new AprovacaoDAO();
                
                cli.setId(rs.getInt(1));
                cli.setNome(rs.getString(2));
                cli.setCpf(rs.getString(3));
                cli.setAgencia(rs.getString(4));
                cli.setConta(rs.getString(5));
                cli.setAprovacao(daos.select(rs.getInt(6)));                
                clientes.add(cli);
                }
                rs.close();
                ps.close();
                db.close();
                return clientes;
            }catch(SQLException error){
             System.out.println("ERROR: " + error.toString());
            }
        }
        db.close();
        return null;        
    }
     public List<Clientes> selectALL(){
        if(db.open()){            
            List<Clientes> clientes = new ArrayList();
            
            sql ="SELECT * FROM tb_clientes";
            try{
                ps = db.connerction.prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                Clientes cli = new Clientes();
                AprovacaoDAO apr = new AprovacaoDAO();
                cli.setId(rs.getInt(1));
                cli.setNome(rs.getString(2));
                cli.setCpf(rs.getString(6));
                cli.setAgencia(rs.getString(3));
                cli.setConta(rs.getString(4));
                cli.setAprovacao(apr.select(rs.getInt(5)));                
                clientes.add(cli);
                }
                rs.close();
                ps.close();
                db.close();
                return clientes;
            }catch(SQLException error){
             System.out.println("ERROR: " + error.toString());
            }
        }
        db.close();               
        return null;
    }
}
