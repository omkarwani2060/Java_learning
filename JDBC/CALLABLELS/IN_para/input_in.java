package JDBC.CALLABLELS.IN_para;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class input_in {
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
            CallableStatement cs = con.prepareCall("{call apnap(?,?,?,?)}");
            cs.setString(1,"Mohini");
            cs.setString(2,"wagholi");
            cs.setInt(3,20);
            cs.setDate(4, Date.valueOf("2004-01-27"));
            int val = cs.executeUpdate();
            if(val > 0){
                System.out.println("One more added..!");
            }
            else{
                System.out.println("no added..");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }


    }
}
