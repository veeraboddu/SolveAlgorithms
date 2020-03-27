package veera.practice;

public class NumOfwordsInStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st ="Number of the words in the string";
		
		String[] stAry = st.split(" ");
		System.out.println("Number of the words in the String: "+stAry.length);
		String newstr = st.replace(" ", "");
		System.out.println("Remove the white space from given string :"+newstr);
	}

}
