package JDBC.Transation;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class commit_rollback {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/startersql";
    private static final String username = "root";
    private static final String password = "Omkar@123";

    public static boolean inSufficient(Connection con,int acc_no,int amount){
        try {
            String q3 = "select balance from bank where acc_no = ?";
            PreparedStatement state = con.prepareStatement(q3);
            state.setInt(1,acc_no);
            ResultSet res = state.executeQuery();
            if(res.next()){
                int current_amount = res.getInt("balance");
                return (current_amount > amount);
            }
            else{
                return false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            Connection con = DriverManager.getConnection(url,username,password);
            con.setAutoCommit(false);
            String q1 = "update bank set balance = balance - ?  where acc_no = ?";
            String q2 = "update bank set balance = balance + ? where acc_no = ?";
            PreparedStatement ps1 = con.prepareStatement(q1);
            PreparedStatement ps2 = con.prepareStatement(q2);
            System.out.println("Enter Account Number: ");
            int account_no = sc.nextInt();
            System.out.println("Enter Amount : ");
            int amount = sc.nextInt();
            ps1.setInt(1,amount);
            ps1.setInt(2,account_no);
            ps2.setInt(1,amount);
            ps2.setInt(2,102);
            ps1.executeUpdate();
            ps2.executeUpdate();
            if(inSufficient(con ,account_no, amount)){
                con.commit();
                System.out.println("Transation Successfull");
            }
            else{
                con.rollback();
                System.out.println("Insufficient balance.. transation Failed..");
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
