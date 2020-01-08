package ui.view;

import Domain.Dobbelsteen;
import Domain.PlayerData;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class PlayerView {
    private Stage stage = new Stage();
    private Scene playerScene;
    private Label diceLabel;
    private Button playButton;
    private Label messageLabel;

    private PlayerData playerData;
    private Dobbelsteen dobbelsteen;
    private int score;
    private ArrayList<Observer> observers;

    private int spelerNummer;

    public PlayerView(int spelerNummer){
        playerData = new PlayerData();
        dobbelsteen = new Dobbelsteen();
        this.spelerNummer = spelerNummer;

        diceLabel = new Label("beurt 1: ");
        playButton = new Button("Werp");
        playButton.setOnAction(new ThrowDicesHandler());
        playButton.setDisable(true);
        messageLabel = new Label("Spel nog niet gestart");
        layoutComponents();

        stage.setScene(playerScene);
        stage.setTitle("Speler" + spelerNummer);
        stage.setResizable(false);
        stage.setX(100+(spelerNummer-1) * 350);
        stage.setY(200);
        stage.show();
    }

    private void layoutComponents(){
        VBox root = new VBox(10);
        playerScene = new Scene(root, 250, 100);
        root.getChildren().add(playButton);
        root.getChildren().add(diceLabel);
        root.getChildren().add(messageLabel);
    }

    public void isAanBeurt(boolean aanBeurt){
        playButton.setDisable(!aanBeurt);
    }

    class ThrowDicesHandler implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event) {
            score = score + dobbelsteen.gooi();
            playerData.addScore(spelerNummer, score);
            playButton.setDisable(true);
            System.out.println("yeet");
        }
    }
}
