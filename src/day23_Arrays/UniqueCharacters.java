package day23_Arrays;

public class UniqueCharacters {

	public static void main(String[] args) {

		String str = "ALL THE LETTERS";
		String unique = ""; // to store all unique characters
		
	for (int j=0;  j < str.length();  j++)  {	
		
		int count =0;   // counting how many times the characters occured.
		for (int i=0;   i < str.length();  i++) {
		// highest value of i: str.length() - 1
			if (str.substring(i, i+1).equalsIgnoreCase("" + str.charAt(j)))  {
				//                             you can also use str.substring(j, j+1)
				count++;
		
		
		
	}
}
		if (count == 1)  {
			unique +="" + str.charAt(j) ;
		}
		
}
	System.out.println(unique);
}
}