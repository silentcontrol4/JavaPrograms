package dataStructures;

public class array {

	public static void main(String[] args) {
	
		String [] alphabet = {"a","b","c","d","e","f"};
		
	/*	int size=alphabet.length;
		for (int i=0;i<size;i++){
			
			
			System.out.println(alphabet[i]);
			
		
		}
		
		System.out.println("\n\n using the for-each metdod ");
		for (String letter : alphabet){
			System.out.print(letter+" ");
			
			
			
		}
		*/
		String[][] users={{
			"John","Williams","JW@email.com","232323242"},
			{"Tom","Burton","TB@email.com","13232425"},
			{"lis","Tyler","LT@email.com","555636363636"}};
		
		
		//Get the size of the array
	//	int numOfUsers=users.length;
	//	int numOfFields=users[0].length;

/*		System.out.println("\n\n doubleArrays ");
		System.out.println("Num of users is : "+numOfUsers);
		System.out.println("Num of fields is : "+numOfFields);
		
		//Travers the double array
		
		for (int i=0;i<numOfUsers;i++){
							
				
				String firstName=users[i][0];
				String lastName=users[i][1];
				String email=users[i][2];
				String phone=users[i][3];
				System.out.println(firstName+" "+lastName+" "+email+" "+phone);			
						
			
		}*/
		
		//System.out.println("\n\n");
		for (String[] user : users){
			System.out.print("[");
		for (String field : user){
						
			System.out.print(field+" ");
		
			
		}

		System.out.println("]");
			
			
			
		}
		

	}

}
