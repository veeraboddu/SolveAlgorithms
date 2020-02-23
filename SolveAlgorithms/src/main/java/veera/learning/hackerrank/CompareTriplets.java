package veera.learning.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {
	
	public static void main(String arg[]) {
		
	    int a[]= {1,2,3};
	    int b[]= {3,2,1};
	    int alice =0, bob=0;
	    
	    if (a.length == b.length) {
	    	System.out.println("a and b array size are equal");
	    	
	    	for(int i=0;i<a.length;i++) {
	    		if(a[i]>b[i]) alice++;
	    		else if(a[i]<b[i]) bob++;	    		
	    	}
	    	System.out.println("Array Alice Count : "+alice +" Bob Count : "+bob);
	    }
	    
	    //By using  List object
	    int alice1 =0, bob1=0;
	    List<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);l1.add(2);l1.add(3);
		
	    List<Integer> l2 = new ArrayList<Integer>();
	    l2.add(3);l2.add(2);l2.add(1);
	    
	    if(l1.size() == l2.size()) {
	    	for(int i=0;i<l1.size();i++) {
	    		if(l1.get(i)>l2.get(i)) alice1++;
	    		else if(l1.get(i)<l2.get(i)) bob1++;
	    	}
	    	System.out.println("List Alice Count : "+alice1 +" Bob Count : "+bob1);
	    }
	    
	}
}
