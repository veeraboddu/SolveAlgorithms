package veera.learning.hackerrank;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				permute("","ABC");
	}
	
	private static void permute(String prefix, String remain) {
		
		if(remain.length() == 0){
		   System.out.println(prefix);
		   return;
		}
		for(int i=0;i<remain.length();i++) {
			
			permute(prefix+remain.charAt(i),remain.substring(0,i)+remain.substring(i+1, remain.length()));
			
		}
		
	}

}
