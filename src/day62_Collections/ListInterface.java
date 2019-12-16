package day62_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import org.apache.poi.hpsf.Array;

public class ListInterface {

	public static void main(String[] args) {

//		List<Integer>  list1  = new List();
		
		List<Integer>  list2 = new ArrayList<>();
		List<String>  list3 = new LinkedList<>();
		List<Double>  list4 = new Vector<>();
		
		ArrayList<Integer> arrayList  = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.remove(1);
		System.out.println(arrayList);
		
		LinkedList<Integer> linkedList  = new LinkedList<>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.remove(1);
		System.out.println(linkedList);
		
		System.out.println("=============================================");
		
		String [] arr = {"A", "B", "B"};
		
		List<String> list = new ArrayList<>(Arrays.asList(arr));
		LinkedList<String> linked = new LinkedList<>();
		System.out.println(linked);
		
		Vector<Integer>  vector = new Vector<Integer>();
		vector.add(1);
		
		System.out.println("=============================================");
		Stack<Integer> stack = new Stack<>();
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		System.out.println(stack.pop());  // removes last inserted value
		System.out.println(stack);
		System.out.println(stack.pop());  // 
		System.out.println(stack);
		
	}

}
