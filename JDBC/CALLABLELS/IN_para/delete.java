package JDBC.CALLABLELS.IN_para;
import java.sql.*;
public class delete {
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
            CallableStatement state = con.prepareCall("{call dlt(?)}");
            state.setInt(1,2);
            int val = state.executeUpdate();
            if(val > 0){
                System.out.println("Your favourite p delete.");
            }
            else{
                System.out.println("NOT delete");
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
