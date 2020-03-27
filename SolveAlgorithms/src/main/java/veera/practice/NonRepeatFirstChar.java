package veera.practice;

import java.util.HashMap;
import java.util.Map.Entry;

public class NonRepeatFirstChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "you are a bad boy";
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		int count =0;
		
		for(int i=0;i<str.length();i++) {
			count =1;
			if(hm.containsKey(str.charAt(i))) {
				count = hm.get(str.charAt(i));
				hm.put(str.charAt(i), count+1);
			}
			else {
				
				hm.put(str.charAt(i), count);
			}
		}
		
		for (Entry<Character, Integer> entry : hm.entrySet()) {
			 System.out.println(entry.getKey()+ " "+entry.getValue() );
			
		/*		if ((int) entry.getValue() == 1) {
					System.out.println(entry.getKey() + " " + entry.getValue());
				}
		*/			
		}
		
		System.out.println("---------Nextout -----------");

		
		for(int i=0;i<str.length();i++) {
		
			for (Entry<Character, Integer> entry : hm.entrySet()) {
				// System.out.println(entry.getKey()+ " "+entry.getValue() );
				if(str.charAt(i) == entry.getKey() & entry.getValue() ==1)
				{	
					//if ((int) entry.getValue() == 1) {
						System.out.println(entry.getKey() + " " + entry.getValue());
					//}
				}		
			}
		
		}

	}

}
