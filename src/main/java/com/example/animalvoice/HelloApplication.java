import com.example.animalvoice.HelloController;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.geometry.Orientation;
import javafx.geometry.Insets;

public class HelloApplication  extends Application{

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Label selectedLbl = new Label();

        RadioButton SolRB = new RadioButton("Solovey");
        RadioButton CatRB = new RadioButton("Cat");
        RadioButton HyeRB = new RadioButton("Hyena");

        ToggleGroup group = new ToggleGroup();
        // установка группы
        SolRB.setToggleGroup(group);
        CatRB.setToggleGroup(group);
        HyeRB.setToggleGroup(group);

        // установка обработчика события нажатия
        SolRB.setOnAction(event -> selectedLbl.setText("a very nice song!"));
        CatRB.setOnAction(event -> selectedLbl.setText("Meooooow"));
        HyeRB.setOnAction(event -> selectedLbl.setText("aha haha"));

        FlowPane root = new FlowPane(Orientation.VERTICAL, 10, 10);
        root.getChildren().addAll(SolRB, CatRB, HyeRB, selectedLbl);
        root.setPadding(new Insets(10));
        Scene scene = new Scene(root, 250, 200);

        stage.setScene(scene);
        stage.setTitle("RadioButtons in JavaFX");
        stage.show();
    }
}