import java.beans.Statement;
import java.sql.*;

public class Cidade_ti {

    public static void main(String[] args) {
     
    	Connection conn = DriverManager.getConnection("jdbc:mem:Cidade","sa", "");
    	
    	java.sql.Statement stmt = conn.createStatement();
        
    		String createTable = "CREATE TABLE IF NOT EXISTS Cidade (id INT Primary key, nome varchar(30))";
    			stmt.executeUpdate(createTable);
    			
    		String Createtable = "CREATE TABLE OF NOT EXISTS Comercio(id INT PRIMARY KEY, Nome_do_comercio varchar(50) , Nome_do_responsavel varchar(60), Tipo_de_comercio varchar(60))";
    			stmt.executeUpdate(Createtable);
    
    			
    			
    			
    			
    			
    			
    			
    			
    			
    			
    			
    			
    			
    			
    	conn.close();
};