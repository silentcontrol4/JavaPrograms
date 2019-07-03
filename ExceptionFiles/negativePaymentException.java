package ExceptionFiles;

public class negativePaymentException extends Exception{
	//Define class variable
	
	double payment;
	
	//1.Constructor that takes the value that would throw exception
	public negativePaymentException(double payment){
		//2.Assign the value of the locacl variable to class variable
this.payment=payment;
		
		
	}
	
	//3.Override the toString method to include specific exception
	public String toString(){
		return "ERROR : cannot take negative payment : "+payment+"\n";
		
		
		
	}
	
	

}
