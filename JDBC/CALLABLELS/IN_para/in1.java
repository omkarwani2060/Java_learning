package JDBC.CALLABLELS.IN_para;
import java.sql.*;

public class in1 {
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
            Connection con = DriverManager.getConnection(url,username,password);
            CallableStatement cs = con.prepareCall("{call pro1(?)}");
            cs.setString(1,"Omkar");
            int val = cs.executeUpdate();
            if(val > 0){
                System.out.println("Data are Inserted...");
            }
            else{
                System.out.println("Data are Not Inserted  ");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
