module com.example.animalvoice {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.animalvoice to javafx.fxml;
    exports com.example.animalvoice;
}