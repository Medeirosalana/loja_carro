package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Carros;
import model.CartasDeCreditos;


public class CartaDeCreditoDAO {

     private final DataBase db;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;
    
    public CartaDeCreditoDAO(){
    db = new DataBase();
    }
    public boolean inset(CartasDeCreditos cartas){
        if(db.open()){
            sql = "INSERT INTO tb_cartas_de_creiditos(cdc_cota, cdc_grupo, cdc_proposta, cdc_prazo, cdc_parcela, cdc_valor_inicial, cdc_valor_final)VALUES(?,?,?,?,?,?,?)";
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setInt(1, cartas.getCota());
                ps.setInt(2, cartas.getGrupo());
                ps.setInt(3, cartas.getProposta());
                ps.setInt(4, cartas.getPrazo());
                ps.setInt(5, cartas.getParcela());
                ps.setInt(6, cartas.getValor_inicial());
                ps.setInt(7, cartas.getValor_final());
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
    public boolean delete(CartasDeCreditos cartas){
        if(db.open()){
        sql = "DELETE FROM tb_cartas_de_creiditos WHERE cdc_id = ?";
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setInt(1, cartas.getId());
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
    public boolean update(CartasDeCreditos cartas){
        if(db.open()){
        sql = "UPDATE tb_cartas_de_creiditos SET cdc_cota = ?, cdc_grupo = ?,cdc_proposta = ?, cdc_prazo = ?,cdc_valor_final = ?,cdc_valor_inicial = ?  WHERE cdc_id =?";
            try{
            ps = db.connerction.prepareStatement(sql);
            ps.setInt(1, cartas.getCota());
            ps.setInt(2, cartas.getGrupo());
            ps.setInt(3, cartas.getProposta());
            ps.setInt(4, cartas.getPrazo());
            ps.setInt(5, cartas.getValor_final());
            ps.setInt(6, cartas.getValor_inicial());
            ps.setInt(7, cartas.getId());
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
    public CartasDeCreditos select(int id){
        if(db.open()){
            CartasDeCreditos carta = new CartasDeCreditos();
            sql ="SELECT * FROM tb_cartas_de_creiditos WHERE cdc_id";
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setInt(1, id);
                rs = ps.executeQuery();
                if(rs.next()){                
                carta.setId(rs.getInt(1));
                carta.setCota(rs.getInt(2));
                carta.setGrupo(rs.getInt(3));
                carta.setProposta(rs.getInt(4));
                carta.setPrazo(rs.getInt(5));
                carta.setParcela(rs.getInt(6));
                carta.setValor_inicial(rs.getInt(7));
                carta.setValor_final(rs.getInt(8));
                rs.close();
                ps.close();
                db.close();
                return carta;
                }
            }catch(SQLException error){
             System.out.println("ERROR: " + error.toString());
            }
        }
        db.close();
        return null;
    }
     public List<CartasDeCreditos> selectFilter(String filter){
     if(db.open()){            
            List<CartasDeCreditos> cartas = new ArrayList();
            String filtro = "%" + filter + "%";
            sql ="SELECT * FROM tb_cartas_de_creiditos WHERE cdc_cota LIKE ? OR cdc_valor_final = ? LIKE ?";            
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setString(1, filtro);
                ps.setString(2, filtro);
                rs = ps.executeQuery();
                while(rs.next()){
                
                 CartasDeCreditos carta = new CartasDeCreditos();
                
                carta.setId(rs.getInt(1));
                carta.setCota(rs.getInt(2));
                carta.setGrupo(rs.getInt(3));
                carta.setProposta(rs.getInt(4));
                carta.setPrazo(rs.getInt(5));
                carta.setParcela(rs.getInt(6));
                carta.setValor_inicial(rs.getInt(7));
                carta.setValor_final(rs.getInt(8));
                cartas.add(carta);
                }
                rs.close();
                ps.close();
                db.close();
                return cartas;
            }catch(SQLException error){
             System.out.println("ERROR: " + error.toString());
            }
        }
        db.close();
        return null;        
    }
     public List<CartasDeCreditos> selectALL(){
        if(db.open()){            
            List<CartasDeCreditos> cartas = new ArrayList();
            
            sql ="SELECT * FROM tb_cartas_de_creiditos";
            try{
                ps = db.connerction.prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                CartasDeCreditos carta = new CartasDeCreditos();                
                carta.setId(rs.getInt(1));
                carta.setCota(rs.getInt(2));
                carta.setGrupo(rs.getInt(3));
                carta.setProposta(rs.getInt(4));
                carta.setPrazo(rs.getInt(5));
                carta.setParcela(rs.getInt(6));
                carta.setValor_inicial(rs.getInt(7));
                carta.setValor_final(rs.getInt(8));
                
                cartas.add(carta);
                }
                rs.close();
                ps.close();
                db.close();
                return cartas;
            }catch(SQLException error){
             System.out.println("ERROR: " + error.toString());
            }
        }
        db.close();               
        return null;
    }
}
