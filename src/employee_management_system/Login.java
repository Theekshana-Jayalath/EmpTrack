package employee_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JTextField tusername;

    JPasswordField tpassword;

    JButton login, back;

    Login(){

        setSize(600,300);
        setLocation(450,200);
        setLayout(null);

        /*  ----background image---
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/loginBG.jpg"));
        Image i2 = i1.getImage().getScaledInstance(60,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,600,300);
        add(img);*/

       /* ---icon on login page----
        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        Image i22= i11.getImage().getScaledInstance(600,400,Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i22);
        JLabel img = new JLabel(i33);
        img.setBounds(350,10,600,400);
        add(img);
*/
        JLabel username = new JLabel("Username");
        username.setBounds(40,30,100,30);
        add(username);

        tusername = new JTextField();
        tusername.setBounds(150,30,150,30);
        add(tusername);

        JLabel password = new JLabel("Password");
        password.setBounds(40,80,100,30);
        add(password);

        tpassword = new JPasswordField();
        tpassword.setBounds(150,80,150,30);
        add(tpassword);

        login = new JButton("Login");
        login.setBounds(150,140,150,30);
        login.setBackground(Color.black);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        back = new JButton("Back");
        back.setBounds(350,140,150,30);
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==login){

        } else if (e.getSource()== back) {
            System.exit(90);
        }
    }


    public static void main(String[] args) {
        new Login();
    }
}
