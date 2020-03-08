package lab_s6;


import connector.Connector;
import lab_s6.Main;
import lab_s6.Products;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;

import java.sql.*;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class List implements Initializable {
    public ListView<Products> listView = new ListView<>();


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {

            String sql_text = "SELECT * FROM products";
            Connector connector = new Connector();

            ResultSet rs = connector.getQuery(sql_text);
            ObservableList<Products> ls = FXCollections.observableArrayList();

            while (rs.next()) {
                ls.add(new Products(rs.getInt("id"), rs.getString("name"), rs.getString("description"), rs.getDouble("price"), rs.getInt("quantity")));
            }
            listView.setItems(ls);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            // Step 4: kết nối với database
        }
    }

    public void form() {
        try {
            Parent form = FXMLLoader.load(getClass().getResource("Form.fxml"));
            Main.productStage.getScene().setRoot(form);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void addtoCart(){
        Products selected = (Products) listView.getSelectionModel().getSelectedItems();
        Main.cart.add(selected);
        System.out.println("ADD TO CART SUCCESSFULLY");
    }

    public  void cart(){
        try {
            Parent cart = FXMLLoader.load(getClass().getResource("cart.fxml"));
            Main.productStage.getScene().setRoot(cart);
            // mainStage la 1 bien static trong lop Main
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
