package CMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Created by krishn on 5/10/2016.
 */
public class SQL {

    private Scanner input = new Scanner(System.in);
    private String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private String URL = "jdbc:mysql://localhost/CMS";

//    private String dbName = "CMS";
    private String username = "root";
    private String password = "";

    private Statement stmt;
    private Connection conn;
    private PreparedStatement preparedStatement;
public SQL()
{

    try{
        Class.forName(JDBC_DRIVER);


        conn = DriverManager.getConnection(URL,username,password);
//
    } catch (Exception e) {
       e.printStackTrace();
    }
}

    public Connection getConn(){
        return  conn;
    }



}
