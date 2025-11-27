


                    // This  Code very error i am not solve error ....
                        // program run but logical error ..



package JDBC.Transation;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class p_j_r {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/startersql";
    private static final String username = "root";
    private static final String password = "Omkar@123";

    public  static boolean billing (Connection con, int price , int p_id){
        String q1 = "select price from bus_travel where p_id = ?";
       try{
           PreparedStatement pe = con.prepareStatement(q1);
           pe.setInt(1,p_id);
           ResultSet re = pe.executeQuery();
           if(re.next()){
               int c_p = re.getInt("price");
               return  (c_p < price);
           }
           else{
               return true;
           }
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
    }
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try{
            Connection con = DriverManager.getConnection(url,username,password);
            con.setAutoCommit(false);
            String q1 = "Update bus_travel set price= price - ? where p_id=? ";
            String q2 = "Update bus_travel set price= price + ? where p_id=? ";

            PreparedStatement pr1 = con.prepareStatement(q1);
            PreparedStatement pr2 = con.prepareStatement(q2);
            Scanner sc = new Scanner(System.in);
            System.out.println("Sender id : ");
            int pa1  = sc.nextInt();
            System.out.println("recever id : ");
            int pa2  = sc.nextInt();
            System.out.println("price : ");
            int price = sc.nextInt();
            pr1.setInt(1,price);
            pr1.setInt(2,pa1);
            pr1.setInt(1,price);
            pr1.setInt(2,pa2);
            pr1.executeUpdate();
            pr2.executeUpdate();
            if(billing(con, price, pa1)){
                con.commit();
                System.out.println("passenger are Comfirm");
            }
            else{
                con.rollback();
                System.out.println("passenger is not confirm");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
