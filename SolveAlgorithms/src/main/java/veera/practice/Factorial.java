package veera.practice;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3! = 3 * 2 *1
		int givenNum = 5;
		int factorial=1;
		
		for(int i=givenNum;i>=1;i--) {
			System.out.println(i);
			factorial= i*factorial;
		}
		
		System.out.println("Factorial of the given number :"+factorial);
	}

}
