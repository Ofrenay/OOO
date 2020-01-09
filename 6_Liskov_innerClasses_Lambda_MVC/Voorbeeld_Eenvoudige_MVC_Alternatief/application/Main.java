package application;
	
import controller.CalculatorController;
import javafx.application.Application;
import javafx.stage.Stage;
import model.CalculatorModel;
import view.CalculatorView;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		CalculatorView theView = new CalculatorView();
		CalculatorModel theModel = new CalculatorModel();
		CalculatorController theController = new CalculatorController(theView,theModel);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
