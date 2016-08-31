package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.CustosCarros;
import model.valorCustos;

public class CustoCarrosDAO {

    private DataBase db;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    public CustoCarrosDAO() {
        db = new DataBase();
    }
    public boolean inset(CustosCarros custo){
         if(db.open()){
            sql = "INSERT INTO tb_valor_custo(vcc_nome, vcc_valor)VALUES(?,?)";
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setString(1, custo.getNome());
                ps.setFloat(2, custo.getValor());
                
                
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
    public boolean excluir(CustosCarros custo){
    if(db.open()){
         sql = "DELETE FROM tb_valor_custo WHERE vcc_nome = ? ";
        try{
        ps = db.connerction.prepareStatement(sql);
        ps.setString(1, custo.getNome());
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
    
    public boolean editar(CustosCarros custo){
    if(db.open()){
         sql = "UPDATE tb_valor_custo SET vcc_nome = ?, vcc_valor = ? WHERE vcc_id = ?";
        try{
        ps = db.connerction.prepareStatement(sql);
        ps.setString(1, custo.getNome());
        ps.setFloat(2,custo.getValor());        
        ps.setInt(3, custo.getId());
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
    
    
    public List<CustosCarros> selectAll(){
        if(db.open()){            
            List<CustosCarros> custos = new ArrayList();
            sql ="SELECT * FROM tb_valor_custo";
            try{
                CarrosDAO dao = new CarrosDAO();
                ps = db.connerction.prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                CustosCarros custo = new CustosCarros();
                custo.setId(rs.getInt(1));
                custo.setNome(rs.getString(2));
                custo.setValor(rs.getInt(3));                
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
    public List<CustosCarros> selectFilter(String filter){
     if(db.open()){            
            List<CustosCarros> custos = new ArrayList();
            String filtro = "%" + filter + "%";
            sql ="SELECT * FROM tb_valor_custo WHERE vcc_nome LIKE ? OR vcc_valor LIKE ?";            
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setString(1, filtro);
                ps.setString(2, filtro);
                rs = ps.executeQuery();
                while(rs.next()){
                CustosCarros custo = new CustosCarros();
                
                custo.setNome(rs.getString(2));
                custo.setValor(rs.getInt(3));
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

    public CustosCarros select(int id){
        if(db.open()){
            CustosCarros custo = new CustosCarros();
            sql ="SELECT * FROM tb_valor_custo WHERE vcc_id";
            try{
                CarrosDAO dao = new CarrosDAO();
                ps = db.connerction.prepareStatement(sql);
                ps.setInt(1, id);
                rs = ps.executeQuery();
                if(rs.next()){
                custo.setId(rs.getInt(1));
                custo.setNome(rs.getString(2));
                custo.setValor(rs.getInt(3));
                
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
    public boolean inset(valorCustos custo){
         if(db.open()){
            sql = "INSERT INTO tb_custos_carros(cdc_cus_id, cdc_vcc_id)VALUES(?,?)";
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setInt(1, custo.getCusto().getId());
                ps.setInt(2, custo.getValor().getId());
                
                
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
     public boolean excluir(valorCustos custo){
    if(db.open()){
         sql = "DELETE FROM tb_custos_carros WHERE cdc_vcc_id = ? ";
        try{
        ps = db.connerction.prepareStatement(sql);
        ps.setInt(1, custo.getValor().getId());
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
    

