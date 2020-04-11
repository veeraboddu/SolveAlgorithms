package veera.practice;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arrNumber[] = {10, 20,50, 33,99,44,11,30,54};
		int seachKey =11;
		
	/*	for(int i :arrNumber) {
			System.out.print(" "+i);
		} */
		
		Arrays.sort(arrNumber);
		//System.out.println();
		for(int s:arrNumber) {
			System.out.print(" "+s);
		}
		
		int res = Arrays.binarySearch(arrNumber, seachKey);
		System.out.println(res);
		if(res>=0)
			System.out.println(seachKey +" found at index: "+res);
		else
			System.out.println(seachKey +" not found in the given array "+res);

	}

}
