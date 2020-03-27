package veera.learning.hackerrank;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int A[] = {-1, 3, 6, 4, 1, 2,1,2,3,4,5,6,7,8,9,};
		//int A[] = {-1,-2,-3};
		int A[] = {1,4,6,5};
		int N = A.length;
		long result =0;
		Set<Integer> set = new HashSet<Integer>();
		for (int a : A) {
		    if (a > 0) {
		        set.add(a);
		    }
		}
		int size = set.size();
		System.out.println(size);
		for (int i = 1; i <= size + 1; i++) {
		    if (!set.contains(i)) {
		        System.out.println("Missing integer : "+i);
		        result=i;
		    }
		}
		result = size +1;
		System.out.println(result);

	}

}
