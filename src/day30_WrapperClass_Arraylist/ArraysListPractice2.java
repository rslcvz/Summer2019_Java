package day30_WrapperClass_Arraylist;
import java.util.*;
public class ArraysListPractice2 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i <= 40; i++) {
			if (i %2 ==0) {
				continue;
			}
			list.add(i);
			
		}
		System.out.println(list);
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
			
		}
		System.out.println();
		for (int each : list) {   // unboxing
			System.out.print(each + " ");
		}
		System.out.println();
		int num = list.get(7);  // unboxing
		System.out.println(num);
		list.clear();   // size of list becomes 0 : 
		//   System.out.println(list.get(7));   it gives main exception because we cleared 
		Collections.sort(list);
		System.out.println(list);
		ArrayList<Integer> list2 = new ArrayList<>();
		
		for (int i=20; i >=0; i--) {
			list2.add(i);
		}
		System.out.println(list2);
		Collections.sort(list2);
		System.out.println(list2);
	}

}
