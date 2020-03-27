package veera.practice;

public class AlphabetPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1
		12
		123
		1234
		12345
		*/
		int n=5;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++)
				System.out.print(j);
			for(int k=i;k<=n-i;k++)
				System.out.print(" ");	
			
			System.out.println();	
		}
		
	}

}
