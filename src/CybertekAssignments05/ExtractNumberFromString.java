package CybertekAssignments05;

public class ExtractNumberFromString {
	public static void main(String[] args) {

		System.out.println(extractNum("aa2aa3"));

	}

	public static String extractNum(String s) {
		String nums = "";
		for (int x = 0; x < s.length(); x++) {
			if (Character.isDigit(s.charAt(x))) {
				nums += s.charAt(x) + " ";
			}
		}
		return nums;
	}

}
