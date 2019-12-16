package CybertekAssignments04;

import java.util.*;

public class MethodWithArraysMerge {

	public static int[] mergR(int[] a, int[] b) {
		int result[] = new int[a.length + b.length];
		

		for (int i = 0; i < a.length; i++) {
			result[i] = a[i];

		}
		int x= 0;
		for (int i = a.length; i < result.length; i++) {
			result[i] = b[x];
			x++;

		}
		return result;
	}

	// end mergR

	public static void main(String[] args) {
		int[] a = {1, 2, 3,7,8};
		int[] b = {4, 5, 6};

	mergR(a, b);
	System.out.println(Arrays.toString(mergR(a, b)));
	}

}
