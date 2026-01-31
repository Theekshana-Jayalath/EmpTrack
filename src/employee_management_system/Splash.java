package employee_management_system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {

        Splash(){

            ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
            Image i2 = i1.getImage().getScaledInstance(1170,650,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            image.setBounds(0,0,1170,650);
            add(image);

            setSize(1170,650);
            setLocation(200,50);
            setLayout(null);
            setVisible(true);

            JLabel heading = new JLabel("Employee Management System");
            heading.setBounds(180, 250, 800, 80);
            heading.setFont(new Font("Serif", Font.BOLD, 60));
            heading.setForeground(Color.WHITE);

            image.add(heading);

            try{
                Thread.sleep(5000);
                setVisible(false);

            }catch(Exception e){
                e.printStackTrace();
            }

        }

         public static void main(String[] args){
             new Splash();
         }
}
