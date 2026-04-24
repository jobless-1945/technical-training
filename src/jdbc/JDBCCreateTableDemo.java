package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCCreateTableDemo {
    static void main(String[] args) {
        String URL="jdbc:mysql://localhost:3306/snpsu_ise_jdbc";
        String USERNAME="root";
        String PASSWORD="123456789";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(URL,USERNAME,PASSWORD);
            System.out.println("Connection Established");
            Statement statement= connection.createStatement();
            String createTableQuery="create table teachers ("+
                    "id int primary key auto_increment,"+"name varchar(50),"+
                    "age int,"+"salary double)";
            statement.executeUpdate(createTableQuery);
            System.out.println("table 'teachers' created");
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
