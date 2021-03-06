package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {

    int r;
    Conexion con;
    Producto pro = new Producto();

    public ProductoDAO() {
        con = new Conexion();
    }

    public int actualizarStock(int cant, int idp) {
        String sql = "update producto set Stock=? where idProducto=?";
        try {
            PreparedStatement ps = con.getConnection().prepareStatement(sql);
            ps.setInt(1, cant);
            ps.setInt(2, idp);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }

    public Producto listarID(int id) {
        Producto p = new Producto();
        String sql = "select * from producto where IdProducto=?";
        try {
            PreparedStatement ps = con.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                p.setId(rs.getInt(1));
                p.setNom(rs.getString(2));
                p.setPre(rs.getDouble(3));
                p.setStock(rs.getInt(4));
                p.setEstado(rs.getString(5));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return p;
    }

    //*************MANTENIMIENTO CRUD**************
    public List listarProducto() {
        String sql = "select * from producto";
        List<Producto> listaprod = new ArrayList<>();
        try {
            PreparedStatement ps = con.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setNom(rs.getString(2));
                p.setPre(rs.getDouble(3));
                p.setStock(rs.getInt(4));
                p.setEstado(rs.getString(5));
                listaprod.add(p);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return listaprod;
    }

    public int agregar(Producto p) {
        String sql = "insert into producto(Nombres,Precio,Stock,Estado)values(?,?,?,?)";
        try {
            PreparedStatement ps = con.getConnection().prepareStatement(sql);
            ps.setString(1, p.getNom());
            ps.setDouble(2, p.getPre());
            ps.setInt(3, p.getStock());
            ps.setString(4, p.getEstado());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }

    public int actualizar(Producto p) {
        String sql = "update producto set Nombres=?,Precio=?,Stock=?,Estado=? where IdProducto=?";
        try {
            PreparedStatement ps = con.getConnection().prepareStatement(sql);
            ps.setString(1, p.getNom());
            ps.setDouble(2, p.getPre());
            ps.setInt(3, p.getStock());
            ps.setString(4, p.getEstado());
            ps.setInt(5, p.getId());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }

    public int delete(int id) {
        String sql = "delete from producto where IdProducto=?";
        try {
            PreparedStatement ps = con.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }
}

