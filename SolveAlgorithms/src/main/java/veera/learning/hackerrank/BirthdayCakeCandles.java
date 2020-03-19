package veera.learning.hackerrank;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		int a[] = {3,2,1,3};
		int max = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) max = a[i];
			if(max == a[i])
				count ++;
		}
			System.out.println(count);
	}

}
