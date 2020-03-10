package ass8;


import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Form {
    public TextField txtName = new TextField();
    public TextField txtAge = new TextField();
    public TextField txtMark = new TextField();

    public void submit(){
        try {
            // Step 2
            Class.forName("com.mysql.jdbc.Driver");

            // Step 3:
            String url = "jdbc:mysql://localhost:8889/t1907m";
            String username = "root";// thuong thi luon la root
            String password = "root"; // "" neu dung xampp "root" neu dung mamp

            //Step 4
            Connection conn = DriverManager.getConnection(url,username,password);

            String name = txtName.getText();
            Integer age = Integer.parseInt(txtAge.getText());
            Integer mark = Integer.parseInt(txtMark.getText());

            String sql_text = "INSERT INTO students(name,age,mark) VALUES(?,?,?)";

            PreparedStatement prStm = conn.prepareStatement(sql_text);
            prStm.setString(1,name);
            prStm.setInt(2,age);
            prStm.setInt(3,mark);
            if(!prStm.execute()){
                Main.studentStage.getScene().setRoot(Main.listPage);
                List.reloadData();
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}