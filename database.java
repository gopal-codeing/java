import java.sql.*;
import java.util.*;
class database{
    public static void main(String... kh)throws Exception {
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedetels","root","");
    // Connection con =DriverManager.getConnection();
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery("select * form empolyee");
    while (rs.next()){
        System.out.println(rs.getString(1)+""+rs.getString(2));
    }
    rs.close();
    st.close();
    con.close();
}
}
