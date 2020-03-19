package veera.learning.hackerrank;

public class MinMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,5,7,9};
	    long sum =0, min=a[0],max=a[0];
		for(int i=0;i<a.length;i++) {
			sum = sum + a[i];
			if(a[i]<min) min = a[i];
			if(a[i]>max) max = a[i];
		}
		System.out.print(sum-max+" ");
		System.out.print(sum-min);
	}

}
