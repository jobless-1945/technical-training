package jdbc;

import java.sql.*;

public class JDBCReadDemo {
    static void main(String[] args) throws Exception{
        //Load the JDBC Driver  [jar file]
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Start / Establish the connection
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/snpsu_ise_jdbc",
                "root",
                "123456789");
        System.out.println("Connection Established!!!");
        Statement statement= connection.createStatement();
        ResultSet rs= statement.executeQuery("SELECT * FROM students");
        while (rs.next()){
            System.out.println(rs.getString(1)+"\t"+rs.getString(2));
        }
        rs.close();
        statement.close();
        connection.close();
    }
}
