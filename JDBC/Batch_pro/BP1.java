package JDBC.Batch_pro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BP1 {
    private static final String url ="jdbc:mysql://127.0.0.1:3306/startersql";
    private static final String username = "root";
    private static final String password = "Omkar@123";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try{
            Connection con = DriverManager.getConnection(url,username,password);
            Statement state = con.createStatement();
            while(true){
                System.out.println("Enter the Name: ");
                String name = sc.next();
                System.out.println("Enter the mail: ");
                String email = sc.next();
                System.out.println("Ente The Gender : ");
                String gender = sc.next();
                System.out.println("Enter the Salary : ");
                int salary = sc.nextInt();
                String query = String.format("Insert into users (name,email,gender,salary) values ('%s','%s','%s',%d)",name,email,gender,salary);
                state.addBatch(query);
                System.out.println("Enter More Data(Y/N): ");
                String choice=sc.next();
                if(choice.toUpperCase().equals("N")){
                    break;
                }
            }
            int[] val = state.executeBatch();
            System.out.println("Insteted row : "+val.length);
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
