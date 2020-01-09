package view;

//This is the View
//Its only job is to display what the user sees
//It performs no calculations, but instead passes
//information entered by the user to whomever needs
//it. 

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import controller.CalculatorController;

public class CalculatorView{
	private Stage stage = new Stage();
	private TextField firstNumber  = new TextField();
	private Label additionLabel = new Label("+");
	private TextField secondNumber = new TextField();
	private Button calculateButton = new Button("Calculate");
	private TextField calcSolution = new TextField();

	private CalculatorController calculatorController;
	
	public CalculatorView(){
		// Sets up the view and adds the components
		stage.setTitle("MVCSample");
		GridPane grid = new GridPane();
		grid.setVgap(4);
		grid.setHgap(10);
		grid.setPadding(new Insets(5, 5, 5, 5));  
		grid.add(firstNumber, 0, 0);	    
		grid.add(additionLabel,1,0);
		grid.add(secondNumber, 2, 0);	    
		grid.add(calculateButton,3,0);
		grid.add(calcSolution, 4, 0);	
		
		calculateButton.setOnAction(new EventHandler<ActionEvent>() {
	        @Override public void handle(ActionEvent e) {
	            calculatorController.handleCalculation();
	        }	        
		});
		/*
		//alternatief 1
		calculateButton.setOnAction((event) -> {
			calculatorController.handleCalculation();
		});
		
		//alternatief 2
		calculateButton.setOnAction(new CalculateHandler<ActionEvent>);
		en dan een aparte innerclass:
		class CalculateHandler implements EventHandler<ActionEvent>{
        	@Override 
        	public void handle(ActionEvent e) { 
	       		calculatorController.handleCalculation();
	    	}	        
		}		 
		*/
		Scene scene = new Scene(grid, 650,  250);
		stage.setScene(scene);
		stage.show();     
	}

	public void setCalculatorController(CalculatorController calculatorController){
		this.calculatorController = calculatorController;
	}

	public int getFirstNumber(){
		return Integer.parseInt(firstNumber.getText());
	}

	public int getSecondNumber(){
		return Integer.parseInt(secondNumber.getText());
	}

	public int getCalcSolution(){
		return Integer.parseInt(calcSolution.getText());
	}

	public void setCalcSolution(int solution){
		calcSolution.setText(Integer.toString(solution));
	}

	// If the calculateButton is clicked execute a method
	// in the Controller named handle
	// Open a popup that contains the error message passed
	public void displayErrorMessage(String errorMessage){
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setHeaderText("Information Alert");		 
		alert.setContentText(errorMessage);	 
		alert.show();
	}
}