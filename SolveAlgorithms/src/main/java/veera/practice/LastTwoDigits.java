package veera.practice;

public class LastTwoDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,20,30};
		int count =1;
		for(int i:a) {
			count = count * a[1];
		}
		System.out.println(""+count%100);
		
		

	}

}
