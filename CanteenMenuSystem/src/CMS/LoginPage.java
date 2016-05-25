package CMS;

import javax.swing.*;
import javax.xml.ws.soap.AddressingFeature;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by krishn on 5/10/2016.
 */
public class LoginPage extends JFrame{


    public LoginPage()
    {

        JFrame frame=new JFrame("Login");
        frame.setSize(400,400);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel=new JPanel();
        panel.setSize(300,150);

        frame.add(panel);
        placecomponent(panel);


        frame.setVisible(true);
    }
    private static void placecomponent(JPanel panel) {
        panel.setLayout(null);


        JLabel userlabel = new JLabel("UserName:");
        userlabel.setBounds(10, 10, 80, 25);
        panel.add(userlabel);

        JTextField userTextField = new JTextField(20);
        userTextField.setBounds(100, 10, 160, 25);
        panel.add(userTextField);


        JLabel passwordlabel = new JLabel("Password:");
        passwordlabel.setBounds(10, 40, 80, 25);
        panel.add(passwordlabel);



        JPasswordField passwordTextField = new JPasswordField(20);
        passwordTextField.setBounds(100, 40, 160, 25);
        panel.add(passwordTextField);

        JButton submitbutton = new JButton("Login");
        submitbutton.setBounds(10, 80, 80, 25);
        panel.add(submitbutton);

        JButton registerbutton = new JButton("LogOut");
        registerbutton.setBounds(180, 80, 80, 25);
        panel.add(registerbutton);
        panel.setVisible(true);


        submitbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userTextField.getText();
                String password = passwordTextField.getText();
                System.out.println(username);
                System.out.println(password);
               SQL mydb = new SQL();
                Connection conn = null;
                Statement stmt = null;
                conn = mydb.getConn();

                try {

                    stmt = conn.createStatement();
                    String sql = "SELECT * FROM admin";
                    ResultSet rs = stmt.executeQuery(sql);
                    while(rs.next()){
                        String uname = rs.getString("username");
                        String pass = rs.getString("password");
                        if(username.equals(uname)){
                            if(password.equals(pass)){
                                AddOperation add = new AddOperation();

                            }
                        }
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });

        registerbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             LoginPage loginPage=new LoginPage();

            }
        });
    }
    void disposeFrame(){
        this.dispose();
    }

}
