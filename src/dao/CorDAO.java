package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cores;


public class CorDAO {

    private final DataBase db;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    public CorDAO() {
        db = new DataBase();
    }
     public List<Cores> selectALL(){
        if(db.open()){            
            List<Cores> cores = new ArrayList();
            sql ="SELECT * FROM tb_cores";
            try{
                ps = db.connerction.prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                Cores cor = new Cores();
                cor.setId(rs.getInt(1));
                cor.setCor(rs.getString(2));
                
                cores.add(cor);
                }
                rs.close();
                ps.close();
                db.close();
                return cores;
            }catch(SQLException error){
             System.out.println("ERROR: " + error.toString());
            }
        }
        db.close();               
        return null;
    }
     public List<Cores> selectFilter(String filter){
     if(db.open()){            
            List<Cores> cores = new ArrayList();
            String filtro = "%" + filter + "%";
            sql ="SELECT * FROM tb_cores WHERE cor_cor LIKE ?";            
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setString(1, filtro);
                
                rs = ps.executeQuery();
                while(rs.next()){
                Cores cor = new Cores();
                cor.setId(rs.getInt(1));
                cor.setCor(rs.getString(2));                
                cores.add(cor);
                }
                rs.close();
                ps.close();
                db.close();
                return cores;
            }catch(SQLException error){
             System.out.println("ERROR: " + error.toString());
            }
        }
        db.close();
        return null;        
    }
     public Cores select(int id){
        if(db.open()){
            Cores cor = new Cores();
            sql ="SELECT * FROM tb_cores WHERE cor_id";
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setInt(1, id);
                rs = ps.executeQuery();
                if(rs.next()){
                cor.setId(rs.getInt(1));
                cor.setCor(rs.getString(2));
                
                rs.close();
                ps.close();
                db.close();
                return cor;
                }
            }catch(SQLException error){
             System.out.println("ERROR: " + error.toString());
            }
        }
        db.close();
        return null;
    }
    
}
