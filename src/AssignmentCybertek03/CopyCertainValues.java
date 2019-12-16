package AssignmentCybertek03;

import java.util.*;

public class CopyCertainValues {

	public static void main(String[] args) {

		System.out.println("-----EXAMPLE RUN ---------");
		String[] numbers = { "zero", "one", "two", "three", "four" };
		System.out.println(Arrays.toString(getWithE(numbers)));

	}

	public static String[] getWithE(String[] numbers) {

		String[] fewValues = {};
		int count = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i].contains("e") || numbers[i].contains("E")) {
				count++;
			}
		}

		fewValues = new String[count];
		int index=0;
		for (int j = 0; j < numbers.length; j++) {
			if (numbers[j].contains("e") || numbers[j].contains("E")) {
				fewValues[index] = numbers[j];
				index++;

			}
		}

		return fewValues;
	}

}
