package veera.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);l1.add(22);l1.add(99);l1.add(33);l1.add(77);l1.add(54);l1.add(23);
		int key = 33;
		System.out.println("List elements: "+ l1);

		Collections.sort(l1);
		System.out.println("List elements after sort: "+ l1);
		int position =Collections.binarySearch(l1, key);
		
		System.out.println("Search element index postion is : "+ position);
		
	}

}
