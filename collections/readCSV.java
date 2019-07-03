package collections;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class readCSV {

	public static void main(String[] args) {
		// This method will read data from a CSV file
		String path="E:/JAVA/WorkSpace/Files/accounts.csv";
	List<String []>data=new ArrayList<String []>();
	String testRow;
try {
	
	//Open the File
	BufferedReader br=new BufferedReader(new FileReader(path));
	//Read the file as long as it's not empty
	while ((testRow=br.readLine())!=null){
		// Parse the method by comma
		String[] line = testRow.split(",");
		//add the data to the collection
		data.add(line);
		
		
	}
	br.close();
} catch (FileNotFoundException e) {

	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}



for (String[] account : data ){
	System.out.print("[");
	for (String field : account){
	System.out.print(field+" ");

	}
	System.out.println("]");
}






	}

}
