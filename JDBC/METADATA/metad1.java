package JDBC.METADATA;
import java.sql.*;

public class metad1 {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/startersql";
    private static final String username = "root";
    private static final String password = "Omkar@123";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url,username,password);
        DatabaseMetaData dbmd = con.getMetaData();
        System.out.println(dbmd.getDriverName());
        System.out.println(dbmd.getDriverVersion());

        System.out.println(dbmd.getDatabaseProductName());      //db name
        System.out.println(dbmd.getDatabaseProductVersion());       // db version

//        ResultSet rs = dbmd.getTables(null, null, "%", null);
//        while(rs.next()){
//            System.out.println(rs.getString(3));  // 3rd column = table name
//        }

//        ResultSet rs = dbmd.getColumns(null, null, "students", null);
//        while(rs.next()){
//            System.out.println(rs.getString("COLUMN_NAME") + " - " + rs.getString("TYPE_NAME"));
//        }

        System.out.println(dbmd.supportsTransactions());
        System.out.println(dbmd.supportsBatchUpdates());
        System.out.println(dbmd.supportsStoredProcedures());





    }
}
