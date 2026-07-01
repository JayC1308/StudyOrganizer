import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.text.Font;
import javafx.event.Event;
import javafx.collections.*;

import je.NumberField;

public class kurs_gui extends Application {

    private Button bNeuerKurs = new Button("Neuer Kurs");
    private Button bLoeschen = new Button("Löschen");

    private TextField tfName = new TextField();
    private TextField tfDozent = new TextField();
    private TextField tfEmailDozent = new TextField();
    private TextField tfVorlesungsart = new TextField();
    private TextField tfRaum = new TextField();
    private TextField tfGebaeude = new TextField();
    private TextField tfWochentag = new TextField();
    private TextField tfUhrzeit = new TextField();

    private NumberField tfKNr = new NumberField();
    private NumberField tfEcts = new NumberField();
    private NumberField tfSemester = new NumberField();

    private ListView<String> kursListeView = new ListView<>();
    private ObservableList<String> kursNamen = FXCollections.observableArrayList();

    private java.util.List<Kurs> kursObjekte = new java.util.ArrayList<>();

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Scene scene = new Scene(root, 950, 536);

        bNeuerKurs.setLayoutX(0);
        bNeuerKurs.setLayoutY(24);
        bNeuerKurs.setPrefSize(80, 24);
        bNeuerKurs.setOnAction(e -> bNeuerKurs_Action(e));
        root.getChildren().add(bNeuerKurs);

        bLoeschen.setLayoutX(90);
        bLoeschen.setLayoutY(24);
        bLoeschen.setPrefSize(80, 24);
        bLoeschen.setOnAction(e -> bLoeschen_Action(e));
        root.getChildren().add(bLoeschen);

        tfName.setLayoutX(0);
        tfName.setLayoutY(80);
        tfName.setPrefSize(80, 24);
        root.getChildren().add(tfName);

        tfKNr.setLayoutX(80);
        tfKNr.setLayoutY(80);
        tfKNr.setPrefSize(80, 24);
        root.getChildren().add(tfKNr);

        tfEcts.setLayoutX(160);
        tfEcts.setLayoutY(80);
        tfEcts.setPrefSize(80, 24);
        root.getChildren().add(tfEcts);

        tfDozent.setLayoutX(240);
        tfDozent.setLayoutY(80);
        tfDozent.setPrefSize(80, 24);
        root.getChildren().add(tfDozent);

        tfEmailDozent.setLayoutX(320);
        tfEmailDozent.setLayoutY(80);
        tfEmailDozent.setPrefSize(80, 24);
        root.getChildren().add(tfEmailDozent);

        tfSemester.setLayoutX(400);
        tfSemester.setLayoutY(80);
        tfSemester.setPrefSize(80, 24);
        root.getChildren().add(tfSemester);

        tfVorlesungsart.setLayoutX(480);
        tfVorlesungsart.setLayoutY(80);
        tfVorlesungsart.setPrefSize(80, 24);
        root.getChildren().add(tfVorlesungsart);

        tfRaum.setLayoutX(560);
        tfRaum.setLayoutY(80);
        tfRaum.setPrefSize(80, 24);
        root.getChildren().add(tfRaum);

        tfGebaeude.setLayoutX(640);
        tfGebaeude.setLayoutY(80);
        tfGebaeude.setPrefSize(80, 24);
        root.getChildren().add(tfGebaeude);

        tfWochentag.setLayoutX(720);
        tfWochentag.setLayoutY(80);
        tfWochentag.setPrefSize(80, 24);
        root.getChildren().add(tfWochentag);

        tfUhrzeit.setLayoutX(800);
        tfUhrzeit.setLayoutY(80);
        tfUhrzeit.setPrefSize(80, 24);
        root.getChildren().add(tfUhrzeit);

        kursListeView.setLayoutX(0);
        kursListeView.setLayoutY(128);
        kursListeView.setPrefSize(200, 300);
        kursListeView.setItems(kursNamen);
        root.getChildren().add(kursListeView);

        primaryStage.setTitle("Kurs GUI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void bNeuerKurs_Action(Event evt) {
        int knr = tfKNr.getText().isEmpty() ? 0 : Integer.parseInt(tfKNr.getText());
        int ects = tfEcts.getText().isEmpty() ? 0 : Integer.parseInt(tfEcts.getText());
        int semester = tfSemester.getText().isEmpty() ? 0 : Integer.parseInt(tfSemester.getText());

        Kurs neuerKurs = new Kurs(
                tfName.getText(),
                knr,
                ects,
                tfDozent.getText(),
                tfEmailDozent.getText(),
                semester,
                tfVorlesungsart.getText(),
                tfRaum.getText(),
                tfGebaeude.getText(),
                tfWochentag.getText(),
                tfUhrzeit.getText()
        );

        kursObjekte.add(neuerKurs);
        kursNamen.add(neuerKurs.getName());
    }

    public void bLoeschen_Action(Event evt) {
        int index = kursListeView.getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            kursNamen.remove(index);
            kursObjekte.remove(index);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
