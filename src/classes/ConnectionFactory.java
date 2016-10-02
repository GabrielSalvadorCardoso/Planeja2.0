package classes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionFactory {
    private Connection con;
    public Connection getConnection(String banco, String user, String pass){
        con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/"+banco,user,pass);
        }catch(SQLException ex){
            System.out.println("Impossivel conectar banco de dados");
        }
        
        return con;
    }
}
