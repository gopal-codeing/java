import java.awt.*;
import javax.swing.*; 
import java.awt.event.*;
public class Home4 extends JFrame implements ActionListener {

    JButton add1,add2,add3,add4;
  Home4(){


    setLayout(null);

    ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg")); 
    Image i2 =i1.getImage().getScaledInstance(1100,700 , Image.SCALE_DEFAULT);
    ImageIcon i3 =new ImageIcon(i2);
    JLabel image =new JLabel(i3);
    image.setBounds(0, 0,  1120, 630);
    add(image);


  JLabel heading =new JLabel("EMPLOYEE MANAGEMENT SYSTEM ");
  heading.setBounds(640,20,400,40);
  heading.setFont(new Font("Raleway",Font.BOLD,20));
  image.add(heading);

   
   add1 =new JButton("Add Empolyee");
  add1.setBounds(650,80,150,40);
  add1.addActionListener(this);
  image.add(add1);

   add2 =new JButton("viwe Empolyee");
  add2.setBounds(830,80,150,40);
  add2.addActionListener(this);
  image.add(add2);
  
   add3 =new JButton("Update Empolyee");
  add3.setBounds(650,140,150,40);
  add3.addActionListener(this);
  image.add(add3);

   add4 =new JButton("Remove Empolyee");
  add4.setBounds(830,140,150,40);
  add4.addActionListener(this);
  image.add(add4);


    setSize(1120,630);
    setLocation(80,50);
    setVisible(true);



  }

  public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==add1){
setVisible(false);
 new Addempolyee5();

    } else if (ae.getSource()==add2){

    }else if(ae.getSource()==add3){

    }else{
        
    }

  }
  
    public static void main(String... jdg){
      new Home4();
  }   
}
