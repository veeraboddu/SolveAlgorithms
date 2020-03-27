package veera.practice;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 371 = 3^3 +7^3+1^3
		
		int givenNum = 371;
		int result =givenNum;
		int armst =0,rem=0;
		
		for(int i=0;i<givenNum;i++) {
			rem = givenNum%10;
			armst  = armst + rem*rem*rem;
			givenNum = givenNum/10;
		}
		System.out.println(result+" "+armst);
		if(result == armst)
			System.out.println("Armstrong Number: "+armst);
		else
			System.out.println("Given number is not a Armstrong Number");

	}

}
