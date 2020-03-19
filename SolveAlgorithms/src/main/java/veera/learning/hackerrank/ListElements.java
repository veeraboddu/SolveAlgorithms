package veera.learning.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l1 =new ArrayList<String>();
		l1.add("l1");
		l1.add("l5");
		l1.add("l3");
		l1.add("l4");
		l1.add("l2");
		Collections.sort(l1);
		
		for(String st:l1) {
			System.out.println(st);
		}
		
	}

}
