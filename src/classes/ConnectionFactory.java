package classes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionFactory {
    public Connection getConnection(String banco, String user, String pass){
        Connection con=null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/"+banco,user,pass);
        }catch(SQLException ex){
            System.out.println("Impossivel conectar banco de dados");
        }        
        return con;
    }
}
