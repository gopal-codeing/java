import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.*;
import java.time.LocalDate;
import java.awt.event.*;
import java.sql.*;
public class Addempolyee5 extends JFrame  implements ActionListener{
    Random num=new Random();
    int n=num.nextInt(99999);
 
    JTextField tfname, tffname,tfphone,tfsalary,tfadhar,tfdesign,tfemail,tfadders; 
     JComboBox cbeduction;
     JLabel ible;
     JButton add,back;
    Addempolyee5(){
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel heading =new JLabel(" Add Employee Detail ");
        heading.setBounds(280,30,500,50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD,25));
        add(heading);

        JLabel labelname = new JLabel("Name:");
        labelname.setBounds(50,150,150,30);
        labelname.setFont(new Font("serif",Font.PLAIN,20));
        add(labelname);

         tfname =new JTextField();
        tfname.setBounds(170,150,140,25);
        add(tfname); 

        JLabel labelfname = new JLabel("Father Name:");
        labelfname.setBounds(400,150,150,30);
        labelfname.setFont(new Font("serif",Font.PLAIN,20));
        add(labelfname);

        tffname =new JTextField();
        tffname.setBounds(550,150,140,25);
        add(tffname); 

        
        JLabel labelsalary = new JLabel("Salary:");
        labelsalary.setBounds(400,200,150,30);
        labelsalary.setFont(new Font("serif",Font.PLAIN,20));
        add(labelsalary);

        tfsalary =new JTextField();
        tfsalary.setBounds(550,200,140,25);
        add(tfsalary); 

        JLabel labeladders = new JLabel("Adderss:");
        labeladders.setBounds(50,200,150,30);
        labeladders.setFont(new Font("serif",Font.PLAIN,20));
        add(labeladders);

        tfadders =new JTextField();
        tfadders.setBounds(170,200,140,25);
        add(tfadders); 

        JLabel labelphone = new JLabel("Phone:");
        labelphone.setBounds(50,250,150,30);
        labelphone.setFont(new Font("serif",Font.PLAIN,20));
        add(labelphone);

         tfphone =new JTextField();
        tfphone.setBounds(170,250,140,25);
        add(tfphone); 

        JLabel labelemail = new JLabel("Email:");
        labelemail.setBounds(400,250,150,30);
        labelemail.setFont(new Font("serif",Font.PLAIN,20));
        add(labelemail);

         tfemail=new JTextField();
        tfemail.setBounds(550,250,140,25);
        add(tfemail); 
   
        JLabel labeleeducation = new JLabel("Hight Education:");
        labeleeducation.setBounds(50,300,150,30);
        labeleeducation.setFont(new Font("serif",Font.PLAIN,20));
        add(labeleeducation);
      
        String cours[]={"BBA","BCA","BA","BSC","B.COM","MCA","MBA","BTech","MA","MSC"};

         cbeduction =new JComboBox(cours);
        cbeduction.setBounds(200,300,120,28);
        add(cbeduction);


        JLabel labeldesignation = new JLabel("Designation:");
        labeldesignation.setBounds(50,370,150,30);
        labeldesignation.setFont(new Font("serif",Font.PLAIN,20));
        add(labeldesignation);

        tfdesign =new JTextField();
        tfdesign.setBounds(170,370,140,25);
        add(tfdesign); 

        JLabel labeladhar = new JLabel("Adhar Number:");
        labeladhar.setBounds(400,300,150,30);
        labeladhar.setFont(new Font("serif",Font.PLAIN,20));
        add(labeladhar);

         tfadhar=new JTextField();
        tfadhar.setBounds(550,300,140,25);
        add(tfadhar); 

        JLabel labelimpid = new JLabel("Employee Id:");
        labelimpid.setBounds(400,370,150,30);
        labelimpid.setFont(new Font("serif",Font.PLAIN,20));
        add(labelimpid);

         ible =new JLabel(" "+n);
        ible.setBounds(600,370,150,30);
        ible.setFont(new Font("serif",Font.PLAIN,20));
        add(ible);

         add =new JButton("Add Details");
        add.setBounds(200,450,150,40);
        add .addActionListener(this);
        add(add);

        back =new JButton("Back");
        back.setBounds(400,450,150,40);
        back.addActionListener(this);
        add(back);


   setSize(800,600);
   setLocation(300,50);
   setVisible(true);

    
}

 public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==add){
      String name =tffname.getText();
      String fname= tffname.getText();
      String adders =tfadders.getText(); 
      String salary =tfsalary.getText();
      String phone=tfphone.getText();
      String email=tfemail.getText();
      String education=(String)cbeduction.getSelectedItem();
      String adhar=tfadhar.getText();
      String designation=tfdesign.getText();
      String empId = ible.getText();

       try{
     Conn3 conn=new Conn3();
     String query="insert into employee values('"+name+"', '"+fname+"', '"+adders+"', '"+salary+"', '"+phone+"', '"+email+"', '"+education+"', '"+adhar+"', '"+designation+"', '"+empId+"')";
     conn.s.executeUpdate(query);
     JOptionPane.showMessageDialog(null, "Details added successfully");
     setVisible(false);
     new Home4();
       }catch(Exception e){
                  e.printStackTrace();
       }
    }
    else{
    setVisible(false);
    new Home4();
    }
 }
    public static void main(String... jd){
        new Addempolyee5();
    }
}
