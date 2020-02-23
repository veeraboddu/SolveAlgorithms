package veera.learning.hackerrank;

public class VeryBigSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Long [] ln = {1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L};
		Long sum=0l;
		
		for(int i=0;i<ln.length;i++) {
			sum = ln[i]+sum;
		}
		System.out.println("Sum :"+sum);
	}

}
