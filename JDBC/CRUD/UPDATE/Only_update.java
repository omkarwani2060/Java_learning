package JDBC.CRUD.UPDATE;

import java.sql.*;

public class Only_update {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/startersql";
    private static final String username = "root";
    private static final String password = "Omkar@123";
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement state = connection.createStatement();
            String query = String.format("Update emp set age=%d where id= %d",100,1);
            int row_effect = state.executeUpdate(query);
            if(row_effect > 0){
                System.out.println("Update Successfully");
            }
            else{
                System.out.println("NOt Successfully");
            }
        }
        catch( SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
