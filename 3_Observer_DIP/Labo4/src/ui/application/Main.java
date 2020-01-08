package ui.application;

import javafx.application.Application;
import javafx.stage.Stage;
import ui.view.PlayerView;
import ui.view.ScoreView;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        new ScoreView();
        PlayerView pv1 = new PlayerView(1);
        PlayerView pv2 = new PlayerView(2);
        PlayerView pv3 = new PlayerView(3);
        pv1.isAanBeurt(true);
    }

    public static void main(String[] args){
        launch(args);
    }
}
