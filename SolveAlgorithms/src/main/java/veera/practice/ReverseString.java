package veera.practice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String givenStr = "you are a bad boy";
		String revStr="";
		for(int i=givenStr.length()-1;i>=0;--i) {
			revStr = revStr+givenStr.charAt(i);
			
		}
		System.out.println(givenStr+" "+revStr);
		
		StringBuffer strbuf = new StringBuffer();
		strbuf.append("you");
		strbuf.append("are");
		strbuf.append("a");
		strbuf.append("bad");
		strbuf.append("boy");

		System.out.println(strbuf);
		System.out.println(strbuf.reverse());
		
		StringBuilder strbuil = new StringBuilder();
		strbuil.append("StringBuilder");
		System.out.println(strbuil);
		System.out.println(strbuil.reverse());

	}

}
