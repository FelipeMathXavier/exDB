package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    final private String url = "jdbc:postgresql://localhost:5432/estoque";
   
    public Connection pegarConexao(){
        try{
            Connection con = DriverManager.getConnection(url);
            return con;
        }catch(SQLException erro){
            System.out.println("Problema ao se conectar");
        }
        return null;
    }
}
