package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
	
		//1.Defile the path we want to wri	te
		String fileName="E:\\JAVA\\WorkSpace\\Files\\FileToWrite.txt";
		String message="Im writing data that will be placed in a file";
		//2.Create the file in JAVA
		File file=new File(fileName);
	
			
		
		try {
	
			//3.open the file
			FileWriter fr=new FileWriter(file);
			
			
			//4.Write to the file
			fr.write(message);
			//5.Close the resources
			fr.close();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		finally {System.out.println("closing the file writer");}
		
		
		
		
	
		
	
		
		
		
		
	}

}
