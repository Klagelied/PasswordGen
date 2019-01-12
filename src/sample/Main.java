package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }




    public static void main(String[] args) {
        launch(args);
        System.out.println("Bitte den gewünschten Satz eingeben - Als Trennung werden Leerzeichen verwendet.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Password pw = new Password(input);
        System.out.println(pw.acronymGenerator(pw.getUsPW()));
    }
}