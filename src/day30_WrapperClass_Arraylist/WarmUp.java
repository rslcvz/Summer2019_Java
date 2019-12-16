package day30_WrapperClass_Arraylist;

public class WarmUp {
public static void main(String[] args) {
	String str = RevDup("aabbccDDDEEE");
	System.out.println(str);
	
	String str2 = UniqueValue("AABBCDEEE");
	System.out.println(str2);
	
}
		
		public static String RevDup(String str) {
			String result = "";
			for (int i=0; i < str.length(); i++) {
				if (!result.contains(str.substring(i, i+1))) {
					result += str.substring(i, i+1);
				}
			}
      return result;
	}

		public static String UniqueValue(String str) {
			String result ="";
		
			
		
		for (int j = 0; j < str.length(); j++) {
			int count =0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
				
			}
			if (count ==1) {
				result += ""+ str.charAt(j);
			}
		}
		return result;
}
		public static void method1() {
			return "12";
		}
}
