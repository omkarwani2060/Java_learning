package JDBC.METADATA;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;

public class resultsetMDB {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/startersql";
    private static final String username = "root";
    private static final String password = "Omkar@123";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,password);

        PreparedStatement ps = con.prepareStatement("SELECT id, name, age FROM students");
        ResultSet rs = ps.executeQuery();

        ResultSetMetaData rsmd = rs.getMetaData();

        System.out.println(rsmd.getColumnCount());

        // column name
        for(int i=1; i<=rsmd.getColumnCount(); i++){
            System.out.println(rsmd.getColumnName(i));
        }



    }
}
