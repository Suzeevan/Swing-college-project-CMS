package CMS;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by krishn on 5/12/2016.
 */
public class AfterLogin extends JFrame {


    public AfterLogin() {
        setTitle("Menulist");
        setSize(400, 400);
        setVisible(true);


//        JMenuBar menuBar = new JMenuBar();
//        JMenu menu = new JMenu("Menu List");
//        JMenuItem item1 = new JMenuItem("Breakfast");
//        JMenuItem item2 = new JMenuItem("Lunch");
//        JMenuItem item3 = new JMenuItem("Cold Drink");
//        JMenuItem item4 = new JMenuItem("Khaja");
//        JMenuItem item5 = new JMenuItem("Food for the day");
//        JMenuItem item6 = new JMenuItem("Dinner");
//
//        setJMenuBar(menuBar);
//        setVisible(true);
//        setSize(400, 200);
//        menuBar.add(menu);
//
//        menu.add(item1);
//        menu.add(item2);
//        menu.add(item3);
//        menu.add(item4);
//        menu.add(item5);
//        menu.add(item6);
        SQL mydb = new SQL();
        Connection conn = null;
        Statement stmt = null;
        conn = mydb.getConn();

        try {

            stmt = conn.createStatement();
            String sql = "SELECT * FROM addoperation";
            ResultSet rs = stmt.executeQuery(sql);
            JPanel panel=new JPanel(new GridLayout(10,2));
            while(rs.next()){
                panel.add(new JLabel(rs.getString("MenuTitle")));
                panel.add(new JLabel(rs.getString("MenuItem")));


                System.out.println(rs);
                add(panel);
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }


    }
}
//







