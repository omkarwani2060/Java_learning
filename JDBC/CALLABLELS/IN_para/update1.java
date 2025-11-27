package JDBC.CALLABLELS.IN_para;
import java.sql.*;

public class update1 {
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
            CallableStatement cs = con.prepareCall("{call up(?,?)}");
            cs.setString(1,"pari");
            cs.setInt(2,1);
            int val = cs.executeUpdate();
            if(val > 0){
                System.out.println("update life");
            }else{
                System.out.println("not update life");
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
