package credit;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class creditCard {

	public static void main(String[] args) {
		
		List<String[]> accounts=new ArrayList<String[]>();
		String account;
	
		
		String path="E:/JAVA/WorkSpace/Files/cardvalues.csv";
	
		try {
			BufferedReader br=new BufferedReader(new FileReader(path));
			double balance=0;	
			
			while ((account=br.readLine())!=null){
		
			String [] line=account.split(",");
			accounts.add(line);
			for (String []value:accounts) {
		 value=line[3].split("\\.");
			
			
			if (line[1].contains("CREDIT")){
				   System.out.println("Account = : "+account);
				   for (int i=0;i<value.length;i++){
				System.out.println("adding "+Double.parseDouble(value[0])+" to balance ");
				balance+=Double.parseDouble(value[i]);
		
				   }
				System.out.println("Balance is "+Math.round(balance));
			
			
			
	
			}
			if (line[1].contains("DEBIT")){
				   System.out.println("Account = : "+account);
				   for (int i=0;i<value.length;i++){
				System.out.println("substracting "+Double.parseDouble(value[0])+" from balance ");
				balance-=Double.parseDouble(value[0]);
			
				   }
				System.out.println("Balance is "+Math.round(balance));
			
			
			
	
			}
			
			
			
			
			
			
			
			
			
			
			
			
			}
	
		
			
		}	br.close(); }
		
		
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
for (String [] acc : accounts){
	for (String values : acc){
		
		//System.out.println(values);
		
		
		
	}
	
	
	
}
		
		

	}

}
