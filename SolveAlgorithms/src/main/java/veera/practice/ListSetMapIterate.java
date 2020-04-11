package veera.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class ListSetMapIterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = "IterateMapSetList";
		
		mapIterate(st);
		setIterate(st);
		listIterage(st);

	}
	
	public static void mapIterate(String st) {
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();	
		for(int i=0;i<st.length();i++) {
			int count=1;
			if(hm.containsKey(st.charAt(i))) {
				count = hm.get(st.charAt(i));
				hm.put(st.charAt(i), ++count);
			}
			else {
				hm.put(st.charAt(i), count);
			}
		}
		// Iterate the Map object elements
		for(Entry<Character,Integer> val:hm.entrySet()) {
			System.out.println(" Key: "+val.getKey()+ " "+"Value : "+val.getValue());
		}
	}
	
	public static void setIterate(String st) {
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0;i<st.length();i++) {
				set.add(st.charAt(i));			
		}
		// Iterate the set object elements
		for(Character s:set) {
			System.out.print(" Set Contain :"+s);
		}
	}
	
	public static void listIterage(String st) {
		ArrayList<Character> list = new ArrayList<Character>();
		
		for(int i=0;i<st.length();i++) {
			if(!list.contains(st.charAt(i)))
				list.add(st.charAt(i));
		}
		System.out.println();
		// Iterate the list object elements
		for(Character l:list) {
			System.out.print(" List Contain :"+l);
		}
	}
	

}
