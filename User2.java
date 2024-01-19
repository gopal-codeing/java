
import java.awt.Color;
import java.awt.Image;

// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JTextField;
// import javax.accessibility.AccessibleSelection;
import javax.swing.*;
import java.awt.event.*;  
import java.sql.*;
import java.awt.*;

public class User2 extends JFrame implements ActionListener {

       JTextField textname ,textpassword ;
      //  Connection c;
      //  Statement s;
    User2() {
        
       

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel username = new JLabel("Username:");
        username.setBounds(40, 20, 100, 30);
        add(username);

         textname = new JTextField();
        textname.setBounds(150, 20, 150, 30);
        add(textname);

        JLabel password = new JLabel("Password:");
        password.setBounds(40, 70, 100, 30);
        add(password);

         textpassword = new JTextField();
        textpassword.setBounds(150, 70, 150, 30);
        add(textpassword);


        JButton login =new JButton("LOGIN");
        login.setBounds(150,140,150,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2  =i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(350,0,200,200);
           add(image);        
        


        setSize(600, 300);
        setLocation(450, 200);
        setVisible(true);


    }

    public void actionPerformed(ActionEvent ae){
      try{
        String username= textname.getText();
        String password= textpassword.getText();
  
        Conn3 c=new Conn3();

        String query="Select * from login where username ='"+username+"' and password='"+ password+"'";

       ResultSet rs =c.s.executeQuery(query);
     if(rs.next()){
        setVisible(false);
        new Home4();
     }else{
        JOptionPane.showMessageDialog(null ,"Invelid username or password ");
        setVisible(false);
     }
      }catch(Exception e){
         e.printStackTrace();
      }
    }

    public static void main(String... jdg) {
        new User2();
    }
}
