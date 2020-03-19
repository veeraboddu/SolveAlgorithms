package veera.learning.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []person = {"p1","p2","p3","p4","p5"};
		String []gift = {"g5","g4","g3","g1","g2"};
		boolean temp=true;
		
		Arrays.sort(gift);
		for(int i=0;i<gift.length;i++) {
			System.out.println(gift[i]);
		}
		HashMap<String,String> hm= new HashMap<String,String>();
		HashMap<String,String> hm1= new HashMap<String,String>();

		
		for(int i=0;i<person.length;i++) {
			hm.put(person[i], gift[i]);temp=true;
			//System.out.println(person[val]+" "+ gift[val]);
			if(!hm1.containsKey(person[i])) {
				while(true) {
				int val =randomst(person);
				if(temp == false) break;
				if (!hm1.containsValue(gift[val]))
					hm1.put(person[val], gift[val]);temp=false;					
				}
			}	
		}
		
		for(Map.Entry<String, String> entry:hm.entrySet()) {
			System.out.println("Key :"+entry.getKey() + " -> Value: "+entry.getValue());
		}
		
		for(Map.Entry<String, String> entry:hm1.entrySet()) {
			System.out.println("-----------------------");
			System.out.println("Key :"+entry.getKey() + " -> Value: "+entry.getValue());
		}
	}
	
	private static int randomst(String a[]) {
		
		Random ran= new Random();
		int value = ran.nextInt(a.length);
		return value;
				
	}

}
