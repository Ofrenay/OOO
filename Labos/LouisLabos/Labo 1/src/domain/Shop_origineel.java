package domain;
import java.util.ArrayList;

import javax.swing.JOptionPane;

//Als je dit ziet werkt de pull :p

public class Shop_origineel {
	
	private ArrayList<String> productTitles;
	private ArrayList<String> productTypes;
	private ArrayList<String> productIds;
	
	public Shop_origineel()
	{
		productTitles = new ArrayList<String>();
		productTypes = new ArrayList<String>();
		productIds = new ArrayList<String>();
	}

	public static void main(String[] args) {
		Shop_origineel shopOrigineel = new Shop_origineel();

		String menu = "1. Add product\n2. Show product\n3. Show rental price\n\n0. Quit";
		int choice = -1;
		while (choice != 0) {
			String choiceString = JOptionPane.showInputDialog(menu);
			choice = Integer.parseInt(choiceString);
			if (choice == 1) {
				addProduct(shopOrigineel);
			} else if (choice == 2) {
				showProduct(shopOrigineel);
			} else if (choice == 3){
				showPrice(shopOrigineel);
			}
		}
	}
	
	public static void addProduct(Shop_origineel shopOrigineel) {
		String title = JOptionPane.showInputDialog("Enter the title:");
		String id = JOptionPane.showInputDialog("Enter the id:");
		String type = JOptionPane.showInputDialog("Enter the type (M for movie/G for game):");
		
		shopOrigineel.productTitles.add(title);
		shopOrigineel.productIds.add(id);
		shopOrigineel.productTypes.add(type);
	}

	
	public static void showProduct(Shop_origineel shopOrigineel){
		String id = JOptionPane.showInputDialog("Enter the id:");
		int idx = -1;
		boolean found = false;
		for(int i = 0; i < shopOrigineel.productIds.size() && !found; i++)
		{
			if(shopOrigineel.productIds.get(i).equals(id))
			{
				idx = i;
				found = true;
			}
		}
		if(found)
		{
			JOptionPane.showMessageDialog(null, shopOrigineel.productTitles.get(idx));
		}		
	}
	public double getPrice(int productidx, int days) {
		double price = 0;
		if(productTypes.get(productidx).equals("M")){
			price = 5;
			int daysLeft = days - 3;
			if (daysLeft > 0) {
				price += (daysLeft * 2);
			}
		} else if(productTypes.get(productidx).equals("G")){
			price = days * 3;
		}
		return price;
	}

	public static void showPrice(Shop_origineel shopOrigineel){
		String id = JOptionPane.showInputDialog("Enter the id:");
		int idx = -1;
		boolean found = false;
		for(int i = 0; i < shopOrigineel.productIds.size() && !found; i++){
			if(shopOrigineel.productIds.get(i).equals(id)){
				idx = i;
				found = true;
			}
		}
		if(found){
			String daysString = JOptionPane.showInputDialog("Enter the number of days:");
			int days = Integer.parseInt(daysString);
			JOptionPane.showMessageDialog(null, shopOrigineel.getPrice(idx,days));
		}
	}
}
