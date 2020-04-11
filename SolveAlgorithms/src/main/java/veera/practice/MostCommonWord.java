package veera.practice;

public class MostCommonWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String para  = "Find the most common words in the given paragraph and also avoid the banned words. Make sure"
				+ "print the most common word and count of the word123 @%^&*@@.";
		
		
		para =para.replaceAll("[^a-zA-Z/0-9]", " ");
		System.out.println(para);
		
		para = para.toLowerCase();
		System.out.println(para);
		
		for(String word:para.replaceAll("[^a-zA-Z]", " ").toLowerCase().split("" )) {
			System.out.print(word);
		}

	}

}
