import java.awt.Color;
import java.awt.Font;  
import java.awt.Image;
import java.awt.event.*;

import javax.swing.*;

public class Employee1 extends JFrame implements ActionListener {
    
Employee1()
{  // constructer 
  setLayout(null); // set background color or image

// Heading 
    JLabel heading= new JLabel("EMPOLYEE MANAGEMENT SYSTEM");   // heading 
    heading.setBounds(80,30,1200,60);   
    heading.setFont(new Font("serif",Font.PLAIN,60));
     heading.setForeground(Color.red);
       add (heading);
 
       // Images

       ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg")); 
       Image i2 =i1.getImage().getScaledInstance(1100,700 , Image.SCALE_DEFAULT);
       ImageIcon i3 =new ImageIcon(i2);
       JLabel image =new JLabel(i3);
       image.setBounds(50, 100,  1050, 500);
     add(image);

//   click button

     JButton  clickhere= new JButton("Loginuser");
     clickhere.setBounds(400,400,300,70);
     clickhere.addActionListener(this);
      add(clickhere);


    //   JFrame fra =new JFrame();  // jframe is  a class 
      setSize(1170,650);  // jframe size 
      setLocation(80, 50);
      setVisible(true);    //
      
     while (true) {
      heading.setVisible(false);
      try{
        Thread.sleep(500);
        }catch(Exception e)
        {
        }

    heading.setVisible(true);
     try{
      Thread.sleep(500);
     }catch(Exception e){

     }
   }

}

public void actionPerformed(ActionEvent ae){
    setVisible(false);
    new User2();
}


    public static void main(String... jdg){
        // System.out.println("Hello Employee ");
        new Employee1();
    }
} 