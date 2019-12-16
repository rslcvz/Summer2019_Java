package day62_Collections;
import java.util.*;


public class SetInterface {

	public static void main(String[] args) {

//		List<Integer> abc = new ArrayList<Integer>(); // Why it gives me compile error.
		
		Set<Integer>  st1 = new HashSet<>();
		st1.add(100);
		st1.add(100);
		st1.add(100);
		System.out.println(st1);
		System.out.println("=====================================");
		
		Set<Integer> hashSet  = new HashSet<Integer>();
		hashSet.add(100);
		hashSet.add(10);
		hashSet.add(5);
		hashSet.add(4);
		hashSet.add(3);
		System.out.println(hashSet);  // hashset doesnt keep the order.
		
		Set<Integer>  linkedHashSet = new LinkedHashSet<Integer>();
		linkedHashSet.add(100);
		linkedHashSet.add(10);
		linkedHashSet.add(12);
		linkedHashSet.add(4); 
		System.out.println(linkedHashSet);   // keep in order as it is
		
		SortedSet<String> treeset = new TreeSet<>();
		treeset.add("Z");
		treeset.add("Y");
		treeset.add("C");
		treeset.add("b");
		treeset.add("W");
		System.out.println(treeset);     //  Romoves duplicates, keep i order.
		
		// Task: Romove duplicates
		List<Integer> list = new ArrayList<>();
		
		list.addAll(Arrays.asList(10, 9, 8, 7, 6));
		Collections.sort(list);
		System.out.println(list);
		
		/*
		 * 
		 String str = "AAAABBCCCDDD";
		 write a program that can remove duplicates from String
		 */
		
		String str = "AAAABBCCCDDD";
		/*
		String nonDuplicate = "";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != str.charAt(i+1)) {
				nonDuplicate += str.charAt(i);	
			}*/
			
			

		
		String [] arr = str.split("");      // split method can make it Array
		System.out.println(Arrays.toString(arr));
		
		TreeSet<String> restroom = new TreeSet<>(Arrays.asList(arr));
		String result = restroom.toString().replace("[", "").replace("]", "");
		System.out.println(result);
		
		
		
	}

}
