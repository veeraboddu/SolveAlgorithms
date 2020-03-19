package veera.learning.hackerrank;

public class PlusMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a []  = {1,1,0,-1,-1};
		int poscount=0, negcount=0, zerocount=0;
		int n =a.length;
		for(int i=0;i<a.length;i++) {
			if(a[i]> 0)
				poscount++;
			if(a[i]<0)
				negcount++;
			if (a[i] == 0)
				zerocount++;
		}
		
		System.out.format("%.6f\n", (double)poscount/n);
		System.out.format("%.6f\n", (double)negcount/n);
		System.out.format("%.6f", (double)zerocount/n);
		
	}

}
