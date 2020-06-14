
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VendedorDAO {

    Conexion con;
    //Connection con;
    
    public VendedorDAO(){
        con=new Conexion();
    }
    
    public EntidadVendedor ValidarVendedor(String Dni,String User){
        EntidadVendedor ev=new EntidadVendedor();
        String sql="select * from vendedor where Dni=? and User=?";
        try {
           //con=acceso.Conectar();
          PreparedStatement pstm =con.getConnection().prepareStatement(sql); 
           pstm.setString(1, Dni);
           pstm.setString(2, User);
           ResultSet res =pstm.executeQuery();
            while (res.next()) {
                ev.setId(res.getInt(1));
                ev.setDni(res.getString(2));
                ev.setNom(res.getString(3));
                ev.setTel(res.getString(4));
                ev.setEstado(res.getString(5));
                ev.setUser(res.getString(6));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return ev;
    }
     public Vendedor listarVendedorId(String dni) {
        Vendedor v=new Vendedor();
        String sql = "select * from vendedor where Dni=" + dni;
        try {
            //con = acceso.Conectar();
            PreparedStatement pstm = con.getConnection().prepareStatement(sql);
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                v.setId(res.getInt(1));
                v.setDni(res.getString(2));
                v.setNom(res.getString(3));
                v.setTel(res.getString(4));
                v.setEstado(res.getString(5));
                v.setUser(res.getString(6));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return v;
    }
    //********CRUD - Principal**************

    public List listarVendedor() {
        String sql = "select * from vendedor";
        List<Vendedor> listaVendedor = new ArrayList<>();
        try {
            //con = acceso.Conectar();
            PreparedStatement pstm = con.getConnection().prepareStatement(sql);
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                Vendedor ven = new Vendedor();
                ven.setId(res.getInt(1));
                ven.setDni(res.getString(2));
                ven.setNom(res.getString(3));
                ven.setTel(res.getString(4));
                ven.setEstado(res.getString(5));
                ven.setUser(res.getString(6));
                listaVendedor.add(ven);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return listaVendedor;
    }

    public int agregar(Vendedor v) {
        int r=0;
        String sql = "insert into vendedor(Dni,Nombres,Telefono,Estado,User)values(?,?,?,?,?)";
        try {
            //con = acceso.Conectar();
            PreparedStatement pstm = con.getConnection().prepareStatement(sql);
            pstm.setString(1, v.getDni());
            pstm.setString(2, v.getNom());
            pstm.setString(3, v.getTel());
            pstm.setString(4, v.getEstado());
            pstm.setString(5, v.getUser());
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }

    public int actualizar(Vendedor v) {
        int r=0;
        String sql = "update vendedor set Dni=?, Nombres=?,Telefono=?,Estado=? Where IdVendedor=?";
        try {
            //con = acceso.Conectar();
            PreparedStatement pstm = con.getConnection().prepareStatement(sql);
            pstm.setString(1, v.getDni());
            pstm.setString(2, v.getNom());
            pstm.setString(3, v.getTel());
            pstm.setString(4, v.getEstado());
            pstm.setInt(5, v.getId());
            r = pstm.executeUpdate();
            if (r == 1) {
                r = 1;
            } else {
                r = 0;
            }
        } catch (Exception e) {
            System.err.println( e);
        }
        return r;
    }

    public int delete(int id) {
        int r=0;
        String sql = "delete from vendedor where IdVendedor=?";
        try {
            //con = acceso.Conectar();
            PreparedStatement pstm = con.getConnection().prepareStatement(sql);
            pstm.setInt(1, id);
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }
}






