package JDBC.PREPAREDSTATEMENT;
import java.sql.*;
import java.sql.SQLException;

public class UPDATE {
    private static final String url= "jdbc:mysql://127.0.0.1:3306/startersql";
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
            String query = "update students set name= ? where id = ?";
            PreparedStatement ps = con1.prepareStatement(query);
            ps.setString(1,"Gotya");
            ps.setInt(2,5);
            int row_e =  ps.executeUpdate();
            if(row_e > 0){
                System.out.println("Data Update");
            }
            else{
                System.out.println("Data NOt Update..");
            }
        }catch (SQLException e){

        }


    }
}
