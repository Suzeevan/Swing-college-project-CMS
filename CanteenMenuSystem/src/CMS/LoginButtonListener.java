package CMS;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by krishn on 5/10/2016.
 */
public class LoginButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        JOptionPane.showMessageDialog(null,"Login Button Pressed");
    }
}
