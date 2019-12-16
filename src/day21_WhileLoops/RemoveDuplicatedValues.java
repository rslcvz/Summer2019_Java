package day21_WhileLoops;

public class RemoveDuplicatedValues {

	public static void main(String[] args) {

		String s1 = "aabbccddeeffgghhiijjkklllmmmmmmmmmmmmmm";
		String result = "";   // to store the new string value that doesnot have duplicates
		
		for (int i = 0; i < s1.length(); i++) {
			
			if (!result.contains("" + s1.charAt(i))) {
				//                            (1, 2) ==> a
				result += s1.substring(i, i+1);
				
}
}
		
		System.out.println(result);
}
}