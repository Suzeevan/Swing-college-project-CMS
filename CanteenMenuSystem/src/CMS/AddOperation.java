package CMS;

import com.mysql.jdbc.PreparedStatement;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by krishn on 5/12/2016.
 */
public class AddOperation {

    public AddOperation() {
        JFrame frame = new JFrame("Add_Item");
        frame.setSize(400, 400);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setSize(300, 150);

        frame.add(panel);
        placecomponent(panel);


        frame.setVisible(true);
    }

    private static void placecomponent(JPanel panel) {
        panel.setLayout(null);


        JLabel menulabel = new JLabel("MenuTitle:");
        menulabel.setBounds(10, 10, 80, 25);
        panel.add(menulabel);

        JTextField menuTextField = new JTextField(20);
        menuTextField.setBounds(100, 10, 160, 25);
        panel.add(menuTextField);


        JLabel itemlabel = new JLabel("MenuItem:");
        itemlabel.setBounds(10, 40, 80, 25);
        panel.add(itemlabel);


        JTextArea itemTextField = new JTextArea();
        itemTextField.setBounds(100, 40, 160, 25);
        panel.add(itemTextField);

        JButton addtbutton = new JButton("Add");
        addtbutton.setBounds(10, 80, 80, 25);
        panel.add(addtbutton);

        JButton Homebutton = new JButton("Home");
        Homebutton.setBounds(10, 80, 80, 25);
        panel.add(Homebutton);

        Homebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MenuPage menuPage=new MenuPage();

            }
        });




        addtbutton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String MenuTitle = menuTextField.getText();
        String MenuItem = itemTextField.getText();

        SQL mydb = new SQL();
        Connection conn = null;
        Statement stmt = null;
        conn = mydb.getConn();
        try {
            String title = menuTextField.getText();
            String item = itemTextField.getText();
            System.out.println(MenuTitle);
            System.out.println(MenuItem);

            stmt = conn.createStatement();
//            String sql = "INSERT INTO addoperation"+" VALUES (title, item)";
//            stmt.executeUpdate(sql);
            String query = " insert into addoperation (MenuTitle,MenuItem)"
                    + " values (?, ?)";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = (PreparedStatement) conn.prepareStatement(query);
            preparedStmt.setString (1, title);
            preparedStmt.setString (2, item);

            // execute the preparedstatement
            preparedStmt.execute();
//            ResultSet rs = stmt.executeQuery(sql);
//            while(rs.next()){
//                String uname = rs.getString("");
//                String pass = rs.getString("password");
//                if(us.equals(uname)){
//                    if(password.equals(pass)){
//                        AfterLogin aflogin = new AfterLogin();
//
//                    }
//                }
            } catch (SQLException e2) {
            e2.printStackTrace();
        }
    }

});



    }


}