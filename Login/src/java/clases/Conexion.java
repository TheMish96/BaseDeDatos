
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
<<<<<<< HEAD
    private static final String user= ("consulta");
    private static final String password=("123");
=======
    private static final String user= ("root");
    private static final String password=("123456789");
>>>>>>> 8ae920a142522db60dc6f67bbd7bad9280f033e4
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
 