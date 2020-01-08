package ui.view;

import Domain.PlayerData;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ScoreView implements Observer {
    private Stage stage = new Stage();
    private Scene scoreScene;
    private Label scoreLabel;
    private PlayerData playerData;

    public ScoreView(){

        scoreLabel = new Label();

        layoutComponents();
        stage.setScene(scoreScene);
        stage.setTitle("Score overzicht");
        stage.setResizable(false);
        stage.setX(100);
        stage.setY(400);
        stage.show();

        playerData = new PlayerData();
        playerData.registerObservers(this);
    }

    private void layoutComponents(){
        VBox root = new VBox();
        scoreScene = new Scene(root, 400, 200);
        root.getChildren().add(scoreLabel);
    }

    private void voegScoreLijnToe(String scoreLijn){
        scoreLabel.setText("\n" + scoreLijn);
    }
    @Override
    public void update(ArrayList<Integer> scores) {
        System.out.println("YA YEET");
        String result = "result";
        for(int i = 0 ; i < scores.size(); i++){
            result = result + "Speler" + i + " score: " + scores.get(i);
        }
        voegScoreLijnToe(result);
    }
}
