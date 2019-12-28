
import java.sql.*;
import javax.swing.JOptionPane;
    public class DatabaseManager {
    Connection connection;
    static String userName="root";
    static String password="12345";
    static String dbUrl="jdbc:mysql://localhost:3306/library?useSSL=false&"
    + "useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
   public static Connection getConnection(){
      try{
         
           Connection connection=DriverManager.getConnection(dbUrl, userName,password);
          return connection;
      }
     catch(Exception exception){ 
        JOptionPane.showMessageDialog(null, exception);
        return null;
     }
         
  }

    void showErrorMessage(SQLException exception) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
