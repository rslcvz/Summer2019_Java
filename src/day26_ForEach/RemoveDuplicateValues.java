package day26_ForEach;

public class RemoveDuplicateValues {

	public static void main(String[] args) {
        String b = "bac";
		String b1 = "";
		
		for (int i =0; i < b.length(); i++) {
			if (!b1.contains(b.substring(i, i+1))) {
				b1 += b.substring(i, i+1);
			}
			
		}
		System.out.println(b1);
	}

}
