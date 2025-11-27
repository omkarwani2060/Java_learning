package JDBC.FIRST_PROGRAM;
import java.sql.*;

public class Starter {
    private  static final String url = "jdbc:mysql://127.0.0.1:3306/startersql";
    private static final String  username = "root";
    private static final String password = "Omkar@123";

    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (Exception e){                   // ClassnotfoundException
            System.out.println(e.getMessage());
        }

        try{
            Connection con1 = DriverManager.getConnection(url,username,password);
            Statement stat1 = con1.createStatement();
            ResultSet r1 = stat1.executeQuery("Select * from users");
            while(r1.next()){
                int id = r1.getInt("id");
                String name = r1.getString("name");
                String email = r1.getString("Email");
                String gender = r1.getString("gender");
                String dob = r1.getString("date_of_birth");
                int salary = r1.getInt("salary");
                Date current = r1.getDate("created_at");
                System.out.println("ID : "+ id);
                System.out.println("Name : "+name);
                System.out.println("email : "+ email);
                System.out.println("gender : "+ gender);
                System.out.println("date_of_birth : "+ dob);
                System.out.println("Salary : "+ salary);
                System.out.println("currunt time : "+ current);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
