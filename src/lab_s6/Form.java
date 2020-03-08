package lab_s6;

import lab_s6.Products;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Form {
    public TextField txtName = new TextField();
    public TextArea txtDescription = new TextArea();
    public TextField txtPrice = new TextField();
    public TextField txtQuantity = new TextField();

    public void submit() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:8889/t1907m"; // ở cuối là tên database
            String username = "root";
            String password = "root";

            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connect Success!");

            String name = txtName.getText();
            String descripton = txtDescription.getText();
            Double price = Double.parseDouble(txtPrice.getText());
            Integer quantity = Integer.parseInt(txtQuantity.getText());

            String sql_text = "INSERT INTO products(name,description,price,quantity) VALUES(?,?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql_text);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,descripton);
            preparedStatement.setDouble(3,price);
            preparedStatement.setInt(4,quantity);
            if (!preparedStatement.execute()){
                Parent form = FXMLLoader.load(getClass().getResource("Form.fxml"));
                Main.productStage.getScene().setRoot(form);
            }

            Statement stm = conn.createStatement();
            int row_number = stm.executeUpdate(sql_text);
            if (row_number > 0) {
                Parent list = FXMLLoader.load(getClass().getResource("list.fxml"));
                lab_s6.Main.productStage.getScene().setRoot(list);
            } else {

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}