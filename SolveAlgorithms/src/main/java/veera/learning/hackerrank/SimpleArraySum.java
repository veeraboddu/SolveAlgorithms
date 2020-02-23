package veera.learning.hackerrank;

public class SimpleArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[]= {1,2,3,4,5,6,7,8,9}, sum=0;
		
		for(int i=0;i<ar.length;i++) {
			sum = sum + ar[i];
		}
		
		System.out.println("array sum : "+sum );
	}

}
