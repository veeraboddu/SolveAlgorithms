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
		
		//System.out.println("Factorial of the given number :"+factorial);
		
		int a[]= {1,2,3,4};
		int ba = 2500; 
		System.out.print(String.valueOf(ba).substring(2));
	/*	int count=1;
		for(int i=0;i<a.length;i++) {
			count = count *a[i];
			System.out.println(a[i]);
		}
		System.out.println(count);
		*/
		
	}
	
	

}
