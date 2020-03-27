package veera.practice;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharInStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdabcd";
		Set<Character> uniChar = new HashSet<Character>();
		boolean status=false;
		
		for(int i=0;i<str.length();i++) {
			status =uniChar.add(str.charAt(i));
			System.out.println(status);
			if(!status) {
				System.out.println("Does not contain unique char in string");
				break;
			}	
		}
		
		
		for(Character st : uniChar)
		{
			System.out.println(st);
		}


	}

}
