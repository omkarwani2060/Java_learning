package JDBC.PREPAREDSTATEMENT.DELETE;
import java.sql.*;

public class delete1 {
    private static final String url= "jdbc:mysql://127.0.0.1:3306/startersql";
    private static final String username = "root";
    private static final String password = "Omkar@123";
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            String query = "delete from students where id = ?";
            PreparedStatement state = connection.prepareStatement(query);
            state.setInt(1,5);
            int row_effect = state.executeUpdate();
            if(row_effect > 0){
                System.out.println("Data delete success fully.");
            }
            else{
                System.out.println("Data Not Delete success fully..");
            }

        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
