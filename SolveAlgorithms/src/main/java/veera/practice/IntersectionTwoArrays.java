package veera.practice;

import java.util.ArrayList;
import java.util.List;

public class IntersectionTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,4,7,9,2};
		int b[] = {1,7,3,4,5};
		//int[] c=new int[5];
		List l1 = new ArrayList();
		int count=1;
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=b.length-1;j++) {
			//	System.out.println(a[i]+" "+b[j]);
				if(a[i] == b[j]) {
					//c[++count]=b[j];
					l1.add(b[j]);
					System.out.println(a[i]);
				}	
			}
		}
		
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
	/*	
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
*/
	}

}
