package lab1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Form {
    public TextField txtName = new TextField();
    public TextField txtAge = new TextField();
    public TextField txtMark = new TextField();
    public TextArea txtArea = new TextArea();
    public Text txtMesseage = new Text();
    Connection conn;


    public void submitStudent() {
        String name = txtName.getText();
        Integer age ;
        Integer mark;

        try {
            age = Integer.parseInt(txtAge.getText());
            mark = Integer.parseInt(txtMark.getText());
            Student a = new Student(name, age, mark);
            insertTable(conn,a);
        } catch (Exception e) {
//            age = 18;
//            mark = 0;
            // thong bao loi chuong trinh
            txtMesseage.setText("Vui long nhap day du thong tin");
        }
    }

    public void showArea(String s) {
        txtArea.setText(s);
    }

    public void showTable(Connection conn) {
        try {
            Statement stm = conn.createStatement();
            String sql_text = "SELECT * FROM students";
            ResultSet rs = stm.executeQuery(sql_text);
            String txtArea = "";
            while (rs.next()) {
                String line = rs.getInt("id") + "-" + rs.getString("name") + "-" + rs.getInt("age") + "-" + rs.getInt("mark");
                txtArea += line + "\n";
            }
            System.out.println(txtArea);
            showArea(txtArea);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void insertTable(Connection conn,Student student){
        try {
            Statement stm = conn.createStatement();
            String query = ("INSERT INTO students (name, age, mark) "+" VALUES (?, ?, ?)");
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1,student.getName());
            preparedStatement.setInt(2,student.getAge());
            preparedStatement.setInt(3,student.getMark());
            preparedStatement.execute();
            showTable(conn);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @FXML
    public void initialize(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:8889/t1907m";
            String username = "root";
            String password = "root";
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Ket noi My sql thanh cong");
//            insertTable(conn);
            showTable(conn);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        txtMesseage.setText("");
    }
    public void inputchane(MouseEvent inputMethodEvent) {
        txtMesseage.setText("");
    }
}
