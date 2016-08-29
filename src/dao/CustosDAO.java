package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Custos;
import model.CustosCarros;

public class CustosDAO {
 private DataBase db;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    public CustosDAO() {
        db = new DataBase();
    }
     public boolean inset(Custos custo){
        if(db.open()){
            sql = "INSERT INTO tb_custos(cus_valor_final, cus_lucro, cus_valor)VALUES(?,?,?)";
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setFloat(1, custo.getValor_final());
                ps.setFloat(2, custo.getLucro());
                ps.setFloat(3, custo.getValor_total());
                
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
    public boolean update(Custos custo){
        if(db.open()){
        sql = "UPDATE tb_custos SET cus_valor_final = ?, cus_lucro = ?, cus_valor = ? WHERE cus_id = ?";
            try{
            ps = db.connerction.prepareStatement(sql);
            ps.setFloat(1, custo.getValor_final());
            ps.setFloat(2, custo.getLucro());
            ps.setFloat(3, custo.getValor_total());
            ps.setInt(4, custo.getId());
                    
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
}
