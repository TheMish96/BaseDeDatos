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
    String user= ("root");
    String password=("tuputisimamadre");
    String url= "jdbc:mysql://localhost:3306/escuela";
    
    
    public Conectar(){
    driver= "com.mysql.jdbc.Driver";
    user= ("root");
    password=("tuputisimamadre");
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