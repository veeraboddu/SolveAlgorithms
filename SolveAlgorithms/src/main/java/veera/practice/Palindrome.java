package veera.practice;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st ="madam";
		String st2="";
		for(int i=st.length()-1;i>=0;i--) {
			st2 = st2 + st.charAt(i);
		}
		System.out.println(st2);
		
		if(st.equals(st2))
			System.out.println("Palendrum");
		else
			System.out.println("Not a palendrum");
	}

}
