package jdbc.bookstore;

import java.sql.*;
import java.util.Scanner;

public class BookStoreCRUD {
   private static String URL="jdbc:mysql://localhost:3306/ise_bookstore_db";
   private static String USERNAME="root";
   private static String PASSWORD="123456789";

    static void main(String[] args) {
        // Try with resources [The classes are auto-closed by jvm]
        try(Connection conn= DriverManager.getConnection(URL,USERNAME,PASSWORD);
            Scanner scanner=new Scanner(System.in)){
            Class.forName("com.mysql.cj.jdbc.Driver");
            //MAIN CRUD APPLICATION [BOOKSTORE]
            while (true){
                //Display some menuoptions
                System.out.println("\n1.Create Books | 2.Read Books | 3.Update Books | 4.Delete Books | 5.Exit");
                System.out.println("Choice: ");
                int ch=scanner.nextInt();
                scanner.nextLine(); // Consume leftover newline - goes to next
                //========================== CREATE ==========================
                if(ch==1){
                    System.out.print("Title: ");
                    String title= scanner.nextLine();
                    System.out.print("Author: ");
                    String author= scanner.nextLine();
                    System.out.print("Price: ");
                    Double price= scanner.nextDouble();
                    // Prepared statement to prevent SQL Injection
                    String sql="insert into books (title,author,price) values (?,?,?)";
                    try(PreparedStatement ps=conn.prepareStatement(sql)){
                        ps.setString(1,title);
                        ps.setString(2,author);
                        ps.setDouble(3,price);
                        ps.executeUpdate(); // Executes the INSERT operation
                        System.out.println("Book: "+title+" added to DB");
                    }
                }
                //======================= Read ==========================
                else if(ch==2){
                    String sql="select * from books";
                    try(Statement statement= conn.createStatement();
                        ResultSet rs=statement.executeQuery(sql)){
                        System.out.println("ID | TITLE | AUTHOR | PRICE");
                        while (rs.next()){
                            int id=rs.getInt("id");
                            String title= rs.getString("title");
                            String author=rs.getString("author");
                            double price= rs.getDouble("price");
                            System.out.println(id+"\t|\t"+title+"\t|\t"+author+"\t|\t"+price);
                        }
                    }
                }
                // ==================================== Update ========================
                else if (ch==3) {
                    System.out.println("Enter book ID to update: ");
                    int id=scanner.nextInt();
                    scanner.nextLine(); //Consume the leftover line
                    System.out.println("New Title: ");
                    String title= scanner.nextLine();
                    System.out.println("New Author: ");
                    String author= scanner.nextLine();
                    System.out.println("Price: ");
                    double price= scanner.nextDouble();
                    String sql="update books set title=?,author=?,price=? where id=?";
                    try(PreparedStatement ps= conn.prepareStatement(sql)){
                        ps.setString(1,title);
                        ps.setString(2,author);
                        ps.setDouble(3,price);
                        ps.setInt(4,id);
                        int rows=ps.executeUpdate(); // Returns affected rows
                        if(rows>0){
                            System.out.println("Updated");
                        }else System.out.println("ID not found");
                    }
                }
                //============================ Delete ===================
                else if (ch==4) {
                    System.out.println("Enter Book ID to delete: ");
                    int id= scanner.nextInt();
                    String sql="delete from books where id=?";
                    try(PreparedStatement ps= conn.prepareStatement(sql)){
                        ps.setInt(1,id);
                        int rows=ps.executeUpdate();
                        if(rows>0){
                            System.out.println("Deleted");
                        }else System.out.println("ID not found");
                    }
                }
                // =========================== EXIT =================================
                else if (ch==5){
                    System.out.println("Exiting the system");
                    for (int i=0;i<5;i++){
                        System.out.println(". ");
                        Thread.sleep(1000);
                    }
                    break; //Exits the while loop
                }
                //Handles the invalid choices
                else {
                    System.out.println("Invalid Choice");
                    System.out.println("Choices: [1,2,3,4,5]");
                }
            }
        }catch (ClassNotFoundException e){
            System.out.println("MYSQL JDBC Driver not found. Add JAR to classpath");
        }catch (SQLException e){
            System.out.println("Database error: "+e.getMessage());
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
