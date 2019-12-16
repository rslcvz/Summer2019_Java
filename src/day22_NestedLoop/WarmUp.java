package day22_NestedLoop;

public class WarmUp {

	public static void main(String[] args) {

		
			
			
		String str = "";
		int i = 1;
		while(i <= 30) {
			/* if (i % 3 == 0 && i % 5 ==0) {
				str += "FINRA";
			} else if (i % 3 == 0) {
				str += "FIN";
			}else if (i % 5 == 0) {
				str += "RA";
		} else {
			str += i + " ";
		} */
			str += (i % 3 == 0 && i % 5 == 0) ? " FINRA " :
				(i % 3 == 0) ? " FIN " :
					(i % 5 == 0) ? " RA ":    i + " ";
			i++;
	}
		System.out.println(str);

}
}
