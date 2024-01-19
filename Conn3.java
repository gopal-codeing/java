import java.sql.*;
public class Conn3 {
    Connection c;
    Statement s;
    Conn3(){
     try{
         Class.forName("com.mysql.jdbc.Driver");
         c=DriverManager.getConnection("jdbc:mysql:///mangement","root","");
         System.out.println("connection succesfull ");
         s=c.createStatement();

     }catch(Exception e){
        e.printStackTrace();
     }


    }
    public static void main(String... jsgd){
        System.out.println("Hello constion"); 
       Conn3 obj= new Conn3();
        // obj.insertRecord();
    }
}
