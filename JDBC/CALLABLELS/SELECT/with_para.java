package JDBC.CALLABLELS.SELECT;

import java.sql.*;

public class with_para {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/startersql";
    private static final String username = "root";
    private static final String password = "Omkar@123";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            CallableStatement cs = con.prepareCall("{call procedure1(?)}");
            cs.setInt(1, 2);
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                System.out.println("ID : " + rs.getInt("id") + " | " + "Name : " +
                        rs.getString("name") + " | " + "Age : " + rs.getInt("age")
                        + " | " + "Grade : " + rs.getString("grade")
                );
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
