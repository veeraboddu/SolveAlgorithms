package veera.practice;

import java.util.HashSet;
import java.util.Set;

public class RemoveRepeatCharSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="Veerae";
		Set<Character> set = new HashSet<Character>();
		
		for(int i=0;i<st.length();i++) {
			if(set.contains(st.charAt(i))){
				set.remove(st.charAt(i));
			}else {
				set.add(st.charAt(i));
			}	
		}
		for(Character ch:set) {
			System.out.println(ch);
		}

	}

}
