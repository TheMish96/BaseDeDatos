
package clases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author MIRSHA
 */
public class Conexion {
    private static Connection conn;
    private static final String driver= "com.mysql.jdbc.Driver";
    private static final String user= ("root");
    private static final String password=("tuputisimamadre");
    private static final String url= "jdbc:mysql://localhost:3306/escuela";


public Connection conectar() {

    conn= null;
        try{
            
            Class.forName(driver);
            conn= DriverManager.getConnection(url,user,password);
            if (conn !=null){
           
            }
        }catch (Exception e){
            System.out.println("error al conectar ");
        }
        return conn;
    }

}
 