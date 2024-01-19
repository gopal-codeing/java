import javax.swing.*;
import javax.swing.text.View;
import java.awt.*;
import java.sql.ResultSet;


public class Viwe_empolyee extends JFrame{
JTable table;
Choice comployeeId;
    Viwe_empolyee(){

       getContentPane().setBackground(Color.WHITE);
       setLayout(null);

       JLabel searchlbl= new JLabel("Serch by Employee Id :");
       searchlbl.setBounds(20,20,150,20);
       add(searchlbl);
        
       comployeeId=new Choice();
       comployeeId.setBounds(180,20,150,20);
       add(comployeeId);

       table =new JTable();
       try{
   Conn3 c=new Conn3();
   ResultSet rs=c.s.executeQuery("select *from employee");
  //  table.setModel(Dbutils.ResultSetToTableModel(rs));

       }catch(Exception e){
     e.printStackTrace();
       }
       JScrollPane jsp =new JScrollPane();
       jsp.setBounds(0,100,900,600);
       add(jsp); 
     setSize(900,700);
    setLocation(300,100);
    setVisible(true);
    }
    public static void main(String... njsg){
        new Viwe_empolyee();
    }
}
