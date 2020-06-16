
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection con;
    static String url="jdbc:mysql://localhost:3306/bd_ventas";
    static String login="root";
    static String pass="one15117";
    static String bd = "bd_ventas"; 
    private Connection conn = null; 
    
    public Conexion() { 
      try{          
         Class.forName("com.mysql.cj.jdbc.Driver");          
         conn = DriverManager.getConnection(url,login,pass); 
         if (conn!=null){ 
            System.out.println("Conexión a base de datos "+bd+". listo"); 
         } 
      }catch(SQLException e){ 
         System.out.println(e); 
      }catch(ClassNotFoundException e){ 
         System.out.println(e); 
      } 
   } 

       public Connection getConnection(){ 
      return conn; 
   } 
 
   public void desconectar(){ 
      conn = null; 
   } 

    public static String getLogin() {
        return login;
    }

    public static String getPassword() {
        return pass;
    }
}







