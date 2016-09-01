package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Carros;


import model.Custos;


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
            sql = "INSERT INTO tb_custos(cus_valor, cus_descricao, cus_car_id)VALUES(?,?,?)";
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setFloat(1, custo.getValor());
                ps.setString(2, custo.getDescrissao());
               ps.setInt(3, custo.getCarro().getId());
                
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
        sql = "UPDATE tb_custos SET cus_descricao = ?, cus_valor = ? WHERE cus_id = ?";
            try{
            ps = db.connerction.prepareStatement(sql);
            ps.setString(1, custo.getDescrissao());
            ps.setFloat(2, custo.getValor());            
            ps.setInt(3, custo.getId());
                    
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
     
    public Custos select(int id){
        if(db.open()){
            Custos cli = new Custos();
            sql ="SELECT * FROM tb_custos WHERE cus_id = ?";
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setInt(1, id);
                rs = ps.executeQuery();
                if(rs.next()){
                CarrosDAO dao = new CarrosDAO();
                cli.setId(rs.getInt(1));
                cli.setDescrissao(rs.getString(3));
                cli.setValor(rs.getFloat(2));
                cli.setCarro(dao.select(rs.getInt(4)));
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
    public List<Custos> selectFilter(int filter){
     if(db.open()){            
            List<Custos> clientes = new ArrayList();
            String filtro = "%" + filter + "%";
            sql ="SELECT * FROM tb_custos WHERE cus_car_id LIKE ?";            
            try{
                ps = db.connerction.prepareStatement(sql);
                ps.setString(1, filtro);
               
                rs = ps.executeQuery();
                while(rs.next()){
                Custos cli = new Custos();
                CarrosDAO dao = new CarrosDAO();
                cli.setId(rs.getInt(1));
                cli.setDescrissao(rs.getString(3));
                cli.setValor(rs.getFloat(2));
                cli.setCarro(dao.select(rs.getInt(4)));
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
     public List<Custos> selectALL(){
        if(db.open()){            
            List<Custos> clientes = new ArrayList();
            
            sql ="SELECT * FROM tb_custos";
            try{
                ps = db.connerction.prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                Custos cli = new Custos();  
                CarrosDAO dao = new CarrosDAO();
                cli.setId(rs.getInt("cus_id"));
                cli.setDescrissao(rs.getString("cus_descricao"));
                cli.setValor(rs.getFloat("cus_valor"));
                cli.setCarro(dao.select(rs.getInt(4)));
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
//      public Custos select(Carros id){
//        if(db.open()){
//            Custos cli = new Custos();
//            sql ="SELECT * FROM tb_custos WHERE cus_car_id = ?";
//            try{
//                ps = db.connerction.prepareStatement(sql);
//                ps.setInt(1, id);
//                rs = ps.executeQuery();
//                if(rs.next()){
//                CarrosDAO dao = new CarrosDAO();
//                cli.setId(rs.getInt(1));
//                cli.setDescrissao(rs.getString(3));
//                cli.setValor(rs.getFloat(2));
//                cli.setCarro(dao.select(rs.getInt(4)));
//                rs.close();
//                ps.close();
//                db.close();
//                return cli;
//                }
//            }catch(SQLException error){
//             System.out.println("ERROR: " + error.toString());
//            }
//        }
//        db.close();
//        return null;
//    }
}
