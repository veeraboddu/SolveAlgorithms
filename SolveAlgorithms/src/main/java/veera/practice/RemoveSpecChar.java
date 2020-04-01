package veera.practice;

public class RemoveSpecChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gvn = "Remove specific Character";
		String remSt = "msa";
		gvn = gvn.replace("R", " ");
		for(int j=0;j<remSt.length();j++) {
		//	if(sb.charAt(i) == gvn.charAt(i)) {
			char ch = remSt.charAt(j);
			char replace ='\0';
			System.out.println(ch);
				gvn = gvn.replace( ch,replace);
		//	}
		}
		
		
	}

}
