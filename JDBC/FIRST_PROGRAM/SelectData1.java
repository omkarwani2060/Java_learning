package JDBC.FIRST_PROGRAM;
import java.sql.*;

public class SelectData1 {
    static String url = "jdbc:mysql://127.0.0.1:3306/startersql";
    private static final String username = "root";
    private static final String password = "Omkar@123";
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

       try{
           Connection connection = DriverManager.getConnection(url,username,password);
           Statement statement = connection.createStatement();
           ResultSet resultSet = statement.executeQuery("Select * from logs");
           while(resultSet.next()){
            int id = resultSet.getInt("id");
            String message = resultSet.getString("message");
            Date date = resultSet.getDate("created_at");
               System.out.println("ID : "+id);
               System.out.println("message : "+ message );
               System.out.println("created_at : "+ date);
           }
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }
}
