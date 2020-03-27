package veera.practice;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String givenStr = "nee kadupu bangaram ganu";
		String []arrStr =givenStr.split(" ");
		String revstr="";
		for(int i=arrStr.length-1;i>=0;--i) {
			revstr = revstr+" "+arrStr[i];
		}
		System.out.println(revstr);
	}

}
