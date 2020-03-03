package Session5;

// step 1 - import package sql
import java.sql.*;
import java.util.Collection;

public class DemoDatabase {
    public static void main(String[] args) {
        try {
            // step 2 - Khai bao Driver
            Class.forName("com.mysql.jdbc.Driver");

            // step 3 - Tao Url Database
            String url = "jdbc:mysql://localhost:8889/t1907m";
            String username = "root";
            String password = "root"; // "" neu dung xamp, "root" neu dung mamp

            // step 4 - ket noi Database
            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("Ket noi My sql thanh cong");

            //Thu truy van  lay Students
            Statement stm = conn.createStatement();
            String sql_text = "SELECT * FROM students";
            ResultSet rs = stm.executeQuery(sql_text);
            while (rs.next()){
                String line = rs.getInt("id") +"-"+ rs.getString("name");
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
