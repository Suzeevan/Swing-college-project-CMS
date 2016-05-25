package CMS;

import javax.swing.*;
import java.awt.*;

/**
 * Created by krishn on 5/13/2016.
 */
public class Aboutus extends JFrame {

    public Aboutus()
    {
        setSize(400,400);
        JPanel panel = new JPanel();


        JLabel label = new JLabel();

        label.setText("This is a java food house.we offer you the healthy and delicious food");
        label.setFont(label.getFont().deriveFont(13f));
        //label.setFont(new Font("Courier New", Font.ITALIC, 25));
        label.setForeground(Color.BLUE);


        panel.add(label);
        setVisible(true);
        add(panel);
    }

    public static void main(String[] args) {
        Aboutus aboutus=new Aboutus();
    }
}
