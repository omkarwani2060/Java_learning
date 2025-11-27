package JDBC.CALLABLELS.INOUT;

import java.sql.*;

public class inout1 {
    private static final String url ="jdbc:mysql://127.0.0.1:3306/startersql";
    private static final String username = "root";
    private static final String password = "Omkar@123";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con1 = DriverManager.getConnection(url,username,password);
        CallableStatement sc = con1.prepareCall("{call ohj(?)}");
        sc.setInt(1,3000);
        sc.registerOutParameter(1, Types.INTEGER);
        sc.execute();
        int val = sc.getInt(1);
        System.out.println("Salary increment : "+val);

    }
}
