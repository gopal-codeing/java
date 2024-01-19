// import javax.swing.JFrame;
import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.awt.Container.*;
public class Clock extends JFrame{
    Clock(){
        setLayout(null);
        JFrame frame=new JFrame();
        frame.setSize(400,250);//400 width and 500 height  
        LocalTime time = LocalTime.now();
        System.out.println();
        LocalDate date= LocalDate.now(); 
        // System.out.println(date);

        JLabel time1= new JLabel();
        time1.add(time);
        // JLabel date2= new JLabel(date);
        // JButton  clickhere1= new JButton();
        // JButton  clickhere2= new JButton("Loginuser");
        frame.setLayout(null);//using no layout managers  
        frame.setVisible(true);//making the frame visible  

    }
    public static void main(String... usg){
        new Clock();
    }
}
