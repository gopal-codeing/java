import java.awt.Color;
import java.sql.ResultSet;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.xml.transform.Result;
import java.sql.*;

public class ViweEmpolyee extends JFrame{
     JTable table;
    ViweEmpolyee(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        table = new JTable();
        try{
            Conn3 c= new Conn3();
            ResultSet rs =c.s.executeQuery("select * from employee");
            // table.setModel(DbUtils.ResultSetTableModel(rs));
        }catch(Exception e){
            e.printStackTrace();
        }
       setSize(900,700);
       setLocation(250,100);
       setVisible(true);
    }
    public static void main(String []dkh){
new ViweEmpolyee();
    }
}
