package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Carros;

public class CarrosDAO {

     private final DataBase db;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;
    
    public CarrosDAO(){
    db = new DataBase();
    }
    public boolean inset(Carros carro){
        if(db.open()){
            sql = "INSERT INTO tb_carros(car_renavam, car_ano_fabricacao, car_ano_modelo, car_chassi, car_cor_id, car_motorizacao, car_observacoes, car_placa, car_modelo)VALUES(?,?,?,?,?,?,?,?,?)";
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setString(1, carro.getRenavam());
                ps.setInt(2, carro.getAno_fabricacao());
                ps.setInt(3, carro.getAno_modelo());
                ps.setString(4, carro.getChassi());
                ps.setInt(5, carro.getCor().getId());
                ps.setString(6, carro.getMotorizacao());
                ps.setString(7, carro.getObeservacoes());
                ps.setString(8, carro.getPlaca());
                ps.setString(9, carro.getModelo());
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
    public boolean delete(Carros carro){
        if(db.open()){
        sql = "DELETE FROM tb_carros WHERE car_placa = ?";
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setString(1, carro.getPlaca());
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
    public boolean update(Carros carro){
        if(db.open()){
        sql = "UPDATE tb_carros SET car_renavam = ?, car_ano_fabricacao = ?, car_ano_modelo = ?, car_chassi = ?, car_motorizacao = ?, car_observacoes = ?, car_modelo = ?  WHERE car_id = ?";
            try{
            ps = db.connerction.prepareStatement(sql);
            ps.setString(1, carro.getRenavam());
            ps.setInt(2, carro.getAno_fabricacao());
            ps.setInt(3, carro.getAno_modelo());
            ps.setString(4, carro.getChassi());
            ps.setString(5, carro.getMotorizacao());
            ps.setString(6, carro.getObeservacoes());
            ps.setString(7, carro.getModelo());
            ps.setInt(8, carro.getId());                
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
    public List<Carros> selectALL(){
        if(db.open()){            
            List<Carros> carros = new ArrayList();
            
            sql ="SELECT * FROM tb_carros";
            try{
                ps = db.connerction.prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                Carros carro = new Carros();
                
                CorDAO dao = new CorDAO();
                carro.setId(rs.getInt(1));
                carro.setRenavam(rs.getString(2));
                carro.setAno_fabricacao(rs.getInt(3));
                carro.setAno_modelo(rs.getInt(4));
                carro.setChassi(rs.getString(5));
               
                
                carro.setPlaca(rs.getString(7));
                carro.setObeservacoes(rs.getString(8));
                carro.setMotorizacao(rs.getString(9));
                carro.setModelo(rs.getString(10));
                carros.add(carro);
                }
                rs.close();
                ps.close();
                db.close();
                return carros;
            }catch(SQLException error){
             System.out.println("ERROR: " + error.toString());
            }
        }
        db.close();               
        return null;
    }
    
    public List<Carros> selectFilter(String filter){
     if(db.open()){            
            List<Carros> carros = new ArrayList();
            String filtro = "%" + filter + "%";
            sql ="SELECT * FROM tb_carros WHERE car_modelo LIKE ? OR car_placa LIKE ?";            
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setString(1, filtro);
                ps.setString(2, filtro);
                rs = ps.executeQuery();
                while(rs.next()){
                Carros carro = new Carros();
             
                CorDAO dao = new CorDAO();
                
                carro.setRenavam(rs.getString(1));
                carro.setAno_fabricacao(rs.getInt(2));
                carro.setAno_modelo(rs.getInt(3));
                carro.setChassi(rs.getString(4));
               
                carro.setCor(dao.select(rs.getInt(5)));
                carro.setPlaca(rs.getString(6));
                carro.setObeservacoes(rs.getString(7));
                carro.setMotorizacao(rs.getString(8));
                carro.setModelo(rs.getString(9));
                carros.add(carro);
                }
                rs.close();
                ps.close();
                db.close();
                return carros;
            }catch(SQLException error){
             System.out.println("ERROR: " + error.toString());
            }
        }
        db.close();
        return null;        
    }
    public Carros select(int id){
        if(db.open()){
            Carros carro = new Carros();
            sql ="SELECT * FROM tb_carros WHERE car_id = ?";
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setInt(1, id);
                rs = ps.executeQuery();
                if(rs.next()){
                 
                CorDAO dao = new CorDAO();
                carro.setId(rs.getInt(1));
                carro.setRenavam(rs.getString(2));
                carro.setAno_fabricacao(rs.getInt(3));
                carro.setAno_modelo(rs.getInt(4));
                carro.setChassi(rs.getString(5));
               
                carro.setCor(dao.select(rs.getInt(6)));
                carro.setPlaca(rs.getString(7));
                carro.setObeservacoes(rs.getString(8));
                carro.setMotorizacao(rs.getString(9));
                carro.setModelo(rs.getString(10));
               
                rs.close();
                ps.close();
                db.close();
                return carro;
                }
            }catch(SQLException error){
             System.out.println("ERROR: " + error.toString());
            }
        }
        db.close();
        return null;
    }
    public Carros selectPlaca(String placa){
    if(db.open()){
            Carros carro = new Carros();
            sql ="SELECT * FROM tb_carros WHERE car_placa = ?";
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setString(1, placa);
                rs = ps.executeQuery();
                if(rs.next()){                 
                CorDAO dao = new CorDAO();
                carro.setId(rs.getInt(1));
                carro.setRenavam(rs.getString(2));
                carro.setAno_fabricacao(rs.getInt(3));
                carro.setAno_modelo(rs.getInt(4));
                carro.setChassi(rs.getString(5));
               
                carro.setCor(dao.select(rs.getInt(6)));
                carro.setPlaca(rs.getString(7));
                carro.setObeservacoes(rs.getString(8));
                carro.setMotorizacao(rs.getString(9));
                carro.setModelo(rs.getString(10));
               
                rs.close();
                ps.close();
                db.close();
               return carro;
                }
            }catch(SQLException error){
             System.out.println("ERROR: " + error.toString());
            }
    
    
    }return null;
}
}
