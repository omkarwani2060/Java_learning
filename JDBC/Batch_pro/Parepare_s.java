package JDBC.Batch_pro;
import java.sql.*;

public class Parepare_s {
    private static final String url ="jdbc:mysql://127.0.0.1:3306/startersql";
    private static final String username = "root";
    private static final String password = "Omkar@123";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url,username,password);
        String query = "update users set name= ? where id = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1,"Raja Don");
        ps.setInt(2,4);
        ps.addBatch();

        ps.setString(1,"bacchan");
        ps.setInt(2,5);
        ps.addBatch();

        ps.setString(1,"dadya");
        ps.setInt(2,6);
        ps.addBatch();

        int[] result = ps.executeBatch();
        for(int i: result){
            System.out.println("batch : "+ i);
        }
        System.out.println("Data succcessfull updated..");
    }
}
