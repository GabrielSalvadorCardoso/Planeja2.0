package classes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class PreparaDeclaracao {//PrepararDeclaração
    public PreparedStatement statement(Connection con, String sql){
        PreparedStatement stm = null;
        try{
            stm = con.prepareStatement(sql);
        }catch(SQLException ex){
            System.out.println("Não foi possivel preparar declaração");
        }
        return stm;
    }
}
