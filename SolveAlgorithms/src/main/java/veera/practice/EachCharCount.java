package veera.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class EachCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st = "MeghanaBoddu";
		charCount(st);
		
		String starray[] = {"veera","suni","megha","megha","suni"};
		strCount(starray);
		
		List<String> listobj = new ArrayList<String>();
		listobj.add("one");		listobj.add("two");
		listobj.add("three");
		listobj.add("one");
		listobj.add("two");listobj.add("three");
		objCount(listobj);
		
	}
	
	public static void objCount(List listobj) {
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		int count =0;
		for(int i=0;i<listobj.size();i++) {
			count =1;
			if(hm.containsKey(listobj.get(i))) {
				count = hm.get(listobj.get(i));
				hm.put((String)listobj.get(i), count+1);
			}
			else
				hm.put((String)listobj.get(i), count);
		}
		
		for(Entry<String, Integer> key:hm.entrySet()) {
			System.out.println(key.getKey()+" "+key.getValue());
		}
		
		System.out.println("-----------Next Output ------------------");
	}
	
	public static void strCount(String starray[]) {
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		int count =0;
		for(int i=0;i<starray.length;i++) {
			count =1;
			if(hm.containsKey(starray[i])) {
				count = hm.get(starray[i]);
				hm.put(starray[i], count+1);
			}
			else
				hm.put(starray[i], count);
		}
		
		for(Entry<String,Integer> key:hm.entrySet()) {		
			System.out.println(key.getKey()+" "+ key.getValue());
		}
		System.out.println("-----------Next Output ------------------");

	}
	
	public static void charCount(String st) {
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		int count=0;
		for(int i=0;i<st.length();i++) {
			count=1;
			if(hm.containsKey(st.charAt(i))) {
				count = hm.get(st.charAt(i));
				hm.put(st.charAt(i), count+1);
			}
			else
				hm.put(st.charAt(i), count);
		}
		
		for(Entry<Character,Integer> key:hm.entrySet()) {
			System.out.println(key.getKey()+" "+key.getValue());
		}
		System.out.println("-----------Next Output ------------------");

	}

}
