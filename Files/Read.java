package Files;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Read {

	public static void main(String[] args) {
//1.Define the file (path) we want to read

		String fileName="E:\\JAVA\\WorkSpace\\Files\\FileToRead.txt";
		String text=null;
		//2.Create the file in JAVA
		File file=new File(fileName);
		
		//3.open the file
		
		try {
			BufferedReader	br = new BufferedReader(new FileReader(fileName));
			//4.Read the file
		text=br.readLine();
			
			//5.Close the resources
		br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Error : FileNotFoundException "+fileName);
			e.printStackTrace();
		} catch (IOException e) {
		
			System.out.println("Error : Could not read the data  "+fileName);
			e.printStackTrace();
		}
		
	finally {
		System.out.println("Finsihed reading the file");
	}
		System.out.println(text);
		
	}

}
