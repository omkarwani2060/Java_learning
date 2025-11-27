package JDBC.CALLABLELS.OUT_PARA;

import java.sql.*;

public class out2 {
    private static final String url ="jdbc:mysql://127.0.0.1:3306/startersql";
    private static final String username = "root";
    private static final String password = "Omkar@123";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,password);
        CallableStatement sc = con.prepareCall("{call name1j(?,?)}");
        sc.setInt(1,3);
        sc.registerOutParameter(2, Types.VARCHAR);
        sc.execute();
        String nn = sc.getString(2);
        System.out.println("NAME : "+nn);
    }
}
