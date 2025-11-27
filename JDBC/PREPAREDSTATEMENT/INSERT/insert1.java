package JDBC.PREPAREDSTATEMENT.INSERT;
import  java.sql.*;
import java.sql.SQLException;

public class insert1 {
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
            Connection con1 = DriverManager.getConnection(url,username,password);
            String query = "Insert into students (name,age,grade) values (?,?,?)";
            PreparedStatement ps = con1.prepareStatement(query);

            ps.setString(1,"Om");
            ps.setInt(2,30);
            ps.setString(3,"AB+");
            int val = ps.executeUpdate();
            if(val > 0){
                System.out.println("Insert the data");
            }
            else{
                System.out.println("Not insert Data");
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
