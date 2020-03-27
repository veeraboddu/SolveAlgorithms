package veera.practice;

import java.util.HashMap;
import java.util.Map.Entry;

public class RemoveRepeatedChar {
	
	public static void main(String arg[]) {
		String st = "veera";
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		int count =0;
		for(int i=0;i<st.length();i++) {
			count=0;
			if(hm.containsKey(st.charAt(i))) {
				count =hm.get(st.charAt(i));
			}
			hm.put(st.charAt(i), ++count);
		}
		
		for(Entry<Character,Integer> entry: hm.entrySet()) {
			//System.out.println(entry.getKey()+"  "+entry.getValue());
			if(entry.getValue() == 1){
				System.out.println(entry.getKey()+"  "+entry.getValue());
			}
		}
	}

}
