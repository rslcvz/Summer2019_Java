package day29_ReturnMethods;

public class FindFrequency {

	public static void main(String[] args) {

		/*
		 Warm up:
1. write a method that can find the frequency of characters in String.
    Ex: 
        FrequencyTest("XXXYYYZZZ")
        output: X3Y3Z3
        FrequencyTest("AAABBBBBCCCC")
        output: A3B5C4
		 */
		String str = "aabbaaabbbcccccDD";
		// expected result: a5b5c5DD2
		String removeDup = "";
		for (int i=0; i < str.length(); i++) {
			if (!removeDup.contains(str.substring(i, i+1))) {
				removeDup += str.substring(i, i+1);
			}
		}
		
		System.out.println(removeDup);
		String result = "";
		
	for(int j=0; j < removeDup.length(); j++) {
		int count =0;
		for (int i=0;  i < str.length(); i++)  {
			if (str.substring(i, i+1).equals(removeDup.substring(j, j+1))) {
				count++;
				
			}
			
		}
		result += removeDup.substring(j, j+1)+ count;
		
	}
	System.out.println(result);
}
}
