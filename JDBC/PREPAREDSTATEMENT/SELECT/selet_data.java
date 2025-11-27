package JDBC.PREPAREDSTATEMENT.SELECT;

import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;

public class selet_data {
    private static final String url ="jdbc:mysql://127.0.0.1:3306/startersql";
    private static final String username ="root";
    private static final String password ="Omkar@123";
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try{
            int[] id = {2,3,4,5};
            Connection connection = DriverManager.getConnection(url,username,password);
            String query = "Select * from students where id = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            for (int ids : id){
                ps.setInt(1,ids);
                ResultSet rs =  ps.executeQuery();
                if(rs.next()){
                    System.out.println("ID : "+ rs.getInt("id"));
                    System.out.println("NAME : "+ rs.getString("name"));
                    System.out.println("AGE : "+ rs.getInt("age"));
                    System.out.println("GRADE : "+rs.getString("grade"));
                    System.out.println("------------------------------------------------");
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
