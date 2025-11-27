package JDBC.CALLABLELS.OUT_PARA;
import java.sql.*;
public class Out_para {
    private static final String url ="jdbc:mysql://127.0.0.1:3306/startersql";
    private static final String username = "root";
    private static final String password = "Omkar@123";
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try{
            Connection con = DriverManager.getConnection(url,username,password);
            CallableStatement cs = con.prepareCall("{call hj(?,?)}");
            cs.setInt(1,6);
            cs.registerOutParameter(2,Types.INTEGER);
            cs.execute();
            int val = cs.getInt(2);
            System.out.println("SALARY : -  " + val);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
