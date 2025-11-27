package JDBC.CALLABLELS.SELECT;
import java.sql.*;

public class without_para {
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
            Connection connection = DriverManager.getConnection(url,username,password);
            CallableStatement cs = connection.prepareCall("{call getval()}");
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                System.out.println(" "+rs.getInt("id") + " | " + rs.getString("name") +
                        " | "+ rs.getInt("age") + " | " + rs.getString("grade"));
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
