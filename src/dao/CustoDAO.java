package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Custos;

public class CustoDAO {

    private DataBase db;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    public CustoDAO() {
        db = new DataBase();
    }
    public boolean inset(Custos custo){
         if(db.open()){
            sql = "INSERT INTO tb_custos(cus_nome, cus_valor, cus_valor_total)VALUES(?,?,?)";
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setString(1, custo.getNome());
                ps.setInt(2, custo.getValor());
                ps.setInt(3, custo.getValor_final());
                
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
    public boolean excluir(Custos custo){
    if(db.open()){
         sql = "DELETE FROM tb_custos WHERE cus_id = ? ";
        try{
        ps = db.connerction.prepareStatement(sql);
        ps.setInt(1, custo.getId());
        if(ps.executeUpdate() == 1){
            ps.close();
            db.close();
        return true;
        }
         
        }catch(SQLException erro){
        System.out.println("ERROR: " + erro.toString());
        return false;
        }
        
        }
    db.close();
    return false;
    
    
    }
    
    public boolean editar(Custos custo){
    if(db.open()){
         sql = "UPDATE tb_custos SET cus_nome = ?, cus_valor = ? WHERE cus_id = ?";
        try{
        ps = db.connerction.prepareStatement(sql);
        ps.setString(1, custo.getNome());
        ps.setInt(2,custo.getValor());        
        ps.setInt(4, custo.getId());
        if(ps.executeUpdate() == 1){
            ps.close();
            db.close();
        return true;
        }
         
        }catch(SQLException erro){
        System.out.println("ERROR: " + erro.toString());
        return false;
        }
        
        }
    db.close();
    return false;
    
    }
    
    }
    

