package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
            sql = "INSERT INTO tb_custos(cus_nome, cus_valor)VALUES(?,?)";
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setString(1, custo.getNome());
                ps.setInt(2, custo.getValor());
                
                
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
    
    
    public List<Custos> selectAll(){
        if(db.open()){            
            List<Custos> custos = new ArrayList();
            sql ="SELECT * FROM tb_custos";
            try{
                ps = db.connerction.prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                Custos custo = new Custos();
                custo.setId(rs.getInt(1));
                custo.setNome(rs.getString(2));
                custo.setValor(rs.getInt(4));
                custo.setValor_final(rs.getInt(3));
                custos.add(custo);
                }
                rs.close();
                ps.close();
                db.close();
                return custos;
            }catch(SQLException error){
             System.out.println("ERROR: " + error.toString());
            }
        }
        db.close();               
        return null;
    }
    public List<Custos> selectFilter(String filter){
     if(db.open()){            
            List<Custos> custos = new ArrayList();
            String filtro = "%" + filter + "%";
            sql ="SELECT * FROM tb_custos WHERE cus_nome LIKE ? OR cus_valor LIKE ?";            
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setString(1, filtro);
                ps.setString(2, filtro);
                rs = ps.executeQuery();
                while(rs.next()){
                Custos custo = new Custos();
                custo.setId(rs.getInt(1));
                custo.setNome(rs.getString(2));
                custo.setValor(rs.getInt(4));
                custos.add(custo);
                }
                rs.close();
                ps.close();
                db.close();
                return custos;
            }catch(SQLException error){
             System.out.println("ERROR: " + error.toString());
            }
        }
        db.close();
        return null;        
    }

    public Custos select(int id){
        if(db.open()){
            Custos custo = new Custos();
            sql ="SELECT * FROM tb_custos WHERE cus_id";
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setInt(1, id);
                rs = ps.executeQuery();
                if(rs.next()){
                custo.setId(rs.getInt(1));
                custo.setNome(rs.getString(2));
                custo.setValor(rs.getInt(4));
                custo.setValor_final(rs.getInt(3));
                rs.close();
                ps.close();
                db.close();
                return custo;
                }
            }catch(SQLException error){
             System.out.println("ERROR: " + error.toString());
            }
        }
        db.close();
        return null;
    }
    
    }
    

