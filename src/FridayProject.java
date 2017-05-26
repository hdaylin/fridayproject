
import java.util.Random;
import java.util.Scanner; 
public class FridayProject {

	public static void main(String[] args) {
		
		String customer; 
		double sales_amount= 0.0; 
		String tax_code; 
		double total = 0.0; 
		double tax;
		String insert = "yes";
		
		Scanner keyboard = new Scanner (System.in);
		Random r = new Random();
		
		int customer_id = 100 + r.nextInt(300);
	
		
		while (insert.equals("yes")){ 
			System.out.println("What is the customer name?");
			customer = keyboard.next(); 
			
			System.out.println("What is the sales amount?"); 
			sales_amount = keyboard.nextDouble(); 
			
			System.out.println("What is the Tax Code ?"); 
			tax_code = keyboard.next(); 
			
			if(tax_code.equals("NRM")){
				tax = 1.06; 
			}else if(tax_code.equals("BIZ")){
				tax = 1.045;
			}else{
				tax = 0;
			} 
			
			total = (tax*sales_amount); 
			System.out.println("Customer ID: " + customer_id); 
			System.out.println("Customer Name: " + customer);
			System.out.println("Sales Amount: $" + sales_amount);
			System.out.println("Tax Code: " + tax_code); 
			System.out.println("Total Amount Due: " + total); 
			
			System.out.println("Do you want to enter another record? (Yes/No)"); 
			insert = keyboard.next(); 
			
		}

		System.out.println("Goodbye!");
		keyboard.close();
	}

}
