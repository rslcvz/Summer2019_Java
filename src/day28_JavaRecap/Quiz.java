package day28_JavaRecap;

public class Quiz {

	public static void main(String[] args) {

		int  nums  [] = {5, 4, 6, 4};
		for (int each : nums) {
			if (each ==3) {
				continue;
			}
			System.out.println(each + " ");
			break;
		}
	}

}
