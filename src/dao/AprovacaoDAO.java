package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Aprovacao;


public class AprovacaoDAO {

     private final DataBase db;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;
    
    public AprovacaoDAO(){
    db = new DataBase();
    }
    public Aprovacao select(int id){
        if(db.open()){
            Aprovacao apr = new Aprovacao();
            sql ="SELECT * FROM tb_aprovacao WHERE apr_id = ?";
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setInt(1, id);
                rs = ps.executeQuery();
                if(rs.next()){
                apr.setId(rs.getInt(1));
                apr.setAprovacao(rs.getString(2));
                
                rs.close();
                ps.close();
                db.close();
                return apr;
                }
            }catch(SQLException error){
             System.out.println("ERROR: " + error.toString());
            }
        }
        db.close();
        return null;
    }
    public List<Aprovacao> selectFilter(String filter){
     if(db.open()){            
            List<Aprovacao> aprs = new ArrayList();
            String filtro = "%" + filter + "%";
            sql ="SELECT * FROM tb_aprovacao WHERE apr_aprovacao LIKE ? ";            
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setString(1, filtro);
                ps.setString(2, filtro);
                rs = ps.executeQuery();
                while(rs.next()){
                Aprovacao apr = new Aprovacao();
                apr.setId(rs.getInt(1));
                apr.setAprovacao(rs.getString(2));                
                aprs.add(apr);
                }
                rs.close();
                ps.close();
                db.close();
                return aprs;
            }catch(SQLException error){
             System.out.println("ERROR: " + error.toString());
            }
        }
        db.close();
        return null; 
    }
}
