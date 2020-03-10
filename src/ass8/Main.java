package ass8;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static Stage studentStage;

    public static void main(String[] args) {
        launch(args);
    }

    public static Parent listPage;
    public static Parent formPage;

    @Override
    public void start(Stage primaryStage) {
        studentStage = primaryStage;
        try {
            if (listPage == null) {
                listPage = FXMLLoader.load(getClass().getResource("list.fxml"));
            }
            primaryStage.setTitle("Manage students");
            primaryStage.setScene(new Scene(listPage, 600, 400));
            primaryStage.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


}