package JDBC.PREPAREDSTATEMENT.INSERT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class insert_value {
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
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "Insert into students (name ,age ,grade) values (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1,"giri");         // first data users
            ps.setInt(2,34);
            ps.setString(3,"B+");
            ps.setString(1,"Adi");          // decond data users
            ps.setInt(2,16);
            ps.setString(3,"C+");
            int row_effect = ps.executeUpdate();
            if(row_effect > 0){
                System.out.println("Data Inserted Successfully");
            }
            else{
                System.out.println("Data Not Inserted.");
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
