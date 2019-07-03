package ExceptionFiles;
import java.util.Scanner;

public class PaymentsApp {

	
	
	// Take payment for a user
	public static void main(String[] args) {
	//1. Ask the user for the amount
		double payment=0;
		boolean positivePay=true;
		
		
	
		
		
	do {
		//1. Ask the user for the amount
		
		System.out.println("Enter the paymant amount ");
		    //2.Take the amount and test the value
		Scanner in = new Scanner(System.in);
		
		//3. Handle the exceptions appropriately
		
		
		try {
        payment=in.nextDouble();
        if (payment<0){
    		throw new negativePaymentException(payment);
    			
        
        
		} else {positivePay=true;}
			
		} catch (negativePaymentException e){
			System.out.print(e.toString());
			System.out.print("Please try again ");
			positivePay=false;
			
		}
	} while (!positivePay);
	//4.Print Confirmation	
	System.out.print("Thank you for your payment of $ " + payment);
		
		
		

	} 
	
	}


