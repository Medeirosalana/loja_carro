package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Carros;

public class CarrosDAO {

     private DataBase db;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;
    
    public CarrosDAO(){
    db = new DataBase();
    }
    public boolean inset(Carros carro){
        if(db.open()){
            sql = "INSERT INTO tb_carros(car_renavam, car_ano_fabricacao, car_ano_modelo, car_chassi, car_cus_id, car_cor_id, car_motorizacao, car_observacao, car_placa, car_modelo)VALUES(?,?,?,?,?,?,?,?,?,?)";
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setString(1, carro.getRenavam());
                ps.setInt(2, carro.getAno_fabricacao());
                ps.setInt(3, carro.getAno_modelo());
                ps.setString(4, carro.getChassi());
                ps.setInt(5, carro.getCusto().getId());
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
    public boolean delete(Contato contato){
        if(db.open()){
        sql = "DELETE FROM tb_contatos WHERE con_id = ?";
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setInt(1, contato.getId());
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
    public boolean update(Contato contato){
        if(db.open()){
        sql = "UPDATE tb_contatos SET con_nome = ?, con_fone = ? WHERE con_id =?";
            try{
            ps = db.connerction.prepareStatement(sql);
            ps.setString(1, contato.getNome());
            ps.setString(2, contato.getFone());
            ps.setInt(3, contato.getId());
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
    public List<Contato> selectALL(){
        if(db.open()){            
            List<Contato> contatos = new ArrayList();
            sql ="SELECT * FROM tb_contatos";
            try{
                ps = db.connerction.prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                Contato contato = new Contato();
                contato.setId(rs.getInt(1));
                contato.setNome(rs.getString(2));
                contato.setFone(rs.getString(3));
                contatos.add(contato);
                }
                rs.close();
                ps.close();
                db.close();
                return contatos;
            }catch(SQLException error){
             System.out.println("ERROR: " + error.toString());
            }
        }
        db.close();               
        return null;
    }
    
    public List<Contato> selectFilter(String filter){
     if(db.open()){            
            List<Contato> contatos = new ArrayList();
            String filtro = "%" + filter + "%";
            sql ="SELECT * FROM tb_contatos WHERE con_nome LIKE ? OR con_fone LIKE ?";            
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setString(1, filtro);
                ps.setString(2, filtro);
                rs = ps.executeQuery();
                while(rs.next()){
                Contato contato = new Contato();
                contato.setId(rs.getInt(1));
                contato.setNome(rs.getString(2));
                contato.setFone(rs.getString(3));
                contatos.add(contato);
                }
                rs.close();
                ps.close();
                db.close();
                return contatos;
            }catch(SQLException error){
             System.out.println("ERROR: " + error.toString());
            }
        }
        db.close();
        return null;        
    }
    public Contato select(int id){
        if(db.open()){
            Contato contato = new Contato();
            sql ="SELECT * FROM tb_contatos WHERE con_id";
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setInt(1, id);
                rs = ps.executeQuery();
                if(rs.next()){
                contato.setId(rs.getInt(1));
                contato.setNome(rs.getString(2));
                contato.setFone(rs.getString(3));
                rs.close();
                ps.close();
                db.close();
                return contato;
                }
            }catch(SQLException error){
             System.out.println("ERROR: " + error.toString());
            }
        }
        db.close();
        return null;
    }
}
