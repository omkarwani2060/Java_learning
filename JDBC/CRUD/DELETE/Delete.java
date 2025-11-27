package JDBC.CRUD.DELETE;
import java.sql.*;

public class Delete {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/startersql";
    private static final String username = "root";
    private static final String password = "Omkar@123";
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try{
            Connection con1 = DriverManager.getConnection(url,username,password);
            Statement state1 = con1.createStatement();
            String query = "Delete from emp where id = 1 ";
            int del = state1.executeUpdate(query);
            if(del > 0){
                System.out.println("DELETED SUCCESSFULLY");
            }
            else{
                System.out.println("NOT DELETED !...");
            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
