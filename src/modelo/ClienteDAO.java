package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements CRUD {

    Conexion con;

    public ClienteDAO() {
        con = new Conexion();
    }

    public Cliente listarID(String dni) {
        Cliente c = new Cliente();
        String sql = "select * from cliente where Dni=?";
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement(sql);
            pstm.setString(1, dni);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                c.setId(rs.getInt(1));
                c.setDni(rs.getString(2));
                c.setNom(rs.getString(3));
                c.setDir(rs.getString(4));
                c.setEstado(rs.getString(5));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return c;
    }

    //Metodos de Mantenimiento CRUD
    @Override
    public List listar() {
        List<Cliente> lista = new ArrayList<>();
        String sql = "select * from cliente";
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getInt(1));
                c.setDni(rs.getString(2));
                c.setNom(rs.getString(3));
                c.setDir(rs.getString(4));
                c.setEstado(rs.getString(5));
                lista.add(c);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "insert into cliente(Dni,Nombres,Direccion,Estado)values(?,?,?,?)";
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement(sql);
            pstm.setObject(1, o[0]);
            pstm.setObject(2, o[1]);
            pstm.setObject(3, o[2]);
            pstm.setObject(4, o[3]);
            r = pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "update cliente set Dni=?,Nombres=?,Direccion=?,Estado=? where IdCliente=?";
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement(sql);
            pstm.setObject(1, o[0]);
            pstm.setObject(2, o[1]);
            pstm.setObject(3, o[2]);
            pstm.setObject(4, o[3]);
            pstm.setObject(5, o[4]);
            r = pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }

    @Override
    public void eliminar(int id) {
        String sql = "delete from cliente where IdCliente=?";
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement(sql);
            pstm.setInt(1, id);
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

