package veera.learning.hackerrank;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set<String> set1= new HashSet<String>();
		Set<String> set1= new TreeSet<String>();

		set1.add("st1");
		set1.add("st2");
		set1.add("st6");
		set1.add("st3");
		set1.add("st4");
		set1.add("st5");

		for(String st:set1) {
			System.out.println(st);
		}
	}

}
