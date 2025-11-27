package JDBC.CRUD.CREATE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import  java.sql.*;

public class create1 {
    private static final String url="jdbc:mysql://127.0.0.1:3306/startersql";
    private static final String username = "root";
    private static final String password = "Omkar@123";

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            throw new RuntimeException(e);
        }
        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement state1 = connection.createStatement();
            String query = String.format("create table emp1 (id int primary key auto_increment, name varchar(20),city varchar(10),state varchar(10))");

            state1.executeUpdate(query);
            System.out.println("TABLE CREATED SUCCESSFULLY !...");
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
