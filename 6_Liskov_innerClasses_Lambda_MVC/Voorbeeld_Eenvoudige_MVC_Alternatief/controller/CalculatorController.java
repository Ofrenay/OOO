package controller;

import model.CalculatorModel;
import view.CalculatorView;

// The Controller coordinates interactions
// between the View and Model

public class CalculatorController {
    private CalculatorView theView;
    private CalculatorModel theModel;
    
    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        // Tell the View that when ever the calculate button
        // is clicked to execute the actionPerformed method
        // in the CalculateListener inner class
        this.theView.setCalculatorController(this);
    }

    public void handleCalculation(){
       	int firstNumber, secondNumber = 0;
        // Surround interactions with the view with
        // a try block in case numbers weren't
        // properly entered
        try{
            firstNumber = theView.getFirstNumber();
            secondNumber = theView.getSecondNumber();
            theModel.addTwoNumbers(firstNumber, secondNumber);
            theView.setCalcSolution(theModel.getCalculationValue());
         }
         catch(NumberFormatException ex){
            theView.displayErrorMessage("You Need to Enter 2 Integers");
         }
    }
 }
