package ass8;

import Session6.StudentDataAccessObject;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class List implements Initializable {
    public ListView<Students> lsView = new ListView<>();

    public static ObservableList<Students> listData = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            reloadData();
            lsView.setItems(listData);
        } catch (Exception e) {

        }
    }

    public static void reloadData() throws Exception {
        // su dung DAO Pattern
        StudentDataAccessObject sdao = StudentDataAccessObject.getInstance();
        ArrayList<Students> ls = sdao.list();
        listData.addAll(ls);
    }

    // SPA - SINGLE PAGE APPLICATION
    public void form() {
        // day la noi chuyen man hinh
        try {
            if (Main.formPage == null)
                Main.formPage = FXMLLoader.load(getClass().getResource("Form.fxml"));
            Main.studentStage.getScene().setRoot(Main.formPage);
            // mainStage la 1 bien static trong lop Main
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}