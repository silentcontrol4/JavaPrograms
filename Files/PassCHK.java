package Files;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PassCHK {


	

	public static void main(String[] args) {

		String pass="";
		File file=new File("E:\\JAVA\\WorkSpace\\Files\\PasswordList.txt");
		try { BufferedReader b=new BufferedReader(new FileReader(file));
	
		
		for (int i=0;i<12;i++){
	
		pass=b.readLine();
		System.out.println("\n"+"Checking password : "+pass);
		
		//checking if pass have any letter
       if ( haveLetter(pass)==true){
   //    System.out.println("Have letter "+pass);
    	   
   	//checking if pass have any number
    	   if ( haveNumber(pass)==true){
    	//   System.out.println("Have number "+pass);
    		       		
    	   
    	   	//checking if pass have any special sign
    	   if ( haveSpecial(pass)==true){
        	 //  System.out.println("Have special character "+pass);
        	   System.out.println("PASSWORD IS CORRECT ");
        		       		
    	   
    	   
    	   }
    	   else {   	   try{      	     	   
    	    //   System.out.println("Havent Special "+pass);
    	        throw new ContaintSpecialException(pass);
    	        	
    	        	          } catch (ContaintSpecialException e) {
    	        	        		System.out.println(e.toString());
    	        	        		
    	        	      	} 
    		   
    		   
    		   
    	   }
    	   
    	   }
    	   
    	   
    	   
    	   else {
        	   try{      	     	   
     //   System.out.println("Havent Number "+pass);
        throw new ContaintsNumberException(pass);
        	
        	          } catch (ContaintsNumberException e) {
        	        		System.out.println(e.toString());
        	        		
        	      	} 
      
    				           }    	       	       	         	   
    	   
    	          }
       else {
    	   try{      	     	   
   // System.out.println("Havent letter "+pass);
    throw new ContaintsLetterException(pass);
    	
    	          } catch (ContaintsLetterException e) {
    	        		System.out.println(e.toString());
    	        		
    	      	} 
  
						
       }
		}
		
		
		b.close();
		   
		}
		
		catch (FileNotFoundException e) {
			System.out.println("Error : File not found ");
			
		} catch (IOException e) {
			System.out.println("Error : File not found ");
			
		} 

		
								
		
	}
	
	//Function checking if given password contains any letters :
	public static boolean haveLetter(String s){
		
		char[] c=s.toCharArray();
				
	for (int i=0;i<c.length;i++){
		
		if ((((int)(c[i]))>=65)&&((int)(c[i]))<=90) { 


	return true;
		
	
				}
else if ((((int)(c[i]))>=97)&&((int)(c[i]))<=122) {

	return true;
								
		}
		
				
	}
	 {
		 		 
		 return false;}
	}
	
	//Function checking if given password contains any numbers:
	public static boolean haveNumber(String s){
		
		char[] c=s.toCharArray();
				
	for (int i=0;i<c.length;i++){
		
	
	
if ((((int)(c[i]))>=48)&&((int)(c[i]))<=57) {

	return true;
								
		}
						
	}
	 {
		 
		 
		 return false;}
	}
	//Function checking if given password contains any special signs:
	public static boolean haveSpecial(String s){
		
		char[] c=s.toCharArray();
				
	for (int i=0;i<c.length;i++){
		
	
	
if ((((int)(c[i]))==33)||(((int)(c[i]))==35)||((int)(c[i]))==64) {

	return true;
								
		}
						
	}
	 {
		 
		 
		 return false;}
	}
	
	
}


class ContaintsNumberException extends Exception{
	
	String pass;
	ContaintsNumberException(String pass){
		this.pass=pass;
				
	}
	public String toString(){
		
		
		return "Error password "+pass+" doesnt contain numbers"+"\n";
		
	}
	
	
}

class ContaintsLetterException extends Exception{
	
	String pass;
	ContaintsLetterException(String pass){
		this.pass=pass;
				
	}
	public String toString(){
		
		
		return "Error password : "+pass+" doesnt containt letters"+"\n";
		
	}
	
		
}

class ContaintSpecialException extends Exception{
	
	String pass;
	ContaintSpecialException(String pass){
		this.pass=pass;
				
	}
	public String toString(){
		
		
		return "Error password : "+pass+" doesnt containt special signs (!,#,@)"+"\n";
		
	}
}
