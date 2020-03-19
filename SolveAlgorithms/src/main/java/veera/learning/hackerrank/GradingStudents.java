package veera.learning.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a[]= {73,67,38,33};
		List<Integer> l1  = new ArrayList<Integer>();
		List<Integer> l2  = new ArrayList<Integer>();
		l1.add(73);l1.add(67);l1.add(38);l1.add(33);
		
	/*	for(int i=0;i<a.length;i++) {
			
			if(a[i]>=38) {
				if(a[i]%5>=3) {
					a[i]+=5-(a[i]%5);
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		*/
		
		for(int i=0;i<l1.size();i++) {
			
			if(l1.get(i)>=38) {
				if(l1.get(i)%5>=3) {
					l2.add(5-l1.get(i)%5 +l1.get(i));
				}else {
					l2.add(l1.get(i));
				}
			}else {
				l2.add(l1.get(i));
			}
			
		}
		for(int i=0;i<l2.size();i++) {
			System.out.println(l2.get(i));
		}
		
	}

}
