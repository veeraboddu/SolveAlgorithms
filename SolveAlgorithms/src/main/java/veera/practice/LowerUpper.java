package veera.practice;

public class LowerUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// UPPER 65 - 90 unicode 
		// lower 97 - 122
		String st = "Veera";
		
		for(int i=0;i<st.length();i++) {
			int unicode = st.charAt(i);
			if(unicode>=97 && unicode <= 122) {
				unicode = unicode -32 ;
				System.out.print( (char) unicode);
			}
			else if(unicode>= 65 && unicode <= 90) {
				unicode = unicode + 32 ;
				System.out.print( (char) unicode);
			}
			if(unicode==32)
	            System.out.print(" ");
		}
		
		
	}

}
