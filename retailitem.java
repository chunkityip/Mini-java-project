package alex;

import java.util.Scanner;

public class retailitem {
	String description;
	int unitsOnHand;
	double price;
	
	 retailitem(String description, int unitsOnHand, double price) {
		this.description = description;
		this.unitsOnHand = unitsOnHand;
		this.price = price;	
	}
	
	public void setdesciption(String description) {
		this.description = description;
		}
	public String getdesciption() {
		return description;
	}
			
	public void setunitsOnHand(int unitsOnHand) {
		this.unitsOnHand = unitsOnHand;
		}
	public int getunitsOnHand() {
		return unitsOnHand;
	}
	public void setprice(double price) {
		this.price = price;
	}
	public double getprice() {
		return price;
	}
	
	
	public static void main (String [] args) {

		retailitem retailitem1 = new retailitem("Jacket", 12, 59.95);
		retailitem retailitem2 = new retailitem("Designer Jeans", 40 , 34.95);
		retailitem retailitem3 = new retailitem("Shirt", 20 , 24.95);
		

		System.out.println("\t\tDescription\tUnits on Hand\tPrice");
		System.out.println("Item#1\t\t" + retailitem1.getdesciption()+ "\t\t" + retailitem1.getunitsOnHand()+ "\t\t" + retailitem1.getprice());
		System.out.println("Item#1\t\t" + retailitem2.getdesciption()+ "\t" + retailitem2.getunitsOnHand()+ "\t\t" + retailitem2.getprice());
		System.out.println("Item#1\t\t" + retailitem3.getdesciption()+ "\t\t" + retailitem2.getunitsOnHand()+ "\t\t" + retailitem2.getprice());
		
			
		}
		
		
		
		
}

