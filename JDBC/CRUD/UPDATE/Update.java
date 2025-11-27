package JDBC.CRUD.UPDATE;
import java.sql.*;

public class Update {
    private static final String url="jdbc:mysql://127.0.0.1:3306/startersql";
    private static final String username = "root";
    private static final String password = "Omkar@123";
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try{
            int id_number = 1;
            Connection con = DriverManager.getConnection(url,username,password);
            Statement state = con.createStatement();
            String query = String.format("Update emp set name='%s' where id= %d ","Kalu ",id_number);
            int row_effect = state.executeUpdate(query);
            if(row_effect > 0){
                System.out.println("Update Successfully");
                try{
                    Connection con1 = DriverManager.getConnection(url,username,password);
                    Statement state1 = con1.createStatement();
                    ResultSet r1 = state1.executeQuery("Select * from emp where id ="+id_number);
                    while(r1.next()){
                        int id = r1.getInt("id");
                        String name = r1.getString("name");
                        int age = r1.getInt("age");
                        String gender = r1.getString("gender");
                        System.out.println("ID : "+ id);
                        System.out.println("Name: "+ name);
                        System.out.println("Age: "+ age);
                        System.out.println("Gender : "+ gender);
                    }
                }
                catch (SQLException e){
                    System.out.println(e.getMessage());
                }
            }
            else{
                System.out.println("Not Update Success Fully");
            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
