package veera.learning.hackerrank;

public class StairCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=16;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
