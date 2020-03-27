package veera.practice;

import java.util.ArrayList;
import java.util.List;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// given word -cinema/ iceman - is a anagram work
		String st = "cinema";
		String st1 ="iceqman";
		boolean status = false;
		List<Character> l1 = new ArrayList<Character>();
		for(int i=0;i<st.length();i++) {
			l1.add(st.charAt(i));
		}
		System.out.println(l1);
		
		for(int i=0;i<st1.length();i++) {
			if(l1.contains(st1.charAt(i))) {
				status = true;
			}
			else {
				status=false;
				System.out.println("given string is not a Anagram");
				break;
			}
		}
		if(status)
			System.out.println("Given string is a Anagram");		
	}

}
