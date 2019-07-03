package credit;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class lab4 {

	public static void main(String[] args) {
	
		// This method will read data from a CSV file
		String path="E:/JAVA/WorkSpace/Files/cardvalues.csv";
	List<String []>tansactions=new ArrayList<String []>();
	String testRow;
	double balance=0;
	
	
	
try {
	
	//Open the File
	BufferedReader br=new BufferedReader(new FileReader(path));
	//Read the file as long as it's not empty
	while ((testRow=br.readLine())!=null){
		// Parse the method by comma
		String[] line = testRow.split(",");
		//add the data to the collection
		tansactions.add(line);
		
		
	}
	br.close();
} catch (FileNotFoundException e) {

	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

		
		for (String[] transaction : tansactions){
		
			String date= transaction[0];
			String type=transaction[1];
			String vendor=transaction[2];
			double ammount=Double.parseDouble(transaction[3]);
			
			System.out.println(date+" "+type+" "+vendor+" $ "+ammount);
			
			if (type.equalsIgnoreCase("credit")){
				
				System.out.println("add to balance "+ammount);
				balance+=ammount;
				System.out.println("balance is : "+balance);
								
			}
	if (type.equalsIgnoreCase("debit")){
				
				System.out.println("substraction of "+ammount);
				balance-=ammount;
				System.out.println("balance is : "+balance);				
				
			}

	if (balance>0){
		
		System.out.println("You have a balance of : "+balance);
		System.out.println("You are charged a balance fee of  : "+balance*.10);
		System.out.println("new balance is : "+balance*1.1);
	}
	else if (balance<0){

		System.out.println("thx for your payments");
		System.out.println("Uoi have overpayments of -"+balance);
		
		
		
		
	}
	else {System.out.println("thanks for your payement");}
	
	
	
				}
	

		
		
	}

}
