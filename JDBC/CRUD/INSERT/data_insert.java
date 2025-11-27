package JDBC.CRUD.INSERT;
import java.sql.*;

public class data_insert{
    private static final String url = "jdbc:mysql://127.0.0.1:3306/startersql";
    private static final String username ="root";
    private static final String password ="Omkar@123";
    public static void main(String[] args) {

                        // insert the values in table

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection con1= DriverManager.getConnection(url,username,password);
            Statement state1 = con1.createStatement();
            String query = String.format("Insert into emp(name,age,gender) values ('%s',%d,'%s')","Sakshi",27,"Female");
            int row = state1.executeUpdate(query);
            if(row > 0){
                System.out.println("Data inserted Successfully");
            }
            else{
                System.out.println("Data Not Inserted Successfully");
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }


                    // read the table :- print the table

        try{
            Connection con2 = DriverManager.getConnection(url,username,password);
            Statement state1 = con2.createStatement();
            ResultSet re1= state1.executeQuery("select * from emp");
            while(re1.next()){
                int id = re1.getInt("id");
                String name = re1.getString("name");
                int age = re1.getInt("age");
                String gender = re1.getString("gender");
                System.out.println("ID :"+id);
                System.out.println("Name :"+name);
                System.out.println("Age :"+age);
                System.out.println("gender :"+gender);
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}

