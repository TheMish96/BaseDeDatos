package clases;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MIRSHA
 */
public class Conectar {
    Connection conn;
    String driver= "com.mysql.jdbc.Driver";
<<<<<<< HEAD
    String user= ("consulta");
    String password=("123");
=======
    String user= ("root");
    String password=("123456789");
>>>>>>> 8ae920a142522db60dc6f67bbd7bad9280f033e4
    String url= "jdbc:mysql://localhost:3306/escuela";
    
    
    public Conectar(){
    driver= "com.mysql.jdbc.Driver";
    user= ("consulta");
    password=("123");
    url= "jdbc:mysql://localhost:3306/escuela";
} 
    
    
    public int loguear (String us,String pass) throws ClassNotFoundException {
        
     Connection conn;   
     PreparedStatement pst;
     ResultSet rs;
     int nivel=0;
     String sql="select nivel from login where usuario='"+us+"' and contra='"+pass+"'";
     try{
         Class.forName(this.driver);
         conn=DriverManager.getConnection(
         this.url,
         this.user,
         this.password);
         pst=conn.prepareStatement(sql);
         rs=pst.executeQuery();
         while(rs.next()){
             nivel=rs.getInt(1);
         }conn.close();         
     }  catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
         return nivel; 
  
}
}