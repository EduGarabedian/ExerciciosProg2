package control.freq;

import java.sql.*;

public class MySQLConnection {
    String url= "jdbc:mysql://127.0.0.1:32771/mysql";
    String usuario="root";
    String senha="root";

    public Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, usuario, senha);
        }catch(final Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
}
