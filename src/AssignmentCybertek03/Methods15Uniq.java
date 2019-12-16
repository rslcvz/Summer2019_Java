package AssignmentCybertek03;

public class Methods15Uniq {

	public static void main(String[] args) {
		String[] words = { "java", "code", "python", "code", "rust", "code", "rust" };

		// WRITE YOUR CODE HERE

		for (int i = 0; i < words.length; i++) {
			int count = 1;
			for (int j = 0; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(words[i]);
			}

		}

	}

}
