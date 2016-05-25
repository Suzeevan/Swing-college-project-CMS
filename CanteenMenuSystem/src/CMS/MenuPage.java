package CMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by krishn on 5/10/2016.
 */
public class MenuPage extends JFrame {


    public MenuPage() {
        //JFrame frame=new JFrame("Java Food House");
        setSize(1000, 680);
        setBackground(Color.white);

        //JPanel panel=new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel panel = new JPanel(new GridBagLayout());
        //GridBagConstraints cons = new GridBagConstraints();


        JLabel label = new JLabel();

        label.setText("Welcome to Java Food House");
        label.setFont(label.getFont().deriveFont(64f));
        //label.setFont(new Font("Courier New", Font.ITALIC, 25));
        label.setForeground(Color.BLUE);


        panel.add(label);


        JPanel panel1 = new JPanel();
        panel1.setBorder(BorderFactory.createLineBorder(Color.black));
        panel1.setBounds(800, 800, 200, 100);
        JButton button = new JButton("Login");
        button.setBounds(60, 400, 220, 30);
      //  button.setFont(button.getFont().deriveFont(34f));
        panel1.add(button);


        JButton button1 = new JButton("About Us");
        button1.setBounds(60, 400, 220, 30);
        panel1.add(button1);

        JButton button2 = new JButton("Menu");
        button2.setBounds(60, 400, 220, 30);
        panel1.add(button2);

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                disposeFrame();
            }
        });

        button.addActionListener(e -> {
            LoginPage lpage = new LoginPage();
            disposeFrame();
        });

        button2.addActionListener(e -> {
            AfterLogin afterLogin = new AfterLogin();
            disposeFrame();

        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Aboutus aboutus=new Aboutus();
                disposeFrame();
            }
        });


           add(panel,BorderLayout.NORTH);
         add(panel1,BorderLayout.CENTER);
        setVisible(true);



    }

    void disposeFrame() {
        this.dispose();
    }


    public static void main(String[] args) {

        MenuPage menuPage=new MenuPage();


    }

}
